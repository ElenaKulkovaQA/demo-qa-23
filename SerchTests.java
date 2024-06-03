import org.junit.Test;

import java.beans.PropertyEditor;

import static jdk.internal.misc.ThreadFlock.open;

public class SerchTests {
    import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

    public class SearchTests {
        @Test
        void successfulSearchTest() {
            open("https://www.google.com/");
            $("[name=q]").setValue("selenide").pressEnter();
            $("[id=search]").shouldHave(text("https://selenide.org"));
        }

        private PropertyEditor $(String s) {
        }
    }
}
