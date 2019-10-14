package Controller;

import Model.Tri_mod;
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
	
	
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Area(int l) {
		// TODO Auto-generated method stub
		return Math.sqrt(3)/4*l*l;
	}

	@Override
	public double Area(double l, double b) {
		// TODO Auto-generated method stub
		return l*b/2;
	}
	
	
}