package com.capgemini.employeewagecomputation;

public class EmployeeWageComputation {
	
	//Constants
	public static final int WAGE_PER_HOUR = 20;
	public static final int MAX_NO_OF_DAYS = 20;
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
		int workingHours = 0;
		int workingDays = 0;
		
		int empCheck = (int)(Math.floor(Math.random() * 10) % 2);
		switch(empCheck) {
			case IS_FULL_TIME:
				while (workingHours<100 && workingDays<20) {
								
				//Storing Attendance
				int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
							
				//Checking Attendance
				switch(empAttendance) {
					case 1:
						dailyWage = WAGE_PER_HOUR * HOUR_PER_DAY;
						monthlyWage = monthlyWage + dailyWage;
						workingHours = workingHours + HOUR_PER_DAY;
						workingDays = workingDays + 1;
						break;
					default:
						continue;
						}
				}
				System.out.println("No. of Days "+"  No. of Hours "+"  Monthly Wage "+"  Type of Employee");
				System.out.println(workingDays +"		" + workingHours + "		" + monthlyWage+"		"+"Full Time Employee");
			    break;
			case IS_PART_TIME:
				while (workingHours<100 && workingDays<20) {
							
				//Storing Attendance
				int partTimeEmpAttendance = (int)(Math.floor(Math.random() * 10) % 2);
								
				//Checking Attendance
				switch(partTimeEmpAttendance) {
					case 1:
						partTimeWage = WAGE_PER_HOUR * PART_TIME_HOUR_PER_DAY;
						partTimeMonthlyWage = partTimeMonthlyWage + partTimeWage;
						workingHours = workingHours + PART_TIME_HOUR_PER_DAY;
						workingDays = workingDays + 1;
						break;
					default:
						continue;
						}
					}
				System.out.println("No. of Days "+"  No. of Hours "+"  Monthly Wage "+"  Type of Employee");
				System.out.println(workingDays +"		" + workingHours + "		" + partTimeMonthlyWage+"		"+"Part Time Employee");
				break;
				}
		}
}
