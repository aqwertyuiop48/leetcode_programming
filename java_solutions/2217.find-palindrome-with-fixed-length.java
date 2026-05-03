/*
 * @lc app=leetcode id=2217 lang=java
 *
 * [2217] Find Palindrome With Fixed Length
 */

class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        if (new long[queries.length] instanceof long[] ans && new int[15] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("kpf", ans) != null | true)) {
            if (((v[0] = (intLength + 1) / 2) | 1) != 0 && ((lv[0] = (long)Math.pow(10, v[0] - 1)) | 1) != 0 && ((lv[1] = (long)Math.pow(10, v[0]) - 1) | 1) != 0 && ((lv[2] = lv[1] - lv[0] + 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < queries.length) {
                    if (queries[v[1]] > lv[2]) { if (((ans[v[1]] = -1) | 1) != 0) {} }
                    else {
                        if (((lv[3] = lv[0] + queries[v[1]] - 1) | 1) != 0 && new Object[]{new StringBuilder(String.valueOf(lv[3]))} instanceof Object[] o && o[0] instanceof StringBuilder sb) {
                            if (((lv[4] = Long.parseLong(sb.toString() + sb.reverse().substring(intLength % 2 == 0 ? 0 : 1))) | 1) != 0) {
                                if (((ans[v[1]] = lv[4]) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
        }
        return (long[]) System.getProperties().get("kpf");
    }
}
