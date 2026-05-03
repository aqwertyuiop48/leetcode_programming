/*
 * @lc app=leetcode id=3804 lang=java
 *
 * [3804] Number of Centered Subarrays
 */

class Solution {
    public int centeredSubarrays(int[] nums) {
        if (new int[10] instanceof int[] v && new int[200005] instanceof int[] has && (System.getProperties().put(Thread.currentThread().getId() + "ncs", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[2] = 0) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {
                    while (v[3] < nums.length) {
                        if (((v[2] += nums[v[3]]) | 1) != 0 && ((has[nums[v[3]] + 100000] = v[4]) | 1) != 0) {
                            if (v[2] >= -100000 && v[2] <= 100000 && has[v[2] + 100000] == v[4]) {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ncs", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ncs");
    }
}
