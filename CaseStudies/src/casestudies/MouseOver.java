package casestudies;

	import java.awt.Desktop.Action;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class MouseOver {

		WebDriver Driver;
		
		public void InvokeBrowser(String Browsertype){
			
			if(Browsertype.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\chromedriver02122018\\chromedriver.exe");
			Driver = new  ChromeDriver();
			
			} 
			else if(Browsertype.equals("edge")) {
					
					System.setProperty("webdriver.edge.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\edgedriver\\MicrosoftWebDriver.exe");
					Driver = new  EdgeDriver();
			}
			
			
			
		
				
			Driver.manage().window().maximize();
			
			Driver.manage().deleteAllCookies();
			Driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Driver.get("https://www.flipkart.com/");


			
		}
		
		public void getText() {
			
			String text = Driver.getTitle();
			System.out.println("Title" +text);
			
		}
		
		public void closeModal() {
			
			Driver.findElement(By.xpath("//button[@class= '_2AkmmA _29YdH8']")).click();
		}
		
		public void MouseOver1() {
			
			//Here we have to call the explicit wait method
			waitTillFindElementVisible(10,By.xpath("(//span[@class= '_1QZ6fC _3Lgyp8'])[5]")); 
			
			
			WebElement toys = Driver.findElement(By.xpath("(//span[@class= '_1QZ6fC _3Lgyp8'])[5]"));

			Actions action = new Actions(Driver);
		
			action.moveToElement(toys).build().perform();
			
			WebElement RemoteToys = Driver.findElement(By.xpath("//a[text() = 'Remote Control Toys']"));		
			
		  action.moveToElement(RemoteToys).click().build().perform();
		  
	  Driver.findElement(By.xpath("//a[text()='9 Perfect Wired Remote Control Battery Operated JCB Cra...']")).click();
//	  action.moveToElement(DoubleClickOnToy).click().build().perform();
	
		 }
		
		//Explicit wait code
		
		private void waitTillFindElementVisible(int timeOutInSeconds,By by) {
			
			
			
			WebDriverWait wait  =  new WebDriverWait(Driver, timeOutInSeconds);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			
		}
		

}
