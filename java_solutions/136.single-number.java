/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

class Solution {
    public int singleNumber(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).findFirst().map(Map.Entry::getKey).orElse(0);
    }
}
