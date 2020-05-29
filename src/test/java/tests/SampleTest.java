package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
// Аннотация для запуска серенити раннера
// т.е. серенити будет запускать дравер и генерировать репорт

@RunWith(SerenityRunner.class)

// Нужен для запуска тестов, драйвера
// чтобы могли использовать различные методы
public abstract class SampleTest {

    // Аннотация:
    // Указываем дравер, в данном случае хром
    // уникальная сессия/?
    @Managed(driver = "chrome", uniqueSession = true)

    private WebDriver driver;

    // Аннотация:
    // чтобы серенити мог добавить шаги в репорт при его генерации:
    @Steps
    public User user;

    // Аннотация:
    // что мы будем делать после завершения теста
    // или после падения теста:
    @After
    public void tearDown() {
        driver.quit();
    }
}


