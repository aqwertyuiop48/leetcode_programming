/*
 * @lc app=leetcode id=3404 lang=java
 *
 * [3404] Count Special Subsequences
 */

class Solution {
    public long numberOfSubsequences(int[] nums) {
        if (new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap map && new int[15] instanceof int[] v && new long[2] instanceof long[] ans && (System.getProperties().put(Thread.currentThread().getId() + "css", 0L) != null | true)) {
            if (((v[0] = 4) | 1) != 0) {
                while (v[0] < nums.length - 2) {
                    if (((v[1] = v[0] - 2) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[2] <= v[1] - 2) {
                            if (((v[5] = nums[v[2]]) | 1) != 0 && ((v[6] = nums[v[1]]) | 1) != 0) {
                                while (v[6] > 0) { if (((v[7] = v[5] % v[6]) | 1) != 0 && ((v[5] = v[6]) | 1) != 0 && ((v[6] = v[7]) | 1) != 0) {} }
                                if (((v[8] = ((nums[v[2]] / v[5]) << 16) | (nums[v[1]] / v[5])) | 1) != 0) {
                                    if (map.put(v[8], (int)map.getOrDefault(v[8], 0) + 1) != null | true) {}
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[3] = v[0] + 2) | 1) != 0) {
                        while (v[3] < nums.length) {
                            if (((v[5] = nums[v[3]]) | 1) != 0 && ((v[6] = nums[v[0]]) | 1) != 0) {
                                while (v[6] > 0) { if (((v[7] = v[5] % v[6]) | 1) != 0 && ((v[5] = v[6]) | 1) != 0 && ((v[6] = v[7]) | 1) != 0) {} }
                                if (((v[8] = ((nums[v[3]] / v[5]) << 16) | (nums[v[0]] / v[5])) | 1) != 0 && ((ans[0] += (int)map.getOrDefault(v[8], 0)) | 1) != 0) {}
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "css", ans[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "css");
    }
}
