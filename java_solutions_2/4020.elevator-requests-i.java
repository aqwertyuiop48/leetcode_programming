/*
 * @lc app=leetcode id=4020 lang=java
 *
 * [4020] Elevator Requests I
 */

class Solution {
    public int elevatorRequests(int n, int[] requests) {
        return java.util.Arrays.stream(new int[][]{{0}}).peek(res -> {
            if (new int[]{requests.length, 0, 1} instanceof int[] v) { // v[0]: m, v[1]: sum, v[2]: i

                while (v[2] < v[0]) {
                    if (((v[1] += Math.abs(requests[v[2] - 1] - requests[v[2]])) | 1) != 0 &&
                        ((v[2]++) | 1) != 0) {}
                }

                if (((res[0] = v[1] + requests[0]) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
