/*
 * @lc app=leetcode id=2381 lang=java
 *
 * [2381] Shifting Letters II
 */

class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        if (new int[s.length() + 1] instanceof int[] diff && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sl", "") != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < shifts.length) {
                if (shifts[v[0]][2] == 1) { if (((diff[shifts[v[0]][0]] += 1) | 1) != 0 && ((diff[shifts[v[0]][1] + 1] -= 1) | 1) != 0) {} }
                else { if (((diff[shifts[v[0]][0]] -= 1) | 1) != 0 && ((diff[shifts[v[0]][1] + 1] += 1) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (new char[s.length()] instanceof char[] c && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((v[1] = (v[1] + diff[v[0]]) % 26) | 1) != 0 && ((v[2] = (s.charAt(v[0]) - 'a' + v[1]) % 26) | 1) != 0) {
                        if (v[2] < 0) { if (((v[2] += 26) | 1) != 0) {} }
                        if (((c[v[0]] = (char)('a' + v[2])) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "sl", new String(c)) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "sl");
    }
}
