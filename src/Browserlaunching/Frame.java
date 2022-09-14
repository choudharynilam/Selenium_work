package Browserlaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame 
{
public static void main(String[] args) throws InterruptedException 
{
	String key="webdriver.chrome.driver";
	String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
	String url="https://chercher.tech/practice/frames-example-selenium-webdriver";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(2000);
//First text
	String text=driver.findElement(By.xpath("//h1[contains(text(),'Selenium ')]")).getText();
	System.out.println(text);

//parent text
	driver.switchTo().frame("frame1");
    driver.findElement(By.tagName("input")).sendKeys("pune");
    
    driver.switchTo().frame("frame3");
    driver.findElement(By.xpath("//input[@id='a']")).click();
    
    driver.switchTo().defaultContent();
    driver.switchTo().frame("frame2");
    //driver.switchTo().frame("frame1");
   WebElement slist=driver.findElement(By.xpath("//select[@id='animals']"));
	Select s=new Select(slist);
	//as.selectByValue("animals");
	s.selectByIndex(1);
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame1");
	driver.switchTo().frame("frame3");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	

	
	
	
}
}
