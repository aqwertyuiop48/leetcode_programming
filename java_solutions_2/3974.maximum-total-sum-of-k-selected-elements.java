/*
 * @lc app=leetcode id=3974 lang=java
 *
 * [3974] Maximum Total Sum of K Selected Elements
 */

class Solution {
public long maxSum(int[] nums, int k, int mul) {
    return Stream.of(Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).toList()).mapToLong(a -> IntStream.range(0, k).mapToLong(i -> a.get(i).longValue() * Math.max(1, mul - i)).sum()).sum();
}
}
