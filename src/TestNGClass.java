import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestNGClass {

	@Test
    public  void appTest() {
       
        System.out.println("Hello Selenium");
        System.setProperty("webdriver.gecko.driver", "C:\\SaiKrishna\\GeckoDriver\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver d  = new FirefoxDriver();
        d.get("https://www.gmail.com");
       
    }

}
