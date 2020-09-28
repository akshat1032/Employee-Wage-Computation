package com.capgemini.employeewagecomputation;

import java.util.ArrayList;
import java.util.Scanner;

interface EmployeeWageComputationInterface{
	
	public void storeEmployeeWage();
	public void searchByCompanyName(ArrayList<EmployeeWageComputation> totalWage, String compnayName);
}



//Main function and creating objects for three companies with different data
public class EmployeeWageComputationMain implements EmployeeWageComputationInterface {
	
	//To search by company name and print the details of the wage of the company employee
	public void searchByCompanyName(ArrayList<EmployeeWageComputation> totalWage, String companyName) {
		
		System.out.println("Company Name	"+"No. of Days  	"+"No. of Hours  	"+"Daily Wage	"+"Monthly Wage  	"+"Type of Employee");
		
		ArrayList<EmployeeWageComputation> totalWageByCompany = totalWage;
		
		//For loop to iterate through Array List
		for(int i = 0; i<totalWage.size();i++) {
			
			if(totalWageByCompany.get(i).getCompanyName().equals(companyName)) {
				
				totalWageByCompany.get(i).printTotalWage();
			}
		}
	}
	
	//Storing and taking input for company name to search for
	public void storeEmployeeWage() {
		
		Scanner sc = new Scanner(System.in);
		
		//Creating array list to store details about multiple companies	
		ArrayList<EmployeeWageComputation> empWageByCompany = new ArrayList<>();
		
		int empCheck = 0;// Variable
				
		//Initializing value for three companies
		empWageByCompany.add(new EmployeeWageComputation("Company 1",20,20,100,8));
		empWageByCompany.add(new EmployeeWageComputation("Company 2",25,25,110,10));
		empWageByCompany.add(new EmployeeWageComputation("Company 3",30,30,120,12));
		
		for(int i = 0; i < empWageByCompany.size(); i++) {

			empCheck = empWageByCompany.get(i).checkEmployeeType();
			empWageByCompany.get(i).storeEmployeeWage(empCheck);
		}
		System.out.println("Enter the company to search for");
		String companyName = sc.nextLine();
		this.searchByCompanyName(empWageByCompany, companyName);
	}
	
	public static void main(String[] args) {
		
		EmployeeWageComputationMain storeObject = new EmployeeWageComputationMain();
		storeObject.storeEmployeeWage();
		
	}

}
