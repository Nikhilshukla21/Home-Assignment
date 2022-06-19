/*Create rectangle class-
states-length,width
calculare area and perimeter using method*/
package oops;

class Rectangle {
	// instance variable
	private int length;
	private int breadth;

	// assigning value in above variable using constructor
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// Method for calculate Perimeter of rectangle
	public int calculatePerimeter() {
		int p = 2 * (length + breadth);
		return p;
	}

	// Method for calculate area of rectangle
	public int calculateArea() {
		int a = (length * breadth);
		return a;
	}
}// End class Rectangle

public class RectangleAreaPerimeter {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(50, 40);
		int p = rectangle.calculatePerimeter();
		System.out.println("Perimeter of Rectangle: " + p);
		int a = rectangle.calculateArea();
		System.out.println("Area of Rectangle: " + a);

	}

}
