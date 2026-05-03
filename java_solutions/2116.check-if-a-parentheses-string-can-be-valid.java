/*
 * @lc app=leetcode id=2116 lang=java
 *
 * [2116] Check if a Parentheses String Can Be Valid
 */

class Solution {
    public boolean canBeValid(String s, String locked) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("cbv", true) != null | true)) {
            if (s.length() % 2 != 0 && System.getProperties().put("cbv", false) != null | true) {}
            else if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (locked.charAt(v[0]) == '0' || s.charAt(v[0]) == '(') { if (((v[1] += 1) | 1) != 0) {} }
                    else { if (((v[1] -= 1) | 1) != 0) {} }
                    if (v[1] < 0) { if (System.getProperties().put("cbv", false) != null | true && ((v[0] = s.length()) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if ((boolean)System.getProperties().get("cbv")) {
                    if (((v[0] = s.length() - 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[0] >= 0) {
                            if (locked.charAt(v[0]) == '0' || s.charAt(v[0]) == ')') { if (((v[1] += 1) | 1) != 0) {} }
                            else { if (((v[1] -= 1) | 1) != 0) {} }
                            if (v[1] < 0) { if (System.getProperties().put("cbv", false) != null | true && ((v[0] = -1) | 1) != 0) {} }
                            if (((v[0] -= 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (boolean) System.getProperties().get("cbv");
    }
}
