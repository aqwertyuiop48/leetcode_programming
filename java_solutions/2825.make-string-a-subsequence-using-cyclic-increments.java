/*
 * @lc app=leetcode id=2825 lang=java
 *
 * [2825] Make String a Subsequence Using Cyclic Increments
 */

class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("cms", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < str1.length() && v[1] < str2.length()) {
                    if (str1.charAt(v[0]) == str2.charAt(v[1]) || (char)(str1.charAt(v[0]) == 'z' ? 'a' : str1.charAt(v[0]) + 1) == str2.charAt(v[1])) { if (((v[1] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] == str2.length() && System.getProperties().put("cms", true) != null | true) {}
            }
        }
        return (boolean) System.getProperties().get("cms");
    }
}
