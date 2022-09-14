package Muitiple_Window;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window 
{


public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
driver.get(" https://www.onlinesbi.sbi/");
driver.manage().window().maximize();

driver.findElement(By.xpath("//a[contains(text(),'Salary')]")).click();
//single windowhandle(finding ID of that perticular window)
String singlewindowID = driver.getWindowHandle();
System.out.println(singlewindowID);
Thread.sleep(2000);

//multiple window handle
driver.findElement(By.xpath("(//a[contains(text(),' Mutual ')])[3]")).click();
driver.findElement(By.xpath("//a[contains(text(),' Aadhaar')]")).click();
Set<String> Ids = driver.getWindowHandles();
for(String list:Ids)
{
	System.out.println(list);
}
ArrayList<String> al=new  ArrayList<String> (Ids);
driver.switchTo().window(al.get(2));
String text = driver.findElement(By.xpath("//*[contains(text(),'Invest Without Login')]")).getText();
System.out.println(text);

driver.switchTo().window(al.get(3));
String text1 = driver.findElement(By.xpath("(//*[contains(text(),'Salary Accounts')])[2]")).getText();
System.out.println(text1);
}
}
