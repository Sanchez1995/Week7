package com.qa.AutomatedTestingAssessment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1Test {

	@FindBy
	WebDriver driver;

	private String url = "http://35.197.222.144:8080/";


	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/ExternalApps/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void task1() {

		driver.get(url);
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"j_username\"]"));
		userName.sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input"));
		password.sendKeys("admin");
		WebElement signIn = driver.findElement(By.xpath("/html/body/div/div/form/div[3]/input"));
		signIn.click();
		WebElement checkNewItem = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[1]/a[2]"));
		checkNewItem.click();
		WebElement addName = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		addName.sendKeys("Sanchez");
		WebElement checkFreestyle = driver
				.findElement(By.xpath("//*[@id=\"j-add-item-type-standalone-projects\"]/ul/li[1]"));
		checkFreestyle.click();
		WebElement checkOK = driver.findElement(By.xpath("//*[@id=\"ok-button\"]"));
		checkOK.click();
		WebElement checkSave = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("yui-gen38-button")));
		checkSave.click();
		WebElement checkDocument = driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[1]/a[2]"));
		checkDocument.click();
		WebElement checkFinalDoc = driver.findElement(By.id("jenkins"));
		System.out.println(checkFinalDoc.getText());
		assertEquals("Document not found", true, checkFinalDoc.getText().contains("Sanchez"));

	}

}
