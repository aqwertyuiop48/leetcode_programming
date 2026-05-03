/*
 * @lc app=leetcode id=1806 lang=java
 *
 * [1806] Minimum Number of Operations to Reinitialize a Permutation
 */

class Solution {
    public int reinitializePermutation(int n) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mno", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] != 1 || v[1] == 0) {
                    if (v[0] % 2 == 0) { if (((v[0] = v[0] / 2) | 1) != 0) {} }
                    else { if (((v[0] = n / 2 + (v[0] - 1) / 2) | 1) != 0) {} }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mno", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mno");
    }
}
