package phase2_MVN001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(phase2_MVN001.MVN_Listeners002.class)
public class MVN001 {

	@Test
	public void testM001() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase2_MavenProject2\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Passed!");
		driver.quit();
	}
	
	@Test
	public void testM002() {
		System.out.println("Is this working?");
//		Assert.fail();
	}

	@Test (dependsOnMethods = "testM001")
	public void testM003() {
		System.out.println("Awesome");
		System.out.println("Passed!");
	}
}
