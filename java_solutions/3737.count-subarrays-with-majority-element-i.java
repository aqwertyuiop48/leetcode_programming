/*
 * @lc app=leetcode id=3737 lang=java
 *
 * [3737] Count Subarrays With Majority Element I
 */

class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "csm", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[2] = v[0]) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[2] < nums.length) {
                        if (nums[v[2]] == target) { if (((v[3] += 1) | 1) != 0) {} }
                        if (v[3] > (v[2] - v[0] + 1) / 2) { if (((v[1] += 1) | 1) != 0) {} }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "csm", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "csm");
    }
}
