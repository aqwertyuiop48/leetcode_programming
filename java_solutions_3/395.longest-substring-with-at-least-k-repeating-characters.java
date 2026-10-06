/*
 * @lc app=leetcode id=395 lang=java
 *
 * [395] Longest Substring with At Least K Repeating Characters
 */

class Solution {
    public int longestSubstring(String s, int k) {
        return s.length() < k ? 0
            : s.chars().boxed().collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() < k).findFirst()
                .map(e -> java.util.Arrays.stream(s.split(String.valueOf((char) (int) e.getKey()))).mapToInt(t -> longestSubstring(t, k)).max().orElse(0))
                .orElse(s.length());
    }
}
