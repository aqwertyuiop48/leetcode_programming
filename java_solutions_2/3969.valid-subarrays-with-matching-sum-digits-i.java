/*
 * @lc app=leetcode id=3969 lang=java
 *
 * [3969] Valid Subarrays With Matching Sum Digits I
 */

class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        return (int) IntStream.range(0, nums.length).boxed()
            .flatMapToLong(i -> Stream.of(new long[1])
                .flatMapToLong(acc -> Arrays.stream(nums, i, nums.length)
                    .mapToLong(v -> acc[0] += v)))
            .filter(s -> (Math.abs(s) % 10 == x) && (Long.toString(Math.abs(s)).charAt(0) - '0' == x))
            .count();
    }
}
