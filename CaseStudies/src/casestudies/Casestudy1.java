package casestudies;


import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Casestudy1 {

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
		Driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		Driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		Driver.get("https://www.edureka.co/");


		
	}
	
	public void getText() {
		
		String text = Driver.getTitle();
		System.out.println("Title" +text);
		
	}
	
	public void Login() {
		
		Driver.findElement(By.linkText("Log In")).click();
	}
	
	
	public void SignIn(String Email , String Password) {
		
		Driver.findElement(By.id("si_popup_email")).sendKeys(Email);
		Driver.findElement(By.id("si_popup_passwd")).sendKeys(Password);
		Driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block pagesense_en_track']")).click();
	
		//Driver.findElementsById(Password = "10111985");
		
		
	}
	
	
//	
//	public void clickondevopsbutton() {
//		
//		WebElement mouseToClick  = Driver.findElement(By.linkText("Cloud Computing"));
//		
//		
//	}
//	
	public void Searchpage() {
		
		WebElement MouseOver = Driver.findElement(By.xpath("//a[@id = 'dLabel']"));
//		System.out.println("i am here" +sear);
		Actions action = new Actions(Driver);
	
		action.moveToElement(MouseOver).build().perform();
		
		WebElement SoftwareTesting = Driver.findElement(By.xpath("(//ul//a[text() = 'Software Testing'])[1]"));		
		
	  action.moveToElement(SoftwareTesting).build().perform();
	  
	System.out.println(Driver.getTitle());
	  WebElement Slenium = Driver.findElement(By.xpath("(//li//a[text() = 'Selenium Certification Training'])[1]"));
		action.moveToElement(Slenium).click().build().perform();	
		
		System.out.println(Driver.getTitle());
	}
	
	
}
