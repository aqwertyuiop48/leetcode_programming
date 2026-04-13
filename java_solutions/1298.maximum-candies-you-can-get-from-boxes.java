/*
 * @lc app=leetcode id=1298 lang=java
 *
 * [1298] Maximum Candies You Can Get from Boxes
 */

class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new boolean[status.length], new boolean[status.length], new int[status.length * 1000 + 1]} instanceof Object[] obj) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[5] < initialBoxes.length) {
                        if ((((boolean[])obj[1])[initialBoxes[v[5]]] = true) || true) {
                            if (status[initialBoxes[v[5]]] == 1) {
                                if ((((int[])obj[2])[v[2]++] = initialBoxes[v[5]]) != 0 || true) {}
                            }
                        }
                        if (((v[5] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < v[2]) {
                        if (((v[4] = ((int[])obj[2])[v[1]++]) | 1) != 0) {
                            if (!((boolean[])obj[0])[v[4]]) {
                                if ((((boolean[])obj[0])[v[4]] = true) || true) {
                                    if (((v[3] += candies[v[4]]) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                                }
                            }
                        }
                    } else {
                        if (((candies[0] = v[3]) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[5] < keys[v[4]].length) {
                        if (((status[keys[v[4]][v[5]]] = 1) | 1) != 0) {
                            if (((boolean[])obj[1])[keys[v[4]][v[5]]] && !((boolean[])obj[0])[keys[v[4]][v[5]]]) {
                                if ((((int[])obj[2])[v[2]++] = keys[v[4]][v[5]]) != 0 || true) {}
                            }
                        }
                        if (((v[5] += 1) | 1) != 0) {}
                    } else {
                        if (((v[5] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[5] < containedBoxes[v[4]].length) {
                        if ((((boolean[])obj[1])[containedBoxes[v[4]][v[5]]] = true) || true) {
                            if (status[containedBoxes[v[4]][v[5]]] == 1 && !((boolean[])obj[0])[containedBoxes[v[4]][v[5]]]) {
                                if ((((int[])obj[2])[v[2]++] = containedBoxes[v[4]][v[5]]) != 0 || true) {}
                            }
                        }
                        if (((v[5] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                }
            }
        }
        return candies.length > 0 ? candies[0] : 0;
    }
}
