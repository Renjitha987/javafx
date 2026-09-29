import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class ShapesExample extends Application {

    public void start(Stage stage) {

        Circle circle = new Circle(80, 80, 40);

        circle.setFill(Color.BLUE);

        Rectangle rectangle = new Rectangle(150, 50, 100, 60);

        rectangle.setFill(Color.RED);

        Line line = new Line(50, 150, 250, 150);

        line.setStroke(Color.GREEN);

        Pane pane = new Pane();

        pane.getChildren().addAll(
                circle,
                rectangle,
                line
        );

        Scene scene = new Scene(pane, 300, 250);

        stage.setTitle("Shapes");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}