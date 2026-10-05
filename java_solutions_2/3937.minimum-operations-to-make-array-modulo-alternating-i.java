/*
 * @lc app=leetcode id=3937 lang=java
 *
 * [3937] Minimum Operations to Make Array Modulo Alternating I
 */

class Solution {
public int minOperations(int[] nums, int k) {
    return Stream.<int[][]>of(IntStream.range(0, 2).mapToObj(par -> IntStream.range(0, k).map(x -> IntStream.range(0, nums.length).filter(p -> p % 2 == par).map(p -> Math.min((nums[p] % k - x + k) % k, (x - nums[p] % k + k) % k)).sum()).toArray()).toArray(int[][]::new)).mapToInt(C -> IntStream.range(0, k).flatMap(i -> IntStream.range(0, k).filter(j -> j != i).map(j -> C[0][i] + C[1][j])).min().orElse(Integer.MAX_VALUE)).sum();
}
}
