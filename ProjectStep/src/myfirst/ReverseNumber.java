package myfirst;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 123456;
		int reversedNumber = 0;
		int temp = 0;
		
		while(number > 0){
			
			
			temp = number%10;
			
			
			reversedNumber = reversedNumber * 10 + temp;
			number = number/10;
			
			
			System.out.println("Reversed Number is: " + reversedNumber);
		}
		
	}

}
// reversed number is 004761
// reversed number is 654321