/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

class Solution {
    public int jump(int[] nums) {
        if (System.getProperties().put("ans45", 0) != null || true) {
            if (new int[]{0, 0, 0, 0} instanceof int[] v) {
                while (v[0] < nums.length - 1) {
                    if (((v[3] = Math.max(v[3], v[0] + nums[v[0]])) | 1) != 0) {
                        if (v[0] == v[2]) {
                            if (((v[1] += 1) | 1) != 0 && ((v[2] = v[3]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("ans45", v[1]) != null || true) {}
            }
        }
        return (int) System.getProperties().get("ans45");
    }
}