/*
 * @lc app=leetcode id=672 lang=java
 *
 * [672] Bulb Switcher II
 */

class Solution {
    public int flipLights(int n, int presses) {
        return presses == 0 ? 1 : n == 1 ? 2 : n == 2 ? (presses == 1 ? 3 : 4) : presses == 1 ? 4 : presses == 2 ? 7 : 8;
    }
}
