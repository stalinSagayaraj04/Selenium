package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class WebData {
	static int indexoftotalcases;
	static int indexofactive,indexofrecovered; 
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stali\\eclipse-workspace\\SeleniumTest\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.worldometers.info/coronavirus/");
		List<WebElement> elmt= driver.findElements(By.xpath("//table[@id = 'main_table_countries_today']/thead/tr/th"));
		System.out.println(elmt.size());
		for (int i = 0; i < elmt.size(); i++) {
			String text = elmt.get(i).getText();
			String replaceAll = text.replaceAll("\n", " ");
			//System.out.println(replaceAll);
			if (replaceAll.equalsIgnoreCase("TotAl Cases")) {
				indexoftotalcases= i;
				System.out.println("total cases: " + i);
			}else if (replaceAll.equalsIgnoreCase("active cases")) {
				indexofactive = i;
				System.out.println("active cases "+ i);
			}else if (replaceAll.equalsIgnoreCase("total recovered")) {
				indexofrecovered = i;
				
				System.out.println("total recoverd: " + i);
			}
			  
		}
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = \"main_table_countries_today\"]/tbody/tr[@role = \"row\"]"));
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> alldatas = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < alldatas.size(); j++) {
				boolean equalsIgnoreCase = alldatas.get(j).getText().equalsIgnoreCase("india");
				if(equalsIgnoreCase == true) {
					System.out.println(alldatas.get(indexofactive).getText());
				}
			}
		
			}}
	}
//table[@id ='main_table_countries_today' ]/thead /tr/th[@class = 'sorting_disabled']