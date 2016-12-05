
import java.util.*;
import java.lang.*;

interface SummarizeStrat {

    public void summarize();

    public void setList( ArrayList<ContactModel> sumList );

}

class ContactModel {
  public String name, org ;

  public ContactModel ( String name, String org ){
    this.name = name;
    this.org = org;
  }
}

class SummarizeName implements SummarizeStrat, Comparable<Contact> {

    //summarizes contact list according to name of employess
    List<ContactModel> detail;

    public void summarize() {

      //TODO implement sorting algorithm
    /*  Collections.sort(detail, new Comparator<ContactModel>(){

        @Override
        public int compare(ContactModel c1, ContactModel c2)
        {
          return c1.name.compareTo(c2.name);
        }
      });*/

      for(int i = 0; i < detail.size(); i++)
      {
          ContactModel temp = detail.get(i);
          System.out.println( temp.name + "    " + temp.org);
      }
    }

    public void setList ( ArrayList<ContactModel> sumList) {
        detail = sumList;
    }

}

class SummarizeOrganization implements SummarizeStrat {

    //summarizes contact list according to name of organization

    public void summarize() {


    }

    public void setList ( ArrayList<ContactModel> sumList) {

    }
}


abstract class Contact {

  SummarizeStrat sm;
  ArrayList<ContactModel> listOfContacts = new ArrayList<>();

  public void setSummarizeMethod ( SummarizeStrat sm ){
        this.sm = sm;
  }

  public abstract void display();

  public void addDetail(String name, String org) {
        ContactModel cm = new ContactModel (name, org);
        listOfContacts.add(cm);
        sm.setList (listOfContacts);

  }

}

class ContactList1 extends Contact {

    public ContactList1(){
      sm = new SummarizeName();
    }

    public void display() {
        System.out.println("Sorting ContactList1");
        sm.summarize( );
    }
}

class ContactList2 extends Contact {

    public ContactList2(){
      sm = new SummarizeName();
    }

    public void display() {
        System.out.println("Sorting ContactList2");
        sm.summarize( );
}



}

public class TestStrategy {

    public static void main(String[] arg)
    {
       Contact a = new ContactList1();
        //name of employee and organization name
       a.addDetail("Ram", "Piper");
       a.addDetail("John","Company");
       a.addDetail("Suresh","Company2");
       a.addDetail("Abhi","Company2");

       a.setSummarizeMethod (new SummarizeName() );
       a.display();
      /* a.setSummarizeMethod (new SummarizeOrganization);
       a.display();*/

   }

}
