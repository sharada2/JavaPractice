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
import Model.Tri_mod;

public class Triangle extends TriContr {
	public static void main(String args[]) {
		TriContr tri = new TriContr();
		Tri_mod trimod = new Tri_mod();
		System.out.println("enter triangle type 1 or 2");
		System.out.println("1.Equilateral \t 2.Isoceleus \n");
		
		Scanner sc = new Scanner(System.in);
		int triType = sc.nextInt();
		
		if(triType == 1) {
			System.out.println("enter triangle length \t");
			int l =sc.nextInt();
			trimod.setLength1(l);
			double triArea  = tri.Area(trimod.getLength1());
			System.out.print("Area of Equilateral traingle\t"+triArea);
		}else if(triType == 2) {
			System.out.print("enter triangle length \t");
			int l =sc.nextInt();
			trimod.setLength1(l);
			System.out.print("enter triangle base \t");
			int b = sc.nextInt();
			trimod.setBase(b);
			double isoArea = tri.Area(trimod.getLength1(),trimod.getBase());
			System.out.print("Area of Isoceleus traingle\t"+isoArea);
			
		}else {
			System.out.print("Invalid");
		}
		/*
		int length1 =10;
		tri.setLength1(length1);
		int length = tri.getLength1();*/
		
	}
}