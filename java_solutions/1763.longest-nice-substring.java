/*
 * @lc app=leetcode id=1763 lang=java
 *
 * [1763] Longest Nice Substring
 */

class Solution {
    public String longestNiceSubstring(String s) {
        return java.util.stream.IntStream.range(0, s.length()).boxed().flatMap(i -> java.util.stream.IntStream.rangeClosed(i + 1, s.length()).mapToObj(j -> s.substring(i, j))).filter(sub -> sub.chars().allMatch(c -> sub.indexOf(Character.toLowerCase(c)) >= 0 && sub.indexOf(Character.toUpperCase(c)) >= 0)).reduce("", (a, b) -> a.length() >= b.length() ? a : b);
    }
}
