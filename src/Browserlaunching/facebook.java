package Browserlaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook 
{
public static void main(String[] args) throws InterruptedException 
{
	String key="webdriver.chrome.driver";
	String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
	String url="https://www.facebook.com/";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7378331234");
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@Navya123");
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@value='1']")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@id='approvals_code']")).sendKeys("123");
	
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
}
}
