package com.crm.SDET25.Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase3 {
	@Test
	public void test() throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.cssSelector("img[title='Create Contact...']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Chetan");
		driver.findElement(By.name("lastname")).sendKeys("S");
		
		driver.findElement(By.xpath("//img[@title='Select'] [1]")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(10000);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//driver.findElement(By.name("accountname")).sendKeys("LMN");
		
		//driver.findElement(By.name("industry")).click();
		
		//driver.findElement(By.cssSelector("option[value='Education']")).click();
		
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1] ")).click();
		//Thread.sleep(10000);
				
		//driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
		
		//driver.findElement(By.linkText("Sign Out")).click();		
		
	}

}
