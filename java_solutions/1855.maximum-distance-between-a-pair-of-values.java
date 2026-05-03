/*
 * @lc app=leetcode id=1855 lang=java
 *
 * [1855] Maximum Distance Between a Pair of Values
 */

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        return java.util.stream.Stream.iterate(new int[]{0, 0, 0}, s -> s[0] < nums1.length && s[1] < nums2.length ? (nums1[s[0]] <= nums2[s[1]] ? new int[]{s[0], s[1] + 1, Math.max(s[2], s[1] - s[0])} : new int[]{s[0] + 1, s[1], s[2]}) : s).filter(s -> s[0] >= nums1.length || s[1] >= nums2.length).findFirst().get()[2];
    }
}
