
import java.util.Scanner;

public class Appointment implements Editable {


    private String name,date,time;

    public ItemEditor getEditor() {
        return new AppointmentEditor();
    }

    private class AppointmentEditor implements ItemEditor{

        public void getInput() {
            Scanner sc = new Scanner(System.in);
            String n,d,t;
            System.out.println("Enter name, date, time for appointment:");
            n = sc.nextLine();
            d= sc.nextLine();
            t = sc.nextLine();
            name = n;
            date = d;
            time = t;

        }

        public void display() {
            System.out.println("Appointment with "+name+" on " + date+ " at " +time );
        }

    }

}
