package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class meesho {
  @Test
  public void meeshoClass() throws InterruptedException 
  {

	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.meesho.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.close();
  }
}
