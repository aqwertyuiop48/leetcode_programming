/*
 * @lc app=leetcode id=2521 lang=java
 *
 * [2521] Distinct Prime Factors of Product of Array
 */

class Solution {
    public int distinctPrimeFactors(int[] nums) {
        return (int) Arrays.stream(nums)
            .mapToObj(n -> IntStream.rangeClosed(2, n).filter(i -> n % i == 0 && IntStream.rangeClosed(2, (int)Math.sqrt(i)).allMatch(j -> i % j != 0)))
            .flatMapToInt(s -> s)
            .distinct()
            .count();
    }
}
