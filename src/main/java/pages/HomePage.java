package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy (xpath="//span[@class='fxg-user-options__sign-in-text']")
	WebElement loginButton;//Couldn't use id,class or name
	
	@FindBy (how=How.ID,using="btnSingleTrack")
	WebElement trackButton;
	
	@FindBy (xpath="//input[@name='trackingnumber']")
	WebElement trackingidButton;
	
	
	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(3000);
	}
	
	public void clickTrackingIdButton() throws InterruptedException {
		trackingidButton.click();
		Thread.sleep(3000);
	}
	
	public void clickTrackButton() throws InterruptedException {
		trackButton.click();
		Thread.sleep(3000);
	}
	
	

}
