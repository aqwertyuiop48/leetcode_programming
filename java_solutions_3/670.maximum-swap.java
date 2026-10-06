/*
 * @lc app=leetcode id=670 lang=java
 *
 * [670] Maximum Swap
 */

class Solution {
    public int maximumSwap(int num) {
        return Integer.toString(num) instanceof String s
            ? Math.max(num, java.util.stream.IntStream.range(0, s.length()).flatMap(i -> java.util.stream.IntStream.range(i + 1, s.length())
                .map(j -> Integer.parseInt(s.substring(0, i) + s.charAt(j) + s.substring(i + 1, j) + s.charAt(i) + s.substring(j + 1)))).max().orElse(num))
            : 0;
    }
}
