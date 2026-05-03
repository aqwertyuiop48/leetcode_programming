/*
 * @lc app=leetcode id=1011 lang=java
 *
 * [1011] Capacity To Ship Packages Within D Days
 */

class Solution { public int shipWithinDays(int[] weights, int days) { if (new int[10] instanceof int[] v && (System.getProperties().put("swd", 0) != null | true)) { if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) { while (v[2] < weights.length) { if (weights[v[2]] > v[0]) { if (((v[0] = weights[v[2]]) | 1) != 0) {} } if (((v[1] += weights[v[2]++]) | 1) != 0) {} } if (((v[3] = 0) | 1) != 0) { while (v[0] <= v[1]) { if (((v[4] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[5] = 1) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) { while (v[7] < weights.length) { if (v[6] + weights[v[7]] > v[4]) { if (((v[5] += 1) | 1) != 0 && ((v[6] = 0) | 1) != 0) {} } if (((v[6] += weights[v[7]++]) | 1) != 0) {} } if (v[5] <= days) { if (((v[3] = v[4]) | 1) != 0 && ((v[1] = v[4] - 1) | 1) != 0) {} } else { if (((v[0] = v[4] + 1) | 1) != 0) {} } } } if (System.getProperties().put("swd", v[3]) != null | true) {} } } } return (int) System.getProperties().get("swd"); } }
