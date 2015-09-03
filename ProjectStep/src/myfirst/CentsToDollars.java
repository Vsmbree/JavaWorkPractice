package myfirst;

import java.util.Scanner;
public class CentsToDollars {

	public static void main(String[] args) 
	
	{   
	
			int user;
			int dollars;
			int cents;
    
		      Scanner input = new Scanner(System.in);
		      System.out.println(" input the cents: ");
		      user = input.nextInt();
		   

		     dollars = user / 100;
		     cents = user% 100;
		     System.out.println("That is " + dollars + " dollars and " + cents + " and cents ");
		      // compute total amount of dollars, quarter, dimes, nickels, and pennies
		     
	}
}

	
