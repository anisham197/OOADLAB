
import java.util.*;

public class PIM {

    public ArrayList<Editable> items;

    public PIM()
    {
        items = new ArrayList<>();
    }

    public void addItem(Editable item) {
        ItemEditor editor = item.getEditor(); // Factory Method
        editor.getInput();
        items.add(item); // Adding to Array List
    }

    public void show()
    {
        for (Editable item : items) {

          ItemEditor editor = item.getEditor(); // Factory Method
          editor.display();
        }
    }

}
