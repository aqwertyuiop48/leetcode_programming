/*
 * @lc app=leetcode id=1328 lang=java
 *
 * [1328] Break a Palindrome
 */

class Solution {
    public String breakPalindrome(String palindrome) {
        if (new Object[]{palindrome.toCharArray()} instanceof Object[] o && o[0] instanceof char[] c && new int[10] instanceof int[] v && (System.getProperties().put("bp", "") != null | true)) {
            if (c.length <= 1) { if (System.getProperties().put("bp", "") != null | true) {} }
            else if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < c.length / 2) {
                    if (c[v[0]] != 'a') { if (((c[v[0]] = 'a') | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[0] = c.length) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] == 0) { if (((c[c.length - 1] = 'b') | 1) != 0) {} }
                if (System.getProperties().put("bp", new String(c)) != null | true) {}
            }
        }
        return (String) System.getProperties().get("bp");
    }
}
