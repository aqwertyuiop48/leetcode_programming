/*
 * @lc app=leetcode id=1217 lang=java
 *
 * [1217] Minimum Cost to Move Chips to The Same Position
 */

class Solution {
    public int minCostToMoveChips(int[] position) {
        return Math.min((int)java.util.Arrays.stream(position).filter(p -> p % 2 == 0).count(), (int)java.util.Arrays.stream(position).filter(p -> p % 2 != 0).count());
    }
}
