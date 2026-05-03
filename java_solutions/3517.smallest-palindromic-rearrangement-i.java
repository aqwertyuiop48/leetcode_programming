/*
 * @lc app=leetcode id=3517 lang=java
 *
 * [3517] Smallest Palindromic Rearrangement I
 */

class Solution {
    public String smallestPalindrome(String s) {
        if (new int[26] instanceof int[] cnt && (System.getProperties().put(Thread.currentThread().getId() + "spr", "") != null | true)) {
            if (new int[10] instanceof int[] v && ((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) { if (((cnt[s.charAt(v[0]++) - 'a'] += 1) | 1) != 0) {} }
                if (new StringBuilder() instanceof StringBuilder half && new StringBuilder() instanceof StringBuilder mid && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < 26) {
                        if (cnt[v[0]] % 2 != 0) { if (mid.append((char)(v[0] + 'a')) != null | true) {} }
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < cnt[v[0]] / 2) { if (half.append((char)(v[0] + 'a')) != null | true && ((v[1] += 1) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "spr", half.toString() + mid.toString() + half.reverse().toString()) != null | true) {}
                }
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "spr");
    }
}
