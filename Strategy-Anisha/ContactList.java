
import java.util.*;

public class ContactList {

    public SummarizeStrat sm;
    public static ArrayList<Contact> list;

    public ContactList (){
        list = new ArrayList<> ();
    }

    public void setSummarizer( SummarizeStrat sm) {
    	this.sm = sm;
    }

    public void addContact (Contact c ){
        list.add(c);
    }

    public void showAll(){
      for(Contact con: list){
        System.out.println( con.getName() + " " + con.getOrg() + " " + con.getCollege());
      }
    }

    public void display()
    {
        System.out.println("\nOrganizing Contact List");
        sm.summarize( list );
    }
}
