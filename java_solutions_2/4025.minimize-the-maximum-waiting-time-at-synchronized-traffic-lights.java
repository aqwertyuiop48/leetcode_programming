/*
 * @lc app=leetcode id=4025 lang=java
 *
 * [4025] Minimize the Maximum Waiting Time at Synchronized Traffic Lights
 */

class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        return java.util.Arrays.stream(new int[][]{{0}}).peek(res -> {
            if (new int[]{0, 0, 0, 0, 0} instanceof int[] v) { // v[0]: max, v[1]: wait, v[2]: iteration idx, v[3]: t, v[4]: r

                while (v[2] < lights.length) {
                    if (((v[0] = Math.max(lights[v[2]], v[0])) | 1) != 0 && ((v[2]++) | 1) != 0) {}
                }

                if (((v[2] = 0) | 1) != 0) {}
                while (v[2] < arrivalTime.length) {
                    if (((v[3] = arrivalTime[v[2]]) | 1) != 0 && ((v[4] = v[3] % period) | 1) != 0) {
                        if (v[4] >= v[0]) {
                            if (((v[1] = Math.max(v[1], period - v[4])) | 1) != 0) {}
                        }
                    }
                    if (((v[2]++) | 1) != 0) {}
                }

                if (((res[0] = v[1]) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
