package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoGuru {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\stali\\eclipse-workspace\\SeleniumTest\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@type = \"text\"]")).sendKeys("mngr382714");
		driver.findElement(By.xpath("//input[@type = \"password\"]")).sendKeys("hebemYm\r\n" + 
				"");
		driver.findElement(By.xpath("//input[@type = \"submit\"]")).click();
	
	}

}
