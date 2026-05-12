/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

class Solution {
    public int[][] generateMatrix(int n) {
        return java.util.stream.Stream.of(new Object[][]{{new int[n][n], new int[]{0, n - 1, n - 1, 0, 0, 0, 0}}}).map(arr -> java.util.stream.IntStream.rangeClosed(1, n * n).mapToObj(i -> java.util.stream.Stream.of((int[])arr[1]).map(s -> (((int[][])arr[0])[s[4]][s[5]] = i) > -1 && (s[6] == 0 ? (s[5] == s[1] ? (s[6] = 1) + (s[0]++) + (s[4]++) : s[5]++) : s[6] == 1 ? (s[4] == s[2] ? (s[6] = 2) + (s[1]--) + (s[5]--) : s[4]++) : s[6] == 2 ? (s[5] == s[3] ? (s[6] = 3) + (s[2]--) + (s[4]--) : s[5]--) : (s[4] == s[0] ? (s[6] = 0) + (s[3]++) + (s[5]++) : s[4]--)) > -100).findFirst().get()).toArray().length > -1 ? (int[][])arr[0] : null).findFirst().get();
    }
}
