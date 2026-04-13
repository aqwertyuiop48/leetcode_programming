/*
 * @lc app=leetcode id=1601 lang=java
 *
 * [1601] Maximum Number of Achievable Transfer Requests
 */

class Solution {
    public int maximumRequests(int n, int[][] requests) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{0, 0, 0, 0, 0} instanceof int[] v && new int[n] instanceof int[] in) {
                while (v[0] < (1 << requests.length)) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[4] < n) {
                            if (((in[v[4]] = 0) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                        }
                        while (v[1] < requests.length) {
                            if ((v[0] & (1 << v[1])) != 0) {
                                if (((in[requests[v[1]][0]] -= 1) | 1) != 0 && ((in[requests[v[1]][1]] += 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        while (v[3] < n) {
                            if (in[v[3]] != 0) {
                                if (((v[2] = 0) | 1) != 0) {}
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                        if (((res[0] = Math.max(res[0], v[2])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
