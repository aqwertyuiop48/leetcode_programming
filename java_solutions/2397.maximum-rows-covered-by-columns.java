/*
 * @lc app=leetcode id=2397 lang=java
 *
 * [2397] Maximum Rows Covered by Columns
 */

class Solution {
    public int maximumRows(int[][] matrix, int numSelect) {
        if (new int[matrix.length] instanceof int[] rowMasks && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mr", 0) != null | true) && ((v[0] = matrix.length) | 1) != 0 && ((v[1] = matrix[0].length) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[2] < v[0]) {
                if (((v[3] = 0) | 1) != 0) {
                    while (v[3] < v[1]) { if (matrix[v[2]][v[3]] == 1) { if (((rowMasks[v[2]] |= (1 << v[3])) | 1) != 0) {} } if (((v[3] += 1) | 1) != 0) {} }
                }
                if (((v[2] += 1) | 1) != 0) {}
            }
            if (((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                while (v[4] < (1 << v[1])) {
                    if (Integer.bitCount(v[4]) == numSelect) {
                        if (((v[6] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                            while (v[6] < v[0]) { if ((rowMasks[v[6]] & ~v[4]) == 0) { if (((v[7] += 1) | 1) != 0) {} } if (((v[6] += 1) | 1) != 0) {} }
                            if (v[7] > v[5]) { if (((v[5] = v[7]) | 1) != 0) {} }
                        }
                    }
                    if (((v[4] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mr", v[5]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mr");
    }
}
