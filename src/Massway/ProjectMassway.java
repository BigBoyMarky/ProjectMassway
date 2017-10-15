package Massway;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ProjectMassway extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ProjectMassway.fxml"));
        stage.setTitle("Massway");
        Scene scene = new Scene(root, 1600, 900);
        stage.setScene(scene);
        stage.show();
    }

}