/*
 * @lc app=leetcode id=2550 lang=java
 *
 * [2550] Count Collisions of Monkeys on a Polygon
 */

class Solution {
    public int monkeyMove(int n) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mm", 0) != null | true) && ((v[0] = 2) | 1) != 0 && ((v[1] = n) | 1) != 0 && ((v[2] = 1) | 1) != 0 && ((v[3] = 1000000007) | 1) != 0) {
            while (v[1] > 0) {
                if (v[1] % 2 == 1) { if (((v[2] = (v[2] * v[0]) % v[3]) | 1) != 0) {} }
                if (((v[0] = (v[0] * v[0]) % v[3]) | 1) != 0 && ((v[1] /= 2) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mm", (int)((v[2] - 2 + v[3]) % v[3])) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mm");
    }
}
