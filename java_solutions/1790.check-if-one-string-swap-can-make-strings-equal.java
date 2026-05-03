/*
 * @lc app=leetcode id=1790 lang=java
 *
 * [1790] Check if One String Swap Can Make Strings Equal
 */

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (new int[10] instanceof int[] v && new int[3] instanceof int[] diff && (System.getProperties().put("aae", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < s1.length()) {
                    if (s1.charAt(v[0]) != s2.charAt(v[0])) {
                        if (v[1] < 2) { if (((diff[v[1]++] = v[0]) | 1) != 0) {} }
                        else { if (((v[1] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] == 0) { if (System.getProperties().put("aae", true) != null | true) {} }
                else if (v[1] == 2 && s1.charAt(diff[0]) == s2.charAt(diff[1]) && s1.charAt(diff[1]) == s2.charAt(diff[0])) { if (System.getProperties().put("aae", true) != null | true) {} }
            }
        }
        return (boolean) System.getProperties().get("aae");
    }
}
