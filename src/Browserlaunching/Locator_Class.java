package Browserlaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Class 
{
public static void main(String[] args)
{
String key="webdriver.chrome.driver";
String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
String url="https://www.youtube.com/";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();

driver.findElement(By.id("search")).sendKeys("Ambay valley city");
//driver.navigate().to("https://www.google.com/");


}
}
