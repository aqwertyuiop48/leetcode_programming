/*
 * @lc app=leetcode id=3523 lang=java
 *
 * [3523] Make Array Non-decreasing
 */

class Solution {
    public int maximumPossibleSize(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mand", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] >= v[1]) {
                        if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mand", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mand");
    }
}
