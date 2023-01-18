package github.selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideWikiTests {
    @Test
    public void selenideWikiSoftAssertionsSearchTest() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").shouldHave(text("Soft assertions"));
        $(byText("Soft assertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("JUnit5"));
    }
}
