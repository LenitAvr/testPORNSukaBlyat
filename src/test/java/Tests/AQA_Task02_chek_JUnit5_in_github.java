package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class AQA_Task02_chek_JUnit5_in_github {

    @BeforeAll
    public static void beforeAllchekJUnitinGithub() {
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    void chekJUnitinGithub() throws InterruptedException {
        open("/selenide/selenide/wiki");
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("SoftAssertions")).click();
        $$(".heading-element").findBy(text("JUnit5")).shouldBe(visible);


    }


}
