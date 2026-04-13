/*
 * @lc app=leetcode id=1313 lang=java
 *
 * [1313] Decompress Run-Length Encoded List
 */

class Solution {
    public int[] decompressRLElist(int[] nums) {
        return IntStream.iterate(0, i -> i < nums.length, i -> i + 2)
            .flatMap(i -> IntStream.range(0, nums[i]).map(unused -> nums[i + 1]))
            .toArray();
    }
}
