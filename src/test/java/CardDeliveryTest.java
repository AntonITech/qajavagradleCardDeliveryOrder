import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class CardDeliveryTest {

    @Test
    void shouldRegisterByAccountDeliveryCard() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999/");
        $x("//input[@type='text']").setValue("Санкт-Петербург");
        $x("//input[@type='tel']").setValue("25.03.2023");
        $x("//input[@name='name']").setValue("Иванов-Петров Иван");
        $x("//input[@name='phone']").setValue("+79999999999");
        $("[data-test-id=agreement]").click();
        $x("//span[contains(text(),'Забронировать')]").click();
        $x("//*[contains(@class, 'notification notification_visible')]").shouldBe(Condition.visible);

    }
}




