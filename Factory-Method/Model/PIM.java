
import java.util.*;


/**
 * 
 */
public class PIM {



    /**
     * 
     */
    public ArrayList<Editable> items;
    public PIM()
    {
        items = new ArrayList<>();
    }

    public void addItem(Editable item) {
        ItemEditor editor = item.getEditor();
        editor.getInput();        
        items.add(item);        
    }

    public void displayItem(Editable item)
    {
        System.out.println(item.getEditor().display());
    }

    public void show()
    {   
        for (Editable item : items) {
            displayItem(item);            
        }
    }

}