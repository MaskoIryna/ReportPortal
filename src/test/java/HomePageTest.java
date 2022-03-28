import com.epam.reportportal.testng.ReportPortalTestNGListener;
import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;


@Listeners({ReportPortalTestNGListener.class})
public class HomePageTest extends TestBase{

    @Epic(value ="VERIFICATION_TITLE")
    @Test
    public void getTitleHomePageTest() {
        Assert.assertEquals(title(),"Online Store | My Store1");
        logger.info(String.format("%s",title()));
    }
}
