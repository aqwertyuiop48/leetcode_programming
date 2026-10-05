/*
 * @lc app=leetcode id=4038 lang=java
 *
 * [4038] Count Integers Appearing in a Single Block
 */

class Solution {
public int countSpecialIntegers(int[] nums) {
    return (int) IntStream.range(0, nums.length)
        .filter(i -> i == 0 || nums[i] != nums[i - 1])
        .map(i -> nums[i]).boxed()
        .collect(Collectors.groupingBy(v -> v, Collectors.counting()))
        .entrySet().stream()
        .filter(e -> e.getKey() >= 1 && e.getValue() == 1)
        .count();
}
}
