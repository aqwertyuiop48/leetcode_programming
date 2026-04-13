/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

class Solution {
    public int majorityElement(int[] nums) {
        return Arrays.stream(nums).boxed() .collect(Collectors.groupingBy(i -> i, Collectors.counting())) .entrySet().stream() .filter(e -> e.getValue() > nums.length / 2) .map(Map.Entry::getKey) .findFirst() .orElse(0);
    }
}
