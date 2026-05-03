/*
 * @lc app=leetcode id=3795 lang=java
 *
 * [3795] Minimum Subarray Length With Distinct Sum At Least K
 */

class Solution {
    public int minLength(int[] nums, int k) {
        if (new int[100005] instanceof int[] freq && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msl", 999999999) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[1] < nums.length) {
                    if (freq[nums[v[1]]] == 0) { if (((v[2] += nums[v[1]]) | 1) != 0) {} }
                    if (((freq[nums[v[1]]] += 1) | 1) != 0) {
                        while (v[2] >= k && v[0] <= v[1]) {
                            if (v[1] - v[0] + 1 < v[3] || v[3] == 0) { if (((v[3] = v[1] - v[0] + 1) | 1) != 0) {} }
                            if (((freq[nums[v[0]]] -= 1) | 1) != 0 && freq[nums[v[0]]] == 0) { if (((v[2] -= nums[v[0]]) | 1) != 0) {} }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "msl", v[3] == 0 ? -1 : v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "msl");
    }
}
