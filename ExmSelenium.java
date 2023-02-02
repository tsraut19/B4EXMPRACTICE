package newPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExmSelenium {

	ChromeDriver driver;
	
	public void myOpen()
    {
		
	     System.setProperty("webdriver.chrome.driver", "D:\\C-DAC\\WBJP\\Sarje_SirWorkspace\\chromedriver.exe");
    	  driver=new ChromeDriver();
	      driver.get("https://www.makemytrip.com/");
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div/nav/ul/li[6]/div/a/span[1]")).click();
	      driver.findElement(By.id("fromCity")).click();
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")).sendKeys("Tapovan");
	      
	      driver.findElement(By.id("toCity")).click();
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/input")).sendKeys("Pune");
          
	      driver.findElement(By.id("travelDate")).click();
	      //driver.findElement(By.id("travelDate")).sendKeys("04/FEB/23");
	      	      
	      //search
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/p/button")).click();
       
          
          
          driver.manage().window().maximize();
          //driver.close();
    }
	
	public static void main(String args[])
	{
		ExmSelenium o = new ExmSelenium();
		o.myOpen();
	
	}
}
