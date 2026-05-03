/*
 * @lc app=leetcode id=3143 lang=java
 *
 * [3143] Maximum Points Inside the Square
 */

class Solution {
    public int maxPointsInsideSquare(int[][] points, String s) {
        if (new int[26] instanceof int[] minD && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mpi", 0) != null | true)) {
            // Fixed line below: Set initial second minimum to Integer.MAX_VALUE (2147483647)
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 2147483647) | 1) != 0) {
                // Fixed line below: Fill array with Integer.MAX_VALUE (2147483647)
                while (v[0] < 26) { if (((minD[v[0]++] = 2147483647) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < points.length) {
                        if (((v[2] = Math.max(Math.abs(points[v[0]][0]), Math.abs(points[v[0]][1]))) | 1) != 0 && ((v[3] = s.charAt(v[0]) - 'a') | 1) != 0) {
                            if (v[2] < minD[v[3]]) {
                                if (minD[v[3]] < v[1]) { if (((v[1] = minD[v[3]]) | 1) != 0) {} }
                                if (((minD[v[3]] = v[2]) | 1) != 0) {}
                            } else if (v[2] < v[1]) {
                                if (((v[1] = v[2]) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[0] < 26) {
                            if (minD[v[0]] < v[1]) { if (((v[4] += 1) | 1) != 0) {} }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "mpi", v[4]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mpi");
    }
}
