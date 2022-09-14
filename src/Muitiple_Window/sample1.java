package Muitiple_Window;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
Thread.sleep(2000);
//Single ID
driver.findElement(By.xpath("//*[@type='text']")).sendKeys("samsung mobile");
driver.findElement(By.xpath("//*[@type='submit']")).click();
String ID = driver.getWindowHandle();
System.out.println(ID);
//Multiple ID
driver.findElement(By.xpath("//span[contains(text(),'(Midnight Blue, 6GB, 128GB Storage)')]")).click();
driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[22]")).click();
Set<String> Ids = driver.getWindowHandles();
for(String list:Ids)
{
	System.out.println(list);
}
ArrayList<String> al=new ArrayList<String>(Ids);
driver.switchTo().window(al.get(2));
String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]")).getText();
System.out.println(text);

driver.switchTo().window(al.get(1));
driver.switchTo().window(al.get(0));

}

}
