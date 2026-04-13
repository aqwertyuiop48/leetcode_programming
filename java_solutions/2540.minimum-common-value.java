/*
 * @lc app=leetcode id=2540 lang=java
 *
 * [2540] Minimum Common Value
 */

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        return Arrays.stream(nums1)
            .filter(n -> Arrays.binarySearch(nums2, n) >= 0)
            .findFirst()
            .orElse(-1);
    }
}
