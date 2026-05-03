/*
 * @lc app=leetcode id=3587 lang=java
 *
 * [3587] Minimum Adjacent Swaps to Alternate Parity
 */

class Solution {
    public int minSwaps(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msap", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] % 2 == 0) {
                        if (((v[1] += Math.abs(v[0] - v[3])) | 1) != 0 && ((v[3] += 2) | 1) != 0 && ((v[2] += Math.abs(v[0] - (v[4] + 1))) | 1) != 0 && ((v[4] += 2) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (Math.abs(nums.length - 2 * (v[3] / 2)) <= 1) {
                    if (nums.length % 2 == 1) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "msap", v[3] / 2 > nums.length / 2 ? v[1] : v[2]) != null | true) {}
                    } else {
                        if (System.getProperties().put(Thread.currentThread().getId() + "msap", Math.min(v[1], v[2])) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "msap");
    }
}
