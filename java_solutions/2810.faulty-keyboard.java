/*
 * @lc app=leetcode id=2810 lang=java
 *
 * [2810] Faulty Keyboard
 */

class Solution {
    public String finalString(String s) {
        if (new Object[]{new StringBuilder()} instanceof Object[] o && o[0] instanceof StringBuilder sb && new int[5] instanceof int[] v && (System.getProperties().put("fks", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (s.charAt(v[0]) == 'i') { if (sb.reverse() != null | true) {} }
                    else { if (sb.append(s.charAt(v[0])) != null | true) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("fks", sb.toString()) != null | true) {}
            }
        }
        return (String) System.getProperties().get("fks");
    }
}
