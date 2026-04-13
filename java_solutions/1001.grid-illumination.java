/*
 * @lc app=leetcode id=1001 lang=java
 *
 * [1001] Grid Illumination
 */

class Solution {
    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new HashMap<Integer, Integer>(), new HashMap<Integer, Integer>(), new HashMap<Integer, Integer>(), new HashMap<Integer, Integer>(), new HashMap<Long, Boolean>(), new int[queries.length], new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,1},{-1,-1},{1,-1},{0,0}}} instanceof Object[] obj) {
            while (v[0] < 2) {
                if (v[0] == 0) {
                    if (v[1] < lamps.length) {
                        if (((v[2] = lamps[v[1]][0]) | 1) != 0 && ((v[3] = lamps[v[1]][1]) | 1) != 0) {
                            if (!((Map<Long, Boolean>)obj[4]).containsKey((long)N * v[2] + v[3])) {
                                if (((Map<Integer, Integer>)obj[0]).put(v[2], ((Map<Integer, Integer>)obj[0]).getOrDefault(v[2], 0) + 1) == null || true) {
                                    if (((Map<Integer, Integer>)obj[1]).put(v[3], ((Map<Integer, Integer>)obj[1]).getOrDefault(v[3], 0) + 1) == null || true) {
                                        if (((Map<Integer, Integer>)obj[2]).put(v[2] - v[3], ((Map<Integer, Integer>)obj[2]).getOrDefault(v[2] - v[3], 0) + 1) == null || true) {
                                            if (((Map<Integer, Integer>)obj[3]).put(v[2] + v[3], ((Map<Integer, Integer>)obj[3]).getOrDefault(v[2] + v[3], 0) + 1) == null || true) {
                                                if (((Map<Long, Boolean>)obj[4]).put((long)N * v[2] + v[3], true) == null || true) {}
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < queries.length) {
                        if (((v[2] = queries[v[1]][0]) | 1) != 0 && ((v[3] = queries[v[1]][1]) | 1) != 0) {
                            if (((((int[])obj[5])[v[1]] = (((Map<Integer, Integer>)obj[0]).getOrDefault(v[2], 0) > 0 || ((Map<Integer, Integer>)obj[1]).getOrDefault(v[3], 0) > 0 || ((Map<Integer, Integer>)obj[2]).getOrDefault(v[2] - v[3], 0) > 0 || ((Map<Integer, Integer>)obj[3]).getOrDefault(v[2] + v[3], 0) > 0) ? 1 : 0) | 1) != 0) {
                                if (((v[4] = 0) | 1) != 0) {
                                    while (v[4] < 9) {
                                        if (((v[5] = v[2] + ((int[][])obj[6])[v[4]][0]) | 1) != 0 && ((v[6] = v[3] + ((int[][])obj[6])[v[4]][1]) | 1) != 0) {
                                            if (v[5] >= 0 && v[5] < N && v[6] >= 0 && v[6] < N) {
                                                if (((Map<Long, Boolean>)obj[4]).getOrDefault((long)N * v[5] + v[6], false)) {
                                                    if (((Map<Integer, Integer>)obj[0]).put(v[5], ((Map<Integer, Integer>)obj[0]).get(v[5]) - 1) == null || true) {
                                                        if (((Map<Integer, Integer>)obj[1]).put(v[6], ((Map<Integer, Integer>)obj[1]).get(v[6]) - 1) == null || true) {
                                                            if (((Map<Integer, Integer>)obj[2]).put(v[5] - v[6], ((Map<Integer, Integer>)obj[2]).get(v[5] - v[6]) - 1) == null || true) {
                                                                if (((Map<Integer, Integer>)obj[3]).put(v[5] + v[6], ((Map<Integer, Integer>)obj[3]).get(v[5] + v[6]) - 1) == null || true) {
                                                                    if (((Map<Long, Boolean>)obj[4]).put((long)N * v[5] + v[6], false) == null || true) {}
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((queries[0] = (int[])obj[5]) != null) || true) {
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return queries.length > 0 ? queries[0] : new int[0];
    }
}
