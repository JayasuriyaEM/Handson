package linkedin.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedIn_Cron {
	public static void main(String args[]) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get("https://www.linkedin.com/login");
//		driver.findElement(By.id("username")).sendKeys("jayasuriyac2000@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Jaya0411@ln");
//		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
//		Thread.sleep(1000);
//		driver.get("https://www.flipkart.com/");
		System.out.println("nandha");
		
	}
	
}