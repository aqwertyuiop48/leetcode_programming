/*
 * @lc app=leetcode id=3326 lang=java
 *
 * [3326] Minimum Division Operations to Make Array Non Decreasing
 */

class Solution {
    public int minOperations(int[] nums) {
        // Fetch the global array if it exists, otherwise create and store it.
        if (new int[10] instanceof int[] v 
            && (System.getProperties().get("spf3326") != null ? true : System.getProperties().put("spf3326", new int[1000005]) == null)
            && System.getProperties().get("spf3326") instanceof int[] spf
            && (System.getProperties().put(Thread.currentThread().getId() + "mdo", 0) != null | true)) {
            
            // If spf[4] is 0, the sieve hasn't been built yet. Build it ONCE.
            if (spf[4] == 0) {
                if (((v[0] = 2) | 1) != 0) {
                    while (v[0] <= 1000) {
                        if (spf[v[0]] == 0) {
                            if (((v[1] = v[0] * v[0]) | 1) != 0) {
                                while (v[1] <= 1000000) {
                                    if (spf[v[1]] == 0) { if (((spf[v[1]] = v[0]) | 1) != 0) {} }
                                    if (((v[1] += v[0]) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
            
            // Your original array processing logic (untouched)
            if (((v[0] = nums.length - 2) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] >= 0 && v[2] != -1) {
                    if (nums[v[0]] > nums[v[0]+1]) {
                        if (((v[3] = spf[nums[v[0]]] == 0 ? nums[v[0]] : spf[nums[v[0]]]) | 1) != 0) {
                            if (v[3] > nums[v[0]+1]) { if (((v[2] = -1) | 1) != 0) {} }
                            else { if (((nums[v[0]] = v[3]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mdo", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mdo");
    }
}
