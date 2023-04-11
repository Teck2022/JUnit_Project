package toggleFunctionality;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	WebDriver driver;
	
	@Before
	public void initDriver() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://techfios.com/test/102/");
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
		
		@Test
		public void toggleTest() throws InterruptedException {
			
//		Toggling on all check boxes
		driver.findElement(By.name("allbox")).click();
		Thread.sleep(8000);

//		Unchecking a box from all check boxes 
		driver.findElement(By.name("todo[0]")).click();
		Thread.sleep(8000);

//		Unchecking all the checked boxes
		driver.findElement(By.name("allbox")).click();
		Thread.sleep(8000);
	}

	@After
	public void tearDown() {
		driver.close();
	}


}
