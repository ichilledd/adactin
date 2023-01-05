package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelSearchSteps {
	WebDriver driver;

	@Given("as a user login into the application")
	public void as_a_user_login_into_the_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:adactinhotelapp.com");
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("ajith2810");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("user1234");
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();

	}

	@When("user the hotel search page")
	public void user_the_hotel_search_page() {
		System.out.println("User see the hotel search page");

	}

	@When("select location drop down to select the desired location")
	public void select_location_drop_down_to_select_the_desired_location() {
		WebElement locationdd = driver.findElement(By.id("location"));
		Select s = new Select(locationdd);
		s.selectByVisibleText("Brisbane");
	}

	@When("user select the hotel dropdown and select")
	public void user_select_the_hotel_dropdown_and_select() {
		WebElement hoteldd = driver.findElement(By.id("hotels"));
		Select s = new Select(hoteldd);
		s.selectByIndex(1);

	}

	@When("user select the room type and number of room")
	public void user_select_the_room_type_and_number_of_room() {
		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select s = new Select(roomtype);
		s.selectByVisibleText("Deluxe");
		WebElement no_of_rooms = driver.findElement(By.id("room_nos"));
		s.selectByIndex(3);
	}

	@When("user select the check in date and check out date")
	public void user_select_the_check_in_date_and_check_out_date() throws InterruptedException {
		WebElement checkindate = driver.findElement(By.id("datepick_in"));
		checkindate.sendKeys("05/01/2023");
		Thread.sleep(1000);
		WebElement checkoutdate = driver.findElement(By.name("datepick_out"));
		checkoutdate.sendKeys("08/01/2023");

	}

	@When("user the select the number of adult and number of children")
	public void user_the_select_the_number_of_adult_and_number_of_children() {
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s = new Select(adultroom);
		s.selectByIndex(2);
		WebElement childroom = driver.findElement(By.id("child_room"));
		s.selectByValue("2");

	}

	@Then("user clicks the search button and it should navigate to next page")
	public void user_clicks_the_search_button_and_it_should_navigate_to_next_page() throws InterruptedException {

		WebElement searchbtn = driver.findElement(By.id("Submit"));
		searchbtn.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
