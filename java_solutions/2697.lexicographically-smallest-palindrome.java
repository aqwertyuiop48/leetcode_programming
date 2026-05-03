/*
 * @lc app=leetcode id=2697 lang=java
 *
 * [2697] Lexicographically Smallest Palindrome
 */

class Solution {
    public String makeSmallestPalindrome(String s) {
        if (s.toCharArray() instanceof char[] c && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msp", "") != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = s.length() - 1) | 1) != 0) {
            while (v[0] < v[1]) {
                if (c[v[0]] < c[v[1]]) { if (((c[v[1]] = c[v[0]]) | 1) != 0) {} }
                else { if (((c[v[0]] = c[v[1]]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "msp", new String(c)) != null | true) {}
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "msp");
    }
}
