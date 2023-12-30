package Step_Definition;

import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook {
    protected static HomePage homePage;
    static WebDriver driver;

    @Before
    public static void user_open_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("http://hiring.petroapp.com/test2.html");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

    }

    @After
    public static void user_close_the_driver() throws InterruptedException {
        Thread.sleep(2000);
         driver.quit();

    }
}
