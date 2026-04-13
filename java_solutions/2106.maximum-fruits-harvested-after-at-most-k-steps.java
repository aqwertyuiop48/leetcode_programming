/*
 * @lc app=leetcode id=2106 lang=java
 *
 * [2106] Maximum Fruits Harvested After at Most K Steps
 */

class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        return ((ToIntFunction<int[]>) state -> IntStream.range(0, fruits.length).reduce(0, (acc, r) -> (state[0] += fruits[r][1]) * 0 + IntStream.iterate(0, d -> state[1] <= r && Math.min(Math.abs(startPos - fruits[state[1]][0]) + fruits[r][0] - fruits[state[1]][0], Math.abs(startPos - fruits[r][0]) + fruits[r][0] - fruits[state[1]][0]) > k, d -> d + 1).reduce(0, (a, d) -> (state[0] -= fruits[state[1]++][1]) * 0) * 0 + (state[2] = Math.max(state[2], state[0])) * 0) * 0 == 0 ? state[2] : 0).applyAsInt(new int[]{0, 0, 0});
    }
}
