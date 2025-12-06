/*
 * @lc app=leetcode id=41 lang=java
 *
 * [41] First Missing Positive
 */

// @lc code=start
// semicolons : 1
public class Solution {
    public int firstMissingPositive(int[] A) {return Stream.iterate(0, i -> i < A.length, i -> A[i] == i+1 || A[i] <= 0 || A[i] > A.length || A[A[i]-1] == A[i] ? i+1 : IntStream.of(A[i]).peek(x -> IntStream.of(A[A[i]-1]).peek(temp -> A[i] = temp).forEach(temp -> A[x-1] = x)).map(x -> i).findFirst().orElse(i+1)).reduce((a,b) -> b).map(x -> IntStream.range(0, A.length).filter(i -> A[i] != i+1).findFirst().orElse(A.length) + 1).orElse(1);}
}
// @lc code=end

