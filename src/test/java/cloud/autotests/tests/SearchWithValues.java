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
public class SearchWithValues extends TestBase {
    @Test
    @AllureId("5987")
    @Description("Checking search with valid values")
    @DisplayName("Проверка поиска с валидными значениями")
    void generatedTest() {
        open("https://innostage-group.ru/");
        $(byCssSelector(".show-fixed .svg")).click();
        $(byCssSelector("#title-search-input")).setValue("безопасность");
        $(byText("Найти")).click();
        $(".item:nth-child(1) > .title b").shouldHave(text("безопасность"));
    }


}