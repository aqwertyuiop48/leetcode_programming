/*
 * @lc app=leetcode id=2588 lang=java
 *
 * [2588] Count the Number of Beautiful Subarrays
 */

class Solution {
    public long beautifulSubarrays(int[] nums) {
        if (new long[10] instanceof long[] v && new java.util.HashMap<Long, Long>() instanceof java.util.HashMap m && m.put(0L, 1L) == null | true && (System.getProperties().put(Thread.currentThread().getId() + "bs", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[1] ^= nums[(int)v[0]]) | 1) != 0 && ((v[2] += (long)m.getOrDefault(v[1], 0L)) | 1) != 0 && m.put(v[1], (long)m.getOrDefault(v[1], 0L) + 1L) == null | true && ((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "bs", v[2]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "bs");
    }
}
