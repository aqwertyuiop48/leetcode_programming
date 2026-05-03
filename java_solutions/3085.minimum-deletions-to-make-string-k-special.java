/*
 * @lc app=leetcode id=3085 lang=java
 *
 * [3085] Minimum Deletions to Make String K-Special
 */

class Solution {
    public int minimumDeletions(String word, int k) {
        if (new int[26] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "md", 999999999) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < word.length()) { if (((cnt[word.charAt(v[0]++) - 'a'] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < 26) {
                        if (((v[1] = v[0] + 1) | 1) != 0) {
                            while (v[1] < 26) {
                                if (cnt[v[0]] > cnt[v[1]]) { if (((v[2] = cnt[v[0]]) | 1) != 0 && ((cnt[v[0]] = cnt[v[1]]) | 1) != 0 && ((cnt[v[1]] = v[2]) | 1) != 0) {} }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < 26) {
                        if (cnt[v[0]] > 0) {
                            if (((v[3] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                                while (v[1] < 26) {
                                    if (cnt[v[1]] > 0) {
                                        if (cnt[v[1]] < cnt[v[0]]) { if (((v[3] += cnt[v[1]]) | 1) != 0) {} }
                                        else if (cnt[v[1]] > cnt[v[0]] + k) { if (((v[3] += cnt[v[1]] - (cnt[v[0]] + k)) | 1) != 0) {} }
                                    }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                                if (v[3] < (int)System.getProperties().get(Thread.currentThread().getId() + "md")) {
                                    if (System.getProperties().put(Thread.currentThread().getId() + "md", v[3]) != null | true) {}
                                }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "md");
    }
}
