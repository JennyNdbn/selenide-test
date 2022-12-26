package lesson_2;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubHoverTest {
    @Test
    void successfulHoverTest() {
        //На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
        open("https://github.com");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        // Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best.")
        $("div .application-main").shouldHave(text("Build like the best"));
    }
}
