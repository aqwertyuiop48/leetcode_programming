/*
 * @lc app=leetcode id=1262 lang=java
 *
 * [1262] Greatest Sum Divisible by Three
 */

class Solution {
    public int maxSumDivThree(int[] nums) {
        return java.util.Optional.of(new int[]{0, Integer.MIN_VALUE, Integer.MIN_VALUE})
            .filter(dp -> java.util.Arrays.stream(nums).allMatch(n -> 
                java.util.Arrays.stream(dp.clone()).allMatch(v -> 
                    v < 0 || (dp[(v + n) % 3] = Math.max(dp[(v + n) % 3], v + n)) != Integer.MIN_VALUE
                )
            ))
            .map(ans -> ans[0])
            .orElse(0);
    }
}
