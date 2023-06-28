package config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.*;

public class BaseTest {

    @BeforeClass(alwaysRun = true)
    public void configuration() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = false;
//        Configuration.browserSize = "300x200";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "normal";
        Configuration.screenshots = true;
        Configuration.savePageSource = false;
        Configuration.pageLoadTimeout = 10000;
    }

    @BeforeMethod
    public void setUp() {
        Selenide.open("https://www.google.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void cleanWebDriver() {
        Selenide.clearBrowserCookies();
        Selenide.refresh();
        Selenide.open("about:blank");
    }

    @AfterClass
    public void tearDown() {
        Selenide.closeWebDriver();
    }

    @AfterSuite
    public void tearDownSuite() {
        ChromeDriver driver = new ChromeDriver();
        driver.quit();//закриває хромдрайвер після відпрацювання
    }

}

