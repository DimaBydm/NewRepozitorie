package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends PageObject {

    // Драйвер:
    protected BasePage(WebDriver driver) {
        super(driver);
        //Инициализация элементов:
        PageFactory.initElements(driver, this);
    }
}


