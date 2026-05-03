/*
 * @lc app=leetcode id=3043 lang=java
 *
 * [3043] Find the Length of the Longest Common Prefix
 */

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        if (new int[5000000] instanceof int[] t && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lcp", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < arr1.length) {
                    if (new Object[]{String.valueOf(arr1[v[1]])} instanceof Object[] o && o[0] instanceof String s && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[3] < s.length()) {
                            if (t[v[2] * 10 + s.charAt(v[3]) - '0'] == 0) {
                                if (((t[v[2] * 10 + s.charAt(v[3]) - '0'] = v[0]++) | 1) != 0) {}
                            }
                            if (((v[2] = t[v[2] * 10 + s.charAt(v[3]) - '0']) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < arr2.length) {
                        if (new Object[]{String.valueOf(arr2[v[1]])} instanceof Object[] o && o[0] instanceof String s && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                            while (v[3] < s.length() && t[v[2] * 10 + s.charAt(v[3]) - '0'] != 0) {
                                if (((v[2] = t[v[2] * 10 + s.charAt(v[3]) - '0']) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                            }
                            if (v[3] > v[4]) { if (((v[4] = v[3]) | 1) != 0) {} }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "lcp", v[4]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lcp");
    }
}
