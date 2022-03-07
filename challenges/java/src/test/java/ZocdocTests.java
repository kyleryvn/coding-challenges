package challengestests;

import com.github.kyleryvn.challenges.zocdoc.Anagrams;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

@DisplayName("Zocdoc Tests")
public class ZocdocTests {

    @Test
    @DisplayName("Anagrams")
    void testAnagrams() {
        List<String> anagrams = new ArrayList<>();
        anagrams.add("code");
        anagrams.add("dcoe");
        anagrams.add("ecod");
        anagrams.add("farmer");
        anagrams.add("afmerr");

        List<String> words = new ArrayList<>();
        words.add("code");
        words.add("farmer");

        List<String> decodedAnagrams = new Anagrams().funWithAnagrams(anagrams);
        assertLinesMatch(words, decodedAnagrams);
    }
}
