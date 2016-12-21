
import java.util.*;

public class PIMTester {

    public static void main(String args[]) {

        PIM myData = new PIM();
        myData.addItem( new Address() );
        myData.addItem( new Appointment() );
        myData.show();
        myData.updateItem(1);
        myData.updateItem(2);
        myData.show();
}
}
