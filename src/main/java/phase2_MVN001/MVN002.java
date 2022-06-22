package phase2_MVN001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(phase2_MVN001.MVN_Listeners002.class)
public class MVN002 {
	
	@Test
	public void testM011() {
		System.out.println("Awesome");
		System.out.println("This will fail!");
//		Assert.fail();
	}

	@Test
	public void testM022() {
		System.out.println("Awesome");
		System.out.println("Passed!");
	}
}
