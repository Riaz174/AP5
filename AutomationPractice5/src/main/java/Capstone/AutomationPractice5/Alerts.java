package Capstone.AutomationPractice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice5\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement alerts = driver.findElement(By.name("alert"));
		alerts.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement confirm = driver.findElement(By.name("confirmation"));
		confirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement promp = driver.findElement(By.name("prompt"));
		promp.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Alert is displayed");
		driver.switchTo().alert().accept();
		

	}

}
