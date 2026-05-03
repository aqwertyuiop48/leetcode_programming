/*
 * @lc app=leetcode id=2696 lang=java
 *
 * [2696] Minimum String Length After Removing Substrings
 */

class Solution {
    public int minLength(String s) {
        if (new char[s.length()] instanceof char[] st && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msl", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (((st[v[1]++] = s.charAt(v[0])) | 1) != 0) {}
                if (v[1] >= 2 && ((st[v[1]-2] == 'A' && st[v[1]-1] == 'B') || (st[v[1]-2] == 'C' && st[v[1]-1] == 'D'))) { if (((v[1] -= 2) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "msl", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "msl");
    }
}
