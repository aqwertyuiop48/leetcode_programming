/*
 * @lc app=leetcode id=2375 lang=java
 *
 * [2375] Construct Smallest Number From DI String
 */

class Solution {
    public String smallestNumber(String pattern) {
        if (new int[15] instanceof int[] s && new int[10] instanceof int[] v && new StringBuilder() instanceof StringBuilder sb && (System.getProperties().put(Thread.currentThread().getId() + "sn", "") != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] <= pattern.length()) {
                if (((s[v[1]++] = v[0] + 1) | 1) != 0) {}
                if (v[0] == pattern.length() || pattern.charAt(v[0]) == 'I') {
                    while (v[1] > 0) { if (sb.append(s[--v[1]]) != null | true) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "sn", sb.toString()) != null | true) {}
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "sn");
    }
}
