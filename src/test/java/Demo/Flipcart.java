package Demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipcart {
@Test
public void FlipcartTest() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	System.out.println("Flipcart");
	Thread.sleep(2000);
	driver.close();
	
}

}
