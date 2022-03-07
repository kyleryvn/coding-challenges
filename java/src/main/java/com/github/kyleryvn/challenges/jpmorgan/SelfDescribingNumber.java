package com.github.kyleryvn.challenges.jpmorgan;

/*
 * For example, 2020 is a four-digit self describing number:
 * position [0] has value 2 and there are two 0s in the number;
 * position [1] has value 0 and there are no 1s in the number;
 * position [2] has value 2 and there are two 2s;
 * position [3] has value 0 and there are zero 3s.
 *
*/

public class SelfDescribingNumber {

    public boolean isSelfDescribing(int number) {
        String s = Integer.toString(number);

        for (int i = 0; i < s.length(); i++) {
            String s0 = s.charAt(i) + "";
            int b = Integer.parseInt(s0); // number of times i-th digit must occur for it to be a self describing number
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                int temp = Integer.parseInt(s.charAt(j) + "");

                if (temp == i)
                    count++;

                if (count > b)
                    return false;
            }

            if (count != b)
                return false;
        }

        return true;
    }
}
