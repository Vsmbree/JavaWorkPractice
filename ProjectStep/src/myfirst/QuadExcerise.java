package myfirst;
import java.util.Scanner;

public class QuadExcerise {

	public static void main(String[] args) {
		
		double quad = 0;
		double x = 0;
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter value for x: ");
		x =input.nextDouble(); 
		
		quad =3*x*x-8*x+4;
		System.out.println("At x: " +x+ " the val ue is " + quad);
		
	}
}
