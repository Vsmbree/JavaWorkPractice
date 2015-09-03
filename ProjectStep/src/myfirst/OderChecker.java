package myfirst;

import java.util.Scanner;
public class OderChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int user;
		int bolt;
		int nut;
		int washer;
		
		Scanner input = new Scanner(System.in);
	      System.out.println(" Number of bolts: ");
	      bolt = input.nextInt();
		  System.out.println(" Number of nuts ");
		   nut = input.nextInt();
		  System.out.println(" Number of washers");
		   washer = input.nextInt();
		   
		   System.out.println((bolt * 5) + (nut * 3) + (washer * 1)); 
		   System.out.println(If there are at least twice as many washers as bolt the order is o);
		  
	}

}
