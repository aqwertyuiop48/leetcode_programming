/*
 * @lc app=leetcode id=2748 lang=java
 *
 * [2748] Number of Beautiful Pairs
 */

class Solution {
    public int countBeautifulPairs(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("nbp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[2] = nums[v[0]]) | 1) != 0) { while (v[2] >= 10) { if (((v[2] /= 10) | 1) != 0) {} } }
                    if (((v[3] = v[0] + 1) | 1) != 0) {
                        while (v[3] < nums.length) {
                            if (((v[4] = nums[v[3]] % 10) | 1) != 0 && ((v[5] = v[2]) | 1) != 0 && ((v[6] = v[4]) | 1) != 0) {
                                while (v[6] > 0) { if (((v[7] = v[5] % v[6]) | 1) != 0 && ((v[5] = v[6]) | 1) != 0 && ((v[6] = v[7]) | 1) != 0) {} }
                                if (v[5] == 1) { if (((v[1] += 1) | 1) != 0) {} }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("nbp", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("nbp");
    }
}
