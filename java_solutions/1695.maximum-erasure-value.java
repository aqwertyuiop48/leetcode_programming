/*
 * @lc app=leetcode id=1695 lang=java
 *
 * [1695] Maximum Erasure Value
 */

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        if (new int[100005] instanceof int[] m && new int[10] instanceof int[] v && (System.getProperties().put("mev", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((m[nums[v[0]]] += 1) | 1) != 0 && ((v[2] += nums[v[0]]) | 1) != 0) {
                        while (m[nums[v[0]]] > 1) { if (((m[nums[v[1]]] -= 1) | 1) != 0 && ((v[2] -= nums[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                        if (v[2] > v[3]) { if (((v[3] = v[2]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mev", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mev");
    }
}
