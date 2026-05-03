/*
 * @lc app=leetcode id=647 lang=java
 *
 * [647] Palindromic Substrings
 */

record Solution() {
    public int countSubstrings(String s) {
        return java.util.stream.IntStream.range(0, 2 * s.length() - 1).map(i -> (int) java.util.stream.Stream.iterate(new int[]{i / 2, (i + 1) / 2}, b -> b[0] >= 0 && b[1] < s.length() && s.charAt(b[0]) == s.charAt(b[1]), b -> new int[]{b[0] - 1, b[1] + 1}).count()).sum();
    }
}
