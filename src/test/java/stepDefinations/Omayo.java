package stepDefinations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Omayo {
	
	WebDriver driver;
	@Given("^I navigate to the omayo website$")
	public void I_navigate_to_the_omayo_website() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		throw new io.cucumber.java.PendingException();
	}
	
	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$")
	public void I_enter_Username_as_username_and_Password_as_password_into_the_fields(String username,String password) {
		
		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("pswrd")).sendKeys(password);
		
	}
	
	@And("^I click on Login button$")
	public void I_click_on_Login_button() {
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();
	}
	
	@Then("^User should login based on expected \"([^\"]*)\" status$")
	public void User_should_login_based_on_expected_loginstatus_status(String ExpectedResult) {
		
		String actualResult = null;
		
		try {
		Alert alert = driver.switchTo().alert();
		
		if(alert.getText().contains("Error Password or Username")) {
			actualResult= "failure";
		}
		}catch(Exception e) {
			actualResult="success";
		}
		
		Assert.assertEquals(ExpectedResult, actualResult);
		
		driver.close();
		
	}

}
