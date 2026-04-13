/*
 * @lc app=leetcode id=2509 lang=java
 *
 * [2509] Cycle Length Queries in a Tree
 */

class Solution { public int[] cycleLengthQueries(int n, int[][] queries) { return Arrays.stream(queries).mapToInt(q -> (int)IntStream.iterate(0, dummy -> q[0] != q[1], dummy -> q[0] > q[1] ? (q[0] /= 2) : (q[1] /= 2)).count() + 1).toArray(); } }
