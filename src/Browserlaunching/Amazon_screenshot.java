package Browserlaunching;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon_screenshot {

	public static void main(String[] args) throws IOException 
	{
		
			String key="webdriver.chrome.driver";
			String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
			String url="https://www.amazon.in/";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			TakesScreenshot t= (TakesScreenshot)driver;
		File source=t.getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\img\\image.jpg");
		FileHandler.copy(source, desti);
	}
}
