#Login Functionality (1)
package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



/*
 * Open application
 * Enter User Id and Password
 * Successfully login
 * close
 */
public class Login1 {
	WebDriver d;
@Test(priority=1)
void Open() {
	
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@Test(priority=2)
void Enter() {
	d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	d.findElement(By.xpath("//button[@type='submit']")).click();
}
@Test(priority=3)
void Success() {
	String act=d.getTitle();
	String exp="OrangeHRM";
	System.out.println("Actual title" +act);
	System.out.println("Expected title"+ exp);
	if(exp.equals(act)) {
		System.out.println("Test Successful"+ exp);
	}
		else {
			System.out.println("Test not Successful"+ exp);
		}
	}

@Test(priority=4)
void Close() {
	d.quit();
	
}
}
