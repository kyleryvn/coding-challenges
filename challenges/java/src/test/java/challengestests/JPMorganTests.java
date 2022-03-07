package challengestests;

import com.github.kyleryvn.challenges.jpmorgan.JumbledNumbers;
import com.github.kyleryvn.challenges.jpmorgan.SelfDescribingNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("JP Morgan Tests")
public class JPMorganTests {

    @Test
    @DisplayName("Jumbled Numbers")
    void jumbledNumbers() {
        String number = "owoftnuoer";
        String result = new JumbledNumbers().findDigits(number);
        assertEquals("124", result);
    }

    @Test
    @DisplayName("Self Describing Number")
    void selfDescribingNumber() {
        int number = 2020;
        boolean result = new SelfDescribingNumber().isSelfDescribing(number);
        assertTrue(result);
    }
}
