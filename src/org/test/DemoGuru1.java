package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoGuru1 {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\stali\\eclipse-workspace\\SeleniumTest\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		WebElement first = driver.findElement(By.name("uid"));
		first.sendKeys("mngr382714");
		WebElement second = driver.findElement(By.name("password"));
		second.sendKeys("hebemYm");
		WebElement third = driver.findElement(By.xpath("//input[@type = \"submit\"]"));
		third.click();
		Thread.sleep(3000);
		driver.close();
	}
}
