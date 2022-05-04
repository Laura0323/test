import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PruebaTest2 {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.edge.driver","src/test/resources/EdgeDriver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    void ShouldSelectTheJsAlertButton() {

        WebElement JsAlertButton = driver.findElement(By.tagName("button"));

        JsAlertButton.click();

    }

    @AfterEach
    void tearDown() {
        //driver.quit();
    }
}
