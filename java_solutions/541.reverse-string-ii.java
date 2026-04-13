/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */

class Solution {
    public String reverseStr(String s, int k) {
        return IntStream.range(0, (s.length() + 2 * k - 1) / (2 * k))
            .mapToObj(i -> new StringBuilder(s.substring(i * 2 * k, Math.min(i * 2 * k + k, s.length()))).reverse().toString() + s.substring(Math.min(i * 2 * k + k, s.length()), Math.min(i * 2 * k + 2 * k, s.length())))
            .collect(Collectors.joining());
    }
}
