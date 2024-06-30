#Login Functionality (2)
package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login2 {
	WebDriver d;
	@Test(priority=1)
	void Open() {
		
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.amazon.in/");
	}
	@Test(priority=2)
	void Enter() {
		d.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		d.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys("Tommy");
		
		d.findElement(By.xpath("//input[@class='a-button-input']")).click();
	}
	@Test(priority=3)
	void Success() {
		String act=d.getTitle();
		String exp="Amazon";
		System.out.println("Actual title" +act);
		System.out.println("Expected title"+ exp);
		if(exp.equals(act)) {
			System.out.println("Test Successfull"+ exp);
		}
			else {
				System.out.println("Test not Successfull"+ exp);
			}
		}

	@Test(priority=4)
	void Close() {
		d.quit();
		
	}

}
