/*
 * @lc app=leetcode id=718 lang=java
 *
 * [718] Maximum Length of Repeated Subarray
 */

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        return new int[nums1.length + 1][nums2.length + 1] instanceof int[][] d
            ? java.util.stream.IntStream.rangeClosed(1, nums1.length).map(i -> java.util.stream.IntStream.rangeClosed(1, nums2.length)
                .map(j -> d[i][j] = nums1[i - 1] == nums2[j - 1] ? d[i - 1][j - 1] + 1 : 0).max().orElse(0)).max().orElse(0)
            : 0;
    }
}
