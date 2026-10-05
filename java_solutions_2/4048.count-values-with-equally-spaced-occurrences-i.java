/*
 * @lc app=leetcode id=4048 lang=java
 *
 * [4048] Count Values With Equally Spaced Occurrences I
 */

class Solution {
public int countSpecialIntegers(int[] nums) {
    return (int) IntStream.range(0, nums.length).boxed()
        .collect(Collectors.groupingBy(i -> nums[i]))
        .values().stream()
        .filter(l -> l.size() == 3 && l.get(1) - l.get(0) == l.get(2) - l.get(1))
        .count();
}
}
