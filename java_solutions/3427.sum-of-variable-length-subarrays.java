/*
 * @lc app=leetcode id=3427 lang=java
 *
 * [3427] Sum of Variable Length Subarrays
 */

class Solution {
    public int subarraySum(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "svs", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = Math.max(0, v[0] - nums[v[0]])) | 1) != 0 && ((v[2] = v[1]) | 1) != 0) {
                        while (v[2] <= v[0]) {
                            if (((v[3] += nums[v[2]]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "svs", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "svs");
    }
}
