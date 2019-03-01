package com.qa.Selenium;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

public class FTSE100 {

	@FindBy
	WebDriver driver;

	private String url = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";

	private int i;

	private int x;

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
	public void findRiser() {
		driver.get(url);
		List<WebElement> table = driver.findElements(By.tagName("tr"));
		for (x = 0; x < table.size(); x++) {
			List<WebElement> trTable = driver.findElements(By.tagName("td"));
			for (i = 0; i < trTable.size(); i++) {
				if (i % 3 == 0) {
					WebElement dayChange = table.get(x);
					System.out.println(dayChange);
				}
			}

		}

	}

	/*
	 * for (i = 0; i < table.size(); i++) { if (i % 3 == 0) { WebElement dayChange =
	 * table.get(i); String current = dayChange.getText(); Float maxChange =
	 * Float.parseFloat(current); float Float change = maxChange.MAX_VALUE;
	 * System.out.println(change); if(current.contains("+")) { // List<Object>
	 * maxChangeList = }
	 */

	
	

	@Test
	public void findFaller() {

	}

}
