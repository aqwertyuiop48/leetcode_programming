/*
 * @lc app=leetcode id=2761 lang=java
 *
 * [2761] Prime Pairs With Target Sum
 */

class Solution {
    public java.util.List<java.util.List<Integer>> findPrimePairs(int n) {
        if (System.getProperties().put("fpp", new java.util.ArrayList<java.util.List<Integer>>()) != null | true && new int[n + 5] instanceof int[] p && new int[10] instanceof int[] v) {
            if (System.getProperties().get("fpp") instanceof java.util.List res && ((v[0] = 2) | 1) != 0) {
                while (v[0] * v[0] <= n) {
                    if (p[v[0]] == 0) { if (((v[1] = v[0] * v[0]) | 1) != 0) { while (v[1] <= n) { if (((p[v[1]] = 1) | 1) != 0 && ((v[1] += v[0]) | 1) != 0) {} } } }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 2) | 1) != 0) {
                    while (v[0] <= n / 2) {
                        if (p[v[0]] == 0 && p[n - v[0]] == 0) { if (res.add(java.util.Arrays.asList(v[0], n - v[0])) | true) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (java.util.List<java.util.List<Integer>>) System.getProperties().get("fpp");
    }
}
