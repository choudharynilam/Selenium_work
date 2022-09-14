package Multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Muitipalbrowser_compatibility 
{
public static void main(String[] args) 
{
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe");
//    WebDriver driver =new ChromeDriver();
//    driver.get("https://en-gb.facebook.com/");
//    String text = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
//    System.out.println(text);

//firefox browser
//    System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\geckodriver.exe");
//    WebDriver driver=new FirefoxDriver();
//    driver.get("https://en-gb.facebook.com/");
//    String text = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
//    System.out.println(text);
//Edge browser
    System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.get("https://en-gb.facebook.com/");
    String text = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
    System.out.println(text);
}
}
