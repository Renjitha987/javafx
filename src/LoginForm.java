import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginForm extends Application {

    public void start(Stage stage) {

        Label userLabel = new Label("Username");

        TextField username = new TextField();

        Label passLabel = new Label("Password");

        PasswordField password = new PasswordField();

        Button loginButton = new Button("Login");

        Label result = new Label();

        loginButton.setOnAction(e -> {

            String user = username.getText();
            String pass = password.getText();

            if (user.equals("admin") && pass.equals("1234")) {
                result.setText("Login Successful");
            } else {
                result.setText("Invalid Login");
            }
        });

        VBox layout = new VBox(10);

        layout.getChildren().addAll(
                userLabel,
                username,
                passLabel,
                password,
                loginButton,
                result
        );

        Scene scene = new Scene(layout, 300, 300);

        stage.setTitle("Login Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}