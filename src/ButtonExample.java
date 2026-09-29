import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ButtonExample extends Application {

    public void start(Stage stage) {

        Button button = new Button("Click Me");

        button.setOnAction(e -> {
            System.out.println("Button Clicked!");
        });

        Scene scene = new Scene(button, 300, 200);

        stage.setTitle("Button Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}