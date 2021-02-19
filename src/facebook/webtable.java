package facebook;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver","/home/saidhanushtecno/Downloads/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        
        driver.manage().window().maximize();
        	
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
        List col  = (List) driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th"));
        System.out.println("Total columns " +col.size());
        
        List rows  = (List) driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
        System.out.println("Total Rows " +rows.size());
        
        WebElement cellIneed  = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[5]/td[2]"));
        System.out.println("Required value " +cellIneed.getText());
        

 

    }
	
	

}
