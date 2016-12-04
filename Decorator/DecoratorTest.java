abstract class Component{
  abstract void display();
}

abstract class Shape extends Component{

}

class Rectangle extends Shape{

	public void display(){
    System.out.println("Rectangle");
	}
}

class Circle extends Shape {

  public void display() {
    System.out.println("Circle");
  }

}

abstract class BorderDecorator extends Component {
  Component myComponent;

  public BorderDecorator (Component myComponent){
    this.myComponent = myComponent;
  }

  public void printShape(){
    if(myComponent != null)
      myComponent.display();
  }

}

class DottedBorder extends BorderDecorator{

      public DottedBorder (Component myComponent){
        super(myComponent);
      }

      public void display(){
        System.out.println("Dotted Border");
        super.printShape();
        System.out.println("Dotted Border");
      }
}

class ColouredBorder extends BorderDecorator{
  public ColouredBorder (Component myComponent){
    super(myComponent);
  }

  public void display(){
    System.out.println("Coloured Border");
    super.printShape();
    System.out.println("Coloured Border");
  }

}

public class DecoratorTest {

    public static void main ( String args[]){
        Component myComponent;
        myComponent = new Rectangle();
        myComponent = new ColouredBorder (myComponent);
        myComponent = new DottedBorder(myComponent);
        myComponent = new ColouredBorder(myComponent);
        //myComponent = new ColouredBorder ( new DottedBorder (new ColouredBorder (new Rectangle() )));
        myComponent.display();
    }
}
