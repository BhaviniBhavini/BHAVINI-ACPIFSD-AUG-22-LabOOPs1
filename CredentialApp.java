package com.email.main;

import java.util.Scanner;

import com.email.model.Employee;
import com.email.service.CredentialService;

public class CredentialApp {

	public static void main(String[] args) {
		
		Employee employee=new Employee("Harshit","Choudary");
		CredentialService credentialService=new CredentialService();
		String generatedEmail="";
		char [] generatedPassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner scanner=new Scanner(System.in);
		int option=scanner.nextInt();
		
		if(option==1) {
			generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"tech");
		    		    
		}else if(option==2) {
			generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"admin");
		    
		}else if (option==3) {
			generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"hr");
		    
		}else if(option==4) {
			generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"legal");
		    		    
		}else {
			System.out.println("Enter a valid option");
			scanner.close();
			System.exit(-1);
		}
		generatedPassword=credentialService.generatePassword();
		credentialService.showCredentials(employee.getFirstName(), generatedEmail,generatedPassword);
		
		scanner.close();
		
		}
		
	}
