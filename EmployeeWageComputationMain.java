package com.capgemini.employeewagecomputation;

interface EmployeeWageComputationInterface{
	
	public void printEmployeeWage();
}



//Main function and creating objects for three companies with different data
public class EmployeeWageComputationMain implements EmployeeWageComputationInterface {
	
	public void printEmployeeWage() {
		
		//Creating array of objects to store details about multiple companies
		EmployeeWageComputation empWageByCompany[] = new EmployeeWageComputation[3];
				
		int numberOfCompany = 0; //Counter for number of companies
		int empCheck = 0;// Variable
				
		//Initializing value for three companies
		empWageByCompany[0] = new EmployeeWageComputation("Company 1",20,20,100,8);
		empWageByCompany[1] = new EmployeeWageComputation("Company 2",25,25,110,10);
		empWageByCompany[2] = new EmployeeWageComputation("Company 3",30,30,120,12);
				
		while(numberOfCompany < 3) {

			empCheck = empWageByCompany[numberOfCompany].checkEmployeeType();
			empWageByCompany[numberOfCompany].printEmployeeWage(empCheck);
			numberOfCompany++;
				}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Company Name	"+"No. of Days  	"+"No. of Hours  	"+"Monthly Wage  	"+"Type of Employee");
		
		EmployeeWageComputationMain printObject = new EmployeeWageComputationMain();
		printObject.printEmployeeWage();
		
	}

}
