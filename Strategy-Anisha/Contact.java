
import java.util.*;

public class Contact{

    String name,organization, college;

    public Contact(){}

    public void setDetails(String name, String organization, String college){
          this.organization=organization;
          this.name=name;
          this.college = college;
      }
    public String getOrg(){return organization;}
    public String getName(){return name;}
    public String getCollege(){return college;}
}
