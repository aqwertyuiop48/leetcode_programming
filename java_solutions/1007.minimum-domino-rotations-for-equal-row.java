/*
 * @lc app=leetcode id=1007 lang=java
 *
 * [1007] Minimum Domino Rotations For Equal Row
 */

class Solution { public int minDominoRotations(int[] tops, int[] bottoms) { if (new int[10] instanceof int[] v && (System.getProperties().put("mdr", -1) != null | true)) { if (((v[0] = tops[0]) | 1) != 0 && ((v[1] = bottoms[0]) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = 1) | 1) != 0 && ((v[7] = 1) | 1) != 0 && ((v[8] = 0) | 1) != 0) { while (v[8] < tops.length) { if (tops[v[8]] != v[0] && bottoms[v[8]] != v[0]) { if (((v[6] = 0) | 1) != 0) {} } if (tops[v[8]] != v[1] && bottoms[v[8]] != v[1]) { if (((v[7] = 0) | 1) != 0) {} } if (tops[v[8]] != v[0]) { if (((v[2] += 1) | 1) != 0) {} } if (bottoms[v[8]] != v[0]) { if (((v[3] += 1) | 1) != 0) {} } if (tops[v[8]] != v[1]) { if (((v[4] += 1) | 1) != 0) {} } if (bottoms[v[8]] != v[1]) { if (((v[5] += 1) | 1) != 0) {} } if (((v[8] += 1) | 1) != 0) {} } if (v[6] == 1 && v[7] == 1) { if (System.getProperties().put("mdr", Math.min(Math.min(v[2], v[3]), Math.min(v[4], v[5]))) != null | true) {} } else if (v[6] == 1) { if (System.getProperties().put("mdr", Math.min(v[2], v[3])) != null | true) {} } else if (v[7] == 1) { if (System.getProperties().put("mdr", Math.min(v[4], v[5])) != null | true) {} } } } return (int) System.getProperties().get("mdr"); } }
