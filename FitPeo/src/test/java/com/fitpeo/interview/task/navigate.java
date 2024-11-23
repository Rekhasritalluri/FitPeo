package com.fitpeo.interview.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.fitpeo.com/");
 
	    driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	   
	   WebElement slider =driver.findElement(By.xpath("//input[@type='range']"));
	
	   for( ; ; ) 
		{
			if(slider.getAttribute("value").contains("820"))
			{
			                                                                                                                                 
				break;
			}
			else 
			{
				slider.sendKeys(Keys.ARROW_RIGHT);
				Thread.sleep(800);
			}
		}
	  WebElement textfield =driver.findElement(By.id(":r0:"));
	  textfield.click();
	  textfield.sendKeys("560");
   WebElement  checkbox99091=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	if(!checkbox99091.isSelected())
	{
		checkbox99091.click();
	}
	
	WebElement  checkbox99453=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	if(!checkbox99453.isSelected())
	{
		checkbox99453.click();
	}
	
	WebElement  checkbox99454=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
	if(!checkbox99454.isSelected())
	{
		checkbox99454.click();
	}
	
	WebElement  checkbox99474=driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
	if(!checkbox99474.isSelected())
	{
		checkbox99474.click();
	}
	
	WebElement verify=driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 inter css-12bch19'])[3]"));
	if(verify.isDisplayed())
	{
		System.out.println("Total Recurring Reimbursement for all Patients Per Month Is Displayed :)");
	}
	
	driver.quit();
}
}