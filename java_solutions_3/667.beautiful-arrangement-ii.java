/*
 * @lc app=leetcode id=667 lang=java
 *
 * [667] Beautiful Arrangement II
 */

class Solution {
    public int[] constructArray(int n, int k) {
        return java.util.stream.IntStream.concat(java.util.stream.IntStream.rangeClosed(1, n - k - 1),
            java.util.stream.IntStream.range(0, k + 1).map(i -> i % 2 == 0 ? n - k + i / 2 : n - i / 2)).toArray();
    }
}
