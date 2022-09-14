package Browserlaunching;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
	String key="webdriver.chrome.driver";
	String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
	String url="https://www.amazon.in/";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	TakesScreenshot t=(TakesScreenshot)driver;
	File source=t.getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	//File img=new File("C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\img");
    //FileHandler.copy(source, img);
    
    Date d=new Date(0);
    String time=d.toString().replace(":", " ").replace(" ", "");
    System.out.println(time);
    File img=new File("C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\img");
    FileHandler.copy(source, img);
    
}
}
