package com.ritesh.employee;

import java.util.Random;

public class Employee_Project {

	public static void main(String[] args) {
		int attendance=0;
		
		
	    System.out.println("Well come Employee Wage Computation Program");

		System.out.println("Enter the Attendence[0 - Absent /  1 - Present ]");
		
		Random random=new Random();
		attendance=random.nextInt(9)%2;
	    System.out.println(attendance);
		
		if(attendance==0) {
			System.out.println("Employee Absent ");
		}
		else {
			System.out.println("Employee present");
			
		}
	}

}
