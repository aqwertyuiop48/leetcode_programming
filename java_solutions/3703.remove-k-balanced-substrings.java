/*
 * @lc app=leetcode id=3703 lang=java
 *
 * [3703] Remove K-Balanced Substrings
 */

class Solution {
    public String removeSubstring(String s, int k) {
        if (new int[s.length()][2] instanceof int[][] st && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rs", "") != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (v[1] == 0 || st[v[1] - 1][0] != s.charAt(v[0])) {
                    if (((st[v[1]][0] = s.charAt(v[0])) | 1) != 0 && ((st[v[1]][1] = 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                } else {
                    if (((st[v[1] - 1][1] += 1) | 1) != 0) {}
                }
                if (v[1] >= 2 && st[v[1] - 1][0] == ')' && st[v[1] - 2][0] == '(' && st[v[1] - 1][1] >= k && st[v[1] - 2][1] >= k) {
                    if (((st[v[1] - 1][1] -= k) | 1) != 0 && ((st[v[1] - 2][1] -= k) | 1) != 0) {}
                    if (st[v[1] - 1][1] == 0) { if (((v[1] -= 1) | 1) != 0) {} }
                    if (st[v[1] - 1][1] == 0) { if (((v[1] -= 1) | 1) != 0) {} }
                    if (v[1] >= 2 && st[v[1] - 1][0] == st[v[1] - 2][0]) {
                        if (((st[v[1] - 2][1] += st[v[1] - 1][1]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (new StringBuilder() instanceof StringBuilder sb && ((v[0] = 0) | 1) != 0) {
                while (v[0] < v[1]) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < st[v[0]][1]) { if (sb.append((char)st[v[0]][0]) != null | true && ((v[2] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "rs", sb.toString()) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "rs");
    }
}
