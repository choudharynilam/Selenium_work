package Browserlaunching;

import javax.swing.text.Position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_size
{
	public static void main(String[] args) throws InterruptedException {
		
	
String key="webdriver.chrome.driver";
String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
String url="https://www.amazon.in/";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.get(url);
System.out.println(driver.manage().window().getSize());
Dimension d1=new Dimension(500,200);
driver.manage().window().setSize(d1);
Thread.sleep(2000);
System.out.println(driver.manage().window().getPosition());
Point p1=new Point(800, 700);
driver.manage().window().setPosition(p1);
	Thread.sleep(2000);
	driver.close();
	}
	

}
