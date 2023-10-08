package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	WebDriver ldriver;
	public AdminPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	//java project
  //WebElement txtEmail= driver.findElement(By.xpath("//input[@id='Email']"));
	
	//MavenProject
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy (xpath="//input[@id='Password']")
	WebElement txtPassword;
	
	@FindBy (xpath="//button[text()='Log in']")
	WebElement buttonlogin;
	
	//user define method to perform operation on above web element
	
	public void setUsername(String uname ) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
		
	}
	
	public void setPassword(String Pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(Pwd);
	}

	public void clicklonLogin() {
		buttonlogin.click(); 
}
}