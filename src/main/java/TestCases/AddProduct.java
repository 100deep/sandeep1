package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class AddProduct 
{
    public static void main( String[] args )
    {
       WebDriver d=new FirefoxDriver();
       d.get("https://www.google.co.in");
       d.manage().window().maximize();
       d.findElement(By.xpath("//*[@id='gb_70']")).click();
       List<WebElement> options = d.findElements(By.xpath("//*[@id='Email']"));
		for (WebElement option : options) {
		    if(option!=null)
		    	
		    	option.sendKeys("dsgads");
		}
    }
}
