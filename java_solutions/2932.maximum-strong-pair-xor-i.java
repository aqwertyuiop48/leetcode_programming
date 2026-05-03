/*
 * @lc app=leetcode id=2932 lang=java
 *
 * [2932] Maximum Strong Pair XOR I
 */

class Solution {
    public int maximumStrongPairXor(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ms", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < nums.length) {
                        if (Math.abs(nums[v[0]] - nums[v[1]]) <= Math.min(nums[v[0]], nums[v[1]])) {
                            if ((nums[v[0]] ^ nums[v[1]]) > v[2]) { if (((v[2] = nums[v[0]] ^ nums[v[1]]) | 1) != 0) {} }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ms", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ms");
    }
}
