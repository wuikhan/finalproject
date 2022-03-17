package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public void openbrowser(String browser, String url) {
		String os_name = System.getProperty("os.name");
		if(os_name.equalsIgnoreCase("Windows 10")) {
			if(browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/windows/chromedriver.exe");
			}
		} else if (os_name.equalsIgnoreCase("Mac OS X")) {
			if(browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/mac/chromedriver");
			}
		} else if (os_name.equalsIgnoreCase("Linux")) {
			if(browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/linux/chromedriver");
			}
		} else {
			System.out.println("Different Operating System.");
		}
		
		 driver = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get(url);
		 driver.manage().window().maximize();	
	}

}
