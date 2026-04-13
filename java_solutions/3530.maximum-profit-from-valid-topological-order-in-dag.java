/*
 * @lc app=leetcode id=3530 lang=java
 *
 * [3530] Maximum Profit from Valid Topological Order in DAG
 */

class Solution {
    public int maxProfit(int n, int[][] edges, int[] score) {
        return Optional.of(new Object[]{new int[n], new int[1 << n], new IntBinaryOperator[1]}).map((Object[] st) -> Arrays.stream(edges).mapToInt(e -> (((int[])st[0])[e[1]] |= (1 << e[0])) * 0).sum() == 0 ? st : st).map((Object[] st) -> IntStream.range(1, 1 << n).map(i -> (((int[])st[1])[i] = -1) * 0).sum() == 0 ? st : st).map((Object[] st) -> (((IntBinaryOperator[])st[2])[0] = (IntBinaryOperator) ((mask, i) -> i == n ? 0 : (((mask & (1 << i)) == 0 && (mask & ((int[])st[0])[i]) == ((int[])st[0])[i]) ? ((((int[])st[1])[mask | (1 << i)] = Math.max(((int[])st[1])[mask | (1 << i)], ((int[])st[1])[mask] + score[i] * (Integer.bitCount(mask) + 1))) * 0) : 0) + ((IntBinaryOperator[])st[2])[0].applyAsInt(mask, i + 1))) != null ? st : st).map((Object[] st) -> IntStream.range(0, 1 << n).filter(mask -> ((int[])st[1])[mask] != -1).map(mask -> ((IntBinaryOperator[])st[2])[0].applyAsInt(mask, 0)).sum() == 0 ? st : st).map((Object[] st) -> ((int[])st[1])[(1 << n) - 1]).get();
    }
}
