/*
 * @lc app=leetcode id=1036 lang=java
 *
 * [1036] Escape a Large Maze
 */

class Solution {
    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new HashSet<Long>(), new HashSet<Long>(), new long[20005], new int[]{0, 0, 1, -1}, new int[]{1, -1, 0, 0}} instanceof Object[] obj) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[1] < blocked.length) {
                        if (((HashSet<Long>)obj[0]).add((long)blocked[v[1]][0] * 1000000L + blocked[v[1]][1]) || true) {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if ((((long[])obj[2])[0] = (long)source[0] * 1000000L + source[1]) != -1) {
                        if (((HashSet<Long>)obj[1]).add(((long[])obj[2])[0]) || true) {
                            if (((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[2] < v[3] && v[4] < 20000) {
                        if (((v[5] = (int)(((long[])obj[2])[v[2]] / 1000000L)) | 1) != 0 && ((v[6] = (int)(((long[])obj[2])[v[2]] % 1000000L)) | 1) != 0) {
                            if (v[5] == target[0] && v[6] == target[1]) {
                                if (((source[0] = 1) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                            } else {
                                if (((v[7] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (v[2] == v[3]) {
                            if (((source[0] = 0) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                        } else {
                            if (((obj[1] = new HashSet<Long>()) != null) || true) {
                                if (((v[0] = 4) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 3) {
                    if (v[7] < 4) {
                        if (((v[8] = v[5] + ((int[])obj[3])[v[7]]) | 1) != 0 && ((v[9] = v[6] + ((int[])obj[4])[v[7]]) | 1) != 0) {
                            if (v[8] >= 0 && v[8] < 1000000 && v[9] >= 0 && v[9] < 1000000) {
                                if (!((HashSet<Long>)obj[0]).contains((long)v[8] * 1000000L + v[9]) && ((HashSet<Long>)obj[1]).add((long)v[8] * 1000000L + v[9])) {
                                    if ((((long[])obj[2])[v[3]++] = (long)v[8] * 1000000L + v[9]) != -1) {
                                        if (((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (((v[7] += 1) | 1) != 0) {}
                    } else {
                        if (((v[2] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 4) {
                    if ((((long[])obj[2])[0] = (long)target[0] * 1000000L + target[1]) != -1) {
                        if (((HashSet<Long>)obj[1]).add(((long[])obj[2])[0]) || true) {
                            if (((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 5) {
                    if (v[2] < v[3] && v[4] < 20000) {
                        if (((v[5] = (int)(((long[])obj[2])[v[2]] / 1000000L)) | 1) != 0 && ((v[6] = (int)(((long[])obj[2])[v[2]] % 1000000L)) | 1) != 0) {
                            if (v[5] == source[0] && v[6] == source[1]) {
                                if (((source[0] = 1) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                            } else {
                                if (((v[7] = 0) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((source[0] = v[2] == v[3] ? 0 : 1) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                    }
                } else if (v[0] == 6) {
                    if (v[7] < 4) {
                        if (((v[8] = v[5] + ((int[])obj[3])[v[7]]) | 1) != 0 && ((v[9] = v[6] + ((int[])obj[4])[v[7]]) | 1) != 0) {
                            if (v[8] >= 0 && v[8] < 1000000 && v[9] >= 0 && v[9] < 1000000) {
                                if (!((HashSet<Long>)obj[0]).contains((long)v[8] * 1000000L + v[9]) && ((HashSet<Long>)obj[1]).add((long)v[8] * 1000000L + v[9])) {
                                    if ((((long[])obj[2])[v[3]++] = (long)v[8] * 1000000L + v[9]) != -1) {
                                        if (((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (((v[7] += 1) | 1) != 0) {}
                    } else {
                        if (((v[2] += 1) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                    }
                }
            }
        }
        return source[0] == 1;
    }
}
