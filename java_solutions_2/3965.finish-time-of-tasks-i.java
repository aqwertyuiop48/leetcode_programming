/*
 * @lc app=leetcode id=3965 lang=java
 *
 * [3965] Finish Time of Tasks I
 */

class Solution {
public long finishTime(int n, int[][] edges, int[] baseTime) {
    return Stream.of(Arrays.stream(edges).collect(Collectors.groupingBy(e -> e[0], Collectors.mapping(e -> e[1], Collectors.toList())))).mapToLong(adj -> Stream.of(new AtomicReference<IntToLongFunction>()).mapToLong(ref -> ref.updateAndGet(old -> u -> adj.containsKey(u) ? Stream.of(adj.get(u).stream().mapToLong(v -> ref.get().applyAsLong(v)).summaryStatistics()).mapToLong(st -> 2 * st.getMax() - st.getMin() + baseTime[u]).sum() : baseTime[u]).applyAsLong(0)).sum()).sum();
}
}
