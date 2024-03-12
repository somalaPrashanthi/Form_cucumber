package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class formsteps {
	
	WebDriver driver;


		@Given("user opens chrome browser and enter simpleform url")
		public void user_opens_chrome_browser_and_enter_simpleform_url() {
		    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanthi\\Desktop\\Selenium Grid\\chromedriver.exe");
		
	 driver = new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/simple-form");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}

		@Given("textbox should be enabled")
		public void textbox_should_be_enabled() {

			driver.findElement(By.id("firstName")).isEnabled();
			
		}

		@When("user enters text in firstname,lastname,email,contact,message")
		public void user_enters_text_in_firstname_lastname_email_contact_message() {

			driver.findElement(By.id("firstName")).sendKeys("Prashanthi");
			driver.findElement(By.id("lastName")).sendKeys("somala");
			driver.findElement(By.id("email")).sendKeys("Prashanthi@gmail.com");
			driver.findElement(By.id("number")).sendKeys("9812345678");
			
			driver.findElement(By.xpath("//textarea")).sendKeys("Hi my name is prashanthi and i am your student");
			
		}

		@When("user clicks on submitbutton")
		public void user_clicks_on_submitbutton() {
			
			driver.findElement(By.xpath("//input[@value='submit']")).click();
			
		}

		@Then("An alret should be displayed")
		public void an_alret_should_be_displayed() {
			
			System.out.println("Alert is present");
			
			Alert alert = driver.switchTo().alert();
			
			alert.accept();
			
			
			
		}
	}


