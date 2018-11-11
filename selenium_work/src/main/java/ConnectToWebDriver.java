import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.sql.DriverManager;

public class ConnectToWebDriver {

    public static WebDriver getWebDriver(String browser) {

        switch (browser.toLowerCase()) {

            case "firefox":
                System.setProperty("webdriver.gecko.driver",
                        String.valueOf(new File(DriverManager.class.getResource("/drivers/geckodriver.exe").getFile())));
                return new FirefoxDriver();

            case "chrome":
                System.setProperty("webdriver.chrome.driver",
                        String.valueOf(new File(DriverManager.class.getResource("/drivers/chromedriver.exe").getFile())));
                return new ChromeDriver();

            case "ie":
                System.setProperty("webdriver.ie.driver",
                        String.valueOf(new File(DriverManager.class.getResource("/drivers/IEDriverServer.exe").getFile())));
                return new InternetExplorerDriver();

            default:
                System.setProperty("webdriver.chrome.driver",
                        String.valueOf(new File(DriverManager.class.getResource("/drivers/chromedriver.exe").getFile())));
                return new ChromeDriver();
        }

    }
}
