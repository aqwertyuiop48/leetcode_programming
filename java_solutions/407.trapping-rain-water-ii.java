/*
 * @lc app=leetcode id=407 lang=java
 *
 * [407] Trapping Rain Water II
 */

class Solution {
    public int trapRainWater(int[][] heightMap) {
        if (new int[]{0, heightMap.length, heightMap[0].length, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new PriorityQueue<int[]>((a,b)->a[2]-b[2]), new boolean[heightMap.length][heightMap[0].length], new int[]{0,0,1,-1}, new int[]{1,-1,0,0}} instanceof Object[] obj) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[3] < v[1]) {
                        if ((((PriorityQueue<int[]>)obj[0]).add(new int[]{v[3], 0, heightMap[v[3]][0]}) || true) && ((((boolean[][])obj[1])[v[3]][0] = true) || true)) {
                            if ((((PriorityQueue<int[]>)obj[0]).add(new int[]{v[3], v[2]-1, heightMap[v[3]][v[2]-1]}) || true) && ((((boolean[][])obj[1])[v[3]][v[2]-1] = true) || true)) {
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[4] < v[2]) {
                        if ((((PriorityQueue<int[]>)obj[0]).add(new int[]{0, v[4], heightMap[0][v[4]]}) || true) && ((((boolean[][])obj[1])[0][v[4]] = true) || true)) {
                            if ((((PriorityQueue<int[]>)obj[0]).add(new int[]{v[1]-1, v[4], heightMap[v[1]-1][v[4]]}) || true) && ((((boolean[][])obj[1])[v[1]-1][v[4]] = true) || true)) {
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (!((PriorityQueue<int[]>)obj[0]).isEmpty()) {
                        if (new Object[]{((PriorityQueue<int[]>)obj[0]).poll()} instanceof Object[] curr) {
                            if (((v[5] = Math.max(v[5], ((int[])curr[0])[2])) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                                if (((v[0] = 3) | 1) != 0 && ((v[8] = ((int[])curr[0])[0]) | 1) != 0 && ((v[9] = ((int[])curr[0])[1]) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((heightMap[0][0] = v[6]) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[7] < 4) {
                        if (((v[3] = v[8] + ((int[])obj[2])[v[7]]) | 1) != 0 && ((v[4] = v[9] + ((int[])obj[3])[v[7]]) | 1) != 0) {
                            if (v[3] >= 0 && v[3] < v[1] && v[4] >= 0 && v[4] < v[2] && !((boolean[][])obj[1])[v[3]][v[4]]) {
                                if ((((boolean[][])obj[1])[v[3]][v[4]] = true) || true) {
                                    if (heightMap[v[3]][v[4]] < v[5]) {
                                        if (((v[6] += v[5] - heightMap[v[3]][v[4]]) | 1) != 0) {}
                                    }
                                    if (((PriorityQueue<int[]>)obj[0]).add(new int[]{v[3], v[4], heightMap[v[3]][v[4]]}) || true) {}
                                }
                            }
                        }
                        if (((v[7] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                }
            }
        }
        return heightMap.length > 0 ? heightMap[0][0] : 0;
    }
}
