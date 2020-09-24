package com.capgemini.employeewagecomputation;

public class EmployeeWageComputation {
	
	//Constants
	public static final int WAGE_PER_HOUR = 20;
	public static final int HOUR_PER_DAY = 8;
	public static final int PART_TIME_HOUR_PER_DAY = 4;
	public static final int IS_FULL_TIME = 0;
	public static final int IS_PART_TIME = 1;
	
	public static void main(String[] args) {
			
		//Variables
		double dailyWage = 0;
		double partTimeWage = 0;
		double monthlyWage = 0;
		double partTimeMonthlyWage = 0;
		
		for (int i = 0; i < 20; i++) {
			
			//Storing Attendance
			int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
			
			//Checking Attendance
			switch(empAttendance) {
				case 1:
					System.out.print("Employee present");
					int empCheck = (int)(Math.floor(Math.random() * 10) % 2);
					switch(empCheck) {
						case IS_FULL_TIME:
							System.out.print("(Full Time)\n"); //To show if full time employee is present
							dailyWage = WAGE_PER_HOUR * HOUR_PER_DAY;
							monthlyWage = monthlyWage + dailyWage;
							break;
						case IS_PART_TIME:
							System.out.print("(Part Time)\n"); //To show if part time employee is present
							partTimeWage = WAGE_PER_HOUR * PART_TIME_HOUR_PER_DAY;
							partTimeMonthlyWage = partTimeMonthlyWage + partTimeWage;
							break;
						}
						break;
					default:
						System.out.println("Employee Absent");	
					}
				}
		System.out.println("Full Time Employee Monthly Wage : "+monthlyWage);
		System.out.println("Part Time Employee Monthly Wage : "+partTimeMonthlyWage);
		}
}
