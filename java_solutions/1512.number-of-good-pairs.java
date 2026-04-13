/*
 * @lc app=leetcode id=1512 lang=java
 *
 * [1512] Number of Good Pairs
 */

import static java.util.stream.Collectors.*;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .collect(groupingBy(n -> n, counting()))
            .values()
            .stream()
            .mapToInt(count -> (int) (count * (count - 1) / 2))
            .sum();
    }
}
