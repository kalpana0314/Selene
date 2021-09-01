import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasics2 {

	

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jaide\\eclipse-workspace\\Selenium1\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.jobserve.com/us/en/Job-Search/");
		dr.findElement(By.id("txtKey")).sendKeys("Selenium");
		dr.findElement(By.name("ctl00$main$srch$ctl_qs$txtLoc")).sendKeys("Boston");
		WebElement posted=dr.findElement(By.xpath("//*[@id=\"selAge\"]"));
		Select s=new Select(posted);
		s.selectByVisibleText("Within 5 days");
		WebElement jobtype=dr.findElement(By.cssSelector("#selJType"));
		 s=new Select(jobtype);
		s.selectByVisibleText("Full Time");
		dr.findElement(By.linkText("Sign In/Register")).click();
		Thread.sleep(3000);
		dr.findElement(By.className("searchbutton")).click();
		
		
		
	}

}
