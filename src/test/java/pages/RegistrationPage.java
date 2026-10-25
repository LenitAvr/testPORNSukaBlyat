package pages;


import com.codeborne.selenide.SelenideElement;
import pages.Components.CalendarRegistration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.value;

public class RegistrationPage {
    CalendarRegistration calendarRegistration =  new CalendarRegistration();

    private String titleText = "Practice Form";
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lasttName");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(titleText));
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value) {
        $("#userEmail").setValue(value);
        return this;

    }

    public RegistrationPage setGender(String gender) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage setNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarRegistration.setDate(day, month, year);
        return this;
    }





}
