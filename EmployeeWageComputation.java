package com.capgemini.employeewagecomputation;

public class EmployeeWageComputation {
	
	//Constants
	public static final int WAGE_PER_HOUR = 20;
	public static final int MAX_NO_OF_DAYS = 20;
	public static final int HOUR_PER_DAY = 8;
	public static final int PART_TIME_HOUR_PER_DAY = 4;
	public static final int IS_FULL_TIME = 0;
	public static final int IS_PART_TIME = 1;
	public static final int IS_PRESENT = 1;
	public static final int IS_ABSENT = 0;
	
	//Variables
	private double dailyWage = 0;
	private double monthlyWage = 0;
	private int workingDays = 0;
	private int workingHours = 0;
	
	//Checking Type of Employee
	public int checkEmployeeType() {
		
		int empCheck = (int)(Math.floor(Math.random() * 10) % 2);
		return empCheck;
	}
	
	//Checking Employee Attendance
	public int checkEmployeeAttendance() {
		
		int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
		return empAttendance;
	}
	
	//Employee Wage Calculation
	public double calculateEmployeeWage(int hourPerDay) {
		
		while (workingHours<100 && workingDays<20) {
			
			int empAttendance = this.checkEmployeeAttendance();
			switch (empAttendance) {
			case IS_PRESENT:
				this.dailyWage = WAGE_PER_HOUR * hourPerDay;
				this.monthlyWage = monthlyWage + dailyWage;
				this.workingHours = this.workingHours + hourPerDay;
				this.workingDays = this.workingDays + 1;
				break;
			case IS_ABSENT:
				continue;
			}
		}
		
		return monthlyWage;
	}
	
	//Printing the Employee Wage
	public void printEmployeeWage(int empCheck) {
		
		double monthlyWage = 0;
		String empType = "";
		System.out.println("No. of Days  	"+"No. of Hours  	"+"Monthly Wage  	"+"Type of Employee");
		switch(empCheck) {
		case IS_FULL_TIME:
			monthlyWage = this.calculateEmployeeWage(HOUR_PER_DAY);
			empType = "Full Time";
			break;
		case IS_PART_TIME:
			monthlyWage = this.calculateEmployeeWage(PART_TIME_HOUR_PER_DAY);
			empType = "Part Time";
			break;
		}
			System.out.println(this.workingDays+"		"+this.workingHours+"	        "+monthlyWage+"		"+empType);
		}
	
	public static void main(String[] args) {
			
		EmployeeWageComputation empWage = new EmployeeWageComputation();
		int empCheck = empWage.checkEmployeeType();
		empWage.printEmployeeWage(empCheck);
	}
}
