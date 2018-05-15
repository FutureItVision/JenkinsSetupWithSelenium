package jenkinsTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestOne {
	
	
	@Test
	public void firstJenkinTest(){
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.groupm.com/");
	driver.findElementByXPath(".//*[@id='navbar']/div/div/div/a/img").isDisplayed();
	driver.findElementByXPath(".//*[@id='navbar']/div/div/div/a/img").isDisplayed();
	driver.findElementByXPath(".//*[@id='navbar']/div/div/div/a/img").isDisplayed();
	driver.close();
				
	}

}