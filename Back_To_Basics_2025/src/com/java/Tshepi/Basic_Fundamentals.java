package com.java.Tshepi;


/* Basic Java fundamentals 
 * 
 * Local Variable 
 * 
 * Created in a method / block 
 * Accessible inside a method /block only 
 * it cannot be static 
 * no access modifiers applicable (Public ,protected, private )
 * assigning a value is mandatory 
 * stored in stack memory area 
 * 
 * Static Variables 
 * Created outside method/block 
 * created with the static keyword 
 * No need to create an object to call it 
 * no mandatory value to assign 
 * Accessable to all the method in a class 
 * access modifiers can ble applied 
 * stored in a method memory area  
 * 
 * Instance Variables 
 * Variable created outside the method inside the class 
 *  Created outside method/block 
 * no mandatory value to assign 
 * Accessable to all the method in a class 
 * access modifiers can ble applied  
 * Stored in the Heap memory 
 * we can use the variable using an object 
*/


/*more information 
system.out.println - print the data and moves to the next line 
system.out.print - display the results but the curser stays in the same line 
\n - New Line 
\t - space tab 
\"" = double quates 
\\  - backspace
%d - intergers 
%f - for floating number 
%.2f  - 2 decimal places 
System.out.printf()-  The %f format specifier is used in formatted output to represent floating-point 
numbers (decimal numbers) when using System.out.printf() or String.format().

*/
public class Basic_Fundamentals {
	
	String address = "Mafikeng"; // Instance variable 
	
	static String familyName = "MAGANO"; // static variable   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic_Fundamentals  bs = new Basic_Fundamentals (); 
		
		String firstName = "Keotshepile"; // Local variable 
		char alpha = 'A';
		int age = 30;
		short ag = 44;
		long count = 2232; 
		float money = 22.5055665f;
		double salary = 15000.00;
				
		System.out.println(firstName  + " "+ familyName + "\n"+ bs.address  +  " "+ alpha);
		System.out.print(age);
		System.out.printf(" Age:%d | Money : %.4f" , ag ,money );
		System.out.println("");
		
	
		// Operators 
		
		int num1 = 500;
		int num2 = 1000;
		int num3 = 200;
		// Arithmetic Operators 
		System.out.println(num1 + num2 ); // Addition 
		System.out.println(num1 - num2 ); // Subtraction
		System.out.println(num1 * num2 ); // Multiplication 
		System.out.println(num1 / num2 ); //division 
		System.out.println(num1 % num2 ); // remainder / moduler 
		System.out.println(num1 + num2 /num3 * num1  % num2 +  "\n");
		
		
		// Assignment operator 
		int number = 200;
		number += 5;
		System.out.println(number);
		number -= 50;
		System.out.println(number);
		number /= 20;
		System.out.println(number);
		number *= 2;
		System.out.println(number + "\n");
		
		
		
		
		
		
		//logigal operators  results is either True or false 
		//&& AND both conditions must be true = true 
		System.out.println(num1 > num2 && num2 > num3); // results is false 
		System.out.println(num1 <num2 && num2 > num3 ); // results is true 
		
		
		// OR || only one conditions can be true 
		
		System.out.println(num2 > num3 || num3 != num1 ); // resuts is true 
		System.out.println(num2 == num3 || num3 >= num1  ); // results is false 
		System.out.println();
		
		
		// type casting 
		/* There are two types of type casting 
		 * Widening / Implicit casting - big  data type
		 * Narrowing / Explicit casting - Shrinking data type 
		 * 
		 */
		
		// Widening casting 
		
		int myInt = 500;
		double myDouble = myInt;
		System.out.println(myInt);
		System.out.println(myDouble + "\n");		
		
		
		// Narrowing casting 
		
		double keo = 5;
		int love = (int) keo ;
		System.out.println(keo);
		System.out.println(love + "\n");
		
		
	}

}
