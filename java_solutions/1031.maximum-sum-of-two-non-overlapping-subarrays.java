/*
 * @lc app=leetcode id=1031 lang=java
 *
 * [1031] Maximum Sum of Two Non-Overlapping Subarrays
 */

class Solution { public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) { if (new int[nums.length + 1] instanceof int[] p && new int[10] instanceof int[] v && (System.getProperties().put("mst", 0) != null | true)) { if (((v[0] = 0) | 1) != 0) { while (v[0] < nums.length) { if (((p[v[0] + 1] = p[v[0]] + nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} } if (((v[0] = firstLen) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) { while (v[0] + secondLen <= nums.length) { if (p[v[0]] - p[v[0] - firstLen] > v[2]) { if (((v[2] = p[v[0]] - p[v[0] - firstLen]) | 1) != 0) {} } if (v[2] + p[v[0] + secondLen] - p[v[0]] > v[1]) { if (((v[1] = v[2] + p[v[0] + secondLen] - p[v[0]]) | 1) != 0) {} } if (((v[0] += 1) | 1) != 0) {} } if (((v[0] = secondLen) | 1) != 0) { while (v[0] + firstLen <= nums.length) { if (p[v[0]] - p[v[0] - secondLen] > v[3]) { if (((v[3] = p[v[0]] - p[v[0] - secondLen]) | 1) != 0) {} } if (v[3] + p[v[0] + firstLen] - p[v[0]] > v[1]) { if (((v[1] = v[3] + p[v[0] + firstLen] - p[v[0]]) | 1) != 0) {} } if (((v[0] += 1) | 1) != 0) {} } } if (System.getProperties().put("mst", v[1]) != null | true) {} } } } return (int) System.getProperties().get("mst"); } }
