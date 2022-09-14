package Browserlaunching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Registration_page 
{
public static void main(String[] args) throws InterruptedException 
{
String key="webdriver.chrome.driver";
String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
String url="http://www.dypatil.edu/application-form/";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
Thread.sleep(2000);
//Xpath by attribute
boolean logostatus=driver.findElement(By.xpath("//img[@class='logo']")).isDisplayed();
System.out.println("logo display status="+logostatus);
//Xpath bt Text
//String schoolname=driver.findElement(By.xpath("//h1[text()='School of Admission']")).getText();	
//System.out.println("name of school="+schoolname);
String schoolname=driver.findElement(By.xpath("//h1[@class='section-heading']")).getText();
System.out.println("name of school="+schoolname);
//Xpath by contains (partial text)
String detailsText = driver.findElement(By.xpath("//h1[contains(text(),'nal')]")).getText();
System.out.println("Details Text="+detailsText);
//xpath by index
driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Akash");

driver.findElement(By.xpath("//input[@name='middle_name']")).sendKeys("Abc");

driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("choudhary");

driver.findElement(By.xpath("//input[@name='father_name']")).sendKeys("prithviraj");

driver.findElement(By.xpath("//input[@name='mother_name']")).sendKeys("vandana");

driver.findElement(By.xpath("//input[@name='mother_tongue']")).sendKeys("marathi");

driver.findElement(By.xpath("(//input[@name='gender'][1])")).click();

//driver.findElement(By.xpath("(//input[@name='gender'][2])")).click();

driver.findElement(By.xpath("//input[@type='date']")).sendKeys("01-09-1988");
//Select s=new Select(dob);
//s.selectByValue("01-09-1988"); 
//input[@type='date']

WebElement admission=driver.findElement(By.xpath("//select[@id='school']"));
Select s1=new Select(admission);
s1.selectByIndex(2);


WebElement option=driver.findElement(By.xpath("//select[@name='level']"));
Select s2=new Select(option);
s2.selectByValue("After 10+2");

WebElement option1=driver.findElement(By.xpath("//select[@name='course_name']"));
Select s3=new Select(option1);
s3.selectByVisibleText("course_name");
//select[@name='course_name']



WebElement Listaddimision=driver.findElement(By.xpath("//select[@id='school']"));
Select s4=new Select(Listaddimision);
 List<WebElement> list = s4.getOptions();
 for(WebElement Object:list)
 {
	 System.out.println(Object.getText());
 }
 //get firstselected option--default/latest selected option
System.out.println(s3.getFirstSelectedOption().getText());


}
}
