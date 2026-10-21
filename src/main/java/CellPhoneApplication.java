import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone phone1 = new CellPhone();

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

        phone1.displayInfo();

        read.close();
    }
}
