/*
 * @lc app=leetcode id=2855 lang=java
 *
 * [2855] Minimum Right Shifts to Sort the Array
 */

class Solution { public int minimumRightShifts(java.util.List<Integer> nums) { return new Object[]{java.util.stream.IntStream.range(0, nums.size() - 1).filter(i -> nums.get(i) > nums.get(i + 1)).toArray()} instanceof Object[] o && o[0] instanceof int[] a ? (a.length == 0 ? 0 : (a.length == 1 && nums.get(nums.size() - 1) <= nums.get(0) ? nums.size() - 1 - a[0] : -1)) : -1; } }
