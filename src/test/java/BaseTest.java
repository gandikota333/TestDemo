import com.amazon.qa.HomePage;
import com.amazon.qa.LoginPage;
import com.amazon.qa.SearchResultsPage;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    private static ChromeDriver driver;
    static HomePage homePageObj;
    static LoginPage loginPageObj;
    static  SearchResultsPage searchResultsPageObj;


    @BeforeClass
    public static void openBrowser() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver-win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //obj initialise
        homePageObj = PageFactory.initElements(driver, HomePage.class);
        loginPageObj = PageFactory.initElements(driver, LoginPage.class);
        searchResultsPageObj = PageFactory.initElements(driver, SearchResultsPage.class);
        driver.get("https://www.amazon.in/");
        Assert.assertTrue(homePageObj.isLogoDisplayed());
    }


    @AfterClass
    public static void teardown() throws Exception {
        driver.quit();
    }
}