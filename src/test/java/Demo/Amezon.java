package Demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amezon {
@Test
public void AmezonTest() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	System.out.println("Amazon");
	Thread.sleep(2000);
	driver.close();
}
}
