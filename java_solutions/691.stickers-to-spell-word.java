/*
 * @lc app=leetcode id=691 lang=java
 *
 * [691] Stickers to Spell Word
 */

class Solution {
    public int minStickers(String[] stickers, String target) {
        if (System.getProperties().put("ans691", -1) != null || true) {
            if (new int[]{0, 1 << target.length(), target.length(), 0, 0, 0, 0, 0} instanceof int[] v && new int[1 << target.length()] instanceof int[] dp && new int[stickers.length][26] instanceof int[][] cnt) {
                while (v[0] < 4) {
                    if (v[0] == 0) {
                        if (v[3] < v[1]) {
                            if (((dp[v[3]] = -1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                        } else {
                            if (((dp[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[3] < stickers.length) {
                            if (((v[4] = 0) | 1) != 0) {
                                while (v[4] < stickers[v[3]].length()) {
                                    if (((cnt[v[3]][stickers[v[3]].charAt(v[4]) - 'a'] += 1) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        } else {
                            if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[3] < v[1]) {
                            if (dp[v[3]] != -1) {
                                if (((v[7] = 0) | 1) != 0) {
                                    while (v[7] < v[2] && (v[3] & (1 << v[7])) != 0) {
                                        if (((v[7] += 1) | 1) != 0) {}
                                    }
                                    if (v[7] < v[2]) {
                                        if (((v[4] = 0) | 1) != 0) {
                                            while (v[4] < stickers.length) {
                                                if (cnt[v[4]][target.charAt(v[7]) - 'a'] > 0) {
                                                    if (((v[5] = v[3]) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                                                        while (v[6] < v[2]) {
                                                            if (((v[5] & (1 << v[6])) == 0) && cnt[v[4]][target.charAt(v[6]) - 'a'] > 0) {
                                                                if (((v[5] |= (1 << v[6])) | 1) != 0 && ((cnt[v[4]][target.charAt(v[6]) - 'a'] -= 1) | 1) != 0) {}
                                                            }
                                                            if (((v[6] += 1) | 1) != 0) {}
                                                        }
                                                    }
                                                    if (dp[v[5]] == -1 || dp[v[5]] > dp[v[3]] + 1) {
                                                        if (((dp[v[5]] = dp[v[3]] + 1) | 1) != 0) {}
                                                    }
                                                    if (((v[6] = 0) | 1) != 0) {
                                                        while (v[6] < v[2]) {
                                                            if (((v[3] & (1 << v[6])) == 0) && ((v[5] & (1 << v[6])) != 0)) {
                                                                if (((cnt[v[4]][target.charAt(v[6]) - 'a'] += 1) | 1) != 0) {}
                                                            }
                                                            if (((v[6] += 1) | 1) != 0) {}
                                                        }
                                                    }
                                                }
                                                if (((v[4] += 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        } else {
                            if (System.getProperties().put("ans691", dp[v[1] - 1]) != null || true) {
                                if (((v[0] = 99) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("ans691");
    }
}
