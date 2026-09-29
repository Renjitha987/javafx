import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridExample extends Application {

    public void start(Stage stage) {

        Label nameLabel = new Label("Name:");

        TextField nameField = new TextField();

        Label ageLabel = new Label("Age:");

        TextField ageField = new TextField();

        Label emailLabel = new Label("Email:");

        TextField emailField = new TextField();

        Button submit = new Button("Submit");

        GridPane grid = new GridPane();

        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);

        grid.add(ageLabel, 0, 1);
        grid.add(ageField, 1, 1);

        grid.add(emailLabel, 0, 2);
        grid.add(emailField, 1, 2);

        grid.add(submit, 1, 3);

        Scene scene = new Scene(grid, 400, 250);

        stage.setTitle("Registration Form");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}