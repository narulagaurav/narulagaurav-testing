package OLAMAuto;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import junit.framework.Assert;


public class AddToCart{
	

public static void Add_Olam(WebDriver driver) {

	//driver.findElement(By.xpath("//span[text()='View All Orders']")).click();
	//WebElement viewOrder=driver.findElement(By.xpath("//span[text()='View All Orders']"));
	//Assert.assertEquals(true, viewOrder.isDisplayed());
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement element = driver.findElement(By.linkText("Tomatoes"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.linkText("Diced")).click();
	try{
		driver.findElement(By.linkText("Diced")).click();
	}catch(NoSuchElementException e){}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//div[text()='Purchase']")).click();
	//driver.findElement(By.xpath("//div[text()='Conventional']")).click();
	//driver.findElement(By.id("product-addtocart-button")).click();
	//driver.findElement(By.id("datepicker")).sendKeys("10-Nov-2017");
	Select oSelect = new Select(driver.findElement(By.xpath("//select[@class='swatch-select crop_year']")));
	oSelect.selectByVisibleText("12 months");
	driver.findElement(By.id("datepicker")).click(); //click field
	driver.findElement(By.linkText("Next")).click(); //click next month
	driver.findElement(By.linkText("28")).click(); //click day
	driver.findElement(By.id("cart-btn")).click();
	
}

}