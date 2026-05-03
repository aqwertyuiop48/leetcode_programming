/*
 * @lc app=leetcode id=2305 lang=java
 *
 * [2305] Fair Distribution of Cookies
 */

class Solution {
    public int distributeCookies(int[] cookies, int k) {
        if (new int[15] instanceof int[] v && new int[k] instanceof int[] sums && (System.getProperties().put("fdc", 999999999) != null | true)) {
            if (((v[0] = (int)Math.pow(k, cookies.length)) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < v[0]) {
                    if (((v[2] = 0) | 1) != 0) { while (v[2] < k) { if (((sums[v[2]++] = 0) | 1) != 0) {} } }
                    if (((v[3] = v[1]) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[4] < cookies.length) {
                            if (((sums[v[3] % k] += cookies[v[4]]) | 1) != 0 && ((v[3] /= k) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[5] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[2] < k) { if (sums[v[2]] > v[5]) { if (((v[5] = sums[v[2]]) | 1) != 0) {} } if (((v[2] += 1) | 1) != 0) {} }
                    }
                    if (v[5] < (int)System.getProperties().get("fdc")) { if (System.getProperties().put("fdc", v[5]) != null | true) {} }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("fdc");
    }
}
