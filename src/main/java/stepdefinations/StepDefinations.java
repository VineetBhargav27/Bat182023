package stepdefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AdminPage;
import org.testng.Assert;

public class StepDefinations extends Base {
	
	@Given("User Launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		driver= new ChromeDriver();
		//create object of Adminpage in java class
		ad=new AdminPage(driver);
	   
	}

	@When("User open url {string}")
	public void user_open_url(String url) throws Exception {
		driver.get(url);
		Thread.sleep(2000);
	    
	}

	@When("user enter email	 as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws Exception {
		ad.setUsername(email);
		ad.setPassword(password);
		Thread.sleep(2000);
	  
	}

	@When("user click on login button")
	public void user_click_on_login_button() throws Exception {
		ad.clicklonLogin();
		Thread.sleep(2000);
	    
	}
	
	@Then("user verify page title should be {string}")
	public void user_verify_page_title_be (String Title) throws Exception {
		Assert.assertEquals(driver.getTitle(),Title);
		Thread.sleep(2000);
	}

	@Then("close the browser")
	public void close_the_browser() throws Exception {
		driver.close();
		Thread.sleep(2000);
	    
	}


}
