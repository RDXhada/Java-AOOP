import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Geometry extends Application {

    static final int WIDTH = 600, HEIGHT = 600;
    static final int INCREMENTS = 80;
    static final int X_INCREMENT = 15, Y_INCREMENT = 15;


    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        draw(gc);
        BorderPane root = new BorderPane(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Problem 2 drawing solution.");
        primaryStage.show();
    }

    private void draw(GraphicsContext gc) {
        gc.setStroke(Color.ORANGE);
        topLeft(gc);
        topRight(gc);
        bottomLeft(gc);
        bottomRight(gc);
    }

    private void topLeft(GraphicsContext gc) {
        int x1 = 0, y1 = HEIGHT, x2 = 0, y2 = 0;

        for (int index = 0; index < INCREMENTS; index++) {
            gc.strokeLine(x1, y1, x2, y2);
            x2 += X_INCREMENT;
            y1 -= Y_INCREMENT;
        }
    }

    private void topRight(GraphicsContext gc) {
        int x1 = 0, y1 = 0, x2 = WIDTH, y2 = 0;

        for (int index = 0; index < INCREMENTS; index++) {
            gc.strokeLine(x1, y1, x2, y2);
            x1 += X_INCREMENT;
            y2 += Y_INCREMENT;
        }
    }

    private void bottomLeft(GraphicsContext gc) {
        int x1 = 0, y1 = HEIGHT, x2 = 0, y2 = 0;

        for (int index = 0; index < INCREMENTS; index++) {
            gc.strokeLine(x1, y1, x2, y2);
            x1 += X_INCREMENT;
            y2 += Y_INCREMENT;
        }
    }

    private void bottomRight(GraphicsContext gc) {
        int x1 = 0, y1 = HEIGHT, x2 = WIDTH, y2 = HEIGHT;

        for (int index = 0; index < INCREMENTS; index++) {
            gc.strokeLine(x1, y1, x2, y2);
            x1 += X_INCREMENT;
            y2 -= Y_INCREMENT;
        }
    }
    public static void main(String[] args) {
        launch(args);
    }

}


