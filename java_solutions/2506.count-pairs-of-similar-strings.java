/*
 * @lc app=leetcode id=2506 lang=java
 *
 * [2506] Count Pairs Of Similar Strings
 */

class Solution {
    public int similarPairs(String[] words) {
        return Arrays.stream(words)
            .map(s -> s.chars().distinct().reduce(0, (mask, c) -> mask | (1 << (c - 'a'))))
            .collect(Collectors.groupingBy(m -> m, Collectors.counting()))
            .values().stream()
            .mapToInt(count -> (int) (count * (count - 1) / 2))
            .sum();
    }
}
