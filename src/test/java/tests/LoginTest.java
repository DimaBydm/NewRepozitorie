package tests;

import Helper.PropertiesHelper;
import org.junit.Test;

// Описываем тест, который будем выполнять:
public class LoginTest extends SampleTest {

    // Аннотация:
    // для выполнения теста:
    @Test
    public void loginTest() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.fillEmailAddressField(PropertiesHelper.INSTANCE.getProperties("email"));
        user.mainPage.fillPasswordField(PropertiesHelper.INSTANCE.getProperties("password"));
        user.mainPage.clickOnSubmitLoginButton();
        user.mainPage.checkWelcomeText();
    }
}


