/*
 * @lc app=leetcode id=1464 lang=java
 *
 * [1464] Maximum Product of Two Elements in an Array
 */

class Solution {
    public int maxProduct(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .limit(2)
            .reduce((a, b) -> (a - 1) * (b - 1))
            .get();
    }
}
