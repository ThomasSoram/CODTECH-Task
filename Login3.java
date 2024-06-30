#Login Functionality (3)
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
public class Login3 {
	
	WebDriver d;
@Test(priority=1)
void open() {
	 d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	
}
@Test(priority=2)
	void login() 
{
	d.findElement(By.id("email")).sendKeys("Tony");
	d.findElement(By.id("pass")).sendKeys("Tony@123");
	d.findElement(By.name("login")).click();
	
}
@Test(priority=3)
void Verify() {
String act=d.getTitle();
String exp="facebook";
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


