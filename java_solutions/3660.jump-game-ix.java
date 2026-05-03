/*
 * @lc app=leetcode id=3660 lang=java
 *
 * [3660] Jump Game IX
 */

class Solution {
    public int[] maxValue(int[] nums) {
        if (new int[nums.length] instanceof int[] ans && new int[nums.length] instanceof int[] preMax && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "jg", ans) != null | true)) {
            if (((preMax[0] = nums[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < nums.length) { if (((preMax[v[0]] = Math.max(preMax[v[0] - 1], nums[v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[0] = nums.length - 1) | 1) != 0 && ((v[1] = 2000000000) | 1) != 0) {
                while (v[0] >= 0) {
                    if (preMax[v[0]] > v[1]) { if (((ans[v[0]] = ans[v[0] + 1]) | 1) != 0) {} }
                    else { if (((ans[v[0]] = preMax[v[0]]) | 1) != 0) {} }
                    if (nums[v[0]] < v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "jg");
    }
}
