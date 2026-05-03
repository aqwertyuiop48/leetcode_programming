/*
 * @lc app=leetcode id=2815 lang=java
 *
 * [2815] Max Pair Sum in an Array
 */

class Solution {
    public int maxSum(int[] nums) {
        if (new int[10] instanceof int[] v && new int[10] instanceof int[] maxVal && (System.getProperties().put("mps", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] > 0) { if (v[1] % 10 > v[2]) { if (((v[2] = v[1] % 10) | 1) != 0) {} } if (((v[1] /= 10) | 1) != 0) {} }
                        if (maxVal[v[2]] > 0) { if (maxVal[v[2]] + nums[v[0]] > (int)System.getProperties().get("mps")) { if (System.getProperties().put("mps", maxVal[v[2]] + nums[v[0]]) != null | true) {} } }
                        if (nums[v[0]] > maxVal[v[2]]) { if (((maxVal[v[2]] = nums[v[0]]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("mps");
    }
}
