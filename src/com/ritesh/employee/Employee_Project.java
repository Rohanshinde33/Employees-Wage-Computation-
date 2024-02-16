package com.ritesh.employee;

import java.util.Random;

public class Employee_Project {

	public static void main(String[] args) {
		int Attendance=0;
		int Daily_wage=0;
        final int Wage_Per_Hour=20;
        final int Full_Day_Hour=8;
		
		
	    System.out.println("Well come Employee Wage Computation Program");

		System.out.println("Enter the Attendence[0 - Absent /  1 - Present ]");
		
		Random random=new Random();
		Attendance=random.nextInt(9)%2;
	    System.out.println(Attendance);
		
		if(Attendance==0) {
			System.out.println("Employee Absent ");
		}
		else {
			System.out.println("Employee present");
			Daily_wage=Wage_Per_Hour * Full_Day_Hour;
			System.out.println("Full Day Wage = "+Daily_wage);
			
		}
	}

}
