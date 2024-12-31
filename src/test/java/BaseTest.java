import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    ThreadLocal<WebDriver> localDriver = new ThreadLocal<>();



    @BeforeMethod
    public void startTest(){
        WebDriver driver;
        driver = new ChromeDriver();
        localDriver.set(driver);
    }
    @AfterMethod
    public void afterTest(){
        getDriver().close();
    }

    public WebDriver getDriver(){
        return  localDriver.get();
    }
}
