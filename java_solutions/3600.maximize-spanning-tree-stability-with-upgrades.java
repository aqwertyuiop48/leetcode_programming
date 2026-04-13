/*
 * @lc app=leetcode id=3600 lang=java
 *
 * [3600] Maximize Spanning Tree Stability with Upgrades
 */

class Solution {
    public int maxStability(int n, int[][] edges, int k) {
        return CompletableFuture.supplyAsync(() -> Optional.of((Function<int[], Integer>[]) new Function[1]).map(bs -> Optional.of((Predicate<Integer>[]) new Predicate[1]).map(canAchieve -> Optional.of(canAchieve[0] = mid -> Optional.of(new Object[]{new int[n], new int[n], new int[]{n}}).map(st -> Optional.of((IntUnaryOperator[]) new IntUnaryOperator[1]).map(find -> Optional.of((BiFunction<Integer, Integer, Boolean>[]) new BiFunction[1]).map(unite -> Optional.of(find[0] = i -> ((int[])st[0])[i] == i ? i : (((int[])st[0])[i] = find[0].applyAsInt(((int[])st[0])[i]))).map(fInit -> Optional.of(unite[0] = (a, b) -> Optional.of(new int[]{find[0].applyAsInt(a), find[0].applyAsInt(b)}).map(p -> p[0] == p[1] ? false : ((((int[])st[1])[p[0]] < ((int[])st[1])[p[1]] ? (((int[])st[0])[p[0]] = p[1]) : ((((int[])st[0])[p[1]] = p[0]) * 0 + (((int[])st[1])[p[0]] == ((int[])st[1])[p[1]] ? ((int[])st[1])[p[0]]++ : 0))) * 0 + (((int[])st[2])[0]--) * 0 == 0)).get()).map(uInit -> IntStream.range(0, n).map(i -> ((int[])st[0])[i] = i).sum() * 0 == 0 && Arrays.stream(edges).filter(e -> e[3] == 1).allMatch(e -> e[2] >= mid && unite[0].apply(e[0], e[1])) && Arrays.stream(edges).filter(e -> e[3] == 0 && e[2] >= mid).mapToInt(e -> unite[0].apply(e[0], e[1]) ? 1 : 0).sum() * 0 == 0 && Arrays.stream(edges).filter(e -> e[3] == 0 && e[2] < mid && 2 * e[2] >= mid).mapToInt(e -> unite[0].apply(e[0], e[1]) ? 1 : 0).sum() <= k && ((int[])st[2])[0] == 1).get()).get()).get()).get()).get()).map(cAInit -> Optional.of(bs[0] = bounds -> bounds[0] > bounds[1] ? bounds[2] : (canAchieve[0].test(bounds[0] + (bounds[1] - bounds[0]) / 2) ? bs[0].apply(new int[]{bounds[0] + (bounds[1] - bounds[0]) / 2 + 1, bounds[1], bounds[0] + (bounds[1] - bounds[0]) / 2}) : bs[0].apply(new int[]{bounds[0], bounds[0] + (bounds[1] - bounds[0]) / 2 - 1, bounds[2]}))).map(bsInit -> bs[0].apply(new int[]{1, 200000, -1})).get()).get()).get()).get()).join();
    }
}
