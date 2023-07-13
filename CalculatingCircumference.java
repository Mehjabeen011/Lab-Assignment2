package Anudip;

import java.util.Scanner;

public class CalculatingCircumference {
	public static void main(String[] args) {
		// accepting data from user therefor i use scanner class...................
		double raddius, area, circumference;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of circule:");
		raddius = sc.nextDouble();
// calculating area of circumference of circule.......................
		area = Math.PI * raddius * raddius;
		circumference = 2 * Math.PI * raddius;
		System.out.println("Area of Circle:" + area);
		System.out.println("circumference of circle:" + circumference);
	}
}
