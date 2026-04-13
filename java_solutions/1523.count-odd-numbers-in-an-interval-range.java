/*
 * @lc app=leetcode id=1523 lang=java
 *
 * [1523] Count Odd Numbers in an Interval Range
 */

class Solution {
     public int countOdds(int low, int high) {
		return (low%2!=0 && high%2!=0) ? (high-low+1)/2 + 1 : (high-low+1)/2;
    }
}
