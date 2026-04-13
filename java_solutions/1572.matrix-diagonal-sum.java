/*
 * @lc app=leetcode id=1572 lang=java
 *
 * [1572] Matrix Diagonal Sum
 */

class Solution {
        public static int diagonalSum(int[][] mat) {
            return IntStream.range(0, mat.length)
                    .mapToObj(i -> mat[i][i] + (i != mat.length - 1 - i ? mat[i][mat.length - 1 - i] : 0))
                    .collect(Collectors.toCollection(Stack::new)).stream().mapToInt(Integer::intValue).sum();
        }
    }
