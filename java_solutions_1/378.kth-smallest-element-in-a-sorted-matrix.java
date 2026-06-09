/*
 * @lc app=leetcode id=378 lang=java
 *
 * [378] Kth Smallest Element in a Sorted Matrix
 */

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        return java.util.Arrays.stream(matrix).flatMapToInt(java.util.Arrays::stream).sorted().skip(k - 1).findFirst().getAsInt();
    }
}
