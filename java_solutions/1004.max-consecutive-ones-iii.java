/*
 * @lc app=leetcode id=1004 lang=java
 *
 * [1004] Max Consecutive Ones III
 */

class Solution { public int longestOnes(int[] nums, int k) { if (new int[10] instanceof int[] v && (System.getProperties().put("mco", 0) != null | true)) { if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) { while (v[1] < nums.length) { if (nums[v[1]] == 0) { if (((v[2] += 1) | 1) != 0) {} } while (v[2] > k) { if (nums[v[0]++] == 0) { if (((v[2] -= 1) | 1) != 0) {} } } if (v[1] - v[0] + 1 > (int)System.getProperties().get("mco")) { if (System.getProperties().put("mco", v[1] - v[0] + 1) != null | true) {} } if (((v[1] += 1) | 1) != 0) {} } } } return (int) System.getProperties().get("mco"); } }
