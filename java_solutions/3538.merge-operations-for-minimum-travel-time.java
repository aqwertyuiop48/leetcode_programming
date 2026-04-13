/*
 * @lc app=leetcode id=3538 lang=java
 *
 * [3538] Merge Operations for Minimum Travel Time
 */

class Solution {
    static public int minTravelTime(int l, int n, int k, int[] positions, int[] times) {
        return Optional.of(new Object[]{new int[n], new int[(k + 1) * n * (n + 1)], new IntUnaryOperator[1]}).map((Object[] st) -> ((((int[])st[0])[0] = times[0]) * 0 + IntStream.range(1, n - 1).map(idx -> (((int[])st[0])[idx] = ((int[])st[0])[idx - 1] + times[idx]) * 0).sum()) == 0 ? st : st).map((Object[] st) -> IntStream.range(0, (k + 1) * n * (n + 1)).map(x -> (((int[])st[1])[x] = -1) * 0).sum() == 0 ? st : st).map((Object[] st) -> (((IntUnaryOperator[])st[2])[0] = (IntUnaryOperator) (packed -> Optional.of(new int[]{packed / (n * (n + 1)), (packed / (n + 1)) % n, packed % (n + 1)}).map((int[] state) -> state[1] == n - 1 ? (state[0] == 0 ? 0 : 10000000) : (((int[])st[1])[packed] != -1 ? ((int[])st[1])[packed] : (((int[])st[1])[packed] = IntStream.rangeClosed(state[1] + 1, Math.min(n - 1, state[1] + state[0] + 1)).map(j -> (positions[j] - positions[state[1]]) * (((int[])st[0])[state[1]] - (state[2] > 0 ? ((int[])st[0])[state[2] - 1] : 0)) + ((IntUnaryOperator[])st[2])[0].applyAsInt((state[0] - (j - state[1] - 1)) * n * (n + 1) + j * (n + 1) + state[1] + 1)).min().orElse(10000000)))).get())) != null ? st : st).map((Object[] st) -> ((IntUnaryOperator[])st[2])[0].applyAsInt(k * n * (n + 1))).get();
    }
}
