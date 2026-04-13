/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

class Solution {
    public int findDuplicate(int[] nums) {
        if (System.getProperties().put("ans287", 0) != null || true) {
            if (new int[]{nums[0], nums[nums[0]]} instanceof int[] v) {
                while (v[0] != v[1]) {
                    if (((v[0] = nums[v[0]]) | 1) != 0 && ((v[1] = nums[nums[v[1]]]) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] != v[1]) {
                        if (((v[0] = nums[v[0]]) | 1) != 0 && ((v[1] = nums[v[1]]) | 1) != 0) {}
                    }
                    if (System.getProperties().put("ans287", v[0]) != null || true) {}
                }
            }
        }
        return (int) System.getProperties().get("ans287");
    }
}