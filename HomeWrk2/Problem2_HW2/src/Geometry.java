import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
public class Geometry extends Application {
    //NOTE : YOU CAN ONLY CHANGE HEIGHT == WIDTH
    final int width = 400;
    final int height = 400;
    final int increment = height/10;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, width, height);

        Line line1 = new Line(increment, increment, height-increment, increment); // horizontal line
        Line line2 = new Line(increment, increment, increment, height-increment); // vertical line
        Line line3 = new Line(height-2*increment, height-increment, increment, height-increment); // horizontal line
        Line line4 = new Line(height-2*increment, height-increment, height-2*increment, 2*increment); // vertical line
        Line line5 = new Line(2*increment, 2*increment, height-2*increment, 2*increment); // horizontal line
        Line line6 = new Line(2*increment, height-2*increment, 2*increment, 2*increment); // vertical line
        Line line7 = new Line(height-3*increment, height-2*increment, 2*increment, height-2*increment); // horizontal line
        Line line8 = new Line(height-3*increment, height-2*increment, height-3*increment, 3*increment); // vertical line
        Line line9 = new Line(3*increment, 3*increment, height-3*increment, 3*increment); // horizontal line
        Line line10 = new Line(3*increment, height-3*increment, 3*increment, 3*increment); // vertical line
        Line line11 = new Line(3*increment, height-3*increment, height-4*increment, height-3*increment); // horizontal line
        Line line12 = new Line(height-4*increment, 4*increment, height-4*increment, height-3*increment); // vertical line
        Line line13 = new Line(height-4*increment, 4*increment, 4*increment, 4*increment); // horizontal line
        Line line14 = new Line(4*increment, height-4*increment, 4*increment, 4*increment); // vertical line
        Line line15 = new Line(4*increment, height-4*increment, height-5*increment, height-4*increment); // horizontal line
        Line line16 = new Line(height-5*increment, 5*increment, height-5*increment, height-4*increment); //vertical line
        Line line17 = new Line(height-5*increment, 5*increment, 4.5*increment, 5*increment); // horizontal line
        Line line18 = new Line(height-5.5*increment, 5.5*increment, height-5.5*increment, height-5*increment); //vertical line
        Line line19 = new Line(height-5.5*increment, 5.5*increment, 4.75*increment, 5.5*increment); // horizontal line
        Line line20 = new Line(height-5.25*increment, 5.5*increment, height-5.25*increment, height-4.75*increment); //vertical line


        line1.setStroke(Color.RED);
        line2.setStroke(Color.RED);
        line3.setStroke(Color.RED);
        line4.setStroke(Color.RED);
        line5.setStroke(Color.RED);
        line6.setStroke(Color.RED);
        line7.setStroke(Color.RED);
        line8.setStroke(Color.RED);
        line9.setStroke(Color.RED);
        line10.setStroke(Color.RED);
        line11.setStroke(Color.RED);
        line12.setStroke(Color.RED);
        line13.setStroke(Color.RED);
        line14.setStroke(Color.RED);
        line15.setStroke(Color.RED);
        line16.setStroke(Color.RED);
        line17.setStroke(Color.RED);
        line18.setStroke(Color.RED);
        line19.setStroke(Color.RED);
        line20.setStroke(Color.RED);
        line20.setStrokeWidth(1.25);

        group.getChildren().add(line1);
        group.getChildren().add(line2);
        group.getChildren().add(line3);
        group.getChildren().add(line4);
        group.getChildren().add(line5);
        group.getChildren().add(line6);
        group.getChildren().add(line7);
        group.getChildren().add(line8);
        group.getChildren().add(line9);
        group.getChildren().add(line10);
        group.getChildren().add(line11);
        group.getChildren().add(line12);
        group.getChildren().add(line13);
        group.getChildren().add(line14);
        group.getChildren().add(line15);
        group.getChildren().add(line16);
        group.getChildren().add(line17);
        group.getChildren().add(line18);
        group.getChildren().add(line19);
        group.getChildren().add(line20);



        stage.setTitle("Drawing scene");
        stage.sizeToScene();
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.setScene(scene);
        stage.show();

    }
}