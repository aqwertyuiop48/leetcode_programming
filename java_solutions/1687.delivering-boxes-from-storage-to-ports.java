/*
 * @lc app=leetcode id=1687 lang=java
 *
 * [1687] Delivering Boxes from Storage to Ports
 */

class Solution {
    public int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
        return Arrays.stream(new int[][]{new int[1]}).peek(res -> {
            if (new int[]{0, 0, 0, 0, 0} instanceof int[] v && new int[boxes.length + 2] instanceof int[] dp && new int[boxes.length + 2] instanceof int[] diff && new long[boxes.length + 2] instanceof long[] W && new int[boxes.length + 2] instanceof int[] q) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[1] < boxes.length) {
                            if (((diff[v[1] + 1] = diff[v[1]] + (v[1] > 0 && boxes[v[1]][0] != boxes[v[1] - 1][0] ? 1 : 0)) | 1) != 0 && ((W[v[1] + 1] = W[v[1]] + boxes[v[1]][1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((q[v[3]] = 0) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] <= boxes.length) {
                            while (v[2] < v[3] && (v[1] - q[v[2]] > maxBoxes || W[v[1]] - W[q[v[2]]] > maxWeight)) {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                            if (((dp[v[1]] = diff[v[1]] + 2 + dp[q[v[2]]] - diff[q[v[2]] + 1]) | 1) != 0) {
                                while (v[2] < v[3] && dp[v[1]] - diff[v[1] + 1] <= dp[q[v[3] - 1]] - diff[q[v[3] - 1] + 1]) {
                                    if (((v[3] -= 1) | 1) != 0) {}
                                }
                                if (((q[v[3]] = v[1]) | 1) != 0 && ((v[3] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((res[0] = dp[boxes.length]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
