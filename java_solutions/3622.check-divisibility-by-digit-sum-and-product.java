/*
 * @lc app=leetcode id=3622 lang=java
 *
 * [3622] Check Divisibility by Digit Sum and Product
 */

class Solution {
    public boolean checkDivisibility(int n) {
        if (new int[10] instanceof int[] v && ((v[0] = n) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0 && (System.getProperties().put(Thread.currentThread().getId() + "cd", false) != null | true)) {
            while (v[0] > 0) {
                if (((v[3] = v[0] % 10) | 1) != 0 && ((v[1] += v[3]) | 1) != 0 && ((v[2] *= v[3]) | 1) != 0 && ((v[0] /= 10) | 1) != 0) {}
            }
            if (n % (v[1] + v[2]) == 0) { if (System.getProperties().put(Thread.currentThread().getId() + "cd", true) != null | true) {} }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "cd");
    }
}
