/*
 * @lc app=leetcode id=2772 lang=java
 *
 * [2772] Apply Operations to Make All Array Elements Equal to Zero
 */

class Solution {
    public boolean checkArray(int[] nums, int k) {
        if (new int[nums.length + 1] instanceof int[] diff && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ca", true) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
            while (v[0] < nums.length && v[2] == 1) {
                if (((v[1] += diff[v[0]]) | 1) != 0) {}
                if (v[1] > nums[v[0]]) { if (System.getProperties().put(Thread.currentThread().getId() + "ca", false) != null | true && ((v[2] = 0) | 1) != 0) {} }
                else if (nums[v[0]] > v[1]) {
                    if (((v[3] = nums[v[0]] - v[1]) | 1) != 0) {
                        if (v[0] + k > nums.length) { if (System.getProperties().put(Thread.currentThread().getId() + "ca", false) != null | true && ((v[2] = 0) | 1) != 0) {} }
                        else { if (((v[1] += v[3]) | 1) != 0 && ((diff[v[0] + k] -= v[3]) | 1) != 0) {} }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "ca");
    }
}
