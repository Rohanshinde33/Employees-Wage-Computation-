package com.ritesh.employee;

import java.util.Random;

public class Employee_Project {

	public static void main(String[] args) {
		int Attendance=0;
		int Daily_wage=0;
        final int WAGE_PER_HOUR=20;
        final int FULL_DAY_HOUR=8;
        final int PART_TIME_HOUR=4;
        int Employee_Type=0;
        final int MONTLY_WAGE_COUNT=20;
        
        
	    System.out.println("Well come Employee Wage Computation Program On Master Branch ");
		
		Random random=new Random();
		Attendance=random.nextInt(9)%2;
		
		
		for(int i = 1; i <= MONTLY_WAGE_COUNT; i++)
		{
			
		//Random random=new Random();
		//Attendance=random.nextInt(9)%2;
			System.out.println("DAY "+i);
	   
		switch(Attendance) {
		
		case 0:
			
			System.out.println("Employee Absent ");
			
		   break;
		
		case 1:
			
			System.out.println("Employee present");
			Employee_Type=random.nextInt(9)%2;

			 switch(Employee_Type) {
			
			 case 0:
				
				Daily_wage=WAGE_PER_HOUR*PART_TIME_HOUR;
				System.out.println("Part Time Wage = "+Daily_wage);
				
				break;
				
			 case 1:
				
				Daily_wage=WAGE_PER_HOUR * FULL_DAY_HOUR;
				System.out.println("Full Day Wage = "+Daily_wage);
				
				break;
			  }
			 
			 break;
			 
		   }	
		System.out.println("----------------");
			
		}
	}

}
