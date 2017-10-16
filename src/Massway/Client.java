package Massway;

import javafx.beans.property.SimpleStringProperty;

public class Client {

    private SimpleStringProperty name = new SimpleStringProperty("");
    private SimpleStringProperty number = new SimpleStringProperty("");
    private SimpleStringProperty country = new SimpleStringProperty("");
    private SimpleStringProperty address = new SimpleStringProperty("");
    private SimpleStringProperty telephoneNumber = new SimpleStringProperty("");

    public Client(String number, String name, String country, String address, String telephoneNumber) {
        this.number.set(number);
        this.name.set(name);
        this.country.set(country);
        this.address.set(address);
        this.telephoneNumber.set(telephoneNumber);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getNumber() {
        return number.get();
    }

    public void setNumber(String number) {
        this.number.set(number);
    }

    public String getCountry() {
        return country.get();
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public String getAddress() {
        return address.get();
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getTelephoneNumber() {
        return telephoneNumber.get();
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber.set(telephoneNumber);
    }

}