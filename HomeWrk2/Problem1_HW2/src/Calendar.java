import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Optional;

public class Calendar extends Application {

    private static final int DEFAULT_YEAR = 2023;
    private static final int DEFAULT_MONTH = 1;

    private TextInputDialog createDialog(String contentText) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setContentText(contentText);
        dialog.setHeaderText(null);
        return dialog;
    }

    private int readMonth(String contentText, int defaultValue) {
        TextInputDialog dialog = createDialog(contentText);
        int value = defaultValue;
        Optional<String> result = dialog.showAndWait();
        try {
            value = Integer.parseInt(result.orElse(Integer.toString(defaultValue)));
            if (value < 1 || value > 12) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            alert.setHeaderText(String.format("Invalid value! (%d by default)", defaultValue));
            alert.showAndWait();
        }
        return value;
    }

    private int readYear(String contentText, int defaultValue) {
        TextInputDialog dialog = createDialog(contentText);
        int value = defaultValue;
        Optional<String> result = dialog.showAndWait();
        try {
            value = Integer.parseInt(result.orElse(Integer.toString(defaultValue)));
            if (value < 1) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            alert.setHeaderText(String.format("Invalid value! (%d by default)", defaultValue));
            alert.showAndWait();
        }
        return value;
    }

    private void createHeader(int month, int year, Group group) {
        Text title = new Text(String.format("%s %d", Month.of(month).getDisplayName(TextStyle.FULL, Locale.ENGLISH), year));
        title.setX(100);
        title.setY(50);
        title.setTextAlignment(TextAlignment.CENTER);
        title.setStyle("-fx-font-size: 20px;");
        group.getChildren().add(title);

        String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        for (int i = 0; i < daysOfWeek.length; i++) {
            Text dayOfWeek = new Text(50 + i * 50, 80, daysOfWeek[i]);
            dayOfWeek.setTextAlignment(TextAlignment.CENTER);
            group.getChildren().add(dayOfWeek);
        }
    }

    private void createCalendar(int month, int year, Group group) {

        int startDay = LocalDate.of(year, month, 1).getDayOfWeek().getValue();

        for (int i = 1; i <= 7; i++) {
            String dayOfWeek = DayOfWeek.of(i).getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase(Locale.ROOT);
            Text text = new Text((i * 50), 15, dayOfWeek);
            text.setTextAlignment(TextAlignment.CENTER);
            group.getChildren().add(text);
        }
        int daysInMonth = Month.of(month).length(Year.isLeap(year));
        int weeks = 2;
        boolean flag = false;

        for (int i = 1; i <= daysInMonth; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j != startDay && !flag) {
                    continue;
                } else {
                    Text curDate = new Text(j * 50, weeks * 20, Integer.toString(i));
                    if (i == LocalDate.now().getDayOfMonth() && Month.of(month).getValue() == LocalDate.now().getMonthValue() && Year.now().getValue() == year) {
                        curDate.setStroke(Color.RED);
                    }
                    group.getChildren().add(curDate);
                    flag = true;
                    if (i < daysInMonth && j != 7) {
                        i++;
                    } else {
                        break;
                    }
                }
            }
            weeks++;
        }
    }

    @Override
    public void start(Stage stage) throws IOException {

        Group group = new Group();
        Scene scene = new Scene(group, 430, 150);

        int month = readMonth("Enter month (1-12): ", DEFAULT_MONTH);
        int year = readYear("Enter year (>0): ", DEFAULT_YEAR);
        createCalendar(month, year, group);

        String title = String.format("Calendar for %s %d",
                Month.of(month).getDisplayName(TextStyle.FULL, Locale.ENGLISH), year);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
}



