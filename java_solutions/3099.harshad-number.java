/*
 * @lc app=leetcode id=3099 lang=java
 *
 * [3099] Harshad Number
 */

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sotd", -1) != null | true)) {
            if (((v[0] = x) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] > 0) {
                    if (((v[1] += v[0] % 10) | 1) != 0 && ((v[0] /= 10) | 1) != 0) {}
                }
                if (x % v[1] == 0) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "sotd", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sotd");
    }
}
