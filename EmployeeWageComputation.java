package com.capgemini.employeewagecomputation;

public class EmployeeWageComputation {
	
	//Constants
	public static final int WAGE_PER_HOUR = 20;
	public static final int HOUR_PER_DAY = 8;
	public static final int PART_TIME_HOUR_PER_DAY = 4;
	public static final int IS_FULL_TIME = 0;
	public static final int IS_PART_TIME = 1;
	
	public static void main(String[] args) {
		
		//Variable
		double dailyWage = 0;
		double partTimeWage = 0;
			
		//Storing Attendance
		int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
			
		//Checking Attendance
		if (empAttendance == 1) {
			System.out.println("Employee present");
			int empCheck = (int)(Math.floor(Math.random() * 10) % 2);
			if (empCheck == IS_PART_TIME) {
				partTimeWage = WAGE_PER_HOUR * PART_TIME_HOUR_PER_DAY;
				System.out.println("Part Time Employee Daily Wage : "+partTimeWage);
				}
			else {
				dailyWage = WAGE_PER_HOUR * HOUR_PER_DAY;
				System.out.println("Full Time Employee Daily Wage : "+dailyWage);
				}
			}
		else {
			System.out.println("Employee absent");
			}
		}
}
