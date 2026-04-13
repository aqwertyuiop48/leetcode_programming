/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

class Solution {
    public int findKthLargest(int[] nums, int k) {
        return Arrays.stream(nums)
            .boxed()
            .sorted(Collections.reverseOrder())
            .skip(k - 1)
            .findFirst()
            .get();
    }
}
