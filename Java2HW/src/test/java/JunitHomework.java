import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import domain.MenuItem;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class JunitHomework {

    @BeforeAll
    public static void open() {
        Selenide.open("https://www.sela.ru");
    }


    @DisplayName("Демонстрация первого теста")
    @ValueSource(strings = {
            "Юбка",
            "Шорты"})
    @ParameterizedTest(name = "Проверка поиска одежды по названию {0}")
    void clothesSearchTest(String clothes) {
        //   Шаги:
        $("#header_user_menu_search_link").click();
        $("#form-search-input").setValue(clothes);
        $(".js-submit").click();

        //  Ожидаемый результат:
        $$(".search__wrapper")
                .find(text(clothes))
                .shouldBe(visible);
    }

    @DisplayName("Демонстрация второго теста")
    @CsvSource(value = {
            "Юбка| Плиссированная юбка для девочек",
            "Шорты| шорты домашние женские"
    },
            delimiter = '|')


    @ParameterizedTest(name = "Проверка поиска одежды из {0} и из {1} ")
    void fullClothesSearchTest(String typeOfClothes, String sortOfClothes) {
        //   Шаги:
        $("#header_user_menu_search_link").click();
        $("#form-search-input").setValue(typeOfClothes);
        $(".js-submit").click();
        //  Ожидаемый результат:
        $$(".search__wrapper").find(text(sortOfClothes))
                .shouldBe(visible);
    }

    @EnumSource(MenuItem.class)
    @ParameterizedTest()
    void selaSearchMenuTest(MenuItem testData) {

        //   Шаги:
        $(byXpath("html/body/header/div/div/div[1]/nav/ul[1]/li[8]/a")).click();
        $(byXpath("html/body/header/div/div/div[1]/nav/ul[3]/li[3]/a")).click();

        //  Ожидаемый результат:
        $$(".header__aside-menu")

                .find(text(testData.rusName))
                .click();
        Assertions.assertEquals(
                1,
                WebDriverRunner.getWebDriver().getWindowHandles().size()
        );
    }
    static Stream<Arguments> methodSourceExampleTest() {
        return Stream.of(
                Arguments.of("девочки", List.of("для девочки")),
                Arguments.of("мальчики", List.of("для мальчика"))
        );
    }


    @MethodSource("methodSourceExampleTest")
    @ParameterizedTest
    void methodsourceExampleTest(String девочки, List<String> first){
//      Шаги:
                $("#header_user_menu_search_link").click();
        $("#form-search-input").setValue(девочки);
        $(".js-submit").click();
        //  Ожидаемый результат:
        $$(".search__wrapper").find(text(девочки));
    }

    @AfterAll
    static void close() {
        Selenide.closeWebDriver();
    }
}





