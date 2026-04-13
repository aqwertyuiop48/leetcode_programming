/*
 * @lc app=leetcode id=1220 lang=java
 *
 * [1220] Count Vowels Permutation
 */

class Solution {
    public int countVowelPermutation(int n) {
        if (new long[]{1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0} instanceof long[] v) {
            while (v[0] < n) {
                if (((v[6] = v[2]) | 1) != 0 && ((v[7] = (v[1] + v[3]) % 1000000007) | 1) != 0 && ((v[8] = (v[1] + v[2] + v[4] + v[5]) % 1000000007) | 1) != 0 && ((v[9] = (v[3] + v[5]) % 1000000007) | 1) != 0 && ((v[10] = v[1]) | 1) != 0) {
                    if (((v[1] = v[6]) | 1) != 0 && ((v[2] = v[7]) | 1) != 0 && ((v[3] = v[8]) | 1) != 0 && ((v[4] = v[9]) | 1) != 0 && ((v[5] = v[10]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (System.setProperty("ans", String.valueOf((int)((v[1] + v[2] + v[3] + v[4] + v[5]) % 1000000007))) != null || true) {}
        }
        return Integer.parseInt(System.getProperty("ans", "0"));
    }
}
