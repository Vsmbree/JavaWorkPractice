package myfirst;

		import java.util.Random;
		import java.util.Scanner;
		

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner newscanner= new Scanner(System.in);// creates Scanner
		boolean check=false; //boolean value for while loop
		int number,counter=0;  //number will be input,counter keeps track of while loop
		int rng=(int) (Math.random()*10+1);//generates a random number from 1-10
		//System.out.println(rng);  //prints out the number,used for testing
		while(check==false)
		{
			if(counter>2)
			{System.out.println("You are out of guesses, you Lose!");	
				break; //break exits the while loop
			}
			
		System.out.println("Please pick a number from 1-10");
		number=newscanner.nextInt();
		
			if(number==rng)  {//if the input manages random number you win
			System.out.println("Right! You won the game");
			check=true;
			}
			else if(( number+1==rng) || (number-1==rng)) {// if you are 1 number below or above random you are hot
				System.out.println("Hot");
			}
			else if(( number+2==rng) || (number-2==rng)){
				System.out.println("Warm");
				}
			else
			System.out.println("Cold");{
			
		}
			counter++; 
		
			
	}

	}
}