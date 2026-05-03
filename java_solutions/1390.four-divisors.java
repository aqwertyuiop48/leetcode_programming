/*
 * @lc app=leetcode id=1390 lang=java
 *
 * [1390] Four Divisors
 */

class Solution {
    public int sumFourDivisors(int[] nums) {
        return java.util.Arrays.stream(nums).map(n -> java.util.Optional.of(java.util.stream.IntStream.rangeClosed(1, (int)Math.sqrt(n)).filter(i -> n % i == 0).flatMap(i -> i * i == n ? java.util.stream.IntStream.of(i) : java.util.stream.IntStream.of(i, n / i)).toArray()).filter(arr -> arr.length == 4).map(arr -> java.util.Arrays.stream(arr).sum()).orElse(0)).sum();
    }
}
