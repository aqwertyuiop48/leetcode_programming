/*
 * @lc app=leetcode id=2644 lang=java
 *
 * [2644] Find the Maximum Divisibility Score
 */

class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        return Arrays.stream(divisors)
            .distinct()
            .boxed()
            .max(Comparator.<Integer, Long>comparing(d -> Arrays.stream(nums).filter(n -> n % d == 0).count())
                .thenComparing(Comparator.reverseOrder()))
            .orElse(0);
    }
}
