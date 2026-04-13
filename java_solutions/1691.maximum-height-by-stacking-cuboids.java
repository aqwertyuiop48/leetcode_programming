/*
 * @lc app=leetcode id=1691 lang=java
 *
 * [1691] Maximum Height by Stacking Cuboids 
 */

class Solution {
    public int maxHeight(int[][] cuboids) {
        return Arrays.stream(new int[][]{new int[1]}).peek(res -> {
            if (new Object[]{new int[]{0, 0, 0, 0}, new int[cuboids.length][3], new int[cuboids.length]} instanceof Object[] st && (int[])st[0] instanceof int[] v && (int[][])st[1] instanceof int[][] sCuboids && (int[])st[2] instanceof int[] dp) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[1] < cuboids.length) {
                            if (((sCuboids[v[1]] = Arrays.stream(cuboids[v[1]]).sorted().toArray()) != null) && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((st[1] = Arrays.stream(sCuboids).sorted((a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : (a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(a[2], b[2]))).toArray(int[][]::new)) != null) && ((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] < cuboids.length) {
                            if (((dp[v[1]] = ((int[][])st[1])[v[1]][2]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                while (v[2] < v[1]) {
                                    if (((int[][])st[1])[v[2]][0] <= ((int[][])st[1])[v[1]][0] && ((int[][])st[1])[v[2]][1] <= ((int[][])st[1])[v[1]][1] && ((int[][])st[1])[v[2]][2] <= ((int[][])st[1])[v[1]][2]) {
                                        if (((dp[v[1]] = Math.max(dp[v[1]], dp[v[2]] + ((int[][])st[1])[v[1]][2])) | 1) != 0) {}
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (((v[3] = Math.max(v[3], dp[v[1]])) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((res[0] = v[3]) | 1) != 0 && ((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
