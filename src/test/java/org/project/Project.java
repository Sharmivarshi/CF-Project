package org.project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.utilities.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project extends BaseClass {

	public static void main(String[] args) throws IOException {
		
//		loadUrl("htt://www.coastfashion.com/");
//		loadUrl("https://www.facebook.com");
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com");

//		WebElement act = driver.findElement(By.xpath("(//button[contains(text(),'Accept all')])[1]"));
//		clickBtn(act);
		winMax(); 
				
	
//	WebElement user = driver.findElement(By.className("user-account"));
//		moveToElement(user);
//		WebElement login = driver.findElement(By.xpath("//a[text()='Log In']"));
//		moveToElement(login);
//		jsClick(login);
//		WebElement c = dri..ver.findElement(By.xpath("(//input[@type='email'])[1]"));
//		fill(c, getData(2, 0));
		

		PojoClass l =new PojoClass();
		fill(l.getUser(), getData(2, 1));
		fill(l.getPass(), getData(2, 3));
		clickBtn(l.getLogin());
	}


	
}
