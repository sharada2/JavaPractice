package basic;

import java.util.Scanner;

public class factorial {
	public static void main(String args[]) {
		int i, factorial = 1;
		System.out.print("Enter the number to calculate factorial\t");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print("Factorial is \t"+factorial(number));
		
	}
	static int factorial(int n){
		if(n ==0) {
			return 1;
		}
		else {
			return(n*factorial(n-1));		
		}
	}
}
