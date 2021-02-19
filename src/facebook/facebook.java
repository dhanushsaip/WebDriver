package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		
		
		
		

			 

		  
		        
		        
		        System.setProperty("webdriver.chrome.driver","/home/saidhanushtecno/Downloads/chromedriver");
		        
		        WebDriver driver = new ChromeDriver();
		        
		        driver.get("https://www.facebook.com/");
		        
		        driver.manage().window().maximize();
		        
		        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		        
	//	        WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	//	        username.sendKeys("abc.xyz.com");
		        
		    
		        
	//	        WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	//	        password.sendKeys("123456");
		        
	//	        WebElement button = driver.findElement(By.xpath("//*[@name=\"login\"]"));
		        
	//	        button.click();
		// TODO Auto-generated method stub
		        WebElement createaccount = driver.findElement(By.linkText("Create New Account"));
		        createaccount.click();

		       
		        
		        WebElement firstname = driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
		        firstname.sendKeys("sai");
		        WebElement lastname = driver.findElement(By.xpath("//*[@name=\"lastname\"]"));
		        lastname.sendKeys("dhanush");
		        WebElement mobilenumber = driver.findElement(By.xpath("//*[@name=\"reg_email__\"]"));
		        mobilenumber.sendKeys("9087568758");
		        WebElement password = driver.findElement(By.xpath("//*[@data-type=\"password\"]"));
		        password.sendKeys("dhaush");
		        WebElement Month = driver.findElement(By.xpath("//*[@name=\"birthday_month\"]"));
		        Select ddmonth=new Select(Month);
		        ddmonth.selectByIndex(3);
		        WebElement Day = driver.findElement(By.xpath("//*[@name=\"birthday_day\"]"));
		        Select date=new Select(Day);
		        date.selectByIndex(9);
		        WebElement year = driver.findElement(By.xpath("//*[@name=\"birthday_year\"]"));
		        Select yr =new Select(year);
		        yr.selectByIndex(10);
		        
		        WebElement Gender = driver.findElement(By.xpath("//*[text()='Male']"));
		        Gender.click();
		        
		        WebElement Submit = driver.findElement(By.xpath("//button[@name='webSubmit']"));
		        Submit.click();
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
	}
	

}
