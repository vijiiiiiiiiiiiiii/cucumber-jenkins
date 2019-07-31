package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scnrio1 {
	WebDriver driver;
	@Given("user opens newtours application on chrome browser")
	public void user_opens_newtours_application_on_chrome_browser() {

	System.setProperty("webdriver.chrome.driver","C:\\New_NextGen_Testing_Software\\Selenium Drivers\\chromedriver.exe");

	driver= new ChromeDriver();

	driver.get("http://newtours.demoaut.com");

	}

	@When("user enters username as {string} and password as mercury")
	public void user_enters_username_as_and_password_as_mercury(String string){
	
	driver.findElement(By.name("userName")).sendKeys(string);

	driver.findElement(By.name("password")).sendKeys("mercury");

	}

	@When("click on SignIn button")
	public void click_on_SignIn_button() {

	driver.findElement(By.name("login")).click();

	}

	@Then("verify login result as success")

	public void verify_login_result_as_success() {

	AssertJUnit.assertTrue(driver.getTitle().contains("Flight"));



	driver.close();

}
}
