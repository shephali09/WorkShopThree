package com.bridgelabz.workshopthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BankAccountManagementMain extends BankAccount {

	static List<BankAccount> bankaccounts = new ArrayList<BankAccount>();
	Scanner scanner = new Scanner(System.in);
	BankAccount bankaccount = new BankAccount();

	public void addUser() {
		boolean addMoreUser = true;
		while (addMoreUser) {

			System.out.println("Enter User name: ");
			String userName = scanner.next();
			bankaccount.setUserName(userName);

			System.out.println("Enter User password: ");
			String userPassword = scanner.next();
			bankaccount.setUserPassword(userPassword);

			System.out.println("Enter User Email: ");
			String userEmail = scanner.next();
			bankaccount.setUserEmail(userEmail);

			System.out.println("Enter User DOB: ");
			String userDOB = scanner.next();
			bankaccount.setUserDOB(userDOB);

			System.out.println("User user Age: ");
			int userAge = scanner.nextInt();
			bankaccount.setUserAge(userAge);

			bankaccounts.add(bankaccount);
			System.out.println("User added!!");
			System.out.println("Do you want to add another user? (Y/N)");
			String choice = scanner.nextLine();
			addMoreUser = choice.equalsIgnoreCase("Y");
		}
	}

	public void displayUser() {

		if (bankaccounts.isEmpty()) {
			System.out.println("User Details are empty!!");
		}
		for (BankAccount bankaccount : bankaccounts) {
			System.out.println(bankaccount.getUserName());
			System.out.println(bankaccount.getUserPassword());
			System.out.println(bankaccount.getUserEmail());
			System.out.println(bankaccount.getUserDOB());
			System.out.println(bankaccount.getUserAge());
		}
	}

	public static boolean validateUserName(String userName) throws CustomException.InvalidUserNameException {

		String regex = "^[A-Z][A-Za-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		if (userName == null) {
			throw new CustomException.InvalidUserNameException(
					"User Name should starts with Capital letter and has minumum 3 characters");
		}
		Matcher matcher = pattern.matcher(userName);
		return matcher.matches();

	}
	

	public static void main(String[] args) {

		BankAccountManagementMain bankAccountManagement = new BankAccountManagementMain();
		bankAccountManagement.addUser();
		bankAccountManagement.displayUser();
		
		List<BankAccount> filteredUsers = bankaccounts.stream().filter(user -> user.getUserAge() > 30).collect(Collectors.toList());
		System.out.println(filteredUsers);

	}

}
