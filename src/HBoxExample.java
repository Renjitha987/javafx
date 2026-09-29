import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {

    public void start(Stage stage) {

        Button button1 = new Button("Yes");

        Button button2 = new Button("No");

        Button button3 = new Button("Cancel");

        HBox hbox = new HBox(10);

        hbox.getChildren().addAll(
                button1,
                button2,
                button3
        );

        Scene scene = new Scene(hbox, 300, 100);

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}