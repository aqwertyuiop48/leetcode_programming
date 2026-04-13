/*
 * @lc app=leetcode id=2367 lang=java
 *
 * [2367] Number of Arithmetic Triplets
 */

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        return (int) Arrays.stream(nums)
            .filter(n -> Arrays.stream(nums).anyMatch(j -> j == n + diff) 
                      && Arrays.stream(nums).anyMatch(k -> k == n + 2 * diff))
            .count();
    }
}
