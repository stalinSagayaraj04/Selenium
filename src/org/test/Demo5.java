package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stali\\eclipse-workspace\\SeleniumTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("https://accounts.lambdatest.com/login");
		
		driver.findElement(By.xpath("//input[@name = \"email\"]")).sendKeys("tharun@12");;
		driver.findElement(By.xpath("//input[@name = \"password\"]")).sendKeys("54352gegmi5");;
		driver.findElement(By.xpath("//button[text() = \"Log in\"]")).click();
		List<WebElement> li = driver.findElements(By.tagName("input"));
		System.out.println(li.size());
		for (int i = 0; i < li.size(); i++) {
			String s = li.get(i).getText();
			//int st = Integer.parseInt(s);
			System.out.println(s);
		}
			driver.close();
	
	}
}
