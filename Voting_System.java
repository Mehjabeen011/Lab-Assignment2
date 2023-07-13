package Anudip;

import java.util.Scanner;

public class Voting_System {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You are Eligible for Voting:" + age);
		} else {
			System.out.println("You are not Eligible for Voting:" + age);
		}

//Largest  number.................
		double n1 = -4.5, n2 = 3.9, n3 = 2.5;

		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " is the largest number.");

		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the largest number.");

		else
			System.out.println(n3 + " is the largest number.");
		
		
		

	}

}
