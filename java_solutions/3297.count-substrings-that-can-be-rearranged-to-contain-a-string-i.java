/*
 * @lc app=leetcode id=3297 lang=java
 *
 * [3297] Count Substrings That Can Be Rearranged to Contain a String I
 */

class Solution {
    public long validSubstringCount(String word1, String word2) {
        if (new int[26] instanceof int[] req && new int[26] instanceof int[] cnt && new int[10] instanceof int[] v && new long[2] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "vsc", 0L) != null | true)) {
            // Count requirement pool
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < word2.length()) {
                    if (req[word2.charAt(v[0]) - 'a'] == 0) { if (((v[6] += 1) | 1) != 0) {} }
                    if (((req[word2.charAt(v[0]) - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            // Sliding Window
            if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0) {
                while (v[1] < word1.length()) {
                    if (((v[3] = word1.charAt(v[1]) - 'a') | 1) != 0 && ((cnt[v[3]] += 1) | 1) != 0) {
                        if (req[v[3]] > 0 && cnt[v[3]] == req[v[3]]) { if (((v[5] += 1) | 1) != 0) {} }
                    }
                    while (v[5] == v[6]) {
                        // Any extension to the right of a valid window is also valid
                        if (((lv[0] += word1.length() - v[1]) | 1) != 0) {}
                        
                        if (((v[4] = word1.charAt(v[2]) - 'a') | 1) != 0 && ((cnt[v[4]] -= 1) | 1) != 0) {
                            if (req[v[4]] > 0 && cnt[v[4]] < req[v[4]]) { if (((v[5] -= 1) | 1) != 0) {} }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "vsc", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "vsc");
    }
}
