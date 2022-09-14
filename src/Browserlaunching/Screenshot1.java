package Browserlaunching;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot1 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
String key="webdriver.chrome.driver";
String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
String url="https://www.flipkart.com/";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
Thread.sleep(2000);

TakesScreenshot t = (TakesScreenshot)driver;
File source=t.getScreenshotAs(OutputType.FILE);
System.out.println(source);
File desti= new File("C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\navya.jpg");
FileHandler.copy(source, desti);

//Screenshot of one element
 WebElement elementScreenshot = driver.findElement(By.xpath("//img[@alt='Fashion']"));
 File src=elementScreenshot.getScreenshotAs(OutputType.FILE);
// File desti1=new File("C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\fashion.jpg");
// FileHandler.copy(src, desti1);
 
 //screenshot unique name(date)
 //Date d= new Date();
//String time=d.toString().replace(":",",").replace(""," ");
//System.out.println(time);
//File desti2=new File("C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\time.jpg");
//FileHandler.copy(src, desti2);

//Screenshot random
//String randomName = RandomString.make(3);
//File desti2=new File("C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\random.jpg");
//FileHandler.copy(src, desti2); 
 
}
}
