package Browserlaunching;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Autosuggestion
{
public static void main(String[] args) throws InterruptedException 
{
String key="webdriver.chrome.driver";
String Value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
String url="https://www.flipkart.com/";
System.setProperty(key, Value);
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(url);

Thread.sleep(2000);

 List<WebElement> module = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div"));
  
 for(WebElement Options:module)
 {
  System.out.println(Options.getText());
 }
 
 System.out.println("************Ascending orderlist***********");
 TreeSet<String> t = new TreeSet<String>();
 for(WebElement Options:module)
 {
	 t.add(Options.getText());
 }
 System.out.print(t);
 
 System.out.println("*******select one from list*******");
 for(WebElement Options:module)
 {
	 String selectone="Mobiles";
	 String temp=Options.getText();
	 if(temp.equals(selectone))
	 {
		 Options.click();
		 System.out.println(selectone);
	 }
 }
}
}
