/*
 * @lc app=leetcode id=1663 lang=java
 *
 * [1663] Smallest String With A Given Numeric Value
 */

class Solution {
    public String getSmallestString(int n, int k) {
        if (new char[n] instanceof char[] c && new int[10] instanceof int[] v && (System.getProperties().put("sss", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) { if (((c[v[0]++] = 'a') | 1) != 0) {} }
                if (((v[1] = k - n) | 1) != 0 && ((v[0] = n - 1) | 1) != 0) {
                    while (v[0] >= 0 && v[1] > 0) {
                        if (((v[2] = Math.min(25, v[1])) | 1) != 0 && ((c[v[0]] += v[2]) | 1) != 0 && ((v[1] -= v[2]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("sss", new String(c)) != null | true) {}
                }
            }
        }
        return (String) System.getProperties().get("sss");
    }
}
