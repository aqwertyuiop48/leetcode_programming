/*
 * @lc app=leetcode id=2409 lang=java
 *
 * [2409] Count Days Spent Together
 */

class Solution {
    public int countDaysTogether(String aa, String la, String ab, String lb) {
        return Optional.of(Stream.of(aa, la, ab, lb)
            .mapToInt(s -> IntStream.of(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
                .limit(Integer.parseInt(s.substring(0, 2)) - 1).sum() + Integer.parseInt(s.substring(3)))
            .toArray())
            .map(d -> Math.max(0, Math.min(d[1], d[3]) - Math.max(d[0], d[2]) + 1))
            .get();
    }
}
