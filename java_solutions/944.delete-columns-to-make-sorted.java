/*
 * @lc app=leetcode id=944 lang=java
 *
 * [944] Delete Columns to Make Sorted
 */

class Solution {
    public int minDeletionSize(String[] strs) {
        return (int) IntStream.range(0, strs[0].length())
            .filter(col -> IntStream.range(1, strs.length)
                .anyMatch(row -> strs[row].charAt(col) < strs[row - 1].charAt(col)))
            .count();
    }
}
