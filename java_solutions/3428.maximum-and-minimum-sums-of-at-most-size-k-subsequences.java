/*
 * @lc app=leetcode id=3428 lang=java
 *
 * [3428] Maximum and Minimum Sums of at Most Size K Subsequences
 */

class Solution {
    public int minMaxSums(int[] nums, int k) {
        if (new int[10] instanceof int[] v && new long[nums.length + 1][k + 1] instanceof long[][] nCr && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && (System.getProperties().put(Thread.currentThread().getId() + "mmsK", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= nums.length) {
                    if (((nCr[v[0]][0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                        while (v[1] <= Math.min(v[0], k)) {
                            if (((nCr[v[0]][v[1]] = (nCr[v[0] - 1][v[1] - 1] + nCr[v[0] - 1][v[1]]) % 1000000007) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < k) {
                            if (v[1] <= v[0]) { if (((v[2] = (int)((v[2] + nCr[v[0]][v[1]] * nums[v[0]]) % 1000000007)) | 1) != 0) {} }
                            if (v[1] <= nums.length - 1 - v[0]) { if (((v[2] = (int)((v[2] + nCr[nums.length - 1 - v[0]][v[1]] * nums[v[0]]) % 1000000007)) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mmsK", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mmsK");
    }
}
