
import java.util.*;

public class OrgSummarize implements SummarizeStrat {

   public void summarize( ArrayList<Contact> list)
   {
     System.out.println("Organizing according to Organization\n");
     ArrayList<String> organizations = new ArrayList();
     for(Contact con: list){
         String org = con.getOrg();
         if(!organizations.contains(org))
            organizations.add(org);
     }
     for(String org: organizations){
         System.out.println("Organization:" + org);
         for(Contact con: list){
             String o = con.getOrg();
             if(o.equals(org)){
                 System.out.println(con.getName());
             }
         }
     }
   }
 }
