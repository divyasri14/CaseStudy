package casestudies;


import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Casestudy1 {

	ChromeDriver dr1;
	
	public void InvokeChrome(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambikaraj\\eclipse-workspace\\chromedriver02122018\\chromedriver.exe");
		dr1 = new  ChromeDriver();
		
		dr1.manage().window().maximize();
		
		dr1.manage().deleteAllCookies();
		
		dr1.get("https://www.edureka.co/");
		
		
		
	}
	
	public void Login() {
		
		dr1.findElement(By.linkText("Log In")).click();
	}
	
	
	public void SignIn(String Email , String Password) {
		
		dr1.findElement(By.id("si_popup_email")).sendKeys(Email);
		dr1.findElement(By.id("si_popup_passwd")).sendKeys(Password);
	
		
		//dr1.findElementsById(Password = "10111985");
		
		
	}
}
