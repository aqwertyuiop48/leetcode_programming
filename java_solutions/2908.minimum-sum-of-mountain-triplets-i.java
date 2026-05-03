/*
 * @lc app=leetcode id=2908 lang=java
 *
 * [2908] Minimum Sum of Mountain Triplets I
 */

class Solution { public int minimumSum(int[] nums) { if (new int[nums.length] instanceof int[] r && new int[10] instanceof int[] v && (System.getProperties().put("msm", 999999999) != null | true)) { if (((v[0] = nums.length - 1) | 1) != 0 && ((v[1] = 999999999) | 1) != 0) { while (v[0] >= 0) { if (nums[v[0]] < v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} } if (((r[v[0]] = v[1]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {} } } if (((v[0] = 0) | 1) != 0 && ((v[1] = 999999999) | 1) != 0) { while (v[0] < nums.length) { if (nums[v[0]] < v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} } if (v[0] > 0 && v[0] < nums.length - 1 && v[1] < nums[v[0]] && r[v[0] + 1] < nums[v[0]]) { if (v[1] + nums[v[0]] + r[v[0] + 1] < (int)System.getProperties().get("msm")) { if (System.getProperties().put("msm", v[1] + nums[v[0]] + r[v[0] + 1]) != null | true) {} } } if (((v[0] += 1) | 1) != 0) {} } } } return (int) System.getProperties().get("msm") == 999999999 ? -1 : (int) System.getProperties().get("msm"); } }
