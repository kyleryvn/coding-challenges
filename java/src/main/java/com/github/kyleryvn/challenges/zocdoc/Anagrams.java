package com.github.kyleryvn.challenges.zocdoc;

/*
 * Given an array of strings, remove each string that is an anagram of an earlier string,
 * then return the remaining array in sorted order.
 *
 * Example:
 * str = ['code', 'doce', 'ecod', 'framer', 'frame']
 * - code and doce are anagrams. Remove doce from the array and keep the first occurrence code in the array
 * - code and ecod are anagrams. Remove ecod from the array and keep the first occurrence code in the array
 * - code and framer are not anagrams. Keep both strings in the array
 * - framer and frame are not anagrams due to the extra r in framer. Keep both strings in the array
 * - Order the remaining strings in ascending order: ['code','frame','framer']
 *
 */

import java.util.*;

public class Anagrams {

    public List<String> funWithAnagrams(List<String> text) {
        List<String> answer = new ArrayList<>();

        // No duplicates in a set
        Set<String> keys = new HashSet<>();

        for (String word : text) {
            String key = key(word); // key becomes alphabetically sorted letters of word

            if (!keys.contains(key)) {
                answer.add(word);
                keys.add(key); // Add key if not already in set
            }
        }

        Collections.sort(answer);

        return answer;
    }

    private String key(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars); // Sort characters alphabetically
        return new String(chars);
    }
}
