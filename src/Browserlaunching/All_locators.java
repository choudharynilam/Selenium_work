package Browserlaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_locators 
{
public static void main(String[] args) 
{
	String value="webdriver.chrome.driver";
	String key="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
	String url="https://www.facebook.com/login/";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	//ID
	//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	//Name
//	driver.findElement(By.name("pass")).sendKeys("india");
	//tag name
//	driver.findElement(By.tagName("button")).click();
	//class name
//	driver.findElement(By.className("_sv4")).getText();
	//Link Text
//	driver.findElement(By.linkText("Forgotten account?")).click();
}
}
