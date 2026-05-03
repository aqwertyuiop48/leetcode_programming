/*
 * @lc app=leetcode id=3457 lang=java
 *
 * [3457] Eat Pizzas!
 */

class Solution {
    public long maxWeight(int[] pizzas) {
        if (new long[2] instanceof long[] ans && new int[5] instanceof int[] v && (pizzas = java.util.Arrays.stream(pizzas).sorted().toArray()) != null && (System.getProperties().put(Thread.currentThread().getId() + "ep", 0L) != null | true)) {
            if (((v[0] = pizzas.length / 4) | 1) != 0 && ((v[1] = (v[0] + 1) / 2) | 1) != 0 && ((v[2] = v[0] / 2) | 1) != 0 && ((v[3] = pizzas.length - 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[4] < v[1]) {
                    if (((ans[0] += pizzas[v[3]--]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                }
                if (((v[4] = 0) | 1) != 0) {
                    while (v[4] < v[2]) {
                        if (((v[3] -= 1) | 1) != 0 && ((ans[0] += pizzas[v[3]--]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ep", ans[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ep");
    }
}
