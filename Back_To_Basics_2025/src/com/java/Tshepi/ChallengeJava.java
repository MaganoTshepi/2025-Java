package com.java.Tshepi;

import java.util.Scanner;

public class ChallengeJava {
/*
 * Enter first number: 10
Enter second number: 3
Sum: 13
Difference: 7
Product: 30
Quotient: 3
Remainder: 1



*/
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
	       int data =sc.nextInt();
	       
	       System.out.print("Enter the second number :");
	      int datas = sc.nextInt();
	       System.out.println("Sum : " +(data + datas));
	       System.out.println("Difference : " +(data - datas));
	       System.out.println("Product : " +(data * datas));
	       System.out.println("Quotient : " +(data / datas));
	       System.out.println("Remainder : " +(data % datas));
	       
	       /*
	       Before Swap: a = 5, b = 8
	       After Swap: a = 8, b = 5
	      */
	       
	       
	        int a = 5;
	        int b = 8;

	        // Before swap
	        System.out.println("Before Swap: a = " + a + ", b = " + b);

	        // Swap using + and -
	        a = a + b; // a now becomes 13
	        b = a - b; // b becomes 5 (13 - 8)
	        a = a - b; // a becomes 8 (13 - 5)

	        // After swap
	        System.out.println("After Swap: a = " + a + ", b = " + b);
	        
	       
	        // Before swap
	        System.out.println("Before Swap: a = " + a + ", b = " + b);

	        // Swap using a temporary variable
	        int temp = a;
	        a = b;
	        b = temp;

	        // After swap
	        System.out.println("After Swap: a = " + a + ", b = " + b);

			/*
			 * Task: Write a Java program that:
			 * 
			 * Converts Celsius to Fahrenheit using the formula: Fahrenheit = (Celsius ×
			 * 9/5) + 32
			 * 
			 * Converts Fahrenheit to Celsius using the formula: Celsius = (Fahrenheit - 32)
			 * × 5/9
			 * 
			 * Example:
			 * 
			 * yaml Copy Edit Enter temperature in Celsius: 25 Fahrenheit: 77.0 or
			 * 
			 * yaml Copy Edit Enter temperature in Fahrenheit: 98 Celsius: 36.67 💡 Hint:
			 * Use double for precise calculations.
			 */	        
	        System.out.print("Enter the temperature in censius :  ");
	        double dou = sc.nextDouble();
	        double sum = (dou * 9/5) + 32;
	       
	        System.out.println("Fahrenheit: "+sum);
	        System.out.print("Enter the temperature in Fahrenheit:");
	        double ht = sc.nextDouble();
	        double conv = (ht - 32)* 5/9;
	        System.out.println("Celsius :" + conv);
	        
	        
			/*
			 * Task: Write a program that takes a character as input and prints its ASCII
			 * value.
			 * 
			 * Example:
			 * 
			 * less Copy Edit Enter a character: A ASCII Value: 65 💡 Hint: Use char and
			 * type cast it to int.
			 */
	        
	        System.out.print("Enter a character : ");
	        char ch = sc.next().charAt(0);
	        int numm = (int) ch;
	        System.out.println(numm);
	     
	        
	        /**
	         * Write a program that:

Stores an int in a double (implicit casting).

Stores a double in an int (explicit casting).

Stores an int in a char (explicit casting).

Example:

java
Copy
Edit
Implicit Casting (int to double): 10 -> 10.0
Explicit Casting (double to int): 99.99 -> 99
Explicit Casting (int to char): 65 -> A
💡 Hint: Use (int), (char), or let Java do implicit casting automatically.
	         */
	         
	        
	  int imp = 10;
	  double doImp  = imp;
	  System.out.println(doImp);
	        
	        
	  double hh = 99.99;
	  int hey = (int)hh;
	  System.out.println(hey);
	  
	  int tyr = 65;
	  char hgj = (char) tyr;
	  System.out.println(hgj);
	        
	        
	        
	        
	        
	        
	}

}
