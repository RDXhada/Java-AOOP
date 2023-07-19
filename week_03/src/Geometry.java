
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
public class Geometry extends Application {
    final int width = 500;
    final int height = 500;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, width, height);
        Circle circle = new Circle(height/2,height/2,200, Color.ORANGE);
        Circle circle2 = new Circle(100,100,30,Color.PINK);
        Circle circle3 = new Circle(70,70,15,Color.BLUE);
        group.getChildren().add(circle);
        group.getChildren().add(circle2);
        group.getChildren().add(circle3);

        Line line = new Line(100,0,100,height);
        Line line1 = new Line(25,0,25,width);
        line1.setStartX(0);
        line1.setStartY(height/2);
        line1.setEndX(height);
        line1.setEndY(height/2);

        line.setStrokeWidth(5);
        line1.setStrokeWidth(5);
        group.getChildren().add(line);
        group.getChildren().add(line1);

        int radius = 20;
// TODO Type JavaFX code for drawing objects
        stage.setTitle("Drawing scene");
        stage.sizeToScene();
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.setScene(scene);
        stage.show();

    }
}