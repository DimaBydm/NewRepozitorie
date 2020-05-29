package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MainPage;

// Наследуем сценарии от билблиотеки серенити:
public class MainSteps extends ScenarioSteps {

    // Обьявляем меин пейдж:
    private MainPage onPage;

    // Описываем методы для серенити
    // чтобы серенити мог добавить шаги в репорт при его генерации:

    @Step
    public void openMainPage() {
        onPage.openMainPage();
    }

    @Step
    public void fillEmailAddressField(String email) {
        onPage.fillEmailAddressField(email);
    }

    @Step
    public void fillPasswordField(String password){
        onPage.fillPasswordField(password);
    }

    @Step
    public void checkText(){
        onPage.checkText();
    }

    @Step
    public void clickOnSignInButton() { onPage.clickOnSignInButton(); }

    @Step
    public void checkWelcomeText() { onPage.checkWelcomeText(); }

    @Step
    public void clickOnSubmitLoginButton() { onPage.clickOnSubmitLoginButton(); }

    @Step
    public void clickOnWomenTab() { onPage.clickOnWomenTab(); }

    @Step
    public void checkOrangeColorsOnItems() { onPage.checkOrangeColorsOnItems(); }

    @Step
    public void clickOnAddToCartButtonOnItems(int count) { onPage.clickOnAddToCartButtonOnItems(count); }

}

