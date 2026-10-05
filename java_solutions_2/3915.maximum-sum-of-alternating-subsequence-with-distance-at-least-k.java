/*
 * @lc app=leetcode id=3915 lang=java
 *
 * [3915] Maximum Sum of Alternating Subsequence With Distance at Least K
 */

class Solution {
    public long maxAlternatingSum(int[] nums, int k) {
        return Optional.of(Arrays.stream(nums).max().getAsInt()).map(M ->
            Optional.of(new long[][]{new long[M + 2], new long[M + 2], new long[nums.length], new long[nums.length]}).map(t ->
                IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1)
                    .peek(i -> IntStream.of(i + k).filter(j -> j < nums.length)
                        .peek(j -> IntStream.iterate(nums[j] + 1, x -> x <= M + 1, x -> x + (x & -x))
                            .forEach(x -> t[0][x] = Math.max(t[0][x], t[2][j])))
                        .forEach(j -> IntStream.iterate(M - nums[j] + 1, x -> x <= M + 1, x -> x + (x & -x))
                            .forEach(x -> t[1][x] = Math.max(t[1][x], t[3][j]))))
                    .peek(i -> t[3][i] = nums[i] + IntStream.iterate(nums[i], x -> x > 0, x -> x - (x & -x))
                        .mapToLong(x -> t[0][x]).max().orElse(0))
                    .peek(i -> t[2][i] = nums[i] + IntStream.iterate(M - nums[i], x -> x > 0, x -> x - (x & -x))
                        .mapToLong(x -> t[1][x]).max().orElse(0))
                    .mapToLong(i -> Math.max(t[2][i], t[3][i]))
                    .max().orElse(0)).get()).get();
    }
}
