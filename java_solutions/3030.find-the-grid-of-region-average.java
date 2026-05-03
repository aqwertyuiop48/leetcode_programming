/*
 * @lc app=leetcode id=3030 lang=java
 *
 * [3030] Find the Grid of Region Average
 */

class Solution {
    public int[][] resultGrid(int[][] image, int threshold) {
        if (new int[image.length][image[0].length] instanceof int[][] sum && new int[image.length][image[0].length] instanceof int[][] count && new int[image.length][image[0].length] instanceof int[][] res && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rg", res) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= image.length - 3) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= image[0].length - 3) {
                            if (((v[2] = 1) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {
                                while (v[3] < v[0] + 3 && v[2] == 1) {
                                    if (((v[4] = v[1]) | 1) != 0) {
                                        while (v[4] < v[1] + 2 && v[2] == 1) {
                                            if (Math.abs(image[v[3]][v[4]] - image[v[3]][v[4]+1]) > threshold) { if (((v[2] = 0) | 1) != 0) {} }
                                            if (((v[4] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                                if (((v[4] = v[1]) | 1) != 0) {
                                    while (v[4] < v[1] + 3 && v[2] == 1) {
                                        if (((v[3] = v[0]) | 1) != 0) {
                                            while (v[3] < v[0] + 2 && v[2] == 1) {
                                                if (Math.abs(image[v[3]][v[4]] - image[v[3]+1][v[4]]) > threshold) { if (((v[2] = 0) | 1) != 0) {} }
                                                if (((v[3] += 1) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                                if (v[2] == 1 && ((v[5] = 0) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {
                                    while (v[3] < v[0] + 3) {
                                        if (((v[4] = v[1]) | 1) != 0) {
                                            while (v[4] < v[1] + 3) { if (((v[5] += image[v[3]][v[4]]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {} }
                                        }
                                        if (((v[3] += 1) | 1) != 0) {}
                                    }
                                    if (((v[6] = v[5] / 9) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {
                                        while (v[3] < v[0] + 3) {
                                            if (((v[4] = v[1]) | 1) != 0) {
                                                while (v[4] < v[1] + 3) {
                                                    if (((sum[v[3]][v[4]] += v[6]) | 1) != 0 && ((count[v[3]][v[4]] += 1) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                                                }
                                            }
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < image.length) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < image[0].length) {
                                if (count[v[0]][v[1]] > 0) { if (((res[v[0]][v[1]] = sum[v[0]][v[1]] / count[v[0]][v[1]]) | 1) != 0) {} }
                                else { if (((res[v[0]][v[1]] = image[v[0]][v[1]]) | 1) != 0) {} }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[][]) System.getProperties().get(Thread.currentThread().getId() + "rg");
    }
}
