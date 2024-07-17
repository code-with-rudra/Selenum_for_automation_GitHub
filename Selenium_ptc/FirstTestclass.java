package Selenium_ptc.Selenium_ptc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestclass {
	static WebDriver driver=null;
	public static void main(String[] args)  throws InterruptedException{
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchArea = driver.findElement(By.name("q"));
		searchArea.sendKeys("Github");	
		searchArea.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement LoginLink= driver.findElement(By.className("l"));
		LoginLink.click();
		Thread.sleep(5000);
		WebElement gitId = driver.findElement(By.name("login"));
		WebElement gitPw = driver.findElement(By.name("password"));
		WebElement SignIn = driver.findElement(By.name("commit"));
		gitId.sendKeys("rudranarayan376@gmail.com");
		gitPw.sendKeys("Rudra@76060");
		SignIn.click();
     }
	}
