package com.capgemini.employeewagecomputation;

//Main function and creating objects for three companies with different data
public class EmployeeWageComputationMain {
	
	public static void main(String[] args) {
		
		System.out.println("Company Name	"+"No. of Days  	"+"No. of Hours  	"+"Monthly Wage  	"+"Type of Employee");
		
		//Creating array of objects to store details aout multiple companies
		EmployeeWageComputation empWageByCompany[] = new EmployeeWageComputation[3];
		
		int numberOfCompany = 0; //Counter for number of companies
		int empCheck = 0;// Variable
		
		//Initializing value for three companies
		empWageByCompany[0] = new EmployeeWageComputation("Company 1",20,100,20,8);
		empWageByCompany[1] = new EmployeeWageComputation("Company 2",25,110,25,10);
		empWageByCompany[2] = new EmployeeWageComputation("Company 3",30,120,30,12);
		
		while(numberOfCompany < 3) {
			
			empCheck = empWageByCompany[numberOfCompany].checkEmployeeType();
			empWageByCompany[numberOfCompany].printEmployeeWage(empCheck);
			numberOfCompany++;
		}
	}

}
