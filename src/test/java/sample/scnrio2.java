package sample;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scnrio2 {

	@When("user enter {int}")
public void user_enter(Integer int1) {
		System.out.println(int1);  
}

@When("user press plus")
public void user_press_plus() {
    System.out.println("+");
}

@When("user enters second values as {int}")
public void user_enters_second_values_as(Integer int2) {
	System.out.println(int2);
}

@Then("the user press equal")
public void the_user_press_equal() {
	System.out.println("=");
}

@Then("Validate the output as {int}")
public void validate_the_output_as(Integer int3) {
    System.out.println(int3);
}
}
