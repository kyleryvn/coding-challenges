package ibm;

import java.util.Collections;
import java.util.List;

public class Triplets {

    public long getTriplets(int constraint, List<Integer> numbers) {
        int length = numbers.size();
        long count = 0;

        Collections.sort(numbers);

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (numbers.get(i) + numbers.get(j) + numbers.get(k) <= constraint) {
                        //System.out.println(numbers.get(i) + " " + numbers.get(j) + " " + numbers.get(k));
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
