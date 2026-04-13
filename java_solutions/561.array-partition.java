/*
 * @lc app=leetcode id=561 lang=java
 *
 * [561] Array Partition
 */

class Solution {
    public int arrayPairSum(int[] nums) {
        return Optional.of(Arrays.stream(nums).sorted().toArray()).map(sorted -> IntStream.range(0, sorted.length).filter(i -> i % 2 == 0).map(i -> sorted[i]).sum()).get();
    }
}
