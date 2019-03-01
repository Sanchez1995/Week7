package com.qa.Selenium;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

	@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input\"")
	private WebElement searchbox;

	@FindBy (name = "dominos")
	private WebElement domino;

	public void searchFor(String searchText) {

	}

}
