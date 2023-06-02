
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test()
	public void launchBrowser() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
	}
	

}
