package Massway;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ProjectMassway extends Application {

    //@FXML private BorderPane inventoryTab;
    //@FXML private InventoryController inventoryController;
    //@FXML private InventoryController;

    @FXML private TableView<Client> clientsTable;

    @FXML private TextField clientNumber;
    @FXML private TextField clientName;
    @FXML private TextField clientCountry;
    @FXML private TextField clientAddress;
    @FXML private TextField clientTelephoneNumber;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //FXMLLoader.load(getClass().getResource("inventory.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("ProjectMassway.fxml"));
        stage.setTitle("Massway");
        Scene scene = new Scene(root, 1600, 900);
        stage.setScene(scene);
        stage.show();
    }

}