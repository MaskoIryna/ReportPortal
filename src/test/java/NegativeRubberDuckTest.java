import com.epam.reportportal.testng.ReportPortalTestNGListener;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.RubberDucksPage;

import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Condition.ownText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Listeners({ReportPortalTestNGListener.class})
public class NegativeRubberDuckTest extends TestBase{

    @Epic(value ="VERIFICATION_TITLE")
    @Test
    public void clickRubberDucksNegativeTest() {
        $(RubberDucksPage.bottomRubberDucks).click();
        $("title").shouldHave(ownText(RubberDucksPage.expectedTitleRD));
        logger.info("INFO clickRubberDucksTest");
        logger.info(String.format("expected Title is %s,actual %s" ,$("title").getOwnText(),
                RubberDucksPage.expectedTitleRD));
        Assert.fail("negative");
    }

    @Epic(value ="VERIFICATION_TITLE")
    @Test
    public void findElementSubcategoryNegativeTest() {
        RubberDucksPage.findElementSubcategoryClick();
        $(RubberDucksPage.titleElementSubcategory).shouldHave(text(RubberDucksPage.expectedSubcategory));
        logger.info("INFO findElementSubcategoryTest");
        logger.info(String.format("expect %s actual %s",$(RubberDucksPage.titleElementSubcategory).getText(),
                RubberDucksPage.expectedSubcategory));
        Assert.fail("negative");
    }


    @Test
    @Description(value = "SORT")
    public void clickNameAndSortNegativeTest() {
        RubberDucksPage.clickRubberDucksBottom();
        List<String> elements = $$(RubberDucksPage.locatorElementRD_Name).texts();
        Collections.sort(elements);
        $(RubberDucksPage.elementRD_NameClick).click();
        logger.info("INFO clickNameAndSortTest");
        logger.info(String.format("EXPECTED %s ACTUAL %s",elements,$$(RubberDucksPage.locatorElementRD_Name).texts()));
        Assert.assertFalse($$(RubberDucksPage.locatorElementRD_Name).texts().equals(elements));
    }


    @Test
    @Description(value = "SORT")
    public void clickPriceAndSortRubberDucksPageNegativeTest() {
        Assert.assertFalse(RubberDucksPage.clickPriceAndSortRubberDucksPage(),"Price not sort");

    }

    @Feature(value = "STICKER")
    @Test
    public void greenDuckIsNewElementNegativeTest() {
        String expectedString = RubberDucksPage.getAccessibility(RubberDucksPage.locatorGreenDuck);
        boolean result = expectedString.toLowerCase().contains("Green Duck".toLowerCase()) &&
                expectedString.toLowerCase().contains("NEW".toLowerCase());
        Assert.assertFalse(result,"Accessibility not contain new & Green Duck");
        logger.info("INFO greenDuckIsNewElementTest");
        logger.info(String.format("%s",expectedString));
    }

    @Feature(value = "STICKER")
    @Test
    public void findElementSaleRubberDucksNegativeTest() {
        String expectedString = RubberDucksPage.getAccessibility(RubberDucksPage.locatorYellowDuck);
        boolean result = expectedString.toLowerCase().contains("Yellow Duck".toLowerCase()) &&
                expectedString.toLowerCase().contains("SALE".toLowerCase());
        Assert.assertFalse(result,"Accessibility not contain sale & Yellow Duck");
        logger.info("INFO findElementSaleRubberDucksTest");
        logger.info(String.format("%s",expectedString));
    }
}
