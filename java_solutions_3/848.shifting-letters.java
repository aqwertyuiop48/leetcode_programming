/*
 * @lc app=leetcode id=848 lang=java
 *
 * [848] Shifting Letters
 */

class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        return new char[s.length()] instanceof char[] r && new int[1] instanceof int[] a
            && java.util.stream.IntStream.iterate(s.length() - 1, i -> i >= 0, i -> i - 1).peek(i -> r[i] = (char) ('a' + (s.charAt(i) - 'a' + (a[0] = (a[0] + shifts[i]) % 26)) % 26)).allMatch(x -> true)
            ? new String(r) : "";
    }
}
