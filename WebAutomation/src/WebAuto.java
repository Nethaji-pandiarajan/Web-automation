
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAuto {

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// browser type and chromedrover.exe path as parameters
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver\\chromedriver.exe");
		String url = "https://release-patch.chainsys.com/appconnect/core/login/launch";
		driver.get(url);

		WebElement mail = driver.findElement(By.id("userName"));
		mail.sendKeys("baktha");
		WebElement mail1 = driver.findElement(By.id("password"));
		mail1.sendKeys("Welcome#1");
		WebElement mail2 = driver.findElement(By.className("cs-login-btn"));
		mail2.click();

		driver.close();
	}
}
