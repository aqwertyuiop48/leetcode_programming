/*
 * @lc app=leetcode id=3456 lang=java
 *
 * [3456] Find Special Substring of Length K
 */

class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "hss", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= s.length() - k && !(boolean)System.getProperties().get(Thread.currentThread().getId() + "hss")) {
                    if (((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[2] < k) {
                            if (s.charAt(v[0] + v[2]) != s.charAt(v[0])) { if (((v[1] = 0) | 1) != 0) {} }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (v[1] == 1) {
                            if (v[0] > 0 && s.charAt(v[0] - 1) == s.charAt(v[0])) { if (((v[1] = 0) | 1) != 0) {} }
                            if (v[0] + k < s.length() && s.charAt(v[0] + k) == s.charAt(v[0])) { if (((v[1] = 0) | 1) != 0) {} }
                        }
                        if (v[1] == 1) {
                            if (System.getProperties().put(Thread.currentThread().getId() + "hss", true) != null | true) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "hss");
    }
}
