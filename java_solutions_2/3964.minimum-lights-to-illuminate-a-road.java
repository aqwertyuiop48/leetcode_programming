/*
 * @lc app=leetcode id=3964 lang=java
 *
 * [3964] Minimum Lights to Illuminate a Road
 */

class Solution {
public int minLights(int[] lights) {
    return Stream.<int[][]>of(new int[2][lights.length]).peek(h -> IntStream.range(0, lights.length).forEach(i -> h[0][i] = Math.max(i == 0 ? -1 : h[0][i - 1], lights[i] != 0 ? i + lights[i] : -1))).peek(h -> IntStream.range(0, lights.length).map(i -> lights.length - 1 - i).forEach(i -> h[1][i] = Math.min(i == lights.length - 1 ? lights.length + 1 : h[1][i + 1], lights[i] != 0 ? i - lights[i] : lights.length + 1))).mapToInt(h -> IntStream.range(0, lights.length).collect(() -> new int[2], (st, i) -> st[1] += h[0][i] >= i || h[1][i] <= i ? (st[0] = 0) : ++st[0] % 3 == 1 ? 1 : 0, (a, b) -> {})[1]).sum();
}
}
