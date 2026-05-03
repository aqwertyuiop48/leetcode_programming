/*
 * @lc app=leetcode id=3097 lang=java
 *
 * [3097] Shortest Subarray With OR at Least K II
 */

class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        if (new int[35] instanceof int[] bits && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msl", 999999999) != null | true)) {
            if (k == 0 && System.getProperties().put(Thread.currentThread().getId() + "msl", 1) != null | true) {}
            else if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[1] < nums.length) {
                    if (((v[3] = 0) | 1) != 0) {
                        while (v[3] < 30) {
                            if ((nums[v[1]] & (1 << v[3])) != 0) { if (((bits[v[3]] += 1) | 1) != 0) {} }
                            if (bits[v[3]] > 0) { if (((v[2] |= (1 << v[3])) | 1) != 0) {} }
                            else { if (((v[2] &= ~(1 << v[3])) | 1) != 0) {} }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    while (v[2] >= k && v[0] <= v[1]) {
                        if (v[1] - v[0] + 1 < (int)System.getProperties().get(Thread.currentThread().getId() + "msl")) { if (System.getProperties().put(Thread.currentThread().getId() + "msl", v[1] - v[0] + 1) != null | true) {} }
                        if (((v[3] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                            while (v[3] < 30) {
                                if ((nums[v[0]] & (1 << v[3])) != 0) { if (((bits[v[3]] -= 1) | 1) != 0) {} }
                                if (bits[v[3]] > 0) { if (((v[2] |= (1 << v[3])) | 1) != 0) {} }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
        }
        return (int)System.getProperties().get(Thread.currentThread().getId() + "msl") == 999999999 ? -1 : (int)System.getProperties().get(Thread.currentThread().getId() + "msl");
    }
}
