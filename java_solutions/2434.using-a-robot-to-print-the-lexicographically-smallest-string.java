/*
 * @lc app=leetcode id=2434 lang=java
 *
 * [2434] Using a Robot to Print the Lexicographically Smallest String
 */

class Solution {
    public String robotWithString(String s) {
        if (new char[s.length()] instanceof char[] min && new int[s.length() + 5] instanceof int[] t && new Object[]{new StringBuilder()} instanceof Object[] o && o[0] instanceof StringBuilder ans && (System.getProperties().put("rws", "") != null | true)) {
            if (((min[s.length() - 1] = s.charAt(s.length() - 1)) | 1) != 0 && ((t[0] = 0) | 1) != 0 && ((t[1] = 0) | 1) != 0 && ((t[2] = 0) | 1) != 0) {
                if (((t[0] = s.length() - 2) | 1) != 0) {
                    while (t[0] >= 0) {
                        if (((min[t[0]] = (char)Math.min(min[t[0] + 1], s.charAt(t[0]))) | 1) != 0 && ((t[0] -= 1) | 1) != 0) {}
                    }
                }
                if (((t[0] = 0) | 1) != 0) {
                    while (t[0] < s.length()) {
                        if (((t[t[1]++ + 3] = s.charAt(t[0])) | 1) != 0) {}
                        while (t[1] > 0 && (t[0] == s.length() - 1 || t[t[1] - 1 + 3] <= min[t[0] + 1])) {
                            if (ans.append((char)t[--t[1] + 3]) != null | true) {}
                        }
                        if (((t[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("rws", ans.toString()) != null | true) {}
            }
        }
        return (String) System.getProperties().get("rws");
    }
}
