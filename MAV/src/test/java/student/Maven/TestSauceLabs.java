package student.Maven;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSauceLabs {
	public static final String USERNAME="lochiajay";
	public static final String ACCESS_KEY="574552e0-4b18-4ba6-95e4-a9ef962c71a9";//copy this key from saucelabs account
	public static final String URL="https://"+USERNAME+":"+ACCESS_KEY+"@ondemand.saucelabs.com:443/wd/hub";
	public static void main(String[] args) throws Exception {
		new DesiredCapabilities();
		DesiredCapabilities caps=DesiredCapabilities.firefox();
		caps.setCapability("platform","Windows 10");
		caps.setCapability("Version","52.0");
		WebDriver driver=new RemoteWebDriver(new java.net.URL(URL),caps);
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("Automation");
		ele.sendKeys(Keys.ENTER);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.close();
		

	}

}
