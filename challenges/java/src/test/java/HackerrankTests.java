package challengestests;

import com.github.kyleryvn.challenges.hackerrank.problemsolving.DiagonalDifference;
import com.github.kyleryvn.challenges.hackerrank.problemsolving.NumberLineJump;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Hackerrank Tests")
public class HackerrankTests {

    @Test
    @DisplayName("Diagonal Difference")
    void testDiagonalDifference() {
        List<List<Integer>> numbers = new ArrayList<>();

        List<Integer> listOne = new ArrayList<>();
        listOne.add(8);
        listOne.add(5);
        listOne.add(6);
        listOne.add(3);

        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(2);
        listTwo.add(1);
        listTwo.add(6);
        listTwo.add(5);

        List<Integer> listThree = new ArrayList<>();
        listThree.add(4);
        listThree.add(9);
        listThree.add(2);
        listThree.add(7);

        List<Integer> listFour = new ArrayList<>();
        listFour.add(3);
        listFour.add(4);
        listFour.add(8);
        listFour.add(1);

        numbers.add(listOne);
        numbers.add(listTwo);
        numbers.add(listThree);
        numbers.add(listFour);

        int expected = 9;
        int actual = new DiagonalDifference().difference(numbers);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Number Line Jump")
    void testNumberLineJump() {
        List<Integer> data = new ArrayList<>();
        data.add(0);
        data.add(2);
        data.add(5);
        data.add(3);

        int x1 = data.get(0);
        int v1 = data.get(1);
        int x2 = data.get(2);
        int v2 = data.get(3);

        String expected = "NO";
        String actual = new NumberLineJump().kangaroo(x1, v1, x2, v2);
        assertEquals(expected, actual);
    }
}
