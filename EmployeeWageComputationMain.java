package com.capgemini.employeewagecomputation;

//Main function and creating objects for three companies with different data
public class EmployeeWageComputationMain {
	
	public static void main(String[] args) {
		
		System.out.println("No. of Days  	"+"No. of Hours  	"+"Monthly Wage  	"+"Type of Employee");
		EmployeeWageComputation empWageCompany1 = new EmployeeWageComputation(20,100,20,8);
		EmployeeWageComputation empWageCompany2 = new EmployeeWageComputation(25,110,25,10);
		EmployeeWageComputation empWageCompany3 = new EmployeeWageComputation(30,120,30,12);
		int empCheck = empWageCompany1.checkEmployeeType();
		empWageCompany1.printEmployeeWage(empCheck);
		empCheck =  empWageCompany2.checkEmployeeType();
		empWageCompany2.printEmployeeWage(empCheck);
		empCheck =  empWageCompany3.checkEmployeeType();
		empWageCompany3.printEmployeeWage(empCheck);
	}

}
