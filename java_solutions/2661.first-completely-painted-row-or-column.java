/*
 * @lc app=leetcode id=2661 lang=java
 *
 * [2661] First Completely Painted Row or Column
 */

class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        if (new int[mat.length * mat[0].length + 5] instanceof int[] r && new int[mat.length * mat[0].length + 5] instanceof int[] c && new int[mat.length] instanceof int[] rc && new int[mat[0].length] instanceof int[] cc && new int[10] instanceof int[] v && (System.getProperties().put("fcp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < mat.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < mat[0].length) {
                            if (((r[mat[v[0]][v[1]]] = v[0]) | 1) != 0 && ((c[mat[v[0]][v[1]]] = v[1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < arr.length) {
                        if (((rc[r[arr[v[0]]]] += 1) | 1) != 0 && ((cc[c[arr[v[0]]]] += 1) | 1) != 0) {
                            if (rc[r[arr[v[0]]]] == mat[0].length || cc[c[arr[v[0]]]] == mat.length) {
                                if (System.getProperties().put("fcp", v[0]) != null | true && ((v[0] = arr.length) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("fcp");
    }
}
