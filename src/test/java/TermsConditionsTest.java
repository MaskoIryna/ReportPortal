import com.epam.reportportal.testng.ReportPortalTestNGListener;
import io.qameta.allure.Epic;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.TermsConditionsPage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

@Listeners({ReportPortalTestNGListener.class})
public class TermsConditionsTest extends TestBase {

    @Epic(value ="VERIFICATION_TITLE")
    @Test
    public void findTermsConditionsTest() {

        TermsConditionsPage.clickTermsConditionsBottom();
        $(TermsConditionsPage.pageContain).shouldHave(text(TermsConditionsPage.expectedPageContain));
        logger.info((String.format("element TermsConditions title is %s", TermsConditionsPage.expectedPageContain)));



    }


}
