/*
 * @lc app=leetcode id=3305 lang=java
 *
 * [3305] Count of Substrings Containing Every Vowel and K Consonants I
 */

class Solution {
    // Note: Change to 'public long countOfSubstrings' for LC 3306 if required!
    public int countOfSubstrings(String word, int k) {
        if (new long[2] instanceof long[] ans && new int[]{k, k+1} instanceof int[] target && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cos", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) { 
                while (v[0] < 2) {
                    if (new int[256] instanceof int[] cnt && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[1] < word.length()) {
                            if (((v[5] = word.charAt(v[1])) | 1) != 0) {
                                if (v[5] == 'a' || v[5] == 'e' || v[5] == 'i' || v[5] == 'o' || v[5] == 'u') {
                                    if (cnt[v[5]] == 0) { if (((v[3] += 1) | 1) != 0) {} }
                                    if (((cnt[v[5]] += 1) | 1) != 0) {}
                                } else {
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                            }
                            while (v[3] == 5 && v[4] >= target[v[0]]) {
                                if (((ans[v[0]] += word.length() - v[1]) | 1) != 0 && ((v[6] = word.charAt(v[2])) | 1) != 0) {
                                    if (v[6] == 'a' || v[6] == 'e' || v[6] == 'i' || v[6] == 'o' || v[6] == 'u') {
                                        if (((cnt[v[6]] -= 1) | 1) != 0) {
                                            if (cnt[v[6]] == 0) { if (((v[3] -= 1) | 1) != 0) {} }
                                        }
                                    } else {
                                        if (((v[4] -= 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cos", ans[0] - ans[1]) != null | true) {}
            }
        }
        return (int)(long) System.getProperties().get(Thread.currentThread().getId() + "cos");
    }
}
