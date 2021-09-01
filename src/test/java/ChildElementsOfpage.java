import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildElementsOfpage {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\jaide\\eclipse-workspace\\Selenium1\\src\\test\\resources\\Drivers\\chromedriver.exe");
			WebDriver dr=new ChromeDriver();
			dr.get("https://www.jobserve.com/us/en/Job-Search/");
			List<WebElement>links=dr.findElements(By.tagName("a"));
			System.out.println(links.size());
	}

}
