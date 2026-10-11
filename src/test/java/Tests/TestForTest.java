package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestForTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    public void Perni() throws InterruptedException {
//        out.println("Проверка");
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Practice Form"));
        $("#firstName").setValue("Penis");
        $("#lastName").setValue("Fufelschmertz");
        $("#userEmail").setValue("FufelschmertzPakastinCorp@fufel.utkanos.com");
        $("#gender-radio-2").click();
        $("#userNumber").setValue("88005553535");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $("[value=\"1998\"]").click();
        $(".react-datepicker__month-select").click();
        $("[value=\"8\"]").click();
        $(".react-datepicker__day--003").click();
        $("#subjectsInput").setValue("History").pressEnter();
        $("#hobbies-checkbox-1").click();
        $("#hobbies-checkbox-2").click();
        $("#uploadPicture").uploadFile(new File("C:\\Users\\Lenit\\Desktop\\Gubki-dlya-stanochnykh-tiskov-GT150.png"));
        $("#currentAddress").setValue("Улица Крутых чуваков, дом Пивного повелителя, 4 лестница, 666 этаж, квартира Любителей пива");
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        $("#submit").click();


    }

}
