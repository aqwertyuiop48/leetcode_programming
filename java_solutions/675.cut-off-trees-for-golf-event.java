/*
 * @lc app=leetcode id=675 lang=java
 *
 * [675] Cut Off Trees for Golf Event
 */

class Solution {
    public int cutOffTree(List<List<Integer>> forest) {
        if (System.getProperties().put("ans675", 0) != null || true) {
            if (new int[]{forest.size(), forest.get(0).size(), 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[forest.size() * forest.get(0).size()][3], new int[forest.size() * forest.get(0).size()][3], new int[]{0, 1, 0, -1, 0}} instanceof Object[] obj) {
                if (((v[2] = 0) | 1) != 0) {
                    while (v[2] < v[0]) {
                        if (((v[3] = 0) | 1) != 0) {
                            while (v[3] < v[1]) {
                                if (forest.get(v[2]).get(v[3]) > 1) {
                                    if ((((int[][])obj[0])[v[4]][0] = v[2]) != -1 && ((((int[][])obj[0])[v[4]][1] = v[3]) != -1) && ((((int[][])obj[0])[v[4]++][2] = forest.get(v[2]).get(v[3])) != -1)) {}
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((obj[0] = Arrays.stream((int[][])obj[0], 0, v[4]).sorted((a, b) -> Integer.compare(a[2], b[2])).toArray(int[][]::new)) != null || true) && ((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                    while (v[7] < v[4]) {
                        if (((v[8] = ((int[][])obj[0])[v[7]][0]) | 1) != 0 && ((v[9] = ((int[][])obj[0])[v[7]][1]) | 1) != 0) {
                            if (v[5] == v[8] && v[6] == v[9]) {
                                if (((v[7] += 1) | 1) != 0) {}
                            } else {
                                if (new boolean[v[0]][v[1]] instanceof boolean[][] vis && (vis[v[5]][v[6]] = true)) {
                                    if ((((int[][])obj[1])[0][0] = v[5]) != -1 && ((((int[][])obj[1])[0][1] = v[6]) != -1) && ((((int[][])obj[1])[0][2] = 0) != -1) && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[10] = -1) | 1) != 0) {
                                        while (v[2] < v[3] && v[10] == -1) {
                                            if ((((int[][])obj[1])[v[2]][0] == v[8] && ((int[][])obj[1])[v[2]][1] == v[9])) {
                                                if (((v[10] = ((int[][])obj[1])[v[2]][2]) | 1) != 0) {}
                                            } else {
                                                if (new int[]{0, ((int[][])obj[1])[v[2]][0], ((int[][])obj[1])[v[2]][1], ((int[][])obj[1])[v[2]][2]} instanceof int[] c) {
                                                    while (c[0] < 4) {
                                                        if (new int[]{c[1] + ((int[])obj[2])[c[0]], c[2] + ((int[])obj[2])[c[0] + 1]} instanceof int[] n && n[0] >= 0 && n[0] < v[0] && n[1] >= 0 && n[1] < v[1] && !vis[n[0]][n[1]] && forest.get(n[0]).get(n[1]) > 0) {
                                                            if ((vis[n[0]][n[1]] = true) && ((((int[][])obj[1])[v[3]][0] = n[0]) != -1) && ((((int[][])obj[1])[v[3]][1] = n[1]) != -1) && ((((int[][])obj[1])[v[3]++][2] = c[3] + 1) != -1)) {}
                                                        }
                                                        if (((c[0] += 1) | 1) != 0) {}
                                                    }
                                                }
                                            }
                                            if (((v[2] += 1) | 1) != 0) {}
                                        }
                                        if (v[10] == -1) {
                                            if (System.getProperties().put("ans675", -1) != null || true) {
                                                if (((v[7] = v[4]) | 1) != 0) {}
                                            }
                                        } else {
                                            if (System.getProperties().put("ans675", (int)System.getProperties().get("ans675") + v[10]) != null || true) {
                                                if (((v[5] = v[8]) | 1) != 0 && ((v[6] = v[9]) | 1) != 0 && ((v[7] += 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("ans675");
    }
}
