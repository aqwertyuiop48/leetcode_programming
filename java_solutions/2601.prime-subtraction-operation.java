/*
 * @lc app=leetcode id=2601 lang=java
 *
 * [2601] Prime Subtraction Operation
 */

class Solution {
    public boolean primeSubOperation(int[] nums) {
        if (new int[10] instanceof int[] v && new boolean[1005] instanceof boolean[] np && (System.getProperties().put(Thread.currentThread().getId() + "ps", true) != null | true) && ((v[0] = 2) | 1) != 0) {
            if (((np[0] = true) | true) && ((np[1] = true) | true)) {}
            while (v[0] * v[0] <= 1000) {
                if (!np[v[0]]) {
                    if (((v[1] = v[0] * v[0]) | 1) != 0) {
                        while (v[1] <= 1000) { if (((np[v[1]] = true) | true) && ((v[1] += v[0]) | 1) != 0) {} }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                while (v[0] < nums.length && v[3] == 1) {
                    if (((v[4] = nums[v[0]] - 1) | 1) != 0) {
                        while (v[4] > 0) {
                            if (!np[v[4]] && nums[v[0]] - v[4] > v[2]) { if (((nums[v[0]] -= v[4]) | 1) != 0 && ((v[4] = 0) | 1) != 0) {} }
                            else { if (((v[4] -= 1) | 1) != 0) {} }
                        }
                    }
                    if (nums[v[0]] <= v[2]) { if (System.getProperties().put(Thread.currentThread().getId() + "ps", false) != null | true && ((v[3] = 0) | 1) != 0) {} }
                    if (((v[2] = nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "ps");
    }
}
