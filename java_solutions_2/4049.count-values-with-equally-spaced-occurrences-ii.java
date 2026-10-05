/*
 * @lc app=leetcode id=4049 lang=java
 *
 * [4049] Count Values With Equally Spaced Occurrences II
 */

class Solution {
public int countSpecialIntegers(int[] nums) {
    return (int) IntStream.range(0, nums.length).boxed()
        .collect(Collectors.groupingBy(i -> nums[i]))
        .values().stream()
        .filter(l -> l.size() >= 3
            && IntStream.range(2, l.size()).allMatch(i -> l.get(i) - l.get(i - 1) == l.get(1) - l.get(0)))
        .count();
}
}
