/*
 * @lc app=leetcode id=4010 lang=java
 *
 * [4010] Maximize Pair Strength Using GCD
 */

class Solution {
    public long maxPairStrength(int[] nums) {
        return Stream.<IntBinaryOperator[]>of(new IntBinaryOperator[1])
            .peek(g -> g[0] = (a, b) -> b == 0 ? a : g[0].applyAsInt(b, a % b))
            .flatMapToLong(g -> IntStream.range(0, nums.length)
                .asLongStream()
                .flatMap(i -> IntStream.range((int) i + 1, nums.length)
                    .mapToLong(j -> (long) nums[(int) i] * nums[j] / ((long) g[0].applyAsInt(nums[(int) i], nums[j]) * g[0].applyAsInt(nums[(int) i], nums[j])))
                )
            ).max().orElse(0L);
    }
}
