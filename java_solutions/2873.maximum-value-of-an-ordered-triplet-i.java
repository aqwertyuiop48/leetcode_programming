/*
 * @lc app=leetcode id=2873 lang=java
 *
 * [2873] Maximum Value of an Ordered Triplet I
 */

class Solution { public long maximumTripletValue(int[] nums) { if (new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("mvt", 0L) != null | true)) { if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) { while (v[0] < nums.length) { if (((lv[0] = Math.max(lv[0], (long)v[2] * nums[v[0]])) | 1) != 0 && ((v[2] = Math.max(v[2], v[1] - nums[v[0]])) | 1) != 0 && ((v[1] = Math.max(v[1], nums[v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} } if (System.getProperties().put("mvt", lv[0]) != null | true) {} } } return (long) System.getProperties().get("mvt"); } }
