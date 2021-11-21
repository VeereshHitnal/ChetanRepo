package com.crm.SDET25.Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScript1 {
	@Test
	public void Test() throws IOException, InterruptedException
	{
		String filePath = "E:\\Chetan\\resources/propertydata.properties";
		FileInputStream fin = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fin);
		
		String Url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(Url);
		
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		
		driver.findElement(By.linkText("Organizations")).click();
		
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("ABCD");
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1] ")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
		
		driver.findElement(By.linkText("Sign Out")).click();
		
	}

}
