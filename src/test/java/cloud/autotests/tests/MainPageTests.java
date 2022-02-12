package cloud.autotests.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@Feature("Главная страница")
public class MainPageTests extends TestBase {


    @Test
    @AllureId("5990")
    @Description("works only for web version, does not work for mobile version of  site")
    @DisplayName("logo should be clickable")
    void clikableLogo() {
        open("");
        // $("#bx_3218110189_6 .col-md-6 .btn:nth-child(1)").click();
        $(".btn btn-default").click();
        $(".lazyloaded").click();

    }

    @Test
    @AllureId("6120")
    @Description("works only for web version, does not work for mobile version of  site")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url", () ->
                open(""));

        step("Page title should have text 'Innostage - системная интеграция, консалтинг и аутсорсинг IT услуг'", () -> {
            String expectedTitle = "Innostage - системная интеграция, консалтинг и аутсорсинг IT услуг";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}

