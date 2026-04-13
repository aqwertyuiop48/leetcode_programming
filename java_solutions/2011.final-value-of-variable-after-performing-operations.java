/*
 * @lc app=leetcode id=2011 lang=java
 *
 * [2011] Final Value of Variable After Performing Operations
 */

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        return Arrays.stream(operations)
            .mapToInt(o -> 44 - o.charAt(1))
            .sum();
    }
}
