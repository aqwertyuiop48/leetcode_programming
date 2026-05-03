/*
 * @lc app=leetcode id=390 lang=java
 *
 * [390] Elimination Game
 */

record Solution() {
    public int lastRemaining(int n) {
        return n == 1 ? 1 : 2 * (1 + n / 2 - lastRemaining(n / 2));
    }
}
