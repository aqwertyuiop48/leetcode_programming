/*
 * @lc app=leetcode id=2447 lang=java
 *
 * [2447] Number of Subarrays With GCD Equal to K
 */

class Solution {
    public int subarrayGCD(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("sgcd", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = v[0]) | 1) != 0 && ((v[2] = nums[v[0]]) | 1) != 0) {
                        while (v[1] < nums.length) {
                            if (((v[3] = v[2]) | 1) != 0 && ((v[4] = nums[v[1]]) | 1) != 0) {
                                while (v[4] > 0) { if (((v[5] = v[3] % v[4]) | 1) != 0 && ((v[3] = v[4]) | 1) != 0 && ((v[4] = v[5]) | 1) != 0) {} }
                                if (((v[2] = v[3]) | 1) != 0) {
                                    if (v[2] == k) { if (((v[6] += 1) | 1) != 0) {} }
                                    else if (v[2] < k || v[2] % k != 0) { if (((v[1] = nums.length) | 1) != 0) {} }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("sgcd", v[6]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("sgcd");
    }
}
