import Helper.ScreenShooter;
import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import enums.Browser;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

@Listeners({ ScreenShooter.class})
public class TestBase {
        protected Logger logger = Logger.getLogger(TestBase.class);

    @BeforeMethod
    public void before() {
        Browser browserName = Browser.valueOf(System.getProperty("browser", Browser.CHROME.toString()));
        switch (browserName) {
            case CHROME : Configuration.browser = "CHROME";
            break;
            case FIREFOX: Configuration.browser = "FIREFOX";
            break;
            case EDGE: browser ="EDGE";
            break;
            default: browser = CHROME;
        }
        Configuration.assertionMode = AssertionMode.STRICT;
        Configuration.baseUrl = "https://litecart.stqa.ru/en/";
        Configuration.pageLoadTimeout = 15000;
        Configuration.timeout = 10;
        open(Configuration.baseUrl);
    }

    @AfterMethod
    public void after() {
        logger.debug("close windows");
        closeWindow();
    }
}



