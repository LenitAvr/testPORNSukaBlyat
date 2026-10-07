package Tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;


public class TestJunit5 {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() throws InterruptedException {
        Selenide.open("https://github.com/selenide/selenide/wiki");
        Selenide.$("#wiki-pages-filter").setValue("SoftAssertions");
        Selenide.$(byText("SoftAssertions")).click();
        Selenide.$$(".heading-element").findBy(text("JUnit5")).shouldBe(visible);


    }


}
