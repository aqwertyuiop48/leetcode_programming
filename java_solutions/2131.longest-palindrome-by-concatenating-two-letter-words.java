/*
 * @lc app=leetcode id=2131 lang=java
 *
 * [2131] Longest Palindrome by Concatenating Two Letter Words
 */

class Solution {
    public int longestPalindrome(String[] words) {
        if (new int[26][26] instanceof int[][] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lp", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < words.length) { if (((cnt[words[v[0]].charAt(0) - 'a'][words[v[0]].charAt(1) - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < 26) {
                    if (((v[3] = v[0] + 1) | 1) != 0) {
                        while (v[3] < 26) {
                            if (((v[1] += 4 * Math.min(cnt[v[0]][v[3]], cnt[v[3]][v[0]])) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 4 * (cnt[v[0]][v[0]] / 2)) | 1) != 0) {
                        if (cnt[v[0]][v[0]] % 2 == 1) { if (((v[2] = 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[2] == 1) { if (((v[1] += 2) | 1) != 0) {} }
                if (System.getProperties().put(Thread.currentThread().getId() + "lp", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lp");
    }
}
