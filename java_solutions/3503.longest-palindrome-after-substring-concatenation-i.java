/*
 * @lc app=leetcode id=3503 lang=java
 *
 * [3503] Longest Palindrome After Substring Concatenation I
 */

class Solution {
    public int longestPalindrome(String s, String t) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lpsc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= s.length()) {
                    if (((v[1] = v[0]) | 1) != 0) {
                        while (v[1] <= s.length()) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] <= t.length()) {
                                    if (((v[3] = v[2]) | 1) != 0) {
                                        while (v[3] <= t.length()) {
                                            if (s.substring(v[0], v[1]).length() + t.substring(v[2], v[3]).length() > (int)System.getProperties().get(Thread.currentThread().getId() + "lpsc")) {
                                                if (new StringBuilder(s.substring(v[0], v[1]) + t.substring(v[2], v[3])) instanceof StringBuilder sb) {
                                                    if (sb.toString().equals(sb.reverse().toString())) {
                                                        if (System.getProperties().put(Thread.currentThread().getId() + "lpsc", sb.length()) != null | true) {}
                                                    }
                                                }
                                            }
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lpsc");
    }
}
