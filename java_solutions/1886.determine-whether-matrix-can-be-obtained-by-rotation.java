/*
 * @lc app=leetcode id=1886 lang=java
 *
 * [1886] Determine Whether Matrix Can Be Obtained By Rotation
 */

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        return IntStream.of(0, 1, 2, 3).anyMatch(rotation -> 
            IntStream.range(0, mat.length).allMatch(r -> 
                IntStream.range(0, mat.length).allMatch(c -> 
                    (rotation == 0 && mat[r][c] == target[r][c]) ||
                    (rotation == 1 && mat[mat.length - 1 - c][r] == target[r][c]) ||
                    (rotation == 2 && mat[mat.length - 1 - r][mat.length - 1 - c] == target[r][c]) ||
                    (rotation == 3 && mat[c][mat.length - 1 - r] == target[r][c])
                )
            )
        );
    }
}
