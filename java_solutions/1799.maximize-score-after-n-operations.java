/*
 * @lc app=leetcode id=1799 lang=java
 *
 * [1799] Maximize Score After N Operations
 */

class Solution {
    public int maxScore(int[] nums) {
        return ((Function<int[], Integer>) dp -> 
            IntStream.range(0, 1 << nums.length).filter(i -> Integer.bitCount(i) % 2 == 0).reduce(0, (acc, i) -> 
                IntStream.range(0, nums.length).filter(j -> (i & (1 << j)) != 0).reduce(0, (a1, j) -> 
                    IntStream.range(j + 1, nums.length).filter(k -> (i & (1 << k)) != 0).reduce(0, (a2, k) -> 
                        (dp[i] = Math.max(dp[i], dp[i ^ (1 << j) ^ (1 << k)] + java.math.BigInteger.valueOf(nums[j]).gcd(java.math.BigInteger.valueOf(nums[k])).intValue() * (Integer.bitCount(i) / 2))) * 0
                    ) * 0
                ) * 0
            ) * 0 == 0 ? dp[(1 << nums.length) - 1] : 0
        ).apply(new int[1 << nums.length]);
    }
}
