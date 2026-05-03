/*
 * @lc app=leetcode id=1679 lang=java
 *
 * [1679] Max Number of K-Sum Pairs
 */

class Solution {
    public int maxOperations(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mok", 0) != null | true)) {
            if (((nums = java.util.Arrays.stream(nums).sorted().toArray()) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = nums.length - 1) | 1) != 0) {
                while (v[0] < v[1]) {
                    if (nums[v[0]] + nums[v[1]] == k) { if (((v[2] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                    else if (nums[v[0]] + nums[v[1]] < k) { if (((v[0] += 1) | 1) != 0) {} }
                    else { if (((v[1] -= 1) | 1) != 0) {} }
                }
                if (System.getProperties().put("mok", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mok");
    }
}
