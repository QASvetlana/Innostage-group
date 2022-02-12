package cloud.autotests.tests;

import com.codeborne.selenide.Configuration;
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
public class SearchTests extends TestBase {


    @Test
    @AllureId("5989")
    @Description("works only for web version, does not work for mobile version of  site")
    @DisplayName("Empty search query")
    void searchTest() {
        open("");
        $(".show-fixed .svg").click();
        $(byText("Найти")).click();
        $("b").shouldHave(text("Пустой поисковый запрос."));
    }

    @Test
    @AllureId("5987")
    @Description("works only for web version, does not work for mobile version of  site")
    @DisplayName("Checking the search with valid values")
    void searchWithValuesTest() {
        open("");
        $(".show-fixed .svg").click();
        $("#title-search-input").setValue("безопасность");
        $(byText("Найти")).click();
        // $(".item:nth-child(1) > .title b").shouldHave(text("безопасность"));
        $(".search-page.items").shouldHave(text("безопасность"));
    }

}