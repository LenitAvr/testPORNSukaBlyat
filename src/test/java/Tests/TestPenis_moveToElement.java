package Tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;

public class TestPenis_moveToElement {

    @Test
    void imRealdontKnowWathWariteHier(){
        //Drag&Drop:
        Selenide.actions().moveToElement($("div")).clickAndHold().moveByOffset(300, 200).release().perform();
    }

    private Actions action() {
        return null;
    }
}
