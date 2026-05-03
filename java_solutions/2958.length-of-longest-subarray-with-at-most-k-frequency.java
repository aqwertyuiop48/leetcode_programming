/*
 * @lc app=leetcode id=2958 lang=java
 *
 * [2958] Length of Longest Subarray With at Most K Frequency
 */

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        if (new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap m && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msl", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[1] < nums.length) {
                if (m.put(nums[v[1]], (int)m.getOrDefault(nums[v[1]], 0) + 1) == null | true) {
                    while ((int)m.get(nums[v[1]]) > k) {
                        if (m.put(nums[v[0]], (int)m.get(nums[v[0]]) - 1) == null | true && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (v[1] - v[0] + 1 > v[2]) { if (((v[2] = v[1] - v[0] + 1) | 1) != 0) {} }
                if (((v[1] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "msl", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "msl");
    }
}
