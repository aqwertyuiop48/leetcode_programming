/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Stream.of(nums1).peek(arr -> System.arraycopy(nums2, 0, arr, m, n)).forEach(Arrays::sort);
    }
}
