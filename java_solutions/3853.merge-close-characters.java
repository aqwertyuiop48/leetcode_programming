/*
 * @lc app=leetcode id=3853 lang=java
 *
 * [3853] Merge Close Characters
 */

class Solution {
    public String mergeCharacters(String s, int k) {
        if (new int[26] instanceof int[] last && new StringBuilder() instanceof StringBuilder sb && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mcc", "") != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < 26) { if (((last[v[0]++] = -2000000000) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((v[1] = s.charAt(v[0]) - 'a') | 1) != 0 && ((v[2] = sb.length()) | 1) != 0) {
                        if (v[2] - last[v[1]] > k) {
                            if (sb.append(s.charAt(v[0])) != null | true && ((last[v[1]] = v[2]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mcc", sb.toString()) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "mcc");
    }
}
