package hollaselenium.hollaseleniumday1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class testajax {

	@Test
	public void func1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b4c.06.01\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		
		driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
		WebElement from=driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceholder1_RadTreeView1\']/ul/li/ul/li[1]/div/div/span"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceholder1_priceChecker\']/div[1]"));
		Actions act=new Actions(driver);
		act.clickAndHold(from).release(to).perform();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("ctl00_ContentPlaceholder1_Label1"),"Drop a package here to check price"));
		String text=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
		Assert.assertTrue(text.contains("$3999"));
		
			
	}
}
