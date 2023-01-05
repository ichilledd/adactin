package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	ChromeDriver driver;

	@Given("user opens the browser and login into the url")
	public void user_opens_the_browser_and_login_into_the_url() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:adactinhotelapp.com");
	}

	@When("the user enter the username {string}")
	public void the_user_enter_the_username(String string) {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(string);
	}

	@When("the user enter the password {string}")
	public void the_user_enter_the_password(String string) {
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys(string);
	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();

	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		driver.close();
	}
}
