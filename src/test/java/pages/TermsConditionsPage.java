package pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TermsConditionsPage extends TestBase{
    private static final By bottomTermsConditions = By.xpath("//*[@id='site-menu']/ul/li[5]/a");
    public static final By pageContain = By.cssSelector("#main > div.middle > div.content > h1 > font > font > u");
    public static String expectedPageContain = "Условия";

    public static void clickTermsConditionsBottom() {
        $(bottomTermsConditions).click();
        logger.info("click TermsConditions Bottom");

    }
}
