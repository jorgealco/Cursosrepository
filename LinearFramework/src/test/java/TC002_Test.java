import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC002_Test {
  @Test
  public void f() {
		Reporter.log("Open Browser Amazon Prime web page");
		System.setProperty("chromedriver.exe", "/Users/regio/git/repository/LinearFramework/src/test/resources/drivers/chrome");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.com.mx");
		driver.manage().window().maximize();
  }

}
