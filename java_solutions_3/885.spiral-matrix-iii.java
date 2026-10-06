/*
 * @lc app=leetcode id=885 lang=java
 *
 * [885] Spiral Matrix III
 */

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        return java.util.stream.Stream.iterate(new int[]{rStart, cStart, 0, 1, 1},
                st -> new int[]{st[0] + new int[]{0, 1, 0, -1}[st[2]], st[1] + new int[]{1, 0, -1, 0}[st[2]],
                    st[4] == 1 ? (st[2] + 1) % 4 : st[2], st[4] == 1 ? st[3] + ((st[2] + 1) % 4 % 2 == 0 ? 1 : 0) : st[3],
                    st[4] == 1 ? st[3] + ((st[2] + 1) % 4 % 2 == 0 ? 1 : 0) : st[4] - 1})
            .filter(p -> p[0] >= 0 && p[1] >= 0 && p[0] < rows && p[1] < cols).limit(rows * cols).map(p -> new int[]{p[0], p[1]}).toArray(int[][]::new);
    }
}
