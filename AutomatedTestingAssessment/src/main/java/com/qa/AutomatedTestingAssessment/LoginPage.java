package com.qa.AutomatedTestingAssessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath = "//*[@id=\\\"j_username\\\"]")
	private WebElement username;

	@FindBy(xpath = "/html/body/div/div/form/div[2]/input")
	private WebElement password;

	@FindBy(xpath = "/html/body/div/div/form/div[3]/input")
	private WebElement signIn;

	@FindBy(xpath = "//*[@id=\"jenkins\"]")
	private WebElement loginAttempt;

	public void loginUser(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		signIn.click();
	}

	public String loginAttemptText() {
		return loginAttempt.getText();
	}

}
