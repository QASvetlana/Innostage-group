package cloud.autotests.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
@Feature("Проверка поиска")
public class SearchWithEmptyValues extends TestBase {
    @Test
    @AllureId("5989")
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Пустой поисковый запрос")
    void generatedTest() {
        open("https://innostage-group.ru/");
        $(byCssSelector(".show-fixed .svg")).click();
        $(byText("Найти")).click();
        $("b").shouldHave(text("Пустой поисковый запрос."));
    }


}