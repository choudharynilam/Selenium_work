package Browserlaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe
{
public static void main(String[] args) throws InterruptedException
{
String key="webdriver.chrome.driver";
String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
String url="https://demoqa.com/nestedframes";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
Thread.sleep(2000);

//first text
String text=driver.findElement(By.xpath("//*[contains(text(),'Sample')]")).getText();
System.out.println(text);

//1.by Index
//driver.switchTo().frame(0);

//2.by String name/id/name
driver.switchTo().frame("frame1");
String ParentText=driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
System.out.println( ParentText);
//by index
driver.switchTo().frame(0);
String Child=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
System.out.println(Child); 
//by
//driver.switchTo().frame("parentnew");
WebElement newparent = driver.findElement(By.xpath("//iframe[@width='500px']")).getText();
System.out.println(newparent);

// WebElement PFrame = driver.findElement(By.xpath("//iframe[@width='500px']"));

}
}
