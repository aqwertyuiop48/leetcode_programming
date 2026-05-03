/*
 * @lc app=leetcode id=3759 lang=java
 *
 * [3759] Count Elements With at Least K Greater Values
 */

class Solution {
    public int countElements(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ce", 0) != null | true) && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = nums.length - 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] >= 0) {
                if (v[0] < nums.length - 1 && nums[v[0]] < nums[v[0] + 1]) { if (((v[1] = nums.length - 1 - v[0]) | 1) != 0) {} }
                if (v[1] >= k) { if (((v[2] += 1) | 1) != 0) {} }
                if (((v[0] -= 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ce", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ce");
    }
}
