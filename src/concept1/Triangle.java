package concept1;

import java.util.Scanner;

import Controller.*;
/*
public class Triangle implements shapes{
	private int length1;

	public int getLength1() {
		return length1;
	}

	public void setLength1(int length1) {
		this.length1 = length1;
	}
}*/

public class Triangle extends TriContr {
	public static void main(String args[]) {
		Triangle tri = new Triangle();
		System.out.println("enter triangle type 1 or 2");
		System.out.println("1.Equilateral \t 2.Isoceleus \n");
		
		Scanner sc = new Scanner(System.in);
		int triType = sc.nextInt();
		
		if(triType == 1) {
			System.out.println("enter triangle length \t");
			int l =sc.nextInt();
			tri.setLength1(l);
			tri.Area(tri.getLength1());
			
		}else if(triType == 2) {
			System.out.print("enter triangle length \t");
			int l =sc.nextInt();
			tri.setLength1(l);
			System.out.print("enter triangle base \t");
			int b = sc.nextInt();
			tri.setBase(b);
			tri.Area(tri.getLength1(),tri.getBase());
			
		}else {
			System.out.print("Invalid");
		}
		/*
		int length1 =10;
		tri.setLength1(length1);
		int length = tri.getLength1();*/
		
	}
}