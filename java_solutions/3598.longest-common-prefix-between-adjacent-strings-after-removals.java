/*
 * @lc app=leetcode id=3598 lang=java
 *
 * [3598] Longest Common Prefix Between Adjacent Strings After Removals
 */

class Solution {
    public int[] longestCommonPrefix(String[] words) {
        if (new int[words.length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lcp", ans) != null | true)) {
            if (words.length > 1 && new int[words.length - 1] instanceof int[] lcp && new int[words.length - 1] instanceof int[] prefmax && new int[words.length - 1] instanceof int[] sufmax && ((v[0] = 0) | 1) != 0) {
                while (v[0] < words.length - 1) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = Math.min(words[v[0]].length(), words[v[0] + 1].length())) | 1) != 0) {
                        while (v[1] < v[2] && words[v[0]].charAt(v[1]) == words[v[0] + 1].charAt(v[1])) { if (((v[1] += 1) | 1) != 0) {} }
                        if (((lcp[v[0]] = v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((prefmax[0] = lcp[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                    while (v[0] < words.length - 1) { if (((prefmax[v[0]] = Math.max(prefmax[v[0] - 1], lcp[v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                }
                if (((sufmax[words.length - 2] = lcp[words.length - 2]) | 1) != 0 && ((v[0] = words.length - 3) | 1) != 0) {
                    while (v[0] >= 0) { if (((sufmax[v[0]] = Math.max(sufmax[v[0] + 1], lcp[v[0]])) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {} }
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < words.length) {
                        if (((v[1] = 0) | 1) != 0) {
                            if (v[0] >= 2) { if (((v[1] = Math.max(v[1], prefmax[v[0] - 2])) | 1) != 0) {} }
                            if (v[0] + 1 <= words.length - 2) { if (((v[1] = Math.max(v[1], sufmax[v[0] + 1])) | 1) != 0) {} }
                            if (v[0] > 0 && v[0] < words.length - 1) {
                                if (((v[3] = 0) | 1) != 0 && ((v[4] = Math.min(words[v[0] - 1].length(), words[v[0] + 1].length())) | 1) != 0) {
                                    while (v[3] < v[4] && words[v[0] - 1].charAt(v[3]) == words[v[0] + 1].charAt(v[3])) { if (((v[3] += 1) | 1) != 0) {} }
                                    if (((v[1] = Math.max(v[1], v[3])) | 1) != 0) {}
                                }
                            }
                            if (((ans[v[0]] = v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "lcp");
    }
}
