package pages;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class DeliveryInformationPage extends TestBase {

    private static final By bottomDeliveryInformation = By.linkText("Delivery Information");
    public static final By titleDeliveryInformation = By.cssSelector("#box-information-links>.title");
    public static String expectedTitle = "Information";


    public static void clickDeliveryInformationBottom() {
        $(bottomDeliveryInformation).click();
        logger.info("click Delivery Information Bottom");
    }
}




