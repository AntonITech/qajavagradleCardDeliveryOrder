import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class CardDeliveryTest {

    @Test
    void shouldRegisterByAccountDeliveryCard() {
        open("http://localhost:9999/");
    }
}




