package challengestests;

import com.github.kyleryvn.challenges.ibm.Triplets;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("IBM Tests")
public class IBMTests {

    @Test
    @DisplayName("Triplets")
    void testTriplets() {
        List<Integer> numbers = new ArrayList<>();
        int constraint = 8;
        int count = 4;

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        long check = new Triplets().getTriplets(constraint, numbers);
        assertEquals(check, count);
    }

}
