package seleniumwebdriver;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
	

		
		
	           // System Property for Chrome Driver   
	        System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Saiful Chowdhury\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");

			 
	       
	             // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  
	        
	     
	           // Launch Website  
	        driver.navigate().to("https://www.google.com/");  
	          
	         //Maximize the browser  
	          driver.manage().window().maximize();  
	        
	          
	          //driver.close();
	         // Scroll down the webpage by 5000 pixels  
	       // JavascriptExecutor js = (JavascriptExecutor)driver;  
	        //js.executeScript("scrollBy(0, 5000)");   
	          
	         // Click on the Search button  
	        //driver.findElement(By.linkText("Core Java")).click();     
	  
	     

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
