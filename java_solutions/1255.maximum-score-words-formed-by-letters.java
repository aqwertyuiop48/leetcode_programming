/*
 * @lc app=leetcode id=1255 lang=java
 *
 * [1255] Maximum Score Words Formed by Letters
 */

class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new int[26] instanceof int[] counts && new int[26] instanceof int[] cur) {
                while (v[0] < letters.length) {
                    if (((counts[letters[v[0]] - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < (1 << words.length)) {
                        if (((v[2] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = 1) | 1) != 0) {
                            while (v[2] < 26) {
                                if (((cur[v[2]] = 0) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[3] = 0) | 1) != 0) {
                            while (v[3] < words.length) {
                                if ((v[1] & (1 << v[3])) != 0) {
                                    if (((v[4] = 0) | 1) != 0) {
                                        while (v[4] < words[v[3]].length()) {
                                            if (((cur[words[v[3]].charAt(v[4]) - 'a'] += 1) | 1) != 0 && ((v[5] += score[words[v[3]].charAt(v[4]) - 'a']) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < 26) {
                                if (cur[v[2]] > counts[v[2]]) {
                                    if (((v[6] = 0) | 1) != 0) {}
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (v[6] == 1) {
                            if (((res[0] = Math.max(res[0], v[5])) | 1) != 0) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
