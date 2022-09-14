package Browserlaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_nameGoogle 
{
public static void main(String[] args) throws InterruptedException 
{
	String key="webdriver.chrome.driver";
	String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
	String url="https://www.google.co.in/";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();	
	driver.findElement(By.name("q")).sendKeys("Gujrat state");
	Thread.sleep(5000);
	driver.navigate().to("https://www.youtube.com/");
	driver.findElement(By.name("search_query")).sendKeys("Locator in Selenium");
    driver.findElement(By.id("search-icon-legacy")).click();
    driver.navigate().to("https://www.google.co.in/");
    driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf.emcav > div.RNNXgb > div > div.a4bIc > input"));
    driver.findElement(By.xpath("//button[@type='text']")).click();    

}
}
