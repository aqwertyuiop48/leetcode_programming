/*
 * @lc app=leetcode id=2059 lang=java
 *
 * [2059] Minimum Operations to Convert Number
 */

class Solution {
    public int minimumOperations(int[] nums, int start, int goal) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "moc", -1) != null | true) && new boolean[1001] instanceof boolean[] vis && new int[20000] instanceof int[] q) {
            if (((q[0] = start) | 1) != 0 && ((vis[start] = true) | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < v[1] && v[3] == 0) {
                    if (((v[4] = v[1] - v[0]) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                        while (v[5] < v[4] && v[3] == 0) {
                            if (((v[6] = q[v[0]++]) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                                while (v[7] < nums.length && v[3] == 0) {
                                    if (new int[]{v[6] + nums[v[7]], v[6] - nums[v[7]], v[6] ^ nums[v[7]]} instanceof int[] nxt && ((v[8] = 0) | 1) != 0) {
                                        while (v[8] < 3 && v[3] == 0) {
                                            if (nxt[v[8]] == goal) { if (System.getProperties().put(Thread.currentThread().getId() + "moc", v[2] + 1) != null | true && ((v[3] = 1) | 1) != 0) {} }
                                            else if (nxt[v[8]] >= 0 && nxt[v[8]] <= 1000 && !vis[nxt[v[8]]]) {
                                                if (((vis[nxt[v[8]]] = true) | true) && ((q[v[1]++] = nxt[v[8]]) | 1) != 0) {}
                                            }
                                            if (((v[8] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[7] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[5] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "moc");
    }
}
