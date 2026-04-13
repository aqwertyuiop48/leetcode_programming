/*
 * @lc app=leetcode id=839 lang=java
 *
 * [839] Similar String Groups
 */

class Solution {
    public int numSimilarGroups(String[] strs) {
        if (System.getProperties().put("ans", strs.length) != null || true) {
            if (new int[]{0, 0, 0, strs.length, 0, 0, 0, strs.length, 0, 0} instanceof int[] v && new Object[]{new int[strs.length]} instanceof Object[] obj) {
                while (v[0] < 5) {
                    if (v[0] == 0) {
                        if (v[1] < v[3]) {
                            if ((((int[])obj[0])[v[1]] = v[1]) != -1) {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] < v[3]) {
                            if (((v[2] = v[1] + 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        } else {
                            if (System.getProperties().put("ans", v[7]) != null || true) {
                                if (((v[0] = 5) | 1) != 0) {}
                            }
                        }
                    } else if (v[0] == 2) {
                        if (v[2] < v[3]) {
                            if (((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                                while (v[4] < strs[v[1]].length() && v[5] <= 2) {
                                    if (strs[v[1]].charAt(v[4]) != strs[v[2]].charAt(v[4])) {
                                        if (((v[5] += 1) | 1) != 0) {}
                                    }
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                                if (v[5] == 0 || v[5] == 2) {
                                    if (((v[8] = v[1]) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                                } else {
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[1] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 3) {
                        if (((int[])obj[0])[v[8]] != v[8]) {
                            if (((v[8] = ((int[])obj[0])[v[8]]) | 1) != 0) {}
                        } else {
                            if (((v[9] = v[2]) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                        }
                    } else if (v[0] == 4) {
                        if (((int[])obj[0])[v[9]] != v[9]) {
                            if (((v[9] = ((int[])obj[0])[v[9]]) | 1) != 0) {}
                        } else {
                            if (v[8] != v[9]) {
                                if ((((int[])obj[0])[v[8]] = v[9]) != -1) {
                                    if (((v[7] -= 1) | 1) != 0) {}
                                }
                            }
                            if (((v[2] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int)System.getProperties().get("ans");
    }
}
