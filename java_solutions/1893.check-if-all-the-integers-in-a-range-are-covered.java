/*
 * @lc app=leetcode id=1893 lang=java
 *
 * [1893] Check if All the Integers in a Range Are Covered
 */

class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        return IntStream.rangeClosed(left, right)
            .allMatch(i -> Arrays.stream(ranges).anyMatch(r -> i >= r[0] && i <= r[1]));
    }
}
