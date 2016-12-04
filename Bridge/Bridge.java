class DP1{
	public static void draw_a_line(double x1, double y1, double x2, double y2){
		System.out.println("Line from ("+x1+", "+y1+" to ("+x2+", "+y2+")");
	}

	public static void draw_a_circle(double radius) {
		System.out.println("Drawing Circle of radius " + radius);
	}
}

class DP2{
	public static void drawline(double x1, double y1, double x2, double y2){
		System.out.println("Line from ("+x1+", "+y1+" to ("+x2+", "+y2+")");
	}

	public static void drawcircle(double radius) {
		System.out.println("Drawing Circle of radius " + radius);
	}
}

abstract class Drawing{
	abstract void getDescription();
	abstract void drawLine(double x1, double y1, double x2, double y2);
	abstract void drawCircle(double radius);
}

class V1Drawing extends Drawing{
	void getDescription(){
		System.out.println(" Im using Dp1");

	}
	void drawLine(double x1, double y1, double x2, double y2){
		DP1.draw_a_line(x1, y1, x2, y2);
	}

	void drawCircle(double radius){
		DP1.draw_a_circle(radius);
	}
}

class V2Drawing extends Drawing{
	void getDescription(){
		System.out.println(" Im using Dp2");

	}
	void drawLine(double x1, double y1, double x2, double y2){
		DP2.drawline(x1, y1, x2, y2);
	}

	void drawCircle(double radius){
		DP2.drawcircle(radius);
	}
}
abstract class Shape{
	Drawing drawing;
	public Shape(Drawing drawing){
		this.drawing = drawing;
	}
	abstract void draw();
}

class Rectangle extends Shape{
	double _x1, _y1, _x2, _y2;
	Rectangle(Drawing dp, double x1, double y1, double x2, double y2){
		super(dp);
		_x1 = x1;
		_y1 = y1;
		_x2 = x2;
		_y2 = y2;

	}

	public void draw(){
		drawing.getDescription();
		drawing.drawLine(_x1, _y1, _x2, _y1);
		drawing.drawLine(_x2, _y1, _x2, _y2);
		drawing.drawLine(_x2, _y2, _x1, _y2);
		drawing.drawLine(_x1, _y2, _x1, _y1);
	}
}

class Circle extends Shape {
	double radius;
	public Circle(Drawing dp, double radius) {
		super(dp);
		this.radius = radius;
	}

  public void draw() {
		drawing.getDescription();
		drawing.drawCircle(radius);
  }

}

public class Bridge{
	public static void main(String[] args) {
		Drawing dp1 = new V1Drawing();
		Drawing dp2 = new V2Drawing();
		Shape rect1 = new Rectangle(dp1, 10, 200, 20, 100);
		rect1.draw();
		Shape rect2 = new Rectangle(dp2, 10, 200, 20, 100);
		rect2.draw();
		Shape circ1 = new Circle (dp1, 5);
		circ1.draw();
		Shape circ2 = new Circle (dp2, 5);
		circ2.draw();
	}
}
