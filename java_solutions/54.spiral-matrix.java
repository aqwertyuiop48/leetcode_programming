/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

class Solution {
    public java.util.List<Integer> spiralOrder(int[][] matrix) {
        return java.util.stream.Stream.of(new int[]{0, matrix.length - 1, 0, matrix[0].length - 1, 0, 0, 0}).flatMap(s -> java.util.stream.IntStream.range(0, matrix.length * matrix[0].length).mapToObj(i -> java.util.stream.Stream.of(matrix[s[4]][s[5]]).map(v -> (s[6] == 0 ? (s[5] == s[3] ? (s[6] = 1) + (s[0]++) + (s[4]++) : s[5]++) : s[6] == 1 ? (s[4] == s[1] ? (s[6] = 2) + (s[3]--) + (s[5]--) : s[4]++) : s[6] == 2 ? (s[5] == s[2] ? (s[6] = 3) + (s[1]--) + (s[4]--) : s[5]--) : (s[4] == s[0] ? (s[6] = 0) + (s[2]++) + (s[5]++) : s[4]--)) > -100 ? v : v).findFirst().get())).collect(java.util.stream.Collectors.toList());
    }
}
