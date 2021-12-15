package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;

import com.greatlearning.service.CredentialService;

public class DriverClass {

	public static Employee employee = new Employee();
	public static Scanner sc = new Scanner(System.in);
	public static CredentialService credentialService = new CredentialService();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayMenu();
		int userChoice = sc.nextInt();
		//Technical(tech), Admin(adm), Human Resource(hr), Legal(lg)
		String emailAddress = "";
		switch(userChoice) {
		case 1: emailAddress = credentialService.generateEmailAddress(employee.getFirstName(),
				employee.getLastName(),"tech");
			break;
		case 2: emailAddress = credentialService.generateEmailAddress(employee.getFirstName(),
				employee.getLastName(),"adm");
			break;
		case 3: emailAddress = credentialService.generateEmailAddress(employee.getFirstName(),
				employee.getLastName(),"hr");
			break;
		case 4: emailAddress = credentialService.generateEmailAddress(employee.getFirstName(),
				employee.getLastName(),"lg");
			break;
		default:System.out.println("Invalid choice");
		}
		System.out.println(emailAddress);
	}
	
	private static void displayMenu() {
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}

}
