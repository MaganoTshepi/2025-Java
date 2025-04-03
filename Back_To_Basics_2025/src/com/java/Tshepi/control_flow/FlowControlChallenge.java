package com.java.Tshepi.control_flow;


import java.util.Scanner;

public class FlowControlChallenge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		 int grade = 15;
		if(grade <= 100) {
			System.out.println("A student");
		}else if (grade > 80  && grade <= 89 ) {
			System.out.println("B Student");
		}else if (grade > 70 && grade <= 79) {
			System.out.println(" C Student");
		} else if(grade > 60 && grade <= 69) {
			System.out.println("D Student");
		}else if(grade < 60) {
			System.out.println(" F for FAIL !!!!!  ");
		}
		else {
			System.out.println("Not applicable really ");
		}

		
		
		// String switch 
				System.out.print("Enter the Day of the week  :");
		     	String	weekDay = sc.nextLine().trim(); // trim() removes extra spaces 
		     	
		     	switch (weekDay) {
	            case "Monday":
	                System.out.println( weekDay + " First day of the work week!");
	                break;
	            case "Tuesday":
	                System.out.println(weekDay + " the Second day of the work week.");
	                break;
	            case "Wednesday":
	                System.out.println(weekDay + " is Midweek already!");
	                break;
	            case "Thursday":
	                System.out.println( weekDay + " Almost there.");
	                break;
	            case "Friday":
	                System.out.println( weekDay + " Last day of the work week!");
	                break;
	            case "Saturday":
	                System.out.println( weekDay + " Weekend is here!");
	                break;
	            case "Sunday":
	                System.out.println( weekDay + " Rest and recharge for the week ahead.");
	                break;
	            default:
	                System.out.println("Invalid day.");
	                break;
	        }
	  System.out.println("-----------------------------------------------------------------");
			        	
		System.out.print("Enter the first Number : ");
		int num1 = sc.nextInt();
		
		System.out.print(" Enter the Second Number : ");
		int num2 = sc.nextInt();
		 
		System.out.print(" Enter Operator + - / * % :");
		char operator = sc.next().charAt(0);
		
		double results;
		
		switch(operator) {
		case '+' :
			results = num1 + num2 ;
			System.out.println("Total of the calculation is : " + results);
			break;
			
		case '-' :
			results = num1 - num2 ;
			System.out.println("Total of the calculation is : " + results);
			break;
			
			
		case '*' :
			results = num1 * num2 ;
			System.out.println("Total of the calculation is : " + results);
			break;
			
			
		case '/' :
			results = num1  / num2 ;
			System.out.println("Total of the calculation is : " + results);
			break;
			
			
		case '%' :
			results = num1  % num2 ;
			System.out.println("Total of the calculation is : " + results);
			break;
			
			
			default :
               System.out.println("That calculation is not found ");
			
		}
		  System.out.println("--------------------------Banking"
		  		+ "---------------------------------------");
	        
		
		 System.out.println("Choose Account Type: 1. Savings  2. Current");
	        int accountType = sc.nextInt();
	        
	        System.out.println("Choose Transaction: 1. Deposit  2. Withdraw");
	        int transactionType = sc.nextInt();

	        switch (accountType) {
	            case 1:
	                switch (transactionType) {
	                    case 1:
	                        System.out.println("Depositing into Savings Account...");
	                        break;
	                    case 2:
	                        System.out.println("Withdrawing from Savings Account...");
	                        break;
	                    default:
	                        System.out.println("Invalid Transaction Type");
	                }
	                break;
	            case 2:
	                switch (transactionType) {
	                    case 1:
	                        System.out.println("Depositing into Current Account...");
	                        break;
	                    case 2:
	                        System.out.println("Withdrawing from Current Account...");
	                        break;
	                    default:
	                        System.out.println("Invalid Transaction Type ");
	                }
	                break;
	            default:
	                System.out.println("Invalid Account Type");
	        }
				
	        double savingsBalance = 5000.0;
	        double currentBalance = 10000.0;
	        System.out.println("-----------------------------------------------------------------");
	        
	        System.out.println("\n" +"Welcome to Tshepi  Bank!");
	        System.out.println("Select Account Type: 1. Savings  2. Current");
	        
	        int accountTy = sc.nextInt();

	        if (accountTy == 1 || accountTy == 2) {
	            System.out.println("Choose Transaction: 1. Deposit  2. Withdraw  3. Check Balance");
	            int transactionTy = sc.nextInt();
	            
	            if (transactionTy == 1) {  // Deposit
	                System.out.print("Enter deposit amount: ");
	                double amount = sc.nextDouble();
	                
	                if (accountTy == 1) {
	                    savingsBalance += amount;
	                    System.out.println("New Savings Balance: $" + savingsBalance);
	                } else {
	                    currentBalance += amount;
	                    System.out.println("New Current Balance: $" + currentBalance);
	                }
	            } 
	            else if (transactionTy == 2) { // Withdraw
	                System.out.print("Enter withdrawal amount: ");
	                double amount = sc.nextDouble();
	                
	                if (accountTy == 1) {
	                    if (amount <= savingsBalance) {
	                        savingsBalance -= amount;
	                        System.out.println("Withdrawal successful! New Savings Balance: $" + savingsBalance);
	                    } else {
	                        System.out.println("❌ Insufficient Funds in Savings Account.");
	                    }
	                } else {
	                    if (amount <= currentBalance) {
	                        currentBalance -= amount;
	                        System.out.println("Withdrawal successful! New Current Balance: $" + currentBalance);
	                    } else {
	                        System.out.println("❌ Insufficient Funds in Current Account.");
	                    }
	                }
	            } 
	            else if (transactionTy == 3) { // Check Balance
	                if (accountTy == 1) {
	                    System.out.println("Savings Account Balance: $" + savingsBalance);
	                } else {
	                    System.out.println("Current Account Balance: $" + currentBalance);
	                }
	            } 
	            else {
	                System.out.println("❌ Invalid Transaction Type!");
	            }
	        } else {
	            System.out.println("❌ Invalid Account Type! Please restart.");
	        }
	        
	        sc.close();
	}

}
	

