/*
 * @lc app=leetcode id=312 lang=java
 *
 * [312] Burst Balloons
 */

class Solution {
    public int maxCoins(int[] nums) {
        if (System.getProperties().put("ans312", 0) != null || true) {
            if (new int[]{0, nums.length + 2, 0, 0, 0} instanceof int[] v && new Object[]{new int[nums.length + 2], new int[nums.length + 2][nums.length + 2]} instanceof Object[] obj) {
                if ((((int[])obj[0])[0] = 1) != -1 && ((((int[])obj[0])[v[1] - 1] = 1) != -1) && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if ((((int[])obj[0])[v[0] + 1] = nums[v[0]]) != -1 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[2] = 2) | 1) != 0) {
                    while (v[2] < v[1]) {
                        if (((v[3] = 0) | 1) != 0) {
                            while (v[3] < v[1] - v[2]) {
                                if (((v[4] = v[3] + v[2]) | 1) != 0 && ((v[0] = v[3] + 1) | 1) != 0) {
                                    while (v[0] < v[4]) {
                                        if ((((int[][])obj[1])[v[3]][v[4]] = Math.max(((int[][])obj[1])[v[3]][v[4]], ((int[][])obj[1])[v[3]][v[0]] + ((int[][])obj[1])[v[0]][v[4]] + ((int[])obj[0])[v[3]] * ((int[])obj[0])[v[0]] * ((int[])obj[0])[v[4]])) != -1) {
                                            if (((v[0] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("ans312", ((int[][])obj[1])[0][v[1] - 1]) != null || true) {}
            }
        }
        return (int) System.getProperties().get("ans312");
    }
}
