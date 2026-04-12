/*
 * @lc app=leetcode id=84 lang=java
 *
 * [84] Largest Rectangle in Histogram
 */

class Solution {
    public int largestRectangleArea(int[] heights) {
        if (System.getProperties().put("ans84", 0) != null || true) {
            if (new int[]{0, 0, -1, heights.length, 0, 0, 0} instanceof int[] v && new int[heights.length + 1] instanceof int[] stack) {
                while (v[0] <= v[3]) {
                    if (((v[4] = v[0] == v[3] ? 0 : heights[v[0]]) | 1) != 0) {
                        while (v[2] != -1 && heights[stack[v[2]]] > v[4]) {
                            if (((v[5] = heights[stack[v[2]--]]) | 1) != 0) {
                                if (((v[6] = v[2] == -1 ? v[0] : v[0] - stack[v[2]] - 1) | 1) != 0) {
                                    if (v[5] * v[6] > v[1]) {
                                        if (((v[1] = v[5] * v[6]) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (((stack[++v[2]] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("ans84", v[1]) != null || true) {}
            }
        }
        return (int) System.getProperties().get("ans84");
    }
}
