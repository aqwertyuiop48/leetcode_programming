/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */

class Solution{public boolean search(int[] nums,int target){return IntStream.of(nums).anyMatch(x->x==target);}}
