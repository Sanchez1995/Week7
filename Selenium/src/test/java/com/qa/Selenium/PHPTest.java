package com.qa.Selenium;

import javax.swing.SpringLayout.Constraints;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class PHPTest {

	@FindBy
	WebDriver driver;

	private String condition = "London";

	private String url = "https://www.phptravels.net/hotels/search/united-kingdom/london/28-02-2019/01-03-2019/2/0";

	private int i;

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
	public void bookHotel() {
		driver.get(url);
		WebElement location = driver.findElement(By.tagName("tr"));
		
		 if (location.getText().contains(condition)){
			 System.out.println("London Hotel Found");
		 }
		/* else if {
			 
		 }*/
		
		
		/*WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"s2id_autogen8\"]/a"));
		searchBox.sendKeys(condition);
		WebElement noOfPeople = driver.findElement(By.xpath("//*[@id=\"travellersInput\"]"));
		noOfPeople.click();
		WebElement addPerson = driver.findElement(By.xpath("//*[@id=\"adultPlusBtn\"]"));
		addPerson.click();
		WebElement searchItem = driver.findElement(By.xpath("//*[@id=\"hotels\"]/form/div[5]/button"));
		searchItem.click();
		WebElement checkIn = driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/tbody/tr[5]/td[5]"));
		checkIn.click();
		WebElement checkOut = driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[2]/td[1]"));
		checkOut.click();
		searchItem.click();*/
		
	}

}
