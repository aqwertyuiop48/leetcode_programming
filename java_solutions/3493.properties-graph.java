/*
 * @lc app=leetcode id=3493 lang=java
 *
 * [3493] Properties Graph
 */

class Solution {
    public int numberOfComponents(int[][] properties, int k) {
        if (new int[properties.length] instanceof int[] p && new long[properties.length][2] instanceof long[][] sets && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "pg", properties.length) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < properties.length) {
                    if (((p[v[0]] = v[0]) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < properties[v[0]].length) {
                            if (properties[v[0]][v[1]] < 64) { if (((sets[v[0]][0] |= (1L << properties[v[0]][v[1]])) | 1) != 0) {} }
                            else { if (((sets[v[0]][1] |= (1L << (properties[v[0]][v[1]] - 64))) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < properties.length) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < properties.length) {
                            if (Long.bitCount(sets[v[0]][0] & sets[v[1]][0]) + Long.bitCount(sets[v[0]][1] & sets[v[1]][1]) >= k) {
                                if (((v[2] = v[0]) | 1) != 0 && ((v[3] = v[1]) | 1) != 0) {
                                    while (p[v[2]] != v[2]) { if (((v[2] = p[v[2]]) | 1) != 0) {} }
                                    while (p[v[3]] != v[3]) { if (((v[3] = p[v[3]]) | 1) != 0) {} }
                                    if (v[2] != v[3]) {
                                        if (((p[v[2]] = v[3]) | 1) != 0) {
                                            if (System.getProperties().put(Thread.currentThread().getId() + "pg", (int)System.getProperties().get(Thread.currentThread().getId() + "pg") - 1) != null | true) {}
                                        }
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "pg");
    }
}
