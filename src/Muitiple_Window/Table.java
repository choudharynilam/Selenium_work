package Muitiple_Window;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\June2022_selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population");
driver.manage().window().maximize();
Thread.sleep(2000);

//1 print cell
String densityText = driver.findElement(By.xpath("(//td[@style='text-align: left;'])[1]")).getText();
System.out.println(densityText);

//2 print colum
List<WebElement> columText = driver.findElements(By.xpath("//table[contains(@class,'jquery-tablesorter')]/tbody/tr/td[10]"));
for(WebElement ColumList:columText)
{
	System.out.println(ColumList.getText());
}
int rowCount=columText.size();
System.out.println(rowCount);
//3 print row
List<WebElement> rowText = driver.findElements(By.xpath("//table[contains(@class,'jquery-tablesorter')]/tbody/tr[10]/td"));
for(WebElement list:rowText)
{
	System.out.print(list.getText()+" | ");
}
int columCount=rowText.size();
System.out.print(columCount);

//4 header
List<WebElement> headerText = driver.findElements(By.xpath("//th[@class='headerSort headerSortUp']"));
for(WebElement temp:headerText)
{
	System.out.print(temp.getText()+" | ");
}

//5 Table body (Header+table)



for(int i=1;i<=rowCount;i++)
{
	for(int j=1;j<=columCount;j++)
	{
		
String tableElement = driver.findElement(By.xpath("//table[contains(@class,'tablesorter')]/tbody/tr["+i+"]/td["+j+"]")).getText();
{
	System.out.print(tableElement+" | ");
}
System.out.println();

}

}}}