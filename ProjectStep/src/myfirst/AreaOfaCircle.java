package myfirst;

import java.util.Scanner;
public class AreaOfaCircle {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the radius: ");
		//The radius is being put to
		
		
		double radius = sc.nextDouble();
		
		double area = Math.PI *(radius * radius);
		System.out.println("The area of circle is: " + area);
		
		double circumference= Math.PI *2*radius;
		System.out.println("The circumference of the circle is:"+circumference );
	}

}
