/*
 * @lc app=leetcode id=1191 lang=java
 *
 * [1191] K-Concatenation Maximum Sum
 */

class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("kcm", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[0] < arr.length * (Math.min(k, 2))) {
                    if (((v[1] = Math.max(v[1] + arr[(int)(v[0] % arr.length)], arr[(int)(v[0] % arr.length)])) | 1) != 0 && ((v[2] = Math.max(v[2], v[1])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) { while (v[0] < arr.length) { if (((v[4] += arr[(int)v[0]++]) | 1) != 0) {} } }
                if (System.getProperties().put("kcm", (int)((v[2] + (k > 2 && v[4] > 0 ? (k - 2) * v[4] : 0)) % 1000000007)) != null | true) {}
            }
        }
        return (int) System.getProperties().get("kcm");
    }
}
