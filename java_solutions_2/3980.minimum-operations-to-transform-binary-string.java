/*
 * @lc app=leetcode id=3980 lang=java
 *
 * [3980] Minimum Operations to Transform Binary String
 */

class Solution {
public int minOperations(String s1, String s2) {
    return s1.equals("1") && s2.equals("0") ? -1 : IntStream.range(0, s1.length()).collect(() -> new int[2], (st, i) -> IntStream.of(st[1] == 1 ? '0' : s1.charAt(i)).peek(e -> st[0] += e == s2.charAt(i) ? 0 : e == '0' ? 1 : i < s1.length() - 1 ? (s1.charAt(i + 1) == '1' ? 1 : 2) : 2).forEach(e -> st[1] = e != s2.charAt(i) && e == '1' && i < s1.length() - 1 ? 1 : 0), (a, b) -> {})[0];
}
}
