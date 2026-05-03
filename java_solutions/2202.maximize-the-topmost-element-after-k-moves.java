/*
 * @lc app=leetcode id=2202 lang=java
 *
 * [2202] Maximize the Topmost Element After K Moves
 */

class Solution {
    public int maximumTop(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mt", -1) != null | true)) {
            if (nums.length == 1 && k % 2 == 1 && System.getProperties().put("mt", -1) != null | true) {}
            else if (k == 0 && System.getProperties().put("mt", nums[0]) != null | true) {}
            else if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0 && ((v[2] = Math.min(nums.length, k - 1)) | 1) != 0) {
                while (v[0] < v[2]) {
                    if (nums[v[0]] > v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (k < nums.length && nums[k] > v[1]) { if (((v[1] = nums[k]) | 1) != 0) {} }
                if (System.getProperties().put("mt", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mt");
    }
}
