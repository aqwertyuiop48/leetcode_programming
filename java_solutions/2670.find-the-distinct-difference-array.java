/*
 * @lc app=leetcode id=2670 lang=java
 *
 * [2670] Find the Distinct Difference Array
 */

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        if (new int[nums.length] instanceof int[] ans && new int[55] instanceof int[] f1 && new int[55] instanceof int[] f2 && new int[10] instanceof int[] v && (System.getProperties().put("dda", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (f2[nums[v[0]]] == 0) { if (((f2[nums[v[0]]] = 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                    if (((f2[nums[v[0]]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (f1[nums[v[0]]] == 0) { if (((f1[nums[v[0]]] = 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                        if (((f2[nums[v[0]]] -= 1) | 1) != 0 && f2[nums[v[0]]] == 1) { if (((v[2] -= 1) | 1) != 0) {} }
                        if (((ans[v[0]] = v[1] - v[2]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("dda");
    }
}
