public class Adapter{
	public static void main(String[] args) {
		Shape rect = new Rectangle();
		Shape cir = new Circle();
		rect.draw();
		rect.fill();
		rect.display();

		cir.draw();
		cir.fill();
		cir.display();
	}
}

abstract class Shape	{
	abstract void fill();
	abstract void draw();
	abstract void display();
}

class Rectangle extends Shape {
	XXRectangle myRectangle = new XXRectangle();
	void fill(){
		myRectangle.fillIt();
	}
	void draw(){
		myRectangle.drawIt();
	}
	void display(){
		myRectangle.displayIt();
	}

}
class Circle extends Shape{
	void fill(){
		System.out.println("Filling Colour in Circle");
	}
	void draw(){
		System.out.println("Creating a Circle");
	}
	void display(){
		System.out.println("Displaying Circle");
	}
}

class XXRectangle{
	public void fillIt(){
		System.out.println("Filling Colour in Rectangle");
	}
	public void drawIt(){
		System.out.println("Creating a Rectangle");

	}
	public void displayIt(){
		System.out.println("Displaying Rectangle");
	}
}
