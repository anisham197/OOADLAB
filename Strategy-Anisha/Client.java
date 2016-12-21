
import java.util.*;


public class Client {


    public static void main ( String args[] ) {

      Contact c1 = new Contact();
      c1.setDetails("Tara", "HP", "MSRIT" );
      Contact c2 = new Contact();
      c2.setDetails("Sam", "LinkedIn", "MSRIT"  );
      Contact c3 = new Contact();
      c3.setDetails("Ruth", "HP" , "BMSIT" );
      Contact c4 = new Contact();
      c4.setDetails("Anisha", "LinkedIn" , "BMSIT" );

    	ContactList c = new ContactList();
      c.addContact(c1);
      c.addContact(c2);
      c.addContact(c3);
      c.addContact(c4);

      c.showAll();

    	c.setSummarizer( new CollegeSummarize() );
    	c.display();

    	c.setSummarizer( new OrgSummarize() );
    	c.display();

    }


}
