package challengestests;

import com.github.kyleryvn.challenges.others.ProfitTargets;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
}
