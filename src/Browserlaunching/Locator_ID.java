package Browserlaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ID
{
public static void main(String[] args) 
{
String value="webdriver.chrome.driver";
String key="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
String url="https://www.google.co.in/";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
//driver.findElement(By.name("email")).sendKeys("abc@gmail.com");

}
}
