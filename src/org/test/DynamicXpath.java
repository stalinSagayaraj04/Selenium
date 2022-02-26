package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicXpath {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\stali\\\\eclipse-workspace\\\\SeleniumTest\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement (By.linkText("Create New Account")).click();
	
		WebElement findElement3 = driver.findElement(By.name("firstname"));
		findElement3.sendKeys("saga");
		WebElement elmnt = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(elmnt);
		s.selectByIndex(3);
		WebElement findElement1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(findElement1);
		s1.selectByVisibleText("Nov");
		WebElement findElement4 = driver.findElement(By.id("year"));
		Select s2 = new Select(findElement4
				);
		s2.selectByVisibleText("1997");
		Thread.sleep(4000);
		
		List<WebElement> findElements = driver.findElements(By.cssSelector("input"));
		System.out.println(findElements.size());
		
		for (int i = 0; i < findElements.size(); i++) {
			String l = findElements.get(i).getText();
			
			System.out.println(l
					);       
		}
		
		driver.close();
	}
}
