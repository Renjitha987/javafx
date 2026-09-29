import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxExample extends Application {

    public void start(Stage stage) {

        Label label = new Label("Select your skills:");

        CheckBox java = new CheckBox("Java");

        CheckBox python = new CheckBox("Python");

        CheckBox sql = new CheckBox("SQL");

        Button button = new Button("Submit");

        button.setOnAction(e -> {

            String result = "";

            if (java.isSelected()) {
                result = result + "Java ";
            }

            if (python.isSelected()) {
                result = result + "Python ";
            }

            if (sql.isSelected()) {
                result = result + "SQL ";
            }

            System.out.println(result);
        });

        VBox layout = new VBox(10);

        layout.getChildren().addAll(
                label,
                java,
                python,
                sql,
                button
        );

        Scene scene = new Scene(layout, 300, 250);

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}