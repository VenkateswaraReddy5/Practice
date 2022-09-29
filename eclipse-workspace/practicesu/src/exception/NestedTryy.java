package exception;

import java.util.Scanner;

public class NestedTryy {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b values");
		
		     int a=sc.nextInt();
		     int b=sc.nextInt();
		     int c=0;
		     try {
		    	  c=a/b;
		    	  System.out.println(c);
		     }catch(ArithmeticException e) {
		    	 System.out.println("Divisible by zero is not possible");
		    	 System.out.println(e.getMessage());
		    	 e.printStackTrace();
		    	 System.out.println("enter denaminator other than zero");
		    	 b=sc.nextInt();
		    	 try {
		    		 c=a/b;
		    		 System.out.println(c);
		    	 }catch(ArithmeticException e1) {
		    		 System.out.println(e1.getMessage());
		    	 }
		     }
		     sc.close();

	}

}
