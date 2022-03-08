import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import others.ProfitTargets;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import others.WikipediaArticle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Others Tests")
public class OthersTests {

    @Test
    @DisplayName("Profit Targets")
    void testProfitTargets() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(46);
        list.add(1);
        list.add(3);
        list.add(9);

        int target = 47;
        int expected = 1;
        int actual = new ProfitTargets().stockPairs(target, list);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Wikipedia Article")
    void testWikipediaArticle() {
        String topic = "pizza";
        int expected = 311;
        int actual = new WikipediaArticle().getTopicCount(topic);

        assertEquals(expected, actual);
    }
}
