/*
 * @lc app=leetcode id=4044 lang=java
 *
 * [4044] Count Good Cyclic Rotations
 */

class Solution {
public int countGoodRotations(int[] nums) {
    return Stream.of(LongStream.concat(LongStream.of(0), Arrays.stream(nums).asLongStream()).toArray())
        .peek(q -> Arrays.parallelPrefix(q, Long::sum))
        .mapToInt(q -> (int) IntStream.range(nums.length / 2, nums.length)
            .filter(i -> 2 * (q[i] - q[i - nums.length / 2]) != q[nums.length])
            .count())
        .findFirst().getAsInt();
}
}
