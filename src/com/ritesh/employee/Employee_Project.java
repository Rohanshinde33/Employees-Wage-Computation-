package com.ritesh.employee;

import java.util.Random;

public class Employee_Project {
	
	    int attendance=0;
		int daily_wage=0;
		int employee_type=0;
		int total_wage=0;
		int total_hr=0;
		int total_day=1;
        int wage_per_hour;
        int working_day;
        int working_month_hr;
        final int FULL_DAY_HOUR=8;
        final int PART_TIME_HOUR=4;
        
	    
        public void Employeewage(int wage_per_hour,int working_day,int working_month_hr) {
        
	    System.out.println("Well come Employee Wage Computation Program On Master Branch ");
		
		Random random=new Random();
		
		while(total_hr <= working_month_hr  && total_day <= working_day )
		{
			
			attendance=random.nextInt(9)%2;
			System.out.println("DAY "+total_day);
	   
		switch(attendance) {
		
		case 0:
			
				System.out.println("Employee Absent ");
			
		   break;
		
		case 1:
			
				System.out.println("Employee present");
				employee_type=random.nextInt(9)%2;

			 switch(employee_type) {
			
			 case 0:
				
				daily_wage= wage_per_hour*PART_TIME_HOUR;
				System.out.println("Part Time Wage = "+daily_wage);
				total_hr+=PART_TIME_HOUR;
				
				break;
				
			 case 1:
				
				daily_wage= wage_per_hour * FULL_DAY_HOUR;
				System.out.println("Full Day Wage = "+daily_wage);
				total_hr+=FULL_DAY_HOUR;
				
				break;
			  }
			 
			 break;
			
		   }	
		        total_wage += daily_wage;
		        System.out.println("----------------");
		        total_day++;
		 }
				System.out.println("Montly Total Hour = "+total_hr);
				System.out.println("Montly Total wage = "+	total_wage );
				
       }
	
	public static void main(String[] args) {
		
		Employee_Project employee_project =new Employee_Project();
		employee_project.Employeewage(15,21,99);
		
		System.out.println("----------------");
		
		Employee_Project employee_project2 =new Employee_Project();
		employee_project2.Employeewage(19,25,120);
	}

}
