package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stali\\eclipse-workspace\\SeleniumTest\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		button.click();
		TakesScreenshot shot = (TakesScreenshot)driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\stali\\eclipse-workspace\\SeleniumTest\\screenshot\\snap.png");
		FileUtils.copyFile(src, des);
	}
}
