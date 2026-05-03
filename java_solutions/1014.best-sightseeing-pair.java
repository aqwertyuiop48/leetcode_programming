/*
 * @lc app=leetcode id=1014 lang=java
 *
 * [1014] Best Sightseeing Pair
 */

class Solution { public int maxScoreSightseeingPair(int[] values) { if (new int[10] instanceof int[] v && (System.getProperties().put("bsp", 0) != null | true)) { if (((v[0] = values[0]) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) { while (v[2] < values.length) { if (v[0] + values[v[2]] - v[2] > v[1]) { if (((v[1] = v[0] + values[v[2]] - v[2]) | 1) != 0) {} } if (values[v[2]] + v[2] > v[0]) { if (((v[0] = values[v[2]] + v[2]) | 1) != 0) {} } if (((v[2] += 1) | 1) != 0) {} } if (System.getProperties().put("bsp", v[1]) != null | true) {} } } return (int) System.getProperties().get("bsp"); } }
