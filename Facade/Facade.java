import java.util.*;

interface Customize {
    public void change();
}

class Color implements Customize {

    public String color;

    public void change() {
      Scanner in = new Scanner(System.in);
      System.out.println(" Enter the font color ");
	    color = in.next();
	    System.out.println("Font color changed to " + color);
    }

}

class FontSize implements Customize {

    public int size;

    public void change() {
      Scanner in = new Scanner(System.in);
	    System.out.println(" Enter the font size ");
	    size = in.nextInt();
	    System.out.println("Font size changed to " + size);
    }
}

class FontType implements Customize {

    public String type;

    public void change() {
      Scanner in = new Scanner(System.in);
      System.out.println(" Enter the font type ");
      type = in.next();
      System.out.println("Font type changed to " + type);
    }

}

class CustomizeApplication {

    Customize size, type, color;

    public CustomizeApplication() {
      size = new FontSize();
	    type = new FontType();
	    color = new Color();
    }

    public void changeSize() {
        size.change();
    }

    public void changeType() {
        type.change();
    }

    public void changeColor() {
        color.change();
    }
}

public class Facade {

  public static void main(String args[])
	{
		CustomizeApplication obj = new CustomizeApplication();
		obj.changeSize();
		obj.changeType();
		obj.changeColor();
	}


}
