package Browserlaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateaccount 
{
public static void main(String[] args) throws InterruptedException 
{
	String key="webdriver.chrome.driver";
	String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
	String url="https://www.facebook.com/r.php?locale=en_GB&display=page\"";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Navya");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Londhe");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9096126408");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456!");
//select DOB	
WebElement dob=driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select s= new Select(dob);
s.selectByIndex(26);
Thread.sleep(2000);
WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
Select s1= new Select(month);
s1.selectByValue("2");
Thread.sleep(2000);
WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
Select s2= new Select(year);
s2.selectByValue("2000");
//select gender
driver.findElement(By.xpath("//label[@class='_58mt']")).click();

//driver.findElement(By.xpath("//label[text()='Male']")).click();

driver.findElement(By.xpath("//button[@type='submit']")).click();

}
}
