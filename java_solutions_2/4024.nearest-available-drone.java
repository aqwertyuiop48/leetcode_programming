/*
 * @lc app=leetcode id=4024 lang=java
 *
 * [4024] Nearest Available Drone
 */

class Solution {
    public int nearestDrone(int[][] drones, int[] t) {
        return java.util.Arrays.stream(new int[][]{{0}}).peek(res -> {
            if (new int[]{Integer.MAX_VALUE, -1, 0, 0} instanceof int[] v) { // v[0]: min, v[1]: idx, v[2]: i, v[3]: dist

                while (v[2] < drones.length) {
                    if (drones[v[2]] instanceof int[] d) {
                        if (((v[3] = Math.abs(t[0] - d[0]) + Math.abs(t[1] - d[1])) | 1) != 0) {
                            if (v[3] <= d[2] && v[0] > v[3]) {
                                if (((v[0] = v[3]) | 1) != 0 && ((v[1] = v[2]) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[2]++) | 1) != 0) {}
                }

                if (((res[0] = v[1]) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
