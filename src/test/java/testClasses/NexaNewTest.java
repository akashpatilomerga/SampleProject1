package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NexaNewTest {
  @Test
  public void nexa() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.nexa.com/");
	  Reporter.log("Opening nexa", true);
	  Thread.sleep(3000);
	  driver.quit();
  }
}
