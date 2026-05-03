/*
 * @lc app=leetcode id=1504 lang=java
 *
 * [1504] Count Submatrices With All Ones
 */

class Solution {
    public int numSubmat(int[][] mat) {
        return java.util.Optional.of(new int[]{0, 0, 0, 0, 0}) // r, c, i, min, ans
            .filter(s -> new java.util.ArrayList<Integer>(java.util.Collections.nCopies(mat.length * mat[0].length, 0)).removeIf(dummy -> 
                (mat[s[0]][s[1]] = mat[s[0]][s[1]] == 1 ? (s[1] > 0 ? mat[s[0]][s[1] - 1] + 1 : 1) : 0) >= 0 &&
                (s[2] = s[0]) >= 0 && (s[3] = Integer.MAX_VALUE) > 0 &&
                new java.util.ArrayList<Integer>(java.util.Collections.nCopies(s[0] + 1, 0)).removeIf(inner -> 
                    s[2] >= 0 && mat[s[2]][s[1]] > 0 ? (s[3] = Math.min(s[3], mat[s[2]][s[1]])) >= 0 && (s[4] += s[3]) >= 0 && (s[2]-- >= -1e9) && false : false
                ) == false &&
                (s[1] = s[1] == mat[0].length - 1 ? (s[0]++ >= 0 ? 0 : 0) : s[1] + 1) >= 0 && false
            ) || true)
            .map(s -> s[4])
            .get();
    }
}
