package modelo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 600);
        scene.setFill(Color.BLACK);
        stage.setTitle("Proyecto Pong");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
