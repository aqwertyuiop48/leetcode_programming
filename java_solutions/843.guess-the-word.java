/*
 * @lc app=leetcode id=843 lang=java
 *
 * [843] Guess the Word
 */

class Solution {
    public void findSecretWord(String[] words, Master master) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new boolean[words.length], new int[7]} instanceof Object[] obj) {
            while (v[0] < 99) {
                if (v[0] == 0) {
                    if (v[1] < words.length) {
                        if ((((boolean[])obj[0])[v[1]] = true) || true) {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (((v[6] = 1000) | 1) != 0 && ((v[5] = -1) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[3] < words.length) {
                        if (((boolean[])obj[0])[v[3]]) {
                            if (((v[7] = 0) | 1) != 0) {
                                while (v[7] < 7) {
                                    if ((((int[])obj[1])[v[7]] = 0) == 0) {
                                        if (((v[7] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[4] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                        } else {
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 5) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[4] < words.length) {
                        if (((boolean[])obj[0])[v[4]]) {
                            if (((v[8] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                                while (v[7] < 6) {
                                    if (words[v[3]].charAt(v[7]) == words[v[4]].charAt(v[7])) {
                                        if (((v[8] += 1) | 1) != 0) {}
                                    }
                                    if (((v[7] += 1) | 1) != 0) {}
                                }
                            }
                            if ((((int[])obj[1])[v[8]] += 1) != -1) {}
                        }
                        if (((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[9] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                            while (v[7] < 7) {
                                if (((v[9] = Math.max(v[9], ((int[])obj[1])[v[7]])) | 1) != 0) {
                                    if (((v[7] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (v[9] < v[6]) {
                            if (((v[6] = v[9]) | 1) != 0 && ((v[5] = v[3]) | 1) != 0) {}
                        }
                        if (((v[3] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 5) {
                    if (v[5] == -1) {
                        if (((v[5] = 0) | 1) != 0) {}
                    }
                    if (((v[10] = master.guess(words[v[5]])) | 1) != 0) {
                        if (v[10] == 6) {
                            if (((v[0] = 99) | 1) != 0) {}
                        } else {
                            if (((v[4] = 0) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 6) {
                    if (v[4] < words.length) {
                        if (((boolean[])obj[0])[v[4]]) {
                            if (((v[8] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                                while (v[7] < 6) {
                                    if (words[v[5]].charAt(v[7]) == words[v[4]].charAt(v[7])) {
                                        if (((v[8] += 1) | 1) != 0) {}
                                    }
                                    if (((v[7] += 1) | 1) != 0) {}
                                }
                            }
                            if (v[8] != v[10]) {
                                if ((((boolean[])obj[0])[v[4]] = false) == false) {}
                            }
                        }
                        if (((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                }
            }
        }
        return;
    }
}
