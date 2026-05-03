/*
 * @lc app=leetcode id=3302 lang=java
 *
 * [3302] Find the Lexicographically Smallest Valid Sequence
 */

class Solution {
    public int[] validSequence(String word1, String word2) {
        if (new int[word1.length() + 1] instanceof int[] rm && new int[word2.length()] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lsvs", new int[0]) != null | true)) {
            if (((v[0] = word1.length() - 1) | 1) != 0 && ((v[1] = word2.length() - 1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (v[1] >= 0 && word1.charAt(v[0]) == word2.charAt(v[1])) {
                        if (((rm[v[0]] = rm[v[0] + 1] + 1) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {}
                    } else {
                        if (((rm[v[0]] = rm[v[0] + 1]) | 1) != 0) {}
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < word1.length() && v[1] < word2.length()) {
                    if (word1.charAt(v[0]) == word2.charAt(v[1])) {
                        if (((ans[v[1]++] = v[0]) | 1) != 0) {}
                    } else if (v[2] == 0 && rm[v[0] + 1] >= word2.length() - v[1] - 1) {
                        if (((ans[v[1]++] = v[0]) | 1) != 0 && ((v[2] = 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] == word2.length()) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "lsvs", ans) != null | true) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "lsvs");
    }
}
