import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {

    public void start(Stage stage) {

        Label label = new Label("Welcome");

        Button button1 = new Button("Button 1");

        Button button2 = new Button("Button 2");

        Button button3 = new Button("Button 3");

        VBox vbox = new VBox(10);

        vbox.getChildren().addAll(
                label,
                button1,
                button2,
                button3
        );

        Scene scene = new Scene(vbox, 300, 250);

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}