package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase1 {

	public static void main(String[] args) {
		WebDriver e = new FirefoxDriver();
		e.get("http://www.seleniumhq.org/download/");
		WebElement Editbox = e.findElement(By.xpath("html/body/div[3]/div[1]/form/div/input[3]"));
		//		Editbox.
	}

}
