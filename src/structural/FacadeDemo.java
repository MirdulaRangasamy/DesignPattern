package structural;
interface Shape{
	void draw();
}

class Circle implements Shape{
	public void draw() {
		System.out.println("Drawing Circle...");
	}
}
class Square implements Shape{
	public void draw() {
		System.out.println("Drawing Square...");
	}
}
class Rectangle implements Shape{
	public void draw() {
		System.out.println("Drawing Rectangle...");
	}
}
class ShapeMaker{
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawSquare() {
		square.draw();
	}
}
public class FacadeDemo {

	public static void main(String[] args) {
		ShapeMaker sm = new ShapeMaker();
		sm.drawCircle();
		sm.drawRectangle();
		sm.drawSquare();
	}
}
