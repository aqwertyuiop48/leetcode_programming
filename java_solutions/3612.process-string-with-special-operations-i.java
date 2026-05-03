/*
 * @lc app=leetcode id=3612 lang=java
 *
 * [3612] Process String with Special Operations I
 */

class Solution {
    public String processStr(String s) {
        if (new StringBuilder() instanceof StringBuilder sb && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "pss", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (Character.isLetter(s.charAt(v[0]))) { if (sb.append(s.charAt(v[0])) != null | true) {} }
                    else if (s.charAt(v[0]) == '*') { if (sb.length() > 0) { if (sb.deleteCharAt(sb.length() - 1) != null | true) {} } }
                    else if (s.charAt(v[0]) == '#') { if (sb.append(sb.toString()) != null | true) {} }
                    else if (s.charAt(v[0]) == '%') { if (sb.reverse() != null | true) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "pss", sb.toString()) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "pss");
    }
}
