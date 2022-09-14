package Browserlaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_nevigate
{
public static void main(String[] args) throws InterruptedException {
	String key="webdriver.chrome.driver";
	String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
	String url="https://www.flipkart.com/";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(2000);

	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	driver.close();
	
}
}
