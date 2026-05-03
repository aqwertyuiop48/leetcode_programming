/*
 * @lc app=leetcode id=2420 lang=java
 *
 * [2420] Find All Good Indices
 */

class Solution {
    public java.util.List<Integer> goodIndices(int[] nums, int k) {
        if (new int[nums.length] instanceof int[] dec && new int[nums.length] instanceof int[] inc && new int[10] instanceof int[] v && (System.getProperties().put("agi", new java.util.ArrayList<Integer>()) != null | true)) {
            if (((v[0] = 0) | 1) != 0) { while (v[0] < nums.length) { if (((dec[v[0]] = 1) | 1) != 0 && ((inc[v[0]++] = 1) | 1) != 0) {} } }
            if (((v[0] = 1) | 1) != 0) { while (v[0] < nums.length) { if (nums[v[0] - 1] >= nums[v[0]]) { if (((dec[v[0]] = dec[v[0] - 1] + 1) | 1) != 0) {} } if (((v[0] += 1) | 1) != 0) {} } }
            if (((v[0] = nums.length - 2) | 1) != 0) { while (v[0] >= 0) { if (nums[v[0] + 1] >= nums[v[0]]) { if (((inc[v[0]] = inc[v[0] + 1] + 1) | 1) != 0) {} } if (((v[0] -= 1) | 1) != 0) {} } }
            if (System.getProperties().get("agi") instanceof java.util.List res && ((v[0] = k) | 1) != 0) {
                while (v[0] < nums.length - k) {
                    if (dec[v[0] - 1] >= k && inc[v[0] + 1] >= k) { if (res.add(v[0]) | true) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("agi");
    }
}
