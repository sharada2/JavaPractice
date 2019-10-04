package Controller;

import concept1.*;
/*
public class TriContr extends Triangle {
	public static void main(String args[]) {
		Triangle tri = new Triangle();
		tri.setLength1(10);
		int length = tri.getLength1();
		
	}
}
*/

public class TriContr implements shapes{
	private int length1;
	private double area;
	private int base;
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	

	public int getLength1() {
		return length1;
	}

	public void setLength1(int length1) {
		this.length1 = length1;
	}

//	@Override
//	public double Area(int l) {
//		// TODO Auto-generated method stub
//		area = Math.sqrt(3)/4*l*l;
//		return area;
//		//System.out.print("Area of equlateral traingle is"+area);
//	}

	
	

//	@Override
//	public double Area(int l, int b) {
//		// TODO Auto-generated method stub
//		area = l*b/2;
//		return area;
//		//System.out.print("Area of isosceleus traingle is \t"+area);
//	}*

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float Area(int l) {
		// TODO Auto-generated method stub
		area = Math.sqrt(3)/4*l*l;
		return (float)area;
		
	}

	@Override
	public float Area(int l, int b) {
		// TODO Auto-generated method stub
		area = l*b/2;
		return (float)area;
	}
	
	
}