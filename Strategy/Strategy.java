
import java.util.*;

public interface NameList {


    public void summarize();

   
    public void listOfNames(HashMap< Integer, ArrayList<String>>  hmap );

}


import java.util.*;

/**
 *
 */
public class SummarizeName implements NameList {

    ArrayList<String> detail = new ArrayList<>();;
    String[] name;
    
    public SummarizeName() {

    }



    public void summarize() {
        // TODO implement here
        Arrays.sort(name);
        for(int i=0; i<name.length; i++)
        {
            System.out.println(name[i]);
        }

    }

   
    public void listOfNames(HashMap< Integer, ArrayList<String>>  hmap ) {
        // TODO implement here
        name= new String[hmap.size()];

        for(int i=0; i<hmap.size(); i++)
        {
          detail= hmap.get(i);
          name[i] = detail.get(0);
        }
    }

}



import java.util.*;

public class SummarizeOrganization implements NameList {

    public SummarizeOrganization() {
    }

  
    public void summarize() {
        // TODO implement here

    }

 
    public void listOfNames(HashMap< Integer, ArrayList<String>>  hmap () {
        // TODO implement here
    }

}



import java.util.*;

public abstract class Contact {

    public Contact() {
    }

    public Contact(NameList name)
    {
          this.name=name;
          i=0;
          hashmap = new  HashMap<>();
    }

   
    public int i;


    public HashMap<Integer, ArrayList<String>> hashmap;

    public abstract void display();

    public void addDetail(String s1, String s2) {
        // TODO implement here
        ArrayList<String> al= new ArrayList<>();
        al.add(s1);
        al.add(s2);
        hashmap.put(i,al);
        name.listOfNames(hashmap);
        i++;
    }

}



import java.util.*;

public class ContactList1 extends Contact {

    static NameList nam = new SummarizeName();
  
    public ContactList1() {
        super(nam);
    }

 
    public void display() {
        // TODO implement here
        name.summarize();

    }

 

}



import java.util.*;

public class ContactList2 extends Contact {
    static NameList nam = new SummarizeOrganization();
 
    public ContactList2() {
      super(nam);
    }

   
    public void display() {
        // TODO implement here
        name.summarize();

    }



}



import java.util.*;

public class Client {

  
    public Client() {
    }

    public static void main(String[] arg)
   {

       Contact a = new ContactList1();
       a.addDetail("Ram", "Piper");
       a.addDetail("John","Company");
       a.addDetail("Suresh","Company2");
       a.addDetail("Abhi","Company2");
       a.display();
  
   }

}
