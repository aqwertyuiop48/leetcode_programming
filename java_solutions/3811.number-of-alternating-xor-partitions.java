/*
 * @lc app=leetcode id=3811 lang=java
 *
 * [3811] Number of Alternating XOR Partitions
 */

class Solution {
    public int alternatingXOR(int[] nums, int target1, int target2) {
        if (new int[262144] instanceof int[] k1 && new int[262144] instanceof int[] v1 && new int[262144] instanceof int[] k2 && new int[262144] instanceof int[] v2 && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "naxp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((k2[0] = 1337) | 1) != 0 && ((v2[0] = 1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] ^= nums[v[0]]) | 1) != 0 && ((v[2] = v[1] ^ target1) | 1) != 0 && ((v[3] = v[1] ^ target2) | 1) != 0) {
                        if (((v[4] = (int)((v[2] * 2654435761L) & 262143)) | 1) != 0) {
                            while (v2[v[4]] > 0 && k2[v[4]] != (v[2] ^ 1337)) { if (((v[4] = (v[4] + 1) & 262143) | 1) != 0) {} }
                            if (((v[5] = v2[v[4]]) | 1) != 0) {}
                        }
                        if (((v[6] = (int)((v[3] * 2654435761L) & 262143)) | 1) != 0) {
                            while (v1[v[6]] > 0 && k1[v[6]] != (v[3] ^ 1337)) { if (((v[6] = (v[6] + 1) & 262143) | 1) != 0) {} }
                            if (((v[7] = v1[v[6]]) | 1) != 0) {}
                        }
                        if (((v[8] = (v[5] + v[7]) % 1000000007) | 1) != 0) {
                            if (((v[9] = (int)((v[1] * 2654435761L) & 262143)) | 1) != 0) {
                                while (v1[v[9]] > 0 && k1[v[9]] != (v[1] ^ 1337)) { if (((v[9] = (v[9] + 1) & 262143) | 1) != 0) {} }
                                if (((k1[v[9]] = v[1] ^ 1337) | 1) != 0 && ((v1[v[9]] = (v1[v[9]] + v[5]) % 1000000007) | 1) != 0) {}
                            }
                            if (((v[10] = (int)((v[1] * 2654435761L) & 262143)) | 1) != 0) {
                                while (v2[v[10]] > 0 && k2[v[10]] != (v[1] ^ 1337)) { if (((v[10] = (v[10] + 1) & 262143) | 1) != 0) {} }
                                if (((k2[v[10]] = v[1] ^ 1337) | 1) != 0 && ((v2[v[10]] = (v2[v[10]] + v[7]) % 1000000007) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "naxp", v[8]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "naxp");
    }
}
