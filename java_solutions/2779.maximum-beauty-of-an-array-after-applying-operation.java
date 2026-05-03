/*
 * @lc app=leetcode id=2779 lang=java
 *
 * [2779] Maximum Beauty of an Array After Applying Operation
 */

class Solution {
    public int maximumBeauty(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mb", 0) != null | true) && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] - nums[v[1]] > 2 * k) { if (((v[1] += 1) | 1) != 0) {} }
                if (v[0] - v[1] + 1 > v[2]) { if (((v[2] = v[0] - v[1] + 1) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mb", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mb");
    }
}
