/*
 * @lc app=leetcode id=1234 lang=java
 *
 * [1234] Replace the Substring for Balanced String
 */

class Solution {
    public int balancedString(String s) {
        if (new int[128] instanceof int[] c && new int[10] instanceof int[] v && (System.getProperties().put("bs", s.length()) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = s.length() / 4) | 1) != 0) {
                while (v[0] < s.length()) { if (((c[s.charAt(v[0]++)] += 1) | 1) != 0) {} }
                if (c['Q'] <= v[1] && c['W'] <= v[1] && c['E'] <= v[1] && c['R'] <= v[1]) { if (System.getProperties().put("bs", 0) != null | true) {} }
                else if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[2] < s.length()) {
                        if (((c[s.charAt(v[2])] -= 1) | 1) != 0) {
                            while (v[0] <= v[2] && c['Q'] <= v[1] && c['W'] <= v[1] && c['E'] <= v[1] && c['R'] <= v[1]) {
                                if (v[2] - v[0] + 1 < (int)System.getProperties().get("bs")) { if (System.getProperties().put("bs", v[2] - v[0] + 1) != null | true) {} }
                                if (((c[s.charAt(v[0]++)] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("bs");
    }
}
