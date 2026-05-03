/*
 * @lc app=leetcode id=3012 lang=java
 *
 * [3012] Minimize Length of Array Using Operations
 */

class Solution {
    public int minimumArrayLength(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mla", 0) != null | true)) {
            // Fixed line below: Set initial min to Integer.MAX_VALUE (2147483647)
            if (((v[0] = 2147483647) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < nums.length) {
                    if (nums[v[1]] < v[0]) { if (((v[0] = nums[v[1]]) | 1) != 0) {} }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[1] < nums.length) {
                        if (nums[v[1]] == v[0]) { if (((v[2] += 1) | 1) != 0) {} }
                        else if (nums[v[1]] % v[0] != 0) { if (((v[3] = 1) | 1) != 0) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (v[3] == 1) { if (System.getProperties().put(Thread.currentThread().getId() + "mla", 1) != null | true) {} }
                    else { if (System.getProperties().put(Thread.currentThread().getId() + "mla", (v[2] + 1) / 2) != null | true) {} }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mla");
    }
}
