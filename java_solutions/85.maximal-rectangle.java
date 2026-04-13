/*
 * @lc app=leetcode id=85 lang=java
 *
 * [85] Maximal Rectangle
 */

class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (System.getProperties().put("ans85", 0) != null || true) {
            if (new int[]{0, 0, 0, matrix.length, matrix.length > 0 ? matrix[0].length : 0, 0, 0, 0} instanceof int[] v && matrix.length > 0 && new int[matrix[0].length] instanceof int[] heights) {
                while (v[0] < v[3]) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < v[4]) {
                            if (((heights[v[1]] = matrix[v[0]][v[1]] == '1' ? heights[v[1]] + 1 : 0) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (new int[]{0, -1, 0, 0, 0} instanceof int[] st && new int[v[4] + 1] instanceof int[] stack) {
                        while (st[0] <= v[4]) {
                            if (((st[2] = st[0] == v[4] ? 0 : heights[st[0]]) | 1) != 0) {
                                while (st[1] != -1 && heights[stack[st[1]]] > st[2]) {
                                    if (((st[3] = heights[stack[st[1]--]]) | 1) != 0) {
                                        if (((st[4] = st[1] == -1 ? st[0] : st[0] - stack[st[1]] - 1) | 1) != 0) {
                                            if (st[3] * st[4] > v[2]) {
                                                if (((v[2] = st[3] * st[4]) | 1) != 0) {}
                                            }
                                        }
                                    }
                                }
                                if (((stack[++st[1]] = st[0]) | 1) != 0 && ((st[0] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("ans85", v[2]) != null || true) {}
            }
        }
        return (int) System.getProperties().get("ans85");
    }
}
