/*
 * @lc app=leetcode id=1884 lang=java
 *
 * [1884] Egg Drop With 2 Eggs and N Floors
 */

class Solution {
    public int twoEggDrop(int n) {
        return (int) Math.ceil((-1.0 + Math.sqrt(1 + 8.0 * n)) / 2.0);
    }
}
