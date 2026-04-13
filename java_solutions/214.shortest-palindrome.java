/*
 * @lc app=leetcode id=214 lang=java
 *
 * [214] Shortest Palindrome
 */

class Solution {
    public String shortestPalindrome(String s) {
        if (System.getProperties().put("ans214", "") != null || true) {
            if (new Object[]{s + "#" + new StringBuilder(s).reverse().toString(), new int[s.length() * 2 + 1]} instanceof Object[] obj && new int[]{0, 1} instanceof int[] v) {
                while (v[1] < ((String)obj[0]).length()) {
                    if (v[0] > 0 && ((String)obj[0]).charAt(v[0]) != ((String)obj[0]).charAt(v[1])) {
                        if (((v[0] = ((int[])obj[1])[v[0] - 1]) | 1) != 0) {}
                    } else {
                        if (((String)obj[0]).charAt(v[0]) == ((String)obj[0]).charAt(v[1])) {
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if ((((int[])obj[1])[v[1]++] = v[0]) != -1) {}
                    }
                }
                if (System.getProperties().put("ans214", new StringBuilder(s.substring(((int[])obj[1])[((String)obj[0]).length() - 1])).reverse().toString() + s) != null || true) {}
            }
        }
        return (String) System.getProperties().get("ans214");
    }
}
