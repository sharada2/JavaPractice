package concept1;

import concept1.*;

import java.util.Scanner;

import Controller.*;
import Model.Cir_Mod;
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
		Cir_Mod cmod = new Cir_Mod();
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("Enter the radius");
		int r = sc.nextInt();
		cmod.setRadius(r);
		int radius = cmod.getRadius();
		double cirArea =  c.Area((float)radius);
		System.out.print("Area of circle \t"+cirArea);
	}
}