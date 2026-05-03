/*
 * @lc app=leetcode id=3880 lang=java
 *
 * [3880] Minimum Absolute Difference Between Two Values
 */

class Solution {
    public int minAbsoluteDifference(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mad", 2000000000) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] == 1) { 
                    if (((v[1] = v[0]) | 1) != 0 && v[2] != -1) {
                        if (v[1] - v[2] < (int)System.getProperties().get(Thread.currentThread().getId() + "mad")) {
                            if (System.getProperties().put(Thread.currentThread().getId() + "mad", v[1] - v[2]) != null | true) {}
                        }
                    }
                }
                if (nums[v[0]] == 2) { 
                    if (((v[2] = v[0]) | 1) != 0 && v[1] != -1) {
                        if (v[2] - v[1] < (int)System.getProperties().get(Thread.currentThread().getId() + "mad")) {
                            if (System.getProperties().put(Thread.currentThread().getId() + "mad", v[2] - v[1]) != null | true) {}
                        }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if ((int)System.getProperties().get(Thread.currentThread().getId() + "mad") == 2000000000) {
                if (System.getProperties().put(Thread.currentThread().getId() + "mad", -1) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mad");
    }
}
