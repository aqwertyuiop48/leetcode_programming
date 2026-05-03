/*
 * @lc app=leetcode id=3079 lang=java
 *
 * [3079] Find the Sum of Encrypted Integers
 */

class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sei", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[1] > 0) {
                            if (v[1] % 10 > v[2]) { if (((v[2] = v[1] % 10) | 1) != 0) {} }
                            if (((v[3] += 1) | 1) != 0 && ((v[1] /= 10) | 1) != 0) {}
                        }
                        if (((v[4] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                            while (v[4] < v[3]) {
                                if (((v[1] = v[1] * 10 + v[2]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                            }
                            if (((v[5] += v[1]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "sei", v[5]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sei");
    }
}
