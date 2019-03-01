package com.qa.AutomatedTestingAssessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateUserPage {

	@FindBy(xpath = "//*[@id=\\\"j_username\\\"]")
	private WebElement username;

	@FindBy(xpath = "/html/body/div/div/form/div[2]/input")
	private WebElement password;

	@FindBy(xpath = "/html/body/div/div/form/div[3]/input")
	private WebElement signIn;

	@FindBy(xpath = "//*[@id=\\\"tasks\\\"]/div[4]/a[2]")
	private WebElement manage;

	@FindBy(xpath = "//*[@id=\"main-panel\"]/div[16]/a/dl/dt")
	private WebElement manageUser;

	@FindBy(xpath = "//*[@id=\\\"tasks\\\"]/div[3]/a[2]")
	private WebElement createUser;

	@FindBy(xpath = "//*[@id=\\\"username\\\"]")
	private WebElement addUser;

	@FindBy(xpath = "//*[@id=\\\"main-panel\\\"]/form/div[1]/table/tbody/tr[2]/td[2]/input")
	private WebElement addPassword;

	@FindBy(xpath = "//*[@id=\\\"main-panel\\\"]/form/div[1]/table/tbody/tr[3]/td[2]/input")
	private WebElement confirmPassword;

	@FindBy(xpath ="//*[@id=\\\"main-panel\\\"]/form/div[1]/table/tbody/tr[5]/td[2]/input")
	private WebElement inputEmail;
	
	@FindBy (xpath = "//*[@id=\\\"yui-gen1-button\\\"]")
	private WebElement newUser;
	
	

	public void createUser(String user, String pass, String email) {
		username.sendKeys(user);
		password.sendKeys(pass);
		signIn.click();
		manage.click();
		manageUser.click();
		createUser.click();
		addUser.sendKeys(user);
		addPassword.sendKeys(pass);
		confirmPassword.sendKeys(pass);
		inputEmail.sendKeys(email);
		newUser.click();
	}
}

/*
 * WebElement userName =
 * driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
 * userName.sendKeys("admin"); WebElement password =
 * driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input"));
 * password.sendKeys("admin"); WebElement signIn =
 * driver.findElement(By.xpath("/html/body/div/div/form/div[3]/input"));
 * signIn.click();
 */
/*WebElement manage = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[4]/a[2]"));manage.click();
WebElement manageUser = driver.findElement(By.xpath("//*[@id=\"main-panel\"]/div[16]/a/dl/dt"));manageUser.click();
WebElement createUser = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[3]/a[2]"));createUser.click();
WebElement addUser = driver.findElement(By.xpath("//*[@id=\"username\"]"));addUser.sendKeys("newadmin");
WebElement addPassword = driver.findElement(
		By.xpath("//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input"));addPassword.sendKeys("newadmin");
WebElement confirmPassword = driver.findElement(By.xpath(
		"//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input"));confirmPassword.sendKeys("newadmin");
WebElement inputEmail = driver.findElement(By.xpath(
		"//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[5]/td[2]/input"));inputEmail.sendKeys("newadmin@newadmin@newadmin");
WebElement newUser = driver.findElement(By.xpath("//*[@id=\"yui-gen1-button\"]"));newUser.click();
*/
/*
 * WebElement userName =
 * driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
 * userName.sendKeys("admin"); WebElement password =
 * driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input"));
 * password.sendKeys("admin"); WebElement signIn =
 * driver.findElement(By.xpath("/html/body/div/div/form/div[3]/input"));
 * signIn.click(); WebElement manage =
 * driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[4]/a[2]"));
 * manage.click(); WebElement manageUser =
 * driver.findElement(By.xpath("//*[@id=\"main-panel\"]/div[16]/a/dl/dt"));
 * manageUser.click(); WebElement createUser =
 * driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[3]/a[2]"));
 * createUser.click(); WebElement addUser =
 * driver.findElement(By.xpath("//*[@id=\"username\"]"));
 * addUser.sendKeys(arg0);
 */
