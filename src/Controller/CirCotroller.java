package Controller;

import concept1.Circle;
import concept1.shapes;
/*
public class CirCotroller extends Circle {
	public static void main(String args[]) {
		Circle c = new Circle();
		c.setRadius(10);
		int radius = c.getRadius();
		c.area();
	}

}*/

//package concept1;

public class CirCotroller implements shapes{
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
		System.out.println(Area);
		System.out.println(perimeter);
	}

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Area(int l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Area(int l, int b) {
		// TODO Auto-generated method stub
		
	}
	

}