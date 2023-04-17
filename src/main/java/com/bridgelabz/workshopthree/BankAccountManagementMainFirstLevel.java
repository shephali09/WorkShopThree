package com.bridgelabz.workshopthree;

public class BankAccountManagementMainFirstLevel {

	public static void main(String[] args) {
		BankAccountManagementMain bankAccount = new BankAccountManagementMain();

		bankAccount.userName = "Shephali";
		bankAccount.userPassword = "shephali@233";
		bankAccount.userEmail = "hshephali@gmail.com";
		bankAccount.userDOB = "9/11/2000";
		bankAccount.userAge = 22;

		System.out.println("Username :" + bankAccount.userName);
		System.out.println("Password :" + bankAccount.userPassword);
		System.out.println("Email :" + bankAccount.userEmail);
		System.out.println("Date of Birth :" + bankAccount.userDOB);
		System.out.println("Age :" + bankAccount.userAge);

	}
}
