import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

class Contact {
    public String name,org,col;
    Contact(String n,String o,String c)
    {
        name = n;
        org = o;
        col = c;
    }
    String getCollege() {return col;}
    String getOrg() {return org;}
    String getName() {return name;}
    void display()
    {
        System.out.println(name+", from "+col+" works at "+org);
    }
}

interface Summarizer {
    void summarize(ArrayList<Contact> contacts);
}

class SortbyCollege implements Summarizer{
    HashMap<String,ArrayList<Contact>> hmap;
    SortbyCollege()
    {
        hmap = new HashMap<String,ArrayList<Contact>>();
    }
    public void summarize(ArrayList<Contact> contacts){
        
        System.out.println("Summarizing By College:");
        for(Contact c:contacts)
        {                        
            ArrayList<Contact> t = hmap.get(c.getCollege());
            if(t==null)
            {  
                t = new ArrayList<Contact>();
            }
            t.add(c);             
            hmap.put(c.getCollege(),t);            
        }
                        
        for(String college:hmap.keySet())
        {
            System.out.println("Students studying in "+ college+":");
            for(Contact c: hmap.get(college)){
                System.out.println(c.getName());
            }
        }
    }
}

class ContactList {
    ArrayList<Contact> contacts;
    Summarizer sm;
    ContactList()
    {
        contacts = new ArrayList<Contact>();
    }
    void add(Contact c)
    {
        contacts.add(c);
    }
    void setSummarizer(Summarizer s)
    {
        sm = s;
    }
    void displaySummary()
    {
        sm.summarize(contacts);
    }
}

public class SimpleStrategy
{
    public static void main(String[] args) {
        ContactList l = new ContactList();
        l.setSummarizer(new SortbyCollege());
        l.add(new Contact("Arjun","Google","MSRIT"));
        l.add(new Contact("Anisha","LinkedIn","MSRIT"));
        l.add(new Contact("Ayush","I2U2","PESU"));
        l.add(new Contact("Rishab","IISC","BMSCE"));
        l.displaySummary();
    }
}