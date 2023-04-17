package com.bridgelabz.workshopthree;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountManagementTest {

	BankAccountManagementMain bankAccount = new BankAccountManagementMain();
	boolean result;
	
	@Test
	public void isValisUserNameForPassedTestCase() {
		result = bankAccount.validateUserName("Shephali");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void isValisUserNameForFailedTestCase() {
		result = bankAccount.validateUserName("sh");
		Assert.assertEquals(true, result);
	}
	
}
