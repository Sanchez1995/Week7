package com.qa.AutomatedTestingAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Task2ParaStepDefinition {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/ExternalApps/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) throws Throwable {
	    driver.get(arg1);
	}

	@Given("^the username is present \"([^\"]*)\"$")
	public void the_username_is_present(String arg1) throws Throwable {
	   WebElement userName = driver.findElement(By.xpath(""));
	}

	@When("^I click on username \"([^\"]*)\"$")
	public void i_click_on_username(String arg1) throws Throwable {
	    WebElement userName = driver.findElement(By.);
	}

	@When("^I click on configure link$")
	public void i_click_on_configure_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^change the current fullname to new a new fullname \"([^\"]*)\"$")
	public void change_the_current_fullname_to_new_a_new_fullname(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click save button$")
	public void i_click_save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on People link$")
	public void i_click_on_People_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the new fullname \"([^\"]*)\" should be visible for the username \"([^\"]*)\"$")
	public void the_new_fullname_should_be_visible_for_the_username(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
