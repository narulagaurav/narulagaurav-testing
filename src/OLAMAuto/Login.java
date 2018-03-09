package OLAMAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Login{ 
	
	@SuppressWarnings("deprecation")
	@Test
	public static void login_olam(WebDriver driver){
		
	/*	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		WebElement element = driver.findElement(By.xpath("//a[text()='My Account']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		//driver.findElement(By.linkText("Log In")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'/customer/account/login/')]")).click();
	
		WebElement email=driver.findElement(By.id("email"));
		Assert.assertTrue(email.isDisplayed());
		//driver.findElement(By.id("email")).sendKeys("testcustomertomato@mail.com");
		email.sendKeys("testcustomertomato@mail.com");
		driver.findElement(By.id("pass")).sendKeys("Admin1234$");
		driver.findElement(By.id("send2")).click();
     
        }

}
