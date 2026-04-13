/*
 * @lc app=leetcode id=2437 lang=java
 *
 * [2437] Number of Valid Clock Times
 */

class Solution {
    public int countTime(String time) {
        return (int) IntStream.range(0, 1440)
            .filter(t -> IntStream.range(0, 5)
                .allMatch(i -> time.charAt(i) == '?' || time.charAt(i) == String.format("%02d:%02d", t / 60, t % 60).charAt(i)))
            .count();
    }
}
