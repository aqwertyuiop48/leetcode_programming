/*
 * @lc app=leetcode id=3101 lang=java
 *
 * [3101] Count Alternating Subarrays
 */

class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        if (new long[5] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "cas", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (v[0] > 0 && nums[(int)v[0]] == nums[(int)v[0] - 1]) {
                        if (((v[1] = v[0]) | 1) != 0) {}
                    }
                    if (((v[2] += v[0] - v[1] + 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cas", v[2]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "cas");
    }
}
