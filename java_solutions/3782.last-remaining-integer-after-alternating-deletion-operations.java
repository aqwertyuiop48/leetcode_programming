/*
 * @lc app=leetcode id=3782 lang=java
 *
 * [3782] Last Remaining Integer After Alternating Deletion Operations
 */

class Solution {
    public long lastInteger(long n) {
        return 1 + (0xAAAAAAAAAAAAAAAAL & (n - 1)); 
    }
}
