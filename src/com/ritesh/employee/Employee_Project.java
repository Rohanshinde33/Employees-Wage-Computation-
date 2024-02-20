package com.ritesh.employee;

import java.util.Random;

public class Employee_Project {

	public static void main(String[] args) {
		int attendance=0;
		int daily_wage=0;
		int employee_type=0;
		int total_wage=0;
        final int WAGE_PER_HOUR=20;
        final int FULL_DAY_HOUR=8;
        final int PART_TIME_HOUR=4;
        final int MONTLY_WAGE_COUNT=20;
        
        
	    System.out.println("Well come Employee Wage Computation Program On Master Branch ");
		
		Random random=new Random();
		
		for(int i = 1; i <= MONTLY_WAGE_COUNT; i++)
		{
			
		attendance=random.nextInt(9)%2;
			System.out.println("DAY "+i);
	   
		switch(attendance) {
		
		case 0:
			
			System.out.println("Employee Absent ");
			
		   break;
		
		case 1:
			
			System.out.println("Employee present");
			employee_type=random.nextInt(9)%2;

			 switch(employee_type) {
			
			 case 0:
				
				daily_wage=WAGE_PER_HOUR*PART_TIME_HOUR;
				System.out.println("Part Time Wage = "+daily_wage);
				
				break;
				
			 case 1:
				
				daily_wage=WAGE_PER_HOUR * FULL_DAY_HOUR;
				System.out.println("Full Day Wage = "+daily_wage);
				
				break;
			  }
			 
			 break;
			
		   }	
		        total_wage += daily_wage;
		        System.out.println("----------------");
			
		}
				System.out.println(" Montly Total wage ="+	total_wage );
	}

}
