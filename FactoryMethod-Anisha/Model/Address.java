import java.util.Scanner;


public class Address implements Editable {


    private String address;

    public ItemEditor getEditor() {
        return new AddressEditor();
    }

    private class AddressEditor implements ItemEditor {

        public void getInput() {
            Scanner sc = new Scanner(System.in);
            String a;
            System.out.println("Enter address:");
            a = sc.nextLine();
            address = a;
        }

        public void display() {
            System.out.println("Address: " + address );
        }

    }

}
