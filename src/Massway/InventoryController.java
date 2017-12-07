package Massway;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class InventoryController {

    @FXML private TableView<InventoryItem> inventoryTable;

    @FXML private TextField addItemNumber;
    @FXML private TextField addItemOrigin;
    @FXML private TextField addItemEntryDate;
    @FXML private TextField addItemQuantityImported;
    @FXML private ChoiceBox addItemUnit;
    @FXML private TextArea addItemDescription;
    @FXML private TextField addItemUnitCost;
    @FXML private TextField addItemTotalCost;
    //@FXML private Button itemPhoto;
    @FXML private TextArea addItemNotes;
    @FXML private TextField addItemSalePrice;
    @FXML private TextField addItemZetaNumber;

    @FXML public void handleAddInventoryItemButtonAction(ActionEvent event) throws Exception {
        ObservableList<InventoryItem> inventoryItems = inventoryTable.getItems();
        InventoryItem item = new InventoryItem(addItemNumber.getText(),
                                                addItemOrigin.getText(),
                                                addItemEntryDate.getText(),
                                                addItemQuantityImported.getText(),
                                                addItemUnit.getValue().toString(),
                                                addItemDescription.getText(),
                                                addItemUnitCost.getText(),
                                                addItemTotalCost.getText(),
                                                addItemNotes.getText(),
                                                addItemSalePrice.getText(),
                                                addItemZetaNumber.getText());
        inventoryItems.add(item);
    }

}