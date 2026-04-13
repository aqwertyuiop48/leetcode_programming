/*
 * @lc app=leetcode id=363 lang=java
 *
 * [363] Max Sum of Rectangle No Larger Than K
 */

class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        if (System.getProperties().put("ans363", 0) != null || true) {
            if (new int[]{matrix.length, matrix[0].length, Integer.MIN_VALUE, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[matrix.length], null} instanceof Object[] obj) {
                if (((v[3] = 0) | 1) != 0) {
                    while (v[3] < v[1]) {
                        if (((v[4] = 0) | 1) != 0) {
                            while (v[4] < v[0]) {
                                if (((((int[])obj[0])[v[4]] = 0) | 1) != 0) {
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[4] = v[3]) | 1) != 0) {
                            while (v[4] < v[1]) {
                                if (((v[5] = 0) | 1) != 0) {
                                    while (v[5] < v[0]) {
                                        if (((((int[])obj[0])[v[5]] += matrix[v[5]][v[4]]) | 1) != 0) {
                                            if (((v[5] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((obj[1] = new TreeSet<Integer>()) != null || true) && ((TreeSet<Integer>)obj[1]).add(0)) {
                                    if (((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                                        while (v[5] < v[0]) {
                                            if (((v[6] += ((int[])obj[0])[v[5]]) | 1) != 0) {
                                                if (new Integer[]{((TreeSet<Integer>)obj[1]).ceiling(v[6] - k)} instanceof Integer[] ceil && ceil[0] != null) {
                                                    if (((v[2] = Math.max(v[2], v[6] - ceil[0])) | 1) != 0) {}
                                                }
                                                if (((TreeSet<Integer>)obj[1]).add(v[6]) || true) {
                                                    if (((v[5] += 1) | 1) != 0) {}
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("ans363", v[2]) != null || true) {}
            }
        }
        return (int) System.getProperties().get("ans363");
    }
}
