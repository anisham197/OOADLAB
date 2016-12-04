
import java.util.*;

/**
 * 
 */
public class PIMTester {

    /**
     * 
     */    


    public static void main(String args[]) {
        
        int choice;   
        Editable item;
        PIM myData = new PIM();     
        do
        {
            System.out.println("1.Add Address\n2.Add Book\n3.Add Appointment\n4.Display all\n5.Exit");
            Scanner in = new Scanner(System.in);
            choice= in.nextInt();
            switch(choice)
            {
                case 1:
                   item = new Address();
                   myData.addItem(item);
                   break;

                case 2:
                    item = new Book();
                    myData.addItem(item);
                    break;
                case 3:
                    item = new Appointment();
                    myData.addItem(item);
                    break;
                case 4:
                    myData.show();
                    break;
                default:
                    break;
            }

        }while(choice != 4);
        
    }

}