package basic;

import java.util.Scanner;

public class fibonacci {
	public static void main(String args[]) {
		System.out.print("Enter the number\t");
		//System.out.println(n1+" "+n2);
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		fibonaci(number);
		//System.out.println(n1+""+n2);
	}
	
	static void fibonaci(int n) {
		System.out.print("\t"+n);
		int n1 = 0;
		int n3;
		int n2 = 1;
		if(n>0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 =n3;
			
			fibonaci(n-1);
		}
	}
}
