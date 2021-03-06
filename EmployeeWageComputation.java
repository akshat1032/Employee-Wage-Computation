package com.capgemini.employeewagecomputation;

public class EmployeeWageComputation {
	
	//Constants
	public static final int IS_FULL_TIME = 0;
	public static final int IS_PART_TIME = 1;
	public static final int IS_PRESENT = 1;
	public static final int IS_ABSENT = 0;
	
	//Variables
	private double dailyWage;
	private double monthlyWage;
	private int wagePerHour;
	private int maxWorkingDays;
	private int maxWorkingHours;
	private int hourPerDay;
	private int workingHours;
	private int workingDays;
	private String companyName;
	private String empType;
	
	//Parameterized constructor
	public EmployeeWageComputation(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours, int hourPerDay) {
		
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
		this.hourPerDay = hourPerDay;
		
	}
	
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
	public void calculateEmployeeWage(int hourPerDay) {
		
		while (this.workingHours<this.maxWorkingHours && this.workingDays<this.maxWorkingDays) {
			
			int empAttendance = this.checkEmployeeAttendance();
			switch (empAttendance) {
			case IS_PRESENT:
				this.dailyWage = this.wagePerHour * hourPerDay;
				this.monthlyWage = this.monthlyWage + this.dailyWage;
				this.workingHours = this.workingHours + hourPerDay;
				this.workingDays = this.workingDays + 1;
				break;
			case IS_ABSENT:
				continue;
			}
		}
	}
	//Returning name of the company
	public String getCompanyName() {
		
		return this.companyName;
	}
	
	//Storing the Employee Wage
	public void storeEmployeeWage(int empCheck) {
		
		switch(empCheck) {
		case IS_FULL_TIME:
			this.calculateEmployeeWage(this.hourPerDay);
			this.empType = "Full Time";
			break;
		case IS_PART_TIME:
			this.calculateEmployeeWage(this.hourPerDay/2);
			this.empType = "Part Time";
			break;
		}
	}
	
	//Printing the wage by company name
	public void printTotalWage() {
		
		System.out.println(this.companyName+"	"+this.workingDays+"		"+this.workingHours+"	        "+this.dailyWage+"		"+this.monthlyWage+"		"+this.empType);
	}
}
