package testPages;

import org.testng.annotations.Test;

import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false)
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();
	}

	@Test(enabled = false)
	public void clickTrackingIdButtonTest() throws InterruptedException {
		homePage.clickTrackingIdButton();
	}

	@Test(enabled = true)
	public void clickTrackButtonTest() throws InterruptedException {
		homePage.clickTrackButton();
	}

}
