/*
 * @lc app=leetcode id=3138 lang=java
 *
 * [3138] Minimum Length of Anagram Concatenation
 */

class Solution {
    public int minAnagramLength(String s) {
        if (new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mal", s.length()) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= s.length() / 2) {
                    if (s.length() % v[0] == 0) {
                        if (new int[26] instanceof int[] cnt && new int[26] instanceof int[] cur && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                            while (v[1] < v[0]) {
                                if (((cnt[s.charAt(v[1]) - 'a'] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                            }
                            if (((v[1] = v[0]) | 1) != 0) {
                                while (v[1] < s.length() && v[2] == 1) {
                                    if (((v[3] = 0) | 1) != 0) { while (v[3] < 26) { if (((cur[v[3]++] = 0) | 1) != 0) {} } }
                                    if (((v[3] = 0) | 1) != 0) {
                                        while (v[3] < v[0]) {
                                            if (((cur[s.charAt(v[1] + v[3]) - 'a'] += 1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[3] = 0) | 1) != 0) {
                                        while (v[3] < 26 && v[2] == 1) {
                                            if (cnt[v[3]] != cur[v[3]]) { if (((v[2] = 0) | 1) != 0) {} }
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[1] += v[0]) | 1) != 0) {}
                                }
                            }
                            if (v[2] == 1) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "mal", v[0]) != null | true) {}
                                if (((v[0] = s.length()) | 1) != 0) {} 
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mal");
    }
}
