/*
 * @lc app=leetcode id=1316 lang=java
 *
 * [1316] Distinct Echo Substrings
 */

class Solution {
    public int distinctEchoSubstrings(String text) {
        if (new int[]{0, 1, 0, 0, 0} instanceof int[] v && new Object[]{new HashSet<String>()} instanceof Object[] obj) {
            while (v[0] < 2) {
                if (v[0] == 0) {
                    if (v[1] <= text.length() / 2) {
                        if (((v[4] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = v[1]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    } else {
                        if (System.setProperty("ans", String.valueOf(((HashSet<String>)obj[0]).size())) != null || true) {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[3] < text.length()) {
                        if (text.charAt(v[2]) == text.charAt(v[3])) {
                            if (((v[4] += 1) | 1) != 0) {}
                        } else {
                            if (((v[4] = 0) | 1) != 0) {}
                        }
                        if (v[4] == v[1]) {
                            if ((((HashSet<String>)obj[0]).add(text.substring(v[2] - v[1] + 1, v[3] + 1)) || true) && ((v[4] -= 1) | 1) != 0) {}
                        }
                        if (((v[2] += 1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] += 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                    }
                }
            }
        }
        return Integer.parseInt(System.getProperty("ans", "0"));
    }
}
