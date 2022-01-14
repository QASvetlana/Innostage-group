package cloud.autotests.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Feature("Главная страница")
public class ClickableLogo extends TestBase {

    @BeforeAll
    static void beforeAll() {

        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://innostage-group.ru/";
    }

    @Test
    @AllureId("5990")
    @Description("Clickable logo")
    @DisplayName("Кликабельный логотип")
    void generatedTest() {
        open(Configuration.baseUrl);
        $(byCssSelector(".lazyloaded")).click();
        $(".phone-block").shouldHave(text("+7 (843) 567-42-90"));
    }


}

