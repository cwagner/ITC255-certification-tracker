package com.cmwagner;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Admin a = new Admin("admin", "1234");
		
		System.out.println("To add a certification, please login as an admin");
		System.out.println("Please enter username");
		String username = scan.nextLine();
		System.out.println("Please enter password");
		String password = scan.nextLine();
		
		Login l = new Login(a, username, password);
		
		if (l.isValid()) {
			System.out.println("Welcome!");
			System.out.println("Please enter the name of the new certification");
			Certification c = new Certification(scan.nextLine());
			System.out.println("How many required courses would you like to add?");
			int n = scan.nextInt();
			scan.nextLine();
			for (int i=0;i<n;i++) {
				System.out.println("Please type the name of a course");
				a.addRequiredCourse(c, scan.nextLine());
			}
			System.out.println("You have added the certification " + c.getCertificationName() + " with " + n + " required courses:");
			for(String x : c.getRequiredCourses()) {
				System.out.println(x);
			}
		}
		else {
			System.out.println("Wrong username or password");
		}
	}
}
