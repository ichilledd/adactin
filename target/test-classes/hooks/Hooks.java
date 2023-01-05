package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
WebDriver driver;
	
	@Before
    public void beforeScenario(){
		System.out.println("initiating driver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:adactinhotelapp.com");
		
    }	
	
	@After
    public void afterScenario(){
        driver.close();
		System.out.println("This will run after the Scenario");
    }
}

