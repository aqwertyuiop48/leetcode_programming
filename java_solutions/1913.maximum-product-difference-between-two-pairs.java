/*
 * @lc app=leetcode id=1913 lang=java
 *
 * [1913] Maximum Product Difference Between Two Pairs
 */

class Solution {
    public int maxProductDifference(int[] nums) {
        return Arrays.stream(nums)
            .sorted()
            .boxed()
            .collect(Collectors.collectingAndThen(
                Collectors.toList(), 
                list -> (list.get(list.size() - 1) * list.get(list.size() - 2)) - (list.get(0) * list.get(1))
            ));
    }
}
