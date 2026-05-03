/*
 * @lc app=leetcode id=2917 lang=java
 *
 * [2917] Find the K-or of an Array
 */

class Solution {
    public int findKOr(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fko", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < 32) {
                if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[2] < nums.length) {
                        if ((nums[v[2]] & (1 << v[0])) != 0) { if (((v[1] += 1) | 1) != 0) {} }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (v[1] >= k) { if (((v[3] |= (1 << v[0])) | 1) != 0) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "fko", v[3]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fko");
    }
}
