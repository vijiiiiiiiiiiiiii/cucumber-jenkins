package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scnrio3 {
	WebDriver driver;
	
	@Given("user opens testme application on chrome browser")
	public void user_opens_testme_application_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\New_NextGen_Testing_Software\\Selenium Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		System.out.println("Browser opens");
	}
	
	
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) 
	 {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
		System.out.println("entered username and password");
	}

	@When("click on Login button")
	public void click_on_Login_button() {
		driver.findElement(By.name("Login")).click();
		System.out.println("Logged in");
	}

	@Then("verify it displays Home page")
	public void verify_it_displays_Home_page() {
		AssertJUnit.assertTrue(driver.getTitle().contains("Home"));
		System.out.println("Browser closed");
		driver.close();
	}
	
	@Given("display welcome message")
	public void display(){
		System.out.println("Hi Welcome");
	}
	

}
