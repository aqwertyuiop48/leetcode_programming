/*
 * @lc app=leetcode id=2784 lang=java
 *
 * [2784] Check if Array is Good
 */

class Solution {
    public boolean isGood(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ig", true) != null | true) && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = nums.length - 1) | 1) != 0) {
            if (nums.length < 2 || nums[nums.length - 1] != v[0] || nums[nums.length - 2] != v[0]) {
                if (System.getProperties().put(Thread.currentThread().getId() + "ig", false) != null | true) {}
            } else {
                if (((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                    while (v[1] < nums.length - 1 && v[2] == 1) {
                        if (nums[v[1]] != v[1] + 1) { if (System.getProperties().put(Thread.currentThread().getId() + "ig", false) != null | true && ((v[2] = 0) | 1) != 0) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "ig");
    }
}
