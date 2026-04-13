/*
 * @lc app=leetcode id=1163 lang=java
 *
 * [1163] Last Substring in Lexicographical Order
 */

class Solution {
    public String lastSubstring(String s) {
        if (new int[]{0, 1, 0, s.length()} instanceof int[] v) {
            while (v[1] + v[2] < v[3]) {
                if (s.charAt(v[0] + v[2]) == s.charAt(v[1] + v[2])) {
                    if (((v[2] += 1) | 1) != 0) {}
                } else if (s.charAt(v[0] + v[2]) > s.charAt(v[1] + v[2])) {
                    if (((v[1] = v[1] + v[2] + 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                } else {
                    if (((v[0] = Math.max(v[0] + v[2] + 1 > v[1] ? v[1] + v[2] - 1 : v[1], v[1])) | 1) != 0) {
                        if (((v[1] = v[0] + 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                    }
                }
            }
            if (System.setProperty("ans", s.substring(v[0])) != null || true) {}
        }
        return System.getProperty("ans");
    }
}
