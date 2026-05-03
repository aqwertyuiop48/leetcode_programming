/*
 * @lc app=leetcode id=1743 lang=java
 *
 * [1743] Restore the Array From Adjacent Pairs
 */

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        return java.util.Optional.of(new java.util.HashMap<Integer, java.util.List<Integer>>()).filter(m -> java.util.Arrays.stream(adjacentPairs).allMatch(p -> m.computeIfAbsent(p[0], k -> new java.util.ArrayList<>()).add(p[1]) && m.computeIfAbsent(p[1], k -> new java.util.ArrayList<>()).add(p[0])))
            .map(m -> java.util.Optional.of(new int[]{m.entrySet().stream().filter(e -> e.getValue().size() == 1).findFirst().get().getKey(), 1000000}).map(st -> java.util.stream.IntStream.range(0, adjacentPairs.length + 1).map(i -> java.util.Optional.of(st[0]).map(curr -> (st[0] = m.get(curr).stream().filter(nxt -> nxt != st[1]).findFirst().orElse(0)) * 0 + ((st[1] = curr) * 0 + curr)).get()).toArray()).get()).get();
    }
}
