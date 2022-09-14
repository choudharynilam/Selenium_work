package Multibrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Otherpopup 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?vehicle5=Sedan&languages=Java&enterText=");
Thread.sleep(2000);
//Alert popup/box
driver.findElement(By.xpath("//button[@id='alertBox']")).click();
Thread.sleep(2000);
Alert alt = driver.switchTo().alert();
System.out.println(alt.getText());
alt.accept();
//confirm box
driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
Thread.sleep(2000);
Alert alt1 = driver.switchTo().alert();
System.out.println(alt1.getText());
//alt1.dismiss();
alt.accept();
//prompt box
driver.findElement(By.xpath("//button[@id='promptBox']")).click();
Thread.sleep(2000);
Alert alt2 = driver.switchTo().alert();
System.out.println(alt2.getText());
//alt2.accept();
alt2.dismiss();
}
}
