package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Cls1 {
	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.navigate().to("https://www.google.com");
		
		
		
		
		d1.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("ravi");
		
		
		
		
		
		TakesScreenshot t= ((TakesScreenshot)d1);
		File s=t.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\Ravi\\eclipse-workspace\\FirstDemo\\ScreenShot\\a.png");
		Files.copy(s,d);
	}

}
