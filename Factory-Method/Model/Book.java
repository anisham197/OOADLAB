
import java.util.Scanner;

/**
 * 
 */

public class Book implements Editable {


    private String title,author;
    /**
     * @return
     */
    public ItemEditor getEditor() {        
        return new BookEditor();
    }

    /**
     * 
     */
    private class BookEditor implements ItemEditor {
        
        /**
         * 
         */
        public void getInput() {
            Scanner sc = new Scanner(System.in);
            String t,a;
            System.out.println("Enter Book tite, and author:");
            t = sc.nextLine();            
            a = sc.nextLine();            
            title = t;
            author = a;
        }

        /**
         * 
         */
        public String display(){            
            String message=  "You read "+title+" by "+author+".";            
            return message;            
        }

    }

}