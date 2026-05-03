/*
 * @lc app=leetcode id=2602 lang=java
 *
 * [2602] Minimum Operations to Make All Array Elements Equal
 */

class Solution {
    public java.util.List<Long> minOperations(int[] nums, int[] queries) {
        if (new java.util.ArrayList<Long>() instanceof java.util.ArrayList ans && new long[nums.length + 1] instanceof long[] p && new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo", ans) != null | true) && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (((p[(int)v[0] + 1] = p[(int)v[0]] + nums[(int)v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < queries.length) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = nums.length - 1) | 1) != 0 && ((v[3] = nums.length) | 1) != 0) {
                        while (v[1] <= v[2]) {
                            if (((v[4] = v[1] + (v[2] - v[1]) / 2) | 1) != 0) {
                                if (nums[(int)v[4]] >= queries[(int)v[0]]) { if (((v[3] = v[4]) | 1) != 0 && ((v[2] = v[4] - 1) | 1) != 0) {} }
                                else { if (((v[1] = v[4] + 1) | 1) != 0) {} }
                            }
                        }
                        if (((v[5] = (long)queries[(int)v[0]] * v[3] - p[(int)v[3]] + (p[nums.length] - p[(int)v[3]]) - (long)queries[(int)v[0]] * (nums.length - v[3])) | 1) != 0 && ans.add(v[5]) | true && ((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (java.util.List<Long>) System.getProperties().get(Thread.currentThread().getId() + "mo");
    }
}
