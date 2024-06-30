#login Functionality (4)
package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * open app
 * login
 * login successfully
 * close
 */
public class Login4{
	
	WebDriver d;
@Test(priority=1)
void open() {
	 d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));
	d.manage().window().maximize();
	d.get("https://www.instagram.com/");
	
}
@Test(priority=2)
	void login() 
{
	d.findElement(By.xpath("//input[@name='username']")).sendKeys("Johnny");
	d.findElement(By.xpath("//input[@name='password']")).sendKeys("Johnny@123");
	d.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).click();
	
}
@Test(priority=3)
		void Verify() {
	String act=d.getTitle();
	String exp="Instagram";
	System.out.println( "Actual Title:" +act);
	System.out.println( "Expected Title:" +act);
	if(exp.equals(act)) {
		System.out.println("Verified");}
		else {
		
			System.out.println("Not Verified");
		}
	}
			
		
@Test(priority=4)
			void close() {
	d.quit();
	
}
}

