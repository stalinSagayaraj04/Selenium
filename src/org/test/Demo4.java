package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {
	public static void main(String[] args) throws Exception   {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\stali\\eclipse-workspace\\SeleniumTest\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/V4/index.php");
		WebElement user = driver.findElement(By.xpath("//input[@type = \"text\"]"));
		user.sendKeys("mngr382714");
		WebElement pswd = driver.findElement(By.xpath("//input[@type = \"password\"]"));
		pswd.sendKeys("hebemYm");
		WebElement elmnt2 = driver.findElement(By.name("btnLogin"));
		elmnt2.click();
		TakesScreenshot shot =  (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		
		//Thread.sleep(1000);
		File dest = new File("C:\\Users\\stali\\eclipse-workspace\\SeleniumTest\\screenshot\\demo.png");
		FileUtils.copyFile(src, dest);
		
	}
	
}
