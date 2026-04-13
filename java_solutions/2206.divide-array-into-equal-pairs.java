/*
 * @lc app=leetcode id=2206 lang=java
 *
 * [2206] Divide Array Into Equal Pairs
 */

import java.util.stream.Collectors;

class Solution {
    public boolean divideArray(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
            .values()
            .stream()
            .allMatch(count -> count % 2 == 0);
    }
}
