import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        //Read user input
        Scanner input = new Scanner(System.in);

        Patient patient1 = new Patient("","","","","","","");


        //Ask user to enter their info
        System.out.println("ID: ");
        String ID = input.nextLine();
        patient1.setPatientId(ID);

        System.out.println("First Name: ");
        String fName = input.nextLine();
        patient1.setFirstName(fName);

        System.out.println("Last Name: ");
        String lName = input.nextLine();
        patient1.setLastName(lName);

        System.out.println("Address: ");
        String address = input.nextLine();
        patient1.setAddress(address);

        System.out.println("City: ");
        String city = input.nextLine();
        patient1.setCity(city);

        System.out.println("Province: ");
        String province = input.nextLine();
        patient1.setProvince(province);

        System.out.println("Postal Code: ");
        String pCode = input.nextLine();
        patient1.setPostalCode(pCode);


        //Final Message, or summary
        System.out.printf("\nPatient info is: %s%n", patient1.getPatientInfo());


    }
}
