package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {


    @Test
    @AllureId("6120")
    @Description("Page title should have header text")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://innostage-group.ru//'", () ->
                open("https://innostage-group.ru//"));

        step("Page title should have text 'Innostage - системная интеграция, консалтинг и аутсорсинг IT услуг'", () -> {
            String expectedTitle = "Innostage - системная интеграция, консалтинг и аутсорсинг IT услуг";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @AllureId("6119")
    @Description("Page console log")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://innostage-group.ru/'", () ->
                open("https://innostage-group.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}