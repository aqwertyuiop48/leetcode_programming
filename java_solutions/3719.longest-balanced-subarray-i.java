/*
 * @lc app=leetcode id=3719 lang=java
 *
 * [3719] Longest Balanced Subarray I
 */

class Solution {
    public int longestBalanced(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lba1", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (new int[100005] instanceof int[] evens && new int[100005] instanceof int[] odds && ((v[1] = v[0]) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[1] < nums.length) {
                            if (nums[v[1]] % 2 == 0) { if (evens[nums[v[1]]] == 0) { if (((evens[nums[v[1]]] = 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} } } 
                            else { if (odds[nums[v[1]]] == 0) { if (((odds[nums[v[1]]] = 1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {} } }
                            if (v[2] == v[3]) { if (v[1] - v[0] + 1 > v[4]) { if (((v[4] = v[1] - v[0] + 1) | 1) != 0) {} } }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "lba1", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lba1");
    }
}
