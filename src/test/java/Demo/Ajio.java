package Demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {
@Test
public void AjioTest() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	Thread.sleep(2000);
	System.out.println("Ajio");
	driver.close();
	
}
}
