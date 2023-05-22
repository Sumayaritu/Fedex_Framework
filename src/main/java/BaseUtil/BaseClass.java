package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	WebDriver driver;
	public HomePage homePage;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anik\\eclipse-workspace-2\\gov.cms.portal\\driver\\chromedriver.exe");
		// Please see below 2 line added
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		// Then we need to instantiate the driver
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.fedex.com/en-us/home.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);

	}

	@AfterMethod
	public void tearUp() {
		driver.quit();

	}

}
