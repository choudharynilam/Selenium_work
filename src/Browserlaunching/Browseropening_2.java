package Browserlaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browseropening_2 
{
	public static void main(String[] args)
	{
String key ="webdriver.chrome.driver";
String value ="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
String url ="https://www.flipkart.com/";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();

}
}