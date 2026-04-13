/*
 * @lc app=leetcode id=828 lang=java
 *
 * [828] Count Unique Characters of All Substrings of a Given String
 */

class Solution {
    public int uniqueLetterString(String s) {
        if (System.getProperties().put("ans828", 0) != null || true) {
            if (new int[]{0, 0, 0, s.length(), 0, 0} instanceof int[] v && new int[26][2] instanceof int[][] last) {
                while (v[0] < 3) {
                    if (v[0] == 0) {
                        if (((v[4] = 0) | 1) != 0) {
                            while (v[4] < 26) {
                                if (((last[v[4]][0] = -1) | 1) != 0 && ((last[v[4]][1] = -1) | 1) != 0) {
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[0] = 1) | 1) != 0) {}
                    } else if (v[0] == 1) {
                        if (v[1] < v[3]) {
                            if (((v[4] = s.charAt(v[1]) - 'A') | 1) != 0) {
                                if (((v[2] += (v[1] - last[v[4]][1]) * (last[v[4]][1] - last[v[4]][0])) | 1) != 0) {
                                    if (((last[v[4]][0] = last[v[4]][1]) | 1) != 0 && ((last[v[4]][1] = v[1]) | 1) != 0) {
                                        if (((v[1] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        } else {
                            if (((v[4] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[4] < 26) {
                            if (((v[2] += (v[3] - last[v[4]][1]) * (last[v[4]][1] - last[v[4]][0])) | 1) != 0) {
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[5] = v[2]) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                        }
                    }
                }
                if (System.getProperties().put("ans828", v[5]) != null || true) {}
            }
        }
        return (int) System.getProperties().get("ans828");
    }
}
