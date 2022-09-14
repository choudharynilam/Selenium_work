package Browserlaunching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Brouseropening_1
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login.php/");
driver.findElement(By.name("email")).sendKeys("choudhary.nilam11@gmail.com");
driver.findElement(By.name("pass")).sendKeys("abs123");
driver.findElement(By.name("login")).click();
}
}
