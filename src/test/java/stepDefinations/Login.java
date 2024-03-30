package stepDefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@Given("^I navigate to the Login page$")
	public void I_navigate_to_Login_page() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("^I enter email address as .* and password as .* into the fields$")
	public void I_enter_email_address_as_email_and_password_as_password_into_the_fields(String username, String password) {
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
	}

	@And("^I click on the login button$")
	public void I_click_on_the_login_button() {
		driver.findElement(By.cssSelector("input[type='submit'][value='Login']")).click();
	}

	@Then("^the user should be able to successfully login$")
	public void the_user_should_be_able_to_successfully_login() {
		WebElement element = null;
		try {
			element = driver.findElement(By.linkText("Register for an affiliate account"));
			System.out.println("User has successfully logged in");
		} catch (Exception exc) {
			System.out.println("User has not logged in");
		}
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
