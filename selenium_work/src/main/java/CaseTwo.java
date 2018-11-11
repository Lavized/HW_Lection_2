import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseTwo {
    public static void main(String[] args) {

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






        WebElement dashboard = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab-AdminDashboard\"]/a/span")));
        System.out.println("Section of site: " + dashboard.getText() + "  Is visible: " +  dashboard.isDisplayed());
        dashboard.click();
        driver.navigate().refresh();



        WebElement orders = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subtab-AdminParentOrders\"]")));
        System.out.println("Section of site: " + orders.getText() + "  Is visible: " +  orders.isDisplayed());
        orders.click();
        driver.navigate().refresh();





        WebElement catalog = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subtab-AdminCatalog\"]")));
        System.out.println("Section of site: " + catalog.getText() + "  Is visible: " +  catalog.isDisplayed());
        //System.out.println(webElementTwo.getText());
        catalog.click();
        driver.navigate().refresh();



        WebElement customers = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nav/ul/li[5]")));
        System.out.println("Section of site: " + customers.getText() + "  Is visible: " +  customers.isDisplayed());
        customers.click();
        driver.navigate().refresh();



        WebElement support = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subtab-AdminParentCustomerThreads\"]")));
        System.out.println("Section of site: " + support.getText() + "  Is visible: " +  support.isDisplayed());
        //System.out.println(webElementTwo.getText());
        support.click();
        driver.navigate().refresh();


        WebElement statistic = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subtab-AdminStats\"]")));
        System.out.println("Section of site: " + statistic.getText() + "  Is visible: " +  statistic.isDisplayed());
        statistic.click();
        driver.navigate().refresh();






        WebElement modules  = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subtab-AdminParentModulesSf\"]")));
        System.out.println("Section of site: " + modules.getText() + "  Is visible: " +  modules.isDisplayed());
        modules.click();
        driver.navigate().refresh();



        WebElement design  = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nav/ul/li[10]")));
        System.out.println("Section of site: " + design.getText() + "  Is visible: " +  design.isDisplayed());
        design.click();
        driver.navigate().refresh();



        WebElement  delivery = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subtab-AdminParentShipping\"]")));
        System.out.println("Section of site: " + delivery.getText() + "  Is visible: " +  delivery.isDisplayed());
        delivery.click();
        driver.navigate().refresh();


        WebElement paymentMethod  = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subtab-AdminParentPayment\"]")));
        System.out.println("Section of site: " + paymentMethod.getText() + "  Is visible: " +  paymentMethod.isDisplayed());
        paymentMethod.click();
        driver.navigate().refresh();


        WebElement  international  = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subtab-AdminInternational\"]")));
        System.out.println("Section of site: " + international.getText() + "  Is visible: " +  international.isDisplayed());
        international.click();
        driver.navigate().refresh();


        WebElement  shopParameters  = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subtab-ShopParameters\"]")));
        System.out.println("Section of site: " + shopParameters.getText() + "  Is visible: " +  shopParameters.isDisplayed());
        shopParameters.click();
        driver.navigate().refresh();


        WebElement config  = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"subtab-AdminAdvancedParameters\"]")));
        System.out.println("Section of site: " + config.getText() + "  Is visible: " +  config.isDisplayed());
        config.click();
        driver.navigate().refresh();


        driver.quit();



    }
}
