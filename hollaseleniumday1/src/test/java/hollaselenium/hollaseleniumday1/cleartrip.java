package hollaselenium.hollaseleniumday1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class cleartrip {
	@Test
	public void func1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b4c.06.01\\workspace\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com");
		WebElement from=driver.findElement(By.id("FromTag"));
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		act.sendKeys(from,"hyd").perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.ENTER).perform();
		String city=driver.findElement(By.id("from")).getAttribute("value");
		Assert.assertTrue(city.contains("HYD"));
		
		WebElement to=driver.findElement(By.id("ToTag"));
		
		
		
		
	}
	
		
		
	
		
		
}
