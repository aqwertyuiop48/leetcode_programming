/*
 * @lc app=leetcode id=2002 lang=java
 *
 * [2002] Maximum Product of the Length of Two Palindromic Subsequences
 */

class Solution {
    public int maxProduct(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mp", 0) != null | true) && ((v[0] = s.length()) | 1) != 0 && new int[1 << v[0]] instanceof int[] pal && ((v[1] = 1) | 1) != 0) {
            while (v[1] < (1 << v[0])) {
                if (((v[2] = 0) | 1) != 0 && ((v[3] = v[0] - 1) | 1) != 0 && ((v[4] = 1) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                    while (v[2] <= v[3] && v[4] == 1) {
                        while (v[2] <= v[3] && (v[1] & (1 << v[2])) == 0) { if (((v[2] += 1) | 1) != 0) {} }
                        while (v[2] <= v[3] && (v[1] & (1 << v[3])) == 0) { if (((v[3] -= 1) | 1) != 0) {} }
                        if (v[2] <= v[3]) {
                            if (s.charAt(v[2]) != s.charAt(v[3])) { if (((v[4] = 0) | 1) != 0) {} }
                            else { if (((v[2] += 1) | 1) != 0 && ((v[3] -= 1) | 1) != 0) {} }
                        }
                    }
                    if (v[4] == 1) { if (((pal[v[1]] = Integer.bitCount(v[1])) | 1) != 0) {} }
                }
                if (((v[1] += 1) | 1) != 0) {}
            }
            if (((v[1] = 1) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                while (v[1] < (1 << v[0])) {
                    if (pal[v[1]] > 0) {
                        if (((v[2] = v[1] + 1) | 1) != 0) {
                            while (v[2] < (1 << v[0])) {
                                if (pal[v[2]] > 0 && (v[1] & v[2]) == 0) {
                                    if (pal[v[1]] * pal[v[2]] > v[6]) { if (((v[6] = pal[v[1]] * pal[v[2]]) | 1) != 0) {} }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mp", v[6]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mp");
    }
}
