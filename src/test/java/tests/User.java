package tests;

import net.thucydides.core.annotations.Steps;
import steps.MainSteps;

// Описываем пейджы, для удобства
public class User {

    // Аннотация:
    // чтобы серенити мог добавить шаги в репорт при его генерации:
    @Steps
    public MainSteps mainPage;
}

