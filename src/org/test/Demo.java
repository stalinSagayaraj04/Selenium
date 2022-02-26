package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\stali\\eclipse-workspace\\SeleniumTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upCasting
		driver.get("https://www.facebook.com/");
		WebElement m = driver.findElement(By.id("email"));
		m.sendKeys("psych123@gmail.com");

		WebElement n = driver.findElement(By.name("pass"));

		n.sendKeys("9840950950");
		WebElement u = driver.findElement(By.partialLinkText("Forgot"));

		u.click();
		WebElement s = driver.findElement(By.id("identify_email"));

		s.sendKeys("stalin.arokiyaraj69@gmail.com");
		WebElement forg = driver.findElement(By.tagName("button"));
		Thread.sleep(2000);
		
		forg.click();

		// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		// we.click();
	
		// driver.quit();
	}

}
