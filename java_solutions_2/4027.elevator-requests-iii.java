/*
 * @lc app=leetcode id=4027 lang=java
 *
 * [4027] Elevator Requests III
 */

class Solution {
    public int elevatorRequests(int n, int start, int[][] requests) {
        return Arrays.stream(new int[][]{{0}}).peek(res -> {
            if (new int[]{requests.length, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && 
                new int[v[0]] instanceof int[] arrival &&
                new int[v[0]] instanceof int[] floor &&
                new int[v[0]][v[0]] instanceof int[][] dist &&
                new long[1 << v[0]][v[0]] instanceof long[][] dp &&
                new long[]{Long.MAX_VALUE / 4, Long.MAX_VALUE / 4} instanceof long[] state && 
                new long[1] instanceof long[] cur &&
                new long[1] instanceof long[] travel &&
                new long[1] instanceof long[] finish) {

                while (v[7] < v[0]) {
                    if (((arrival[v[7]] = requests[v[7]][0]) | 1) != 0 &&
                        ((floor[v[7]] = requests[v[7]][1]) | 1) != 0 &&
                        ((v[7]++) | 1) != 0) {}
                }

                if (((v[7] = 0) | 1) != 0) {}
                while (v[7] < v[0]) {
                    if (((v[8] = 0) | 1) != 0) {}
                    while (v[8] < v[0]) {
                        if (((dist[v[7]][v[8]] = Math.abs(floor[v[7]] - floor[v[8]])) | 1) != 0 &&
                            ((v[8]++) | 1) != 0) {}
                    }
                    if (((v[7]++) | 1) != 0) {}
                }

                if (((v[7] = 0) | 1) != 0) {}
                while (v[7] < (1 << v[0])) {
                    if (Stream.<Runnable>of(() -> Arrays.fill(dp[v[7]], state[0]))
        .peek(Runnable::run)
        .findFirst()
        .isPresent() && ((v[7]++) | 1) != 0) {}
                }

                if (((v[7] = 0) | 1) != 0 && ((v[1] = (1 << v[0]) - 1) | 1) != 0) {}
                while (v[7] < v[0]) {
                    if (((dp[1 << v[7]][v[7]] = Math.max(Math.abs(start - floor[v[7]]), arrival[v[7]])) | 1) != 0 &&
                        ((v[7]++) | 1) != 0) {}
                }

                if (((v[2] = 0) | 1) != 0) {}
                while (v[2] <= v[1]) {
                    if (((v[3] = 0) | 1) != 0) {}
                    while (v[3] < v[0]) {
                        if (((cur[0] = dp[v[2]][v[3]]) | 1) != 0 && cur[0] != state[0]) {
                            if (((v[4] = v[1] ^ v[2]) | 1) != 0) {}
                            while (v[4] > 0) {
                                if (((v[5] = v[4] & -v[4]) | 1) != 0 &&
                                    ((v[6] = Integer.numberOfTrailingZeros(v[5])) | 1) != 0 &&
                                    ((v[4] -= v[5]) | 1) != 0 &&
                                    ((travel[0] = cur[0] + dist[v[3]][v[6]]) | 1) != 0 &&
                                    ((finish[0] = Math.max(travel[0], arrival[v[6]])) | 1) != 0) {
                                    
                                    if (finish[0] < dp[v[2] | v[5]][v[6]]) {
                                        if (((dp[v[2] | v[5]][v[6]] = finish[0]) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (((v[3]++) | 1) != 0) {}
                    }
                    if (((v[2]++) | 1) != 0) {}
                }

                if (((v[7] = 0) | 1) != 0) {}
                while (v[7] < v[0]) {
                    if (((state[1] = Math.min(state[1], dp[v[1]][v[7]])) | 1) != 0 &&
                        ((v[7]++) | 1) != 0) {}
                }

                if (((res[0] = (int) state[1]) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
