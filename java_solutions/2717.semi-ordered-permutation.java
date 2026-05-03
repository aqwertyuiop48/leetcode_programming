/*
 * @lc app=leetcode id=2717 lang=java
 *
 * [2717] Semi-Ordered Permutation
 */

class Solution {
    public int semiOrderedPermutation(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("sop", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] == 1) { if (((v[1] = v[0]) | 1) != 0) {} }
                    if (nums[v[0]] == nums.length) { if (((v[2] = v[0]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("sop", v[1] + (nums.length - 1 - v[2]) - (v[1] > v[2] ? 1 : 0)) != null | true) {}
            }
        }
        return (int) System.getProperties().get("sop");
    }
}
