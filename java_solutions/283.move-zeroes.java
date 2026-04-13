/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

class Solution { public void moveZeroes(int[] nums) { System.arraycopy(IntStream.concat( Arrays.stream(nums).filter(i -> i != 0), Arrays.stream(nums).filter(i -> i == 0) ).toArray(), 0, nums, 0, nums.length); } }
