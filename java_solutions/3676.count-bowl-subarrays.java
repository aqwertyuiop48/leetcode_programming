/*
 * @lc app=leetcode id=3676 lang=java
 *
 * [3676] Count Bowl Subarrays
 */

class Solution {
    public int bowlSubarrays(int[] nums) {
        if (new int[nums.length] instanceof int[] pref && new int[nums.length] instanceof int[] suff && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cbs", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] > v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} }
                if (((pref[v[0]] = v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = nums.length - 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] >= 0) {
                    if (nums[v[0]] > v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} }
                    if (((suff[v[0]] = v[1]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.length - 1) {
                    if (nums[v[0]] < pref[v[0] - 1] && nums[v[0]] < suff[v[0] + 1]) { if (((v[2] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cbs", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cbs");
    }
}
