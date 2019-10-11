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
	@Override
	public double Area(float radius) {
		
		double Area = PI * radius * radius;
		return Area;
//		double perimeter = 2 * PI * radius ;
		//System.out.println(Area);
		//System.out.println(perimeter);
	}

//	@Override
//	public void Area() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public double Area(int l) {
		return 0.0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double Area(double l, double b) {
		return 00.000;
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public double Area(float r) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	

}