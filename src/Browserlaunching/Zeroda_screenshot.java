package Browserlaunching;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Zeroda_screenshot 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
String key="webdriver.chrome.driver";
String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
String url="https://zerodha.com/";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
Thread.sleep(2000);

TakesScreenshot t=(TakesScreenshot)driver;
//File source=t.getScreenshotAs(OutputType.FILE);
//System.out.println(source);
//File desti=new File("C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\zeroda.jpg");
//FileHandler.copy(source, desti);

 WebElement logo =driver.findElement(By.xpath("//img[@alt='Zerodha logo']"));
File src=logo.getScreenshotAs(OutputType.FILE);
File desti =new File("C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\img");
FileHandler.copy(src, desti);
}
}
