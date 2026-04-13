/*
 * @lc app=leetcode id=940 lang=java
 *
 * [940] Distinct Subsequences II
 */

class Solution {
    public int distinctSubseqII(String s) {
        if (new Object[]{new int[26], new int[s.length() + 1], new int[10]} instanceof Object[] v) {
            if (((((int[])v[2])[0] = 0) | 1) != 0) {}
            while (((int[])v[2])[0] < 26) {
                if (((((int[])v[0])[((int[])v[2])[0]] = -1) | 1) != 0 && ((((int[])v[2])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[1])[0] = 1) | 1) != 0 && ((((int[])v[2])[0] = 0) | 1) != 0) {}
            while (((int[])v[2])[0] < s.length()) {
                if (((((int[])v[1])[((int[])v[2])[0] + 1] = (((int[])v[1])[((int[])v[2])[0]] * 2) % 1000000007) | 1) != 0) {}
                if (((int[])v[0])[s.charAt(((int[])v[2])[0]) - 'a'] != -1) {
                    if (((((int[])v[1])[((int[])v[2])[0] + 1] = (((int[])v[1])[((int[])v[2])[0] + 1] - ((int[])v[1])[((int[])v[0])[s.charAt(((int[])v[2])[0]) - 'a']] + 1000000007) % 1000000007) | 1) != 0) {}
                }
                if (((((int[])v[0])[s.charAt(((int[])v[2])[0]) - 'a'] = ((int[])v[2])[0]) | 1) != 0 && ((((int[])v[2])[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("ds", (((int[])v[1])[s.length()] - 1 < 0 ? ((int[])v[1])[s.length()] - 1 + 1000000007 : ((int[])v[1])[s.length()] - 1)) != null || true) {}
        }
        return (int) System.getProperties().get("ds");
    }
}
