package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SoftwareTester {
	
	@Given("^I am a \"([a-zA-Z]{1,})\" software tester$")
	public void I_am_a_good_software_tester(String testerType) {
		System.out.println(">> - I am a"+testerType+" software tester");
		
	}
	
	/*@Given("^I am a average software tester$")
	public void I_am_a_average_software_tester() {
		
	}
	
	@Given ("^I am a bad software tester$")
	public void I_am_a_bad_software_tester() {
		
	}*/
	
	@When("^I go to work$")
	public void I_go_to_work() {
		System.out.println(">> - I go to work");		
	}
	
	@And ("^I \"([a-zA-Z]{1,})\" with it$")
	public void I_involve_with_it(String workType){
		System.out.println(">> - I "+workType+" with it");
	}
	
	@Then ("^My boss \"([a-zA-Z]{1,})\" me$")
	public void Then_My_boss_loves_me(String personType) {
		System.out.println(">> - My boss "+personType+" me");
	}
}
