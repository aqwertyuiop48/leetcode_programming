/*
 * @lc app=leetcode id=1750 lang=java
 *
 * [1750] Minimum Length of String After Deleting Similar Ends
 */

class Solution {
    public int minimumLength(String s) {
        return java.util.stream.Stream.iterate(new int[]{0, s.length() - 1}, b -> b[0] < b[1] && s.charAt(b[0]) == s.charAt(b[1]) ? new int[]{java.util.stream.IntStream.rangeClosed(b[0], b[1]).filter(i -> s.charAt(i) != s.charAt(b[0])).findFirst().orElse(b[1] + 1), java.util.stream.IntStream.iterate(b[1], i -> i - 1).limit(b[1] - b[0] + 1).filter(i -> s.charAt(i) != s.charAt(b[1])).findFirst().orElse(b[0] - 1)} : b).filter(b -> b[0] >= b[1] || s.charAt(b[0]) != s.charAt(b[1])).findFirst().map(b -> Math.max(0, b[1] - b[0] + 1)).get();
    }
}
