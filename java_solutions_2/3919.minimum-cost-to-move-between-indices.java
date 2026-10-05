/*
 * @lc app=leetcode id=3919 lang=java
 *
 * [3919] Minimum Cost to Move Between Indices
 */

class Solution {
public int[] minCost(int[] A, int[][] queries) {
    return Stream.<long[][]>of(new long[2][A.length]).peek(V -> IntStream.range(0, A.length - 1).forEach(i -> V[0][i + 1] = V[0][i] + (i == 0 || A[i] - A[i - 1] > A[i + 1] - A[i] ? 1 : A[i + 1] - A[i]))).peek(V -> IntStream.range(1, A.length).forEach(i -> V[1][i] = V[1][i - 1] + (i == A.length - 1 || A[i] - A[i - 1] <= A[i + 1] - A[i] ? 1 : A[i] - A[i - 1]))).flatMapToInt(V -> Arrays.stream(queries).mapToInt(q -> (int) (q[0] < q[1] ? V[0][q[1]] - V[0][q[0]] : V[1][q[0]] - V[1][q[1]]))).toArray();
}
}
