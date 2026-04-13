/*
 * @lc app=leetcode id=3273 lang=java
 *
 * [3273] Minimum Amount of Damage Dealt to Bob
 */

class Solution { public long minDamage(int power, int[] D, int[] H) { return IntStream.range(0, D.length).boxed().sorted((i, j) -> ((H[i] + power - 1) / power) * D[j] - ((H[j] + power - 1) / power) * D[i]).reduce(new long[]{0L, 0L}, (acc, idx) -> new long[]{acc[0] + (long)D[idx] * (acc[1] + (H[idx] + power - 1) / power), acc[1] + (H[idx] + power - 1) / power}, (a, b) -> a)[0]; } }
