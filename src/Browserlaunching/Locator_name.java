package Browserlaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_name 
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
		driver.findElement(By.name("q")).sendKeys("Ambay valley city");
		Thread.sleep(5000);
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("Pune city");
		driver.findElement(By.cssSelector("#search-icon-legacy")).click();
		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.xpath("//button[@id='search']")).sendKeys("Ambay valley city");
		
}
}