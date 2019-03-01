package com.qa.AutomatedTestingAssessment;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.CucumberOptions;

@RunWith(Parameterized.class)
@CucumberOptions(features = "C:/Users/Admin/Downloads/FeatureFileUpdateUser.feature")
public class Task2Test {

	@Parameters
	public static Collection<Object[]> data() throws IOException {
		FileInputStream file = new FileInputStream(Constant.FILELOCATION);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		Object[][] ob = new Object[sheet.getPhysicalNumberOfRows() - 1][4];

		// Reading
		for (int rowNum = 1; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
			ob[rowNum - 1][0] = sheet.getRow(rowNum).getCell(0).getStringCellValue();
			ob[rowNum - 1][1] = sheet.getRow(rowNum).getCell(1).getStringCellValue();
			ob[rowNum - 1][2] = sheet.getRow(rowNum).getCell(2).getStringCellValue();
			ob[rowNum - 1][3] = rowNum;
		}
		workbook.close();
		return Arrays.asList(ob);

	}

	private String username;
	private String password;
	private String expected;
	private int rowNum;
	private WebDriver driver;
	private String email;

	public Task2Test(String username, String password, String expected, int rowNum, String email) {
		this.username = username;
		this.password = password;
		this.expected = expected;
		this.rowNum = rowNum;
		this.email = email;
	}

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", Constant.DRIVERLOCATION);
		driver = new ChromeDriver();

	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void createUserPageTest() {

		driver.get(Constant.LOGINPAGE);
		
		CreateUserPage addAUserPage = PageFactory.initElements(driver, CreateUserPage.class);
		addAUserPage.createUser(username, password, email);
		
		driver.get(Constant.LOGINPAGE);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginUser(username, password);


		// Writing
		FileInputStream file = new FileInputStream(Constant.FILELOCATION);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		XSSFRow row = sheet.getRow(rowNum);
		XSSFCell cell;
		cell = row.getCell(3);
		if (cell == null) {
			cell = row.createCell(3);
		}
		cell.setCellValue(loginPage.loginAttemptText());

		// Testing
		try {
			assertEquals("Login not successful", expected, loginPage.loginAttemptText());
			cell = row.getCell(4);
			if (cell == null) {
				cell = row.createCell(4);
			}
			cell.setCellValue("PASS");
		} catch (AssertionError e) {
			cell = row.getCell(4);
			if (cell == null) {
				cell = row.createCell(4);
			}
			cell.setCellValue("FAIL");
		}

		FileOutputStream fileOut = new FileOutputStream(Constant.FILELOCATION);

		workbook.write(fileOut);
		fileOut.flush();
		fileOut.close();

		workbook.close();
		file.close();
		
		

		

	}

}
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
 * addUser.sendKeys("newadmin"); WebElement addPassword =
 * driver.findElement(By.xpath(
 * "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input"));
 * addPassword.sendKeys("newadmin"); WebElement confirmPassword =
 * driver.findElement(By.xpath(
 * "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input"));
 * confirmPassword.sendKeys("newadmin"); WebElement inputEmail =
 * driver.findElement(By.xpath(
 * "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[5]/td[2]/input"));
 * inputEmail.sendKeys("newadmin@newadmin@newadmin"); WebElement newUser =
 * driver.findElement(By.xpath("//*[@id=\"yui-gen1-button\"]"));
 * newUser.click();
 */