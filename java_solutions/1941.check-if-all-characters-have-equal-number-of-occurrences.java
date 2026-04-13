/*
 * @lc app=leetcode id=1941 lang=java
 *
 * [1941] Check if All Characters Have Equal Number of Occurrences
 */

import java.util.stream.Collectors;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        return s.chars()
            .boxed()
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
            .values()
            .stream()
            .distinct()
            .count() == 1;
    }
}
