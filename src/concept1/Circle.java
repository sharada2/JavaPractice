package concept1;

import concept1.*;
import Controller.*;
import concept1.shapes;
/*
public class Circle implements shapes{
	private int radius;
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void area() {
		double Area = PI * radius * radius;
		double perimeter = 2 * PI * radius ;
		System.out.print(Area);
		System.out.println(perimeter);
	}
}
*/

public class Circle extends CirCotroller {
	public static void main(String args[]) {
		CirCotroller c = new CirCotroller();
		c.setRadius(10);
		int radius = c.getRadius();
		c.area();
	}
}