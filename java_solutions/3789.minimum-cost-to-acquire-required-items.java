/*
 * @lc app=leetcode id=3789 lang=java
 *
 * [3789] Minimum Cost to Acquire Required Items
 */

class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        return Math.min((long) need1 * cost1 + (long) need2 * cost2, Math.min((long) costBoth * Math.max(need1, need2), (long) costBoth * Math.min(need1, need2) + (long) (need1 - Math.min(need1, need2)) * cost1 + (long) (need2 - Math.min(need1, need2)) * cost2));
    }
}
