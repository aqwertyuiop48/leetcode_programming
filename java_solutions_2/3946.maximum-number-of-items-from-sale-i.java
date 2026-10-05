/*
 * @lc app=leetcode id=3946 lang=java
 *
 * [3946] Maximum Number of Items From Sale I
 */

class Solution {
public int maximumSaleItems(int[][] items, int budget) {
    return IntStream.of(Arrays.stream(items).mapToInt(it -> it[1]).min().getAsInt()).map(mini -> IntStream.range(0, items.length).map(i -> items.length - 1 - i).boxed().reduce(IntStream.rangeClosed(0, budget).map(t -> t / mini).toArray(), (nxt, i) -> IntStream.of((int) Arrays.stream(items).filter(o -> o[0] % items[i][0] == 0).count()).boxed().map(fr -> IntStream.rangeClosed(0, budget).map(t -> Math.max(nxt[t], t >= items[i][1] ? fr + nxt[t - items[i][1]] : 0)).toArray()).findFirst().get(), (u, v) -> u)[budget]).sum();
}
}
