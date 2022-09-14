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

	public class Example_sir{
	
		public static void main(String[] args) throws InterruptedException, IOException 
		{
			String key="webdriver.chrome.driver";
			String value="C:\\New folder\\June2022_Selenium\\driver\\chromedriver.exe";
			String url="https://www.amazon.in";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(2000);
	//full webpage screenshot
			TakesScreenshot t = (TakesScreenshot) driver;
			File source = t.getScreenshotAs(OutputType.FILE);
			System.out.println("Original path of screenshot file="+source);
	//1. same name for screenshot		
//			File desti = new File("C:\Users\Admin\eclipse-workspace\June2022_selenium\img");
//			FileHandler.copy(source, desti);
	//2. unique name for screenshot
		//a. timestamp
			Date d= new Date();
			String timestamp = d.toString().replace(":", "").replace(" ", "");
			System.out.println(timestamp);
			File desti = new File("C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\"+timestamp+".jpg");
			FileHandler.copy(source, desti);
		//b. random string name
			String randomName = RandomString.make(3);
//			File desti = new File("C:\\New folder\\June2022_Selenium\\Screenshot\\"+randomName+".jpg");
//			FileHandler.copy(source, desti);
	//Webelement screenshot		
			WebElement elementScrrenshot = driver.findElement(By.xpath("//img[@alt='Great Indian Festival']"));
			File src = elementScrrenshot.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\New folder\\June2022_Selenium\\Screenshot\\ati.jpg");
			FileHandler.copy(src, dest);
			
}}
