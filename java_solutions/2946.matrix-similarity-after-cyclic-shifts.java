/*
 * @lc app=leetcode id=2946 lang=java
 *
 * [2946] Matrix Similarity After Cyclic Shifts
 */

class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "as", true) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = k % mat[0].length) | 1) != 0) {
            while (v[0] < mat.length) {
                if (((v[2] = 0) | 1) != 0) {
                    while (v[2] < mat[0].length) {
                        if (mat[v[0]][v[2]] != mat[v[0]][(v[2] + v[1]) % mat[0].length]) {
                            if (System.getProperties().put(Thread.currentThread().getId() + "as", false) != null | true) {}
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "as");
    }
}
