

public class CellPhone {

    int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    void displayInfo() {
        System.out.println("----------------------------");
        System.out.println("Owner: " + getOwner());
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Model: " + getModel());
        System.out.println("Carrier: " + getCarrier());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("----------------------------");
    }
}
