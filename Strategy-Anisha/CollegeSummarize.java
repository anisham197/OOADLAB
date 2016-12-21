
import java.util.*;

public class CollegeSummarize implements SummarizeStrat {

  public void summarize( ArrayList<Contact> list)
  {
    System.out.println("Organizing according to College\n");
    ArrayList<String> colleges = new ArrayList();
    for(Contact con: list){
        String col = con.getCollege();
        if(!colleges.contains(col))
           colleges.add(col);
    }
    for(String col: colleges){
        System.out.println("College:" + col);
        for(Contact con: list){
            String c = con.getCollege();
            if(c.equals(col)){
                System.out.println(con.getName());
            }
        }
    }
  }

}
