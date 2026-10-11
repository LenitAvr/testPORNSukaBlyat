package Tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class AQA_Task01_Open_wiki {

    @Test
    void openWikiInSelenidInGithub() throws InterruptedException {
        Selenide.open("https://github.com/search");
        Selenide.$("[data-component=\"input\"]").setValue("selenide").pressEnter();
        Selenide.$(".search-match").click();
        Selenide.$("[data-content=\"Wiki\"]").click();


    }


}
