/*
 * @lc app=leetcode id=4070 lang=java
 *
 * [4070] Minimum Rotations to Dial a Number I
 */

class Solution {
    public int minRotations(String s) {
        return java.util.stream.IntStream.range(0, s.length()).map(i -> java.util.stream.IntStream.of(Math.abs((i == 0 ? 0 : s.charAt(i - 1) - '0') - (s.charAt(i) - '0'))).map(d -> Math.min(d, 10 - d)).findFirst().getAsInt()).sum();
    }
}
