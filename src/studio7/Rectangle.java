package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double width;
	private double length;
	
	public Rectangle() {
		width = 0;
		length = 0;
	}
	
	public Rectangle(double initWidth, double initLength) {
		width = initWidth;
		length = initLength;
	}
	
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	
	public void draw() {
		StdDraw.rectangle(0.5, 0.5, getWidth()/2, getLength()/2);
		StdDraw.text(0.8,  0.9, "Area: " + width*length);
		StdDraw.text(0.8, 0.8, "Perimeter: " + 2*(width + length));
		StdDraw.text(0.8, 0.7, "Square: " + (width == length));
	}
	
	public double area() {
		return width * length;
	}
	
	public double perimeter() {
		return 2*(width + length);
	}
	
	public boolean isSquare() {
		return (length == width);
	}
	
	public static boolean compare(Rectangle r1, Rectangle r2) {
		return (r1.area() > r2.area());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(0.2, 0.3);
		r1.draw();
		r1.area();
		Rectangle r2 = new Rectangle(0.7, 0.2);
		Rectangle r3 = new Rectangle(0.3,0.3);
		r3.draw();
		System.out.println(compare(r1, r2)); 
		System.out.println(r2.isSquare()); 
		System.out.println(r3.isSquare()); 
	}

}
