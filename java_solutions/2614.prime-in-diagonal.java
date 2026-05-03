/*
 * @lc app=leetcode id=2614 lang=java
 *
 * [2614] Prime In Diagonal
 */

class Solution {
    public int diagonalPrime(int[][] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("dp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < 2) {
                            if (((v[2] = v[1] == 0 ? nums[v[0]][v[0]] : nums[v[0]][nums.length - 1 - v[0]]) | 1) != 0 && v[2] > (int)System.getProperties().get("dp")) {
                                if (v[2] > 1 && ((v[3] = 2) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
                                    while (v[3] * v[3] <= v[2]) {
                                        if (v[2] % v[3] == 0) { if (((v[4] = 0) | 1) != 0 && ((v[3] = v[2]) | 1) != 0) {} }
                                        if (((v[3] += 1) | 1) != 0) {}
                                    }
                                    if (v[4] == 1) { if (System.getProperties().put("dp", v[2]) != null | true) {} }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("dp");
    }
}
