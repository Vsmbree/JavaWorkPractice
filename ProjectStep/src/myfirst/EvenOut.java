package myfirst;

public class EvenOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19
				,20,21,22,23,24,25,26,27,30,31,32,33,34,35,36,37,38,39,41,42,43,44};
		
		for(int i=0; i < numbers.length; i++){
			
			/*
			 * use modulus operator to check if the number is even or odd
			 * If we divide any number by 2 and the reminder is 0 then the number 
			 * is even, other it is odd
			 */
			
			if(numbers[i]%2 == 0)
				System.out.println(numbers[i] + " is even number ");
			else
				System.out.println(numbers[i] + " is odd number ");
		}
	}

}
