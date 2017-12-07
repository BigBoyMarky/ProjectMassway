package Massway;

import javafx.beans.property.SimpleStringProperty;

public class InventoryItem {

    private SimpleStringProperty number = new SimpleStringProperty("");
    private SimpleStringProperty origin = new SimpleStringProperty("");
    private SimpleStringProperty entryDate = new SimpleStringProperty("");
    private SimpleStringProperty quantityImported = new SimpleStringProperty("");
    private SimpleStringProperty unit = new SimpleStringProperty("");
    private SimpleStringProperty description = new SimpleStringProperty("");
    private SimpleStringProperty unitCost = new SimpleStringProperty("");
    private SimpleStringProperty totalCost = new SimpleStringProperty("");
    private SimpleStringProperty notes = new SimpleStringProperty("");
    private SimpleStringProperty salesPrice = new SimpleStringProperty("");
    private SimpleStringProperty zetaNumber = new SimpleStringProperty("");

    public InventoryItem(String number, String origin, String entryDate, String quantityImported, String unit, String description, String unitCost, String totalCost, String notes, String salesPrice, String zetaNumber) {
        this.number.set(number);
        this.origin.set(origin);
        this.entryDate.set(entryDate);
        this.quantityImported.set(quantityImported);
        this.unit.set(unit);
        this.description.set(description);
        this.unitCost.set(unitCost);
        this.totalCost.set(totalCost);
        this.notes.set(notes);
        this.salesPrice.set(salesPrice);
        this.zetaNumber.set(zetaNumber);
    }

    public String getNumber() { return number.get(); }

    public SimpleStringProperty numberProperty() { return number; }

    public void setNumber(String number) { this.number.set(number); }

    public String getOrigin() { return origin.get(); }

    public SimpleStringProperty originProperty() { return origin; }

    public void setOrigin(String origin) { this.origin.set(origin); }

    public String getEntryDate() { return entryDate.get(); }

    public SimpleStringProperty entryDateProperty() { return entryDate; }

    public void setEntryDate(String entryDate) { this.entryDate.set(entryDate); }

    public String getQuantityImported() { return quantityImported.get(); }

    public SimpleStringProperty quantityImportedProperty() { return quantityImported; }

    public void setQuantityImported(String quantityImported) { this.quantityImported.set(quantityImported); }

    public String getUnit() { return unit.get(); }

    public SimpleStringProperty unitProperty() { return unit; }

    public void setUnit(String unit) { this.unit.set(unit); }

    public String getDescription() { return description.get(); }

    public SimpleStringProperty descriptionProperty() { return description; }

    public void setDescription(String description) { this.description.set(description); }

    public String getUnitCost() { return unitCost.get(); }

    public SimpleStringProperty unitCostProperty() { return unitCost; }

    public void setUnitCost(String unitCost) { this.unitCost.set(unitCost); }

    public String getTotalCost() { return totalCost.get(); }

    public SimpleStringProperty totalCostProperty() { return totalCost; }

    public void setTotalCost(String totalCost) { this.totalCost.set(totalCost); }

    public String getNotes() { return notes.get(); }

    public SimpleStringProperty notesProperty() { return notes; }

    public void setNotes(String notes) { this.notes.set(notes); }

    public String getSalesPrice() { return salesPrice.get(); }

    public SimpleStringProperty salesPriceProperty() { return salesPrice; }

    public void setSalesPrice(String salesPrice) { this.salesPrice.set(salesPrice); }

    public String getZetaNumber() { return zetaNumber.get(); }

    public SimpleStringProperty zetaNumberProperty() { return zetaNumber; }

    public void setZetaNumber(String zetaNumber) { this.zetaNumber.set(zetaNumber); }

}