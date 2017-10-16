package Massway;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ClientController {

    @FXML private TableView<Client> clientsTable;

    @FXML private TextField clientNumber;
    @FXML private TextField clientName;
    @FXML private TextField clientCountry;
    @FXML private TextField clientAddress;
    @FXML private TextField clientTelephoneNumber;

    @FXML public void handleAddClientButtonAction(ActionEvent event) throws Exception {
        ObservableList<Client> clients = clientsTable.getItems();
        Client client = new Client(clientNumber.getText(), clientName.getText(), clientCountry.getText(), clientAddress.getText(), clientTelephoneNumber.getText());
        clients.add(client);
    }
}