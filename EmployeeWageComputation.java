package com.capgemini.employeewagecomputation;

public class EmployeeWageComputation {

	//Constants
	public static final int WAGE_PER_HOUR = 20;
	public static final int HOUR_PER_DAY = 8;
		
	public static void main(String[] args) {
			
	//Variable
	double dailyWage = 0;
			
	//Storing Attendance
	int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
			
	//Checking Attendance
	if (empAttendance == 1) {
		System.out.println("Employee present");
		dailyWage = WAGE_PER_HOUR * HOUR_PER_DAY;
		}
	else {
		System.out.println("Employee absent");
		}
	System.out.println("Daily Wage : "+dailyWage);
	}
}
