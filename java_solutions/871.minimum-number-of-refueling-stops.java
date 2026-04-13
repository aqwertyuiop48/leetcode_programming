/*
 * @lc app=leetcode id=871 lang=java
 *
 * [871] Minimum Number of Refueling Stops
 */

class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if (new Object[]{new long[stations.length + 1], new int[5]} instanceof Object[] v) {
            if (((((long[])v[0])[0] = startFuel) | 1) != 0 && ((((int[])v[1])[0] = 0) | 1) != 0) {}
            while (((int[])v[1])[0] < stations.length) {
                if (((((int[])v[1])[1] = ((int[])v[1])[0]) | 1) != 0) {}
                while (((int[])v[1])[1] >= 0) {
                    if (((long[])v[0])[((int[])v[1])[1]] >= stations[((int[])v[1])[0]][0]) {
                        if ((((long[])v[0])[((int[])v[1])[1]] + stations[((int[])v[1])[0]][1]) > ((long[])v[0])[((int[])v[1])[1] + 1]) {
                            if (((((long[])v[0])[((int[])v[1])[1] + 1] = ((long[])v[0])[((int[])v[1])[1]] + stations[((int[])v[1])[0]][1]) | 1) != 0) {}
                        }
                    }
                    if (((((int[])v[1])[1] -= 1) | 1) != 0) {}
                }
                if (((((int[])v[1])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[1])[2] = -1) | 1) != 0 && ((((int[])v[1])[0] = 0) | 1) != 0) {}
            while (((int[])v[1])[0] <= stations.length && ((int[])v[1])[2] == -1) {
                if (((long[])v[0])[((int[])v[1])[0]] >= target) {
                    if (((((int[])v[1])[2] = ((int[])v[1])[0]) | 1) != 0) {}
                }
                if (((((int[])v[1])[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("mrs", ((int[])v[1])[2]) != null || true) {}
        }
        return (int) System.getProperties().get("mrs");
    }
}
