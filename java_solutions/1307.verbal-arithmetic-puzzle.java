/*
 * @lc app=leetcode id=1307 lang=java
 *
 * [1307] Verbal Arithmetic Puzzle
 */

class Solution {
    public boolean isSolvable(String[] words, String result) {
        if (new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof long[] v && new Object[]{new long[26], new boolean[26], new int[12], new long[12], new long[12], new int[12], new long[12], new int[12]} instanceof Object[] obj) {
            while (v[0] < 99) {
                if (v[0] == 0) {
                    if (v[1] <= words.length) {
                        if (v[1] < words.length) {
                            if (((v[2] = words[(int)v[1]].length() - 1) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                                while (v[2] >= 0) {
                                    if ((((long[])obj[0])[words[(int)v[1]].charAt((int)v[2]) - 'A'] += v[3]) != 0 || true) {
                                        if (v[2] == 0 && words[(int)v[1]].length() > 1) {
                                            if ((((boolean[])obj[1])[words[(int)v[1]].charAt((int)v[2]) - 'A'] = true) || true) {}
                                        }
                                        if (((v[3] *= 10) | 1) != 0 && ((v[2] -= 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[2] = result.length() - 1) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                                while (v[2] >= 0) {
                                    if ((((long[])obj[0])[result.charAt((int)v[2]) - 'A'] -= v[3]) != 0 || true) {
                                        if (v[2] == 0 && result.length() > 1) {
                                            if ((((boolean[])obj[1])[result.charAt((int)v[2]) - 'A'] = true) || true) {}
                                        }
                                        if (((v[3] *= 10) | 1) != 0 && ((v[2] -= 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[0] = 1) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[4] < 26) {
                        if (((long[])obj[0])[(int)v[4]] != 0 || ((boolean[])obj[1])[(int)v[4]]) {
                            if ((((int[])obj[2])[(int)v[5]++] = (int)v[4]) != 0 || true) {}
                        }
                        if (((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[6] = 0) | 1) != 0) {
                            while (v[6] < v[5]) {
                                if (((v[7] = v[6] + 1) | 1) != 0) {
                                    while (v[7] < v[5]) {
                                        if (Math.abs(((long[])obj[0])[((int[])obj[2])[(int)v[6]]]) < Math.abs(((long[])obj[0])[((int[])obj[2])[(int)v[7]]])) {
                                            if (((v[8] = ((int[])obj[2])[(int)v[6]]) | 1) != 0 && ((((int[])obj[2])[(int)v[6]] = ((int[])obj[2])[(int)v[7]]) != 0 || true) && ((((int[])obj[2])[(int)v[7]] = (int)v[8]) != 0 || true)) {}
                                        }
                                        if (((v[7] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[6] += 1) | 1) != 0) {}
                            }
                            if (((v[6] = v[5] - 1) | 1) != 0) {
                                while (v[6] >= 0) {
                                    if (((long[])obj[0])[((int[])obj[2])[(int)v[6]]] > 0) {
                                        if ((((long[])obj[3])[(int)v[6]] = ((long[])obj[3])[(int)v[6] + 1] + ((long[])obj[0])[((int[])obj[2])[(int)v[6]]]) != 0 || true) {
                                            if ((((long[])obj[4])[(int)v[6]] = ((long[])obj[4])[(int)v[6] + 1]) != 0 || true) {}
                                        }
                                    } else {
                                        if ((((long[])obj[4])[(int)v[6]] = ((long[])obj[4])[(int)v[6] + 1] + ((long[])obj[0])[((int[])obj[2])[(int)v[6]]]) != 0 || true) {
                                            if ((((long[])obj[3])[(int)v[6]] = ((long[])obj[3])[(int)v[6] + 1]) != 0 || true) {}
                                        }
                                    }
                                    if (((v[6] -= 1) | 1) != 0) {}
                                }
                            }
                            if (((v[6] = 0) | 1) != 0) {
                                while (v[6] < 12) {
                                    if ((((int[])obj[5])[(int)v[6]] = -1) != 0 || true) {
                                        if (((v[6] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[9] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[9] >= 0) {
                        if (v[9] == v[5]) {
                            if (((long[])obj[6])[(int)v[9]] == 0) {
                                if (((words[0] = "true") != null) && ((v[0] = 99) | 1) != 0) {}
                            } else {
                                if (((v[9] -= 1) | 1) != 0) {}
                            }
                        } else {
                            if (((((int[])obj[5])[(int)v[9]] += 1) | 1) != 0) {
                                if (((int[])obj[5])[(int)v[9]] > 9) {
                                    if ((((int[])obj[5])[(int)v[9]] = -1) != 0 || true) {
                                        if (((v[9] -= 1) | 1) != 0) {}
                                    }
                                } else {
                                    if ((((int[])obj[7])[(int)v[9]] & (1 << ((int[])obj[5])[(int)v[9]])) == 0) {
                                        if (!(((int[])obj[5])[(int)v[9]] == 0 && ((boolean[])obj[1])[((int[])obj[2])[(int)v[9]]])) {
                                            if (((v[10] = ((long[])obj[6])[(int)v[9]] + ((int[])obj[5])[(int)v[9]] * ((long[])obj[0])[((int[])obj[2])[(int)v[9]]]) | 1) != 0) {
                                                if (v[10] + ((long[])obj[3])[(int)v[9] + 1] * 9 >= 0 && v[10] + ((long[])obj[4])[(int)v[9] + 1] * 9 <= 0) {
                                                    if ((((long[])obj[6])[(int)v[9] + 1] = v[10]) != 0 || true) {
                                                        if ((((int[])obj[7])[(int)v[9] + 1] = ((int[])obj[7])[(int)v[9]] | (1 << ((int[])obj[5])[(int)v[9]])) != 0 || true) {
                                                            if (((v[9] += 1) | 1) != 0) {}
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (((words[0] = "false") != null) && ((v[0] = 99) | 1) != 0) {}
                    }
                }
            }
        }
        return words.length > 0 && "true".equals(words[0]);
    }
}
