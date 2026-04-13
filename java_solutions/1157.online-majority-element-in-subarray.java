/*
 * @lc app=leetcode id=1157 lang=java
 *
 * [1157] Online Majority Element In Subarray
 */

record MajorityChecker(int[] arr) {
    public int query(int left, int right, int threshold) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{System.getProperties().get(arr), null, null, null} instanceof Object[] obj) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (obj[0] == null) {
                        if (System.getProperties().put(arr, new Object[]{new int[arr.length + 1][15], new int[20005][], new int[20005]}) == null) {
                            if (((obj[0] = System.getProperties().get(arr)) != null) || true) {
                                if (((v[0] = 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 5) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (((obj[1] = ((Object[])obj[0])[0]) != null) || true) {
                        if (((obj[2] = ((Object[])obj[0])[1]) != null) || true) {
                            if (((obj[3] = ((Object[])obj[0])[2]) != null) || true) {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[1] < arr.length) {
                        if ((((int[])obj[3])[arr[v[1]]] += 1) != -1) {
                            if (((v[2] = 0) | 1) != 0 && ((v[3] = arr[v[1]]) | 1) != 0) {
                                while (v[2] < 15) {
                                    if ((((int[][])obj[1])[v[1] + 1][v[2]] = ((int[][])obj[1])[v[1]][v[2]] + (v[3] & 1)) != -1) {
                                        if (((v[3] >>= 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[1] < 20005) {
                        if (((int[])obj[3])[v[1]] > 0) {
                            if ((((int[][])obj[2])[v[1]] = new int[((int[])obj[3])[v[1]]]) != null) {
                                if ((((int[])obj[3])[v[1]] = 0) == 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 4) {
                    if (v[1] < arr.length) {
                        if ((((int[][])obj[2])[arr[v[1]]][((int[])obj[3])[arr[v[1]]]++] = v[1]) != -1) {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 5) | 1) != 0) {}
                    }
                } else if (v[0] == 5) {
                    if (((obj[1] = ((Object[])obj[0])[0]) != null) || true) {
                        if (((obj[2] = ((Object[])obj[0])[1]) != null) || true) {
                            if (((v[4] = 0) | 1) != 0 && ((v[1] = 14) | 1) != 0) {
                                if (((v[0] = 6) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 6) {
                    if (v[1] >= 0) {
                        if (((v[2] = ((int[][])obj[1])[right + 1][v[1]] - ((int[][])obj[1])[left][v[1]]) | 1) != 0) {
                            if (v[2] >= threshold) {
                                if (((v[4] = (v[4] << 1) | 1) | 1) != 0) {}
                            } else if (right - left + 1 - v[2] >= threshold) {
                                if (((v[4] = (v[4] << 1)) | 1) != 0) {}
                            } else {
                                if (((v[4] = -1) | 1) != 0 && ((v[1] = -10) | 1) != 0) {}
                            }
                        }
                        if (((v[1] -= 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 7) | 1) != 0) {}
                    }
                } else if (v[0] == 7) {
                    if (v[4] == -1 || ((int[][])obj[2])[v[4]] == null) {
                        if (((threshold = -1) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                    } else {
                        if (((v[5] = 0) | 1) != 0 && ((v[6] = ((int[][])obj[2])[v[4]].length - 1) | 1) != 0 && ((v[8] = v[6] + 1) | 1) != 0) {
                            while (v[5] <= v[6]) {
                                if (((v[7] = v[5] + (v[6] - v[5]) / 2) | 1) != 0) {
                                    if (((int[][])obj[2])[v[4]][v[7]] >= left) {
                                        if (((v[8] = v[7]) | 1) != 0 && ((v[6] = v[7] - 1) | 1) != 0) {}
                                    } else {
                                        if (((v[5] = v[7] + 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[9] = v[8]) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = ((int[][])obj[2])[v[4]].length - 1) | 1) != 0 && ((v[10] = -1) | 1) != 0) {
                                while (v[5] <= v[6]) {
                                    if (((v[7] = v[5] + (v[6] - v[5]) / 2) | 1) != 0) {
                                        if (((int[][])obj[2])[v[4]][v[7]] <= right) {
                                            if (((v[10] = v[7]) | 1) != 0 && ((v[5] = v[7] + 1) | 1) != 0) {}
                                        } else {
                                            if (((v[6] = v[7] - 1) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (v[10] - v[9] + 1 >= threshold) {
                                    if (((threshold = v[4]) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                                } else {
                                    if (((threshold = -1) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return threshold;
    }
}
