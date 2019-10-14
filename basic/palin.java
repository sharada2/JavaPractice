package basic;

import java.util.Scanner;

public class palin {
		public static void main(String args[]) {
			System.out.print("enter the string\t");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			char m[]=name.toCharArray();
			String b="";
			int length = name.length();
		    for(int i=length-1;i>=0;i--)
		    {
		    	b=b+m[i];
		    	//System.out.println(b);
		    }
		    if(name.equalsIgnoreCase(b))
		    {
		    	System.out.println("String is palindrome");
		    }else {
		    	System.out.print("String is not palindrome");
		    }
	}
}
