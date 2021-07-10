package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	
	WebDriver driver;

	@Before
	public void launchBrowser() {
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void learnLocators() {
		
		driver.findElement(By.linkText("Link Test : New Page")).click();
		driver.findElement(By.partialLinkText("Link Test")).click();
		
		//css selector
		driver.findElement(By.cssSelector("input#sex-1")).click();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input[type='text'][name=\"firstname\"]")).sendKeys("selenium");
		
		//xpath
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@name='firstname' and @type='text']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//a[text()='OS-API Product FrontEnd']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'TF-API Product Backend')]")).click();
		
		
	}

}
