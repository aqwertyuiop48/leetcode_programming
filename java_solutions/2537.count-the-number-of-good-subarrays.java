/*
 * @lc app=leetcode id=2537 lang=java
 *
 * [2537] Count the Number of Good Subarrays
 */

class Solution {
    public long countGood(int[] nums, int k) {
        if (new long[10] instanceof long[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap m && (System.getProperties().put(Thread.currentThread().getId() + "cg", 0L) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[1] < nums.length) {
                if (((v[2] += (int)m.getOrDefault(nums[(int)v[1]], 0)) | 1) != 0 && m.put(nums[(int)v[1]], (int)m.getOrDefault(nums[(int)v[1]], 0) + 1) == null | true) {
                    while (v[2] >= k) {
                        if (((v[3] += nums.length - v[1]) | 1) != 0 && m.put(nums[(int)v[0]], (int)m.get(nums[(int)v[0]]) - 1) == null | true && ((v[2] -= (int)m.get(nums[(int)v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[1] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "cg", v[3]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "cg");
    }
}
