package sample;

import org.junit.Assert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;

public class scnrio4 {

WebDriver driver;

@Given("display welcome page")

public void display_welcome_page() {

System.out.println("Welcome");

}

@When("user opens testme application in browser")

public void user_opens_testme_application_in_browser() {

	System.setProperty("webdriver.chrome.driver","C:\\New_NextGen_Testing_Software\\Selenium Drivers\\chromedriver.exe");
driver=new ChromeDriver();

driver.get("http://10.232.237.143:443/TestMeApp/");
driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();

}

@When("user entering username as {string} And password as {string} in field")

public void user_entering_username_as_And_password_as_in_field(String string, String string2) {

driver.findElement(By.name("userName")).sendKeys(string);

driver.findElement(By.name("password")).sendKeys(string2);

}

@When("registered user clicks login")

public void registered_user_clicks_login() {

driver.findElement(By.name("Login")).click();

}

@Then("verify login page")

public void verify_login_page() {

Assert.assertTrue(driver.getTitle().contains("Home"));

driver.close();

}

@When("user opens testme app in browser")

public void user_opens_testme_app_in_browser() {

System.setProperty("webdriver.chrome.driver","C:\\New_NextGen_Testing_Software\\Selenium Drivers\\chromedriver.exe");

driver=new ChromeDriver();

driver.get("http://10.232.237.143:443/TestMeApp/");
driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();

}

@When("user entering valid username as {string} And password as {string} in field")

public void user_entering_valid_username_as_And_password_as_in_field(String string, String string2) {

driver.findElement(By.name("userName")).sendKeys(string);

driver.findElement(By.name("password")).sendKeys(string2);

}

@When("clicks login")

public void clicks_login() {

driver.findElement(By.name("Login")).click();

}

@Then("verify login application")

public void verify_login_application() {

Assert.assertTrue(driver.getTitle().contains("Home"));

driver.close();

}

}

