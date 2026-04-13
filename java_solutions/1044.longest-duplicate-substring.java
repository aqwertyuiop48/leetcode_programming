/*
 * @lc app=leetcode id=1044 lang=java
 *
 * [1044] Longest Duplicate Substring
 */

class Solution {
    public String longestDupSubstring(String S) {
        if (System.setProperty("ans", "") != null || true) {
            if (new int[]{0, 1, S.length() - 1, 0, 0, 0, 0} instanceof int[] v && new Object[]{new long[2000003]} instanceof Object[] obj && new long[]{0, 0, 1000000000039L, 0} instanceof long[] l) {
                while (v[0] < 5) {
                    if (v[0] == 0) {
                        if (v[1] <= v[2]) {
                            if (((v[3] = v[1] + (v[2] - v[1]) / 2) | 1) != 0 && ((l[0] = 0) | 1) != 0 && ((l[1] = 1) | 1) != 0) {
                                if (((v[4] = S.length()) | 1) != 0 && ((v[5] = v[3]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[5] >= 1) {
                            if (((l[0] = (l[0] * 313L + S.charAt(v[3] - v[5])) % l[2]) | 1) != 0) {
                                if (v[5] > 1) {
                                    if (((l[1] = (l[1] * 313L) % l[2]) | 1) != 0) {}
                                }
                                if (((v[5] -= 1) | 1) != 0) {}
                            }
                        } else {
                            if (((obj[0] = new long[2000003]) != null) || true) {
                                if (((l[3] = l[0] == 0 ? l[2] : l[0]) | 1) != 0 && ((v[6] = (int)(l[3] % 2000003)) | 1) != 0) {
                                    while (((long[])obj[0])[v[6]] != 0 && ((long[])obj[0])[v[6]] != l[3]) {
                                        if (((v[6] = (v[6] + 1) % 2000003) | 1) != 0) {}
                                    }
                                    if ((((long[])obj[0])[v[6]] = l[3]) != 0 || true) {
                                        if (((v[5] = v[3]) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    } else if (v[0] == 2) {
                        if (v[5] < v[4]) {
                            if (((l[0] = (l[0] - (S.charAt(v[5] - v[3]) * l[1]) % l[2] + l[2]) % l[2]) | 1) != 0) {
                                if (((l[0] = (l[0] * 313L + S.charAt(v[5])) % l[2]) | 1) != 0) {
                                    if (((l[3] = l[0] == 0 ? l[2] : l[0]) | 1) != 0 && ((v[6] = (int)(l[3] % 2000003)) | 1) != 0) {
                                        while (((long[])obj[0])[v[6]] != 0 && ((long[])obj[0])[v[6]] != l[3]) {
                                            if (((v[6] = (v[6] + 1) % 2000003) | 1) != 0) {}
                                        }
                                        if (((long[])obj[0])[v[6]] == 0) {
                                            if ((((long[])obj[0])[v[6]] = l[3]) != 0 || true) {
                                                if (((v[5] += 1) | 1) != 0) {}
                                            }
                                        } else {
                                            if (System.setProperty("ans", S.substring(v[5] - v[3] + 1, v[5] + 1)) != null || true) {
                                                if (((v[1] = v[3] + 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (((v[2] = v[3] - 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return System.getProperty("ans", "");
    }
}
