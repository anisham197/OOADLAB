

import java.util.*;

/**
 *
 */
public interface Customize {

    /**
     * @return
     */
    public void change();

}
import java.util.*;

/**
 *
 */
public class Color implements Customize {

    /**
     * Default constructor
     */
    public Color() {
    }

    /**
     *
     */
    public String color;

    /**
     * @return
     */
    public void change() {
        // TODO implement here
       Scanner in=new Scanner(System.in);
	System.out.println(" Enter the font color ");
	color=in.next();
	 System.out.println("Font color changed to "+color);
    }

}



import java.util.*;

/**
 *
 */
public class FontSize implements Customize {

    /**
     * Default constructor
     */
    public FontSize() {
    }

    /**
     *
     */
    public int size;

    /**
     * @return
     */
    public void change() {
        // TODO implement here
	Scanner in=new Scanner(System.in);
	System.out.println(" Enter the font size ");
	size=in.nextInt();
	 System.out.println("Font size changed to "+size);
        //return null;
    }

}



import java.util.*;

/**
 *
 */
public class FontType implements Customize {

    /**
     * Default constructor
     */
    public FontType() {
    }

    /**
     *
     */
    public String type;

    /**
     * @return
     */
    public void change() {
        // TODO implement here
        Scanner in=new Scanner(System.in);
	System.out.println(" Enter the font type ");
	type=in.next();
	 System.out.println("Font type changed to "+type);
    }

}

import java.util.*;

/**
 *
 */
public class CustomizeApplication {

    /**
     * Default constructor
     */
    public CustomizeApplication() {
	size=new FontSize();
	type=new FontType();
	color=new Color();
    }

    /**
     *
     */
    public Customize size;

    /**
     *
     */
    public Customize type;

    /**
     *
     */
    public Customize color;



    /**
     * @return
     */
    public void changeSize() {
        // TODO implement here
        size.change();
    }

    /**
     * @return
     */
    public void changeType() {
        // TODO implement here
       type.change();
    }

    /**
     * @return
     */
    public void changeColor() {
        // TODO implement here
       color.change();
    }

}



import java.util.*;

/**
 *
 */
public class Client {

    /**
     * Default constructor
     */
    public Client() {

    }

    /**
     *
     */

	public static void main(String args[])
	{
		CustomizeApplication obj = new CustomizeApplication();
		obj.changeSize();
		obj.changeType();
		obj.changeColor();
	}


}
