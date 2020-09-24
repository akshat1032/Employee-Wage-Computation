package com.capgemini.employeewagecomputation;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		//Storing Attendance
		int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
				
		//Checking Attendance
		if (empAttendance == 1) {
			System.out.println("Employee present");
		}
		else {
			System.out.println("Employee absent");
			}
	}
}
