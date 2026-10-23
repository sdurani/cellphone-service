import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();
        CellPhone phone3 = new CellPhone(9867676, "iPhone", "T-mobile", "555-676-8910", "Jane Doe");

        System.out.println("What is the serial number?");
        int userSerialNumber = read.nextInt();
        phone1.setSerialNumber(userSerialNumber);

        read.nextLine();

        System.out.println("What model is the phone?");
        String userPhoneModel = read.nextLine();
        phone1.setModel(userPhoneModel);

        System.out.println("What is the carrier?");
        String userCarrier = read.nextLine();
        phone1.setCarrier(userCarrier);

        System.out.println("What is the phone number?");
        String userPhoneNumber = read.nextLine();
        phone1.setPhoneNumber(userPhoneNumber);

        System.out.println("Who is the owner?");
        String userOwner = read.nextLine();
        phone1.setOwner(userOwner);

//        phone1.displayInfo();

        phone2.setOwner("John Smith");
        phone2.setPhoneNumber("510-767-6767");
        phone2.setCarrier("AT&T");
        phone2.setModel("Temu");
        phone2.setSerialNumber(67676767);

        display(phone1);
        display(phone2);
        display(phone3);

        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());
        phone2.dial(phone3.getPhoneNumber());


        read.close();
    }

    // Accepts a CellPhone object
    public static void display(CellPhone phone) {
        System.out.println("----------------------------");
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("----------------------------");
    }
}
