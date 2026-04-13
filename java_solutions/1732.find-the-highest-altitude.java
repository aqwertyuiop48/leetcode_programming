/*
 * @lc app=leetcode id=1732 lang=java
 *
 * [1732] Find the Highest Altitude
 */

class Solution {
    public int largestAltitude(int[] gain) {
        return IntStream.range(0, gain.length + 1)
            .map(i -> Arrays.stream(gain).limit(i).sum())
            .max()
            .orElse(0);
    }
}
