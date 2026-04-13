/*
 * @lc app=leetcode id=149 lang=java
 *
 * [149] Max Points on a Line
 */

class Solution {
    public int maxPoints(int[][] points) {
        if (System.getProperties().put("ans149", 1) != null || true) {
            if (new int[]{0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new HashMap<String, Integer>()} instanceof Object[] obj) {
                while (v[0] < points.length) {
                    if (((obj[0] = new HashMap<String, Integer>()) != null || true) && ((v[1] = v[0] + 1) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                        while (v[1] < points.length) {
                            if (((v[2] = points[v[1]][0] - points[v[0]][0]) | 1) != 0 && ((v[3] = points[v[1]][1] - points[v[0]][1]) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                if (((v[6] = v[2]) | 1) != 0 && ((v[4] = v[3]) | 1) != 0) {
                                    while (v[4] != 0) {
                                        if (((v[6] = v[6] % v[4]) | 1) != 0 && ((v[6] ^= v[4] ^ (v[4] = v[6])) | 1) != 0) {}
                                    }
                                }
                                if (((v[2] /= v[6]) | 1) != 0 && ((v[3] /= v[6]) | 1) != 0) {
                                    if (((HashMap<String, Integer>)obj[0]).put(v[2] + "," + v[3], ((HashMap<String, Integer>)obj[0]).getOrDefault(v[2] + "," + v[3], 0) + 1) == null || true) {
                                        if (((v[5] = Math.max(v[5], ((HashMap<String, Integer>)obj[0]).get(v[2] + "," + v[3]))) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put("ans149", Math.max((int)System.getProperties().get("ans149"), v[5] + 1)) != null || true) {
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return points.length == 0 ? 0 : (int) System.getProperties().get("ans149");
    }
}
