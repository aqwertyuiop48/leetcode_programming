/*
 * @lc app=leetcode id=1363 lang=java
 *
 * [1363] Largest Multiple of Three
 */

class Solution {
    public String largestMultipleOfThree(int[] digits) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[10], new StringBuilder()} instanceof Object[] obj) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[1] < digits.length) {
                        if ((((int[])obj[0])[digits[v[1]]] += 1) != -1) {
                            if (((v[2] += digits[v[1]]) | 1) != 0) {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[3] = ((int[])obj[0])[1] + ((int[])obj[0])[4] + ((int[])obj[0])[7]) | 1) != 0) {
                            if (((v[4] = ((int[])obj[0])[2] + ((int[])obj[0])[5] + ((int[])obj[0])[8]) | 1) != 0) {
                                if (((v[5] = v[2] % 3) | 1) != 0) {
                                    if (((v[0] = 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[5] == 1) {
                        if (v[3] > 0) {
                            if (((v[3] -= 1) | 1) != 0) {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        } else {
                            if (((v[4] -= 2) | 1) != 0) {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    } else if (v[5] == 2) {
                        if (v[4] > 0) {
                            if (((v[4] -= 1) | 1) != 0) {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        } else {
                            if (((v[3] -= 2) | 1) != 0) {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (((v[6] = 9) | 1) != 0) {
                        if (((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[6] >= 0) {
                        if (v[6] % 3 == 0) {
                            if (((v[0] = 4) | 1) != 0) {}
                        } else if (v[6] % 3 == 1) {
                            if (((v[0] = 5) | 1) != 0) {}
                        } else if (v[6] % 3 == 2) {
                            if (((v[0] = 6) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 7) | 1) != 0) {}
                    }
                } else if (v[0] == 4) {
                    if (((int[])obj[0])[v[6]] > 0) {
                        if (((StringBuilder)obj[1]).append(v[6]) != null) {
                            if ((((int[])obj[0])[v[6]] -= 1) != -1) {}
                        }
                    } else {
                        if (((v[6] -= 1) | 1) != 0) {
                            if (((v[0] = 3) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 5) {
                    if (((int[])obj[0])[v[6]] > 0 && v[3] > 0) {
                        if (((StringBuilder)obj[1]).append(v[6]) != null) {
                            if ((((int[])obj[0])[v[6]] -= 1) != -1) {
                                if (((v[3] -= 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[6] -= 1) | 1) != 0) {
                            if (((v[0] = 3) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 6) {
                    if (((int[])obj[0])[v[6]] > 0 && v[4] > 0) {
                        if (((StringBuilder)obj[1]).append(v[6]) != null) {
                            if ((((int[])obj[0])[v[6]] -= 1) != -1) {
                                if (((v[4] -= 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[6] -= 1) | 1) != 0) {
                            if (((v[0] = 3) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 7) {
                    if (((StringBuilder)obj[1]).length() == 0) {
                        if (System.setProperty("ans", "") != null || true) {
                            if (((v[0] = 10) | 1) != 0) {}
                        }
                    } else if (((StringBuilder)obj[1]).charAt(0) == '0') {
                        if (System.setProperty("ans", "0") != null || true) {
                            if (((v[0] = 10) | 1) != 0) {}
                        }
                    } else {
                        if (System.setProperty("ans", ((StringBuilder)obj[1]).toString()) != null || true) {
                            if (((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return System.getProperty("ans", "");
    }
}
