/*
 * @lc app=leetcode id=2598 lang=java
 *
 * [2598] Smallest Missing Non-negative Integer After Operations
 */

class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        if (new int[value] instanceof int[] freq && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fsi", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (((freq[((nums[v[0]] % value) + value) % value] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] == 0) {
                    if (freq[v[0] % value] == 0) { if (System.getProperties().put(Thread.currentThread().getId() + "fsi", v[0]) != null | true && ((v[1] = 1) | 1) != 0) {} }
                    else { if (((freq[v[0] % value] -= 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fsi");
    }
}
