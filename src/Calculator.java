import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {

    public void start(Stage stage) {

        Label label1 = new Label("Enter first number:");

        TextField num1Field = new TextField();

        Label label2 = new Label("Enter second number:");

        TextField num2Field = new TextField();

        Button addButton = new Button("Add");

        Label result = new Label();

        addButton.setOnAction(e -> {

            double num1 = Double.parseDouble(num1Field.getText());

            double num2 = Double.parseDouble(num2Field.getText());

            double sum = num1 + num2;

            result.setText("Result = " + sum);
        });

        VBox layout = new VBox(10);

        layout.getChildren().addAll(
                label1,
                num1Field,
                label2,
                num2Field,
                addButton,
                result
        );

        Scene scene = new Scene(layout, 300, 300);

        stage.setTitle("Calculator");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}