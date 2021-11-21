package com.crm.SDET25.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 {
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("PQR");
		
		driver.findElement(By.name("industry")).click();
		
		driver.findElement(By.cssSelector("option[value='Education']")).click();
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1] ")).click();
		Thread.sleep(10000);
				
		driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign Out")).click();		
		
	}
		
}


