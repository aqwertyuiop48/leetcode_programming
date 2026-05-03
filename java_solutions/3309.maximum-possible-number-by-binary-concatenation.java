/*
 * @lc app=leetcode id=3309 lang=java
 *
 * [3309] Maximum Possible Number by Binary Concatenation
 */

class Solution {
    public int maxGoodNumber(int[] nums) {
        if (new int[10] instanceof int[] v && new Object[]{new int[][]{{0,1,2},{0,2,1},{1,0,2},{1,2,0},{2,0,1},{2,1,0}}} instanceof Object[] o && o[0] instanceof int[][] p && (System.getProperties().put(Thread.currentThread().getId() + "mgn", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[0] < 6) {
                    if (((v[1] = nums[p[v[0]][0]]) | 1) != 0 && ((v[2] = nums[p[v[0]][1]]) | 1) != 0 && ((v[3] = nums[p[v[0]][2]]) | 1) != 0) {
                        if (new Object[]{Integer.toBinaryString(v[1]) + Integer.toBinaryString(v[2]) + Integer.toBinaryString(v[3])} instanceof Object[] so && so[0] instanceof String s) {
                            if (((v[5] = Integer.parseInt(s, 2)) | 1) != 0) {
                                if (v[5] > v[4]) { if (((v[4] = v[5]) | 1) != 0) {} }
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mgn", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mgn");
    }
}
