package others;

/*
 * Efficient Approach: The approach can be optimized using hashing.
 * - Use two sets, one for numbers and one for pairs seen before
 * - Traverse through the array and see if (target – arr[i]) is present in set and arr[i] is not present in seen
 * - If yes, then add both arr[i] and (target – arr[i]) in seen and add one to count
 * - Time Complexity: O(N)
 * - Auxiliary Space: O(N)
 *
 */

import java.util.*;

public class ProfitTargets {

    public int stockPairs(int target, List<Integer> stocksProfit) {
        int count = 0;

        // Store frequency of each distinct element in the array
        Map<Integer, Integer> map = new HashMap<>();

        // When dealing with number lists/arrays, it's a good practice to sort the list/array before accessing values
        Collections.sort(stocksProfit);

        for (Integer current : stocksProfit) {

            // Update frequency of stocksProfit.get(i)
            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
        }

        // Traverse the map
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            int i = it.getKey(); // Stores key value of map

            // If i is half of target
            if (2 * i == target) {

                // If frequency of i greater than 1
                if (map.get(i) > 1) {
                    count += 2;
                }
            } else {
                if (map.containsKey(target - i)) {
                    count++;
                }
            }
        }

        // Update count
        count /= 2;

        //System.out.println(map.entrySet());
        return count;
    }
}
