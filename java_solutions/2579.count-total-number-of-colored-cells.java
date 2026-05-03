/*
 * @lc app=leetcode id=2579 lang=java
 *
 * [2579] Count Total Number of Colored Cells
 */

class Solution {
    public long coloredCells(int n) {
        if (System.getProperties().put("ctn", 1L + 2L * n * (n - 1)) != null | true) {}
        return (long) System.getProperties().get("ctn");
    }
}
