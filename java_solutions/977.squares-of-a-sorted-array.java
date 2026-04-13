/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

class Solution {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).boxed().map(i->i*i).sorted().mapToInt(Integer::intValue).toArray();
    }
}
