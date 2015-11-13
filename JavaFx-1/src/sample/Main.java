package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        FlowPane root = new FlowPane();
        primaryStage.setScene(new Scene(root, 500, 500));
        Circle c = new Circle(200,150,50);
        c.setFill(Color.RED);
        c.setVisible(true);
        root.getChildren().add(c);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
