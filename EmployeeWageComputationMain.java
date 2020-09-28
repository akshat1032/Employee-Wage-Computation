package com.capgemini.employeewagecomputation;

import java.util.ArrayList;

interface EmployeeWageComputationInterface{
	
	public void printEmployeeWage();
}



//Main function and creating objects for three companies with different data
public class EmployeeWageComputationMain implements EmployeeWageComputationInterface {
	
	public void printEmployeeWage() {
		
		//Creating array list to store details about multiple companies
			
		ArrayList<EmployeeWageComputation> empWageByCompany = new ArrayList<>();
		
		int empCheck = 0;// Variable
				
		//Initializing value for three companies
		empWageByCompany.add(new EmployeeWageComputation("Company 1",20,20,100,8));
		empWageByCompany.add(new EmployeeWageComputation("Company 2",25,25,110,10));
		empWageByCompany.add(new EmployeeWageComputation("Company 3",30,30,120,12));
		
		for(int i = 0; i < empWageByCompany.size(); i++) {

			empCheck = empWageByCompany.get(i).checkEmployeeType();
			empWageByCompany.get(i).printEmployeeWage(empCheck);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Company Name	"+"No. of Days  	"+"No. of Hours  	"+"Daily Wage	"+"Monthly Wage  	"+"Type of Employee");
		
		EmployeeWageComputationMain printObject = new EmployeeWageComputationMain();
		printObject.printEmployeeWage();
		
	}

}
