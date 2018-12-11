package casestudies;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Casestudy1 {

	WebDriver dr1;
	
	public void InvokeBrowser(String Browsertype){
		
		if(Browsertype.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\chromedriver02122018\\chromedriver.exe");
		dr1 = new  ChromeDriver();
		
		} 
		else if(Browsertype.equals("edge")) {
				
				System.setProperty("webdriver.edge.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\edgedriver\\MicrosoftWebDriver.exe");
				dr1 = new  EdgeDriver();
		}
		
			
		dr1.manage().window().maximize();
		
		dr1.manage().deleteAllCookies();
		
		dr1.get("https://www.edureka.co/");
		
		
		
	}
	
	public void getText() {
		
		String text = dr1.getTitle();
		System.out.println("Title" +text);
		
	}
	
	public void Login() {
		
		dr1.findElement(By.linkText("Log In")).click();
	}
	
	
	public void SignIn(String Email , String Password) {
		
		dr1.findElement(By.id("si_popup_email")).sendKeys(Email);
		dr1.findElement(By.id("si_popup_passwd")).sendKeys(Password);
		dr1.findElement(By.xpath("//button[@class='clik_btn_log btn-block pagesense_en_track']")).click();
	
		//dr1.findElementsById(Password = "10111985");
		
		
	}
	
	public void Searchpage(String sear) {
		
		dr1.findElement(By.xpath("//input[@id='homeSearchBar']")).sendKeys(sear);
		System.out.println("i am here" +sear);
			
		
	}
	
	
}
