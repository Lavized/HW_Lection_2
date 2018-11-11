import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CaseOne {


    public static void main(String[] args)  {

        String url = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
        String userName = "webinar.test@gmail.com";
        String userPass = "Xcg7299bnSmMuRLp9ITw";


        WebDriver driver = ConnectToWebDriver.getWebDriver("Chrome");
        driver.get(url);

        WebElement login = driver.findElement(By.name("email"));
        login.sendKeys(userName);

        WebElement pass = driver.findElement(By.name("passwd"));
        pass.sendKeys(userPass);
        pass.submit();




        WebElement userIcon = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"employee_infos\"]/a")));
        userIcon.click();


        WebElement logOut = driver.findElement(By.id("header_logout"));
        logOut.click();

        driver.quit();


    }
}
