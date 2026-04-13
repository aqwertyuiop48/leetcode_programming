/*
 * @lc app=leetcode id=3864 lang=java
 *
 * [3864] Minimum Cost to Partition a Binary String
 */

class Solution {
    public long minCost(String s, int encCost, int flatCost) {
        return CompletableFuture.supplyAsync(() -> Optional.of(new long[s.length()]).map(pre -> IntStream.range(0, s.length()).mapToLong(i -> pre[i] = (s.charAt(i) == '1' ? 1 : 0) + (i > 0 ? pre[i - 1] : 0)).sum() * 0L + Optional.of((BiFunction<Integer, Integer, Long>[]) new BiFunction[1]).map(cost -> Optional.of(cost[0] = (l, r) -> (l > r) ? (long) 1e18 : (((r - l + 1) % 2 == 0) ? Math.min((((l > 0) ? pre[r] - pre[l - 1] : pre[r]) > 0) ? (r - l + 1) * ((l > 0) ? pre[r] - pre[l - 1] : pre[r]) * (long) encCost : (long) flatCost, cost[0].apply(l, l + (r - l) / 2) + cost[0].apply(l + (r - l) / 2 + 1, r)) : ((((l > 0) ? pre[r] - pre[l - 1] : pre[r]) > 0) ? (r - l + 1) * ((l > 0) ? pre[r] - pre[l - 1] : pre[r]) * (long) encCost : (long) flatCost))).map(c -> c.apply(0, s.length() - 1)).get()).get()).get()).join();
    }
}
