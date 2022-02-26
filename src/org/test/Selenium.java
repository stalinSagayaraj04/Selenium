package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\stali\\\\eclipse-workspace\\\\SeleniumTest\\\\driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("saga");
		Thread.sleep(3000);
		driver .close();
	}

}
