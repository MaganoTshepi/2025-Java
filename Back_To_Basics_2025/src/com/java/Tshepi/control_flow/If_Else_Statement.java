package com.java.Tshepi.control_flow;

public class If_Else_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// If Statement(two conditions to test)  and if else if (Multiple conditions tested )
		// if statement Alone 
		int age = 10;
	
		
		if(age < 18) {
			System.out.println("You are very under Age, You cannot Vote");
			
			
		} else {
			System.out.println("You are an Adult");	
		}
		// If else if 
		
		int marks = 85;
		
		if (marks < 35) {
			System.out.println("You are of C grade"); 
			
		}else if (marks >=35 && marks <=60) {
			System.out.println("You are of B grade ");
			
		}else {
			System.out.println("You are A grade ");
		}
		
		
		
		
		/*
		 * // Switch Case statement is similar to if else statement No logical operators
		 * or relational operators to be used not use for multiple conditions to use
		 * cannot work on these data types : Boolean ,float ,long ,double break
		 * Only Data types accepted is : int ,byte , short ,char and string
		 * statement is used to leave the switch case no duplicate cases block allowed
		 * Defaults block is optional and execute if no case is matched
		 * more than 3 conditions use switch statements 
		 */
		 int month = 5;
		switch(month) {
		case 1 :
			System.out.println("January");
			break;
		case 2 :
			System.out.println("Fbeuary");
			break;
		case 12:
			System.out.println("December");
			default :
				System.out.println("Not Applicable");
				break;
			
		
		}
		
		/*
		 *  for loop - Repeating of same line of x=code multiple times
		 * Number of iterations fixed 
		 * Reduces lines of code 
		 * Used to iterate over array and collection 
		 * 1 - Variable is initialised 
		 * 2 - Condition is checked 
		 * 3 - If the condition is true then execute the code 
		 * 4 - Variable is incremented by 1   
		 * 5 - repeating the conditions until the variable has reached it's end 
		 * For loop id not the same as array starting with 0 ;
		 * The start is initialized by the developer / coder 
		 * Fixed number of Iterations 
		 * 
		 */
		
		for(int i = 1 ; i <=5;i++) {
			System.out.println("Hello Tshepi"); // printing the statement 5 times 
			
		}
		
		/*
		 *  while loop 
		 *  used when number of iterations  are not fixed 
		 *  conditions is evaluated 
		 *  
		 */
		int numberss = 1 ;
		
		while(numberss <= 5) {
			
			System.out.println("Hiii ");
			
			numberss ++ ;
			
		}
		
		/* 
		 * Array 
		 * - is a data type 
		 * Store multiple elements  inside a data type  single variables 
		 * stored based on the index 
		 * works with primitives and objects
		 * fixed size 
		 * Can't change on run time 
		 *  uses array symbol []
		 * spacify index new String [5]
		 * String names [] = new String [5];
		 * index starts with 0 
		 * Student [0] = "John"; - index intialized ;
		 * retrive all values or specific number or only 1 
		 * 
		 * retrieving all the data use for loop 
 		 * 
 		 * types of array - 1 dimensional array and 2D/Dimentional Array 
		 **/
		
		// 1D Array 
		int  intTest [] ;
		String studentNames []= {"John", "Smith","Omphimi","William","Tshepi" };
		
		System.out.println(studentNames[3]);
		
		for(int j = 0 ; j <studentNames.length; j++) {
			// studentNames.length specify the number of times it will execute based on the length
			System.out.println(studentNames[j]);
		}
			/*
			 * 2D array
			 * storing data in forms of rows and columns 
			 * 
			 * 
			 * 
			 */	
			
			int [][] studentMarks = new int [2][2];
			
			// assign value 
			studentMarks [0][0] = 5 ;
			studentMarks [0][1] = 6 ;
			
			studentMarks [1][0] = 12 ;
			studentMarks [1][1] = 34 ;
			
		//	System.out.println(studentMarks [0][0]);
			for(int i =0; i < studentMarks.length; i++) {
				for(int l = 0 ;l < studentMarks.length; l++ ) {
					System.out.print(studentMarks[i] [l] + "");

				}
				System.out.println();
			}
			
		}
	}


