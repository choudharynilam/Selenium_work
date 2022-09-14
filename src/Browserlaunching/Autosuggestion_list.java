package Browserlaunching;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_list 
{
public static void main(String[] args) throws InterruptedException 
{
String key="webdriver.chrome.driver";
String value="C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe";
String url="https://www.google.co.in/";
String searchKeyword="flipkart";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(searchKeyword);
Thread.sleep(2000);
//print all Autosugget option
System.out.println("********All Autosuggest optiopn*********");

 List<WebElement> Autosugestlist =driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
 for(WebElement Options:Autosugestlist)
 {
	 System.out.println(Options.getText());
 }
System.out.println("*******Alphabetical order*************");
  TreeSet<String> t= new TreeSet<String>();
  for(WebElement Options:Autosugestlist)
  {
		 t.add( Options.getText());
}
  System.out.println(t);
System.out.println("********Slect one from list*******");

for(WebElement Options:Autosugestlist)
{
	String exp="flipkart big billion days";
	String selectlist=Options.getText();
	if(exp.equals(selectlist))
	{
		Options.click();
		break;
	} 
}


  
}

}