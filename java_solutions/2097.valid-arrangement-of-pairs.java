/*
 * @lc app=leetcode id=2097 lang=java
 *
 * [2097] Valid Arrangement of Pairs
 */

class Solution {
    public int[][] validArrangement(int[][] pairs) {
        return ((Function<Map<Integer, Deque<Integer>>, Function<Map<Integer, Integer>, int[][]>>) adj -> inOut -> IntStream.range(0, pairs.length).reduce(0, (acc, i) -> (adj.computeIfAbsent(pairs[i][0], k -> new ArrayDeque<>()).add(pairs[i][1]) ? 0 : 0) + (inOut.merge(pairs[i][0], 1, Integer::sum)) * 0 + (inOut.merge(pairs[i][1], -1, Integer::sum)) * 0) * 0 == 0 ? ((Function<int[], Function<int[], Function<int[], int[][]>>>) stack -> path -> ptrs -> (stack[ptrs[0]++] = inOut.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(pairs[0][0])) * 0 == 0 && IntStream.iterate(0, i -> ptrs[0] > 0, i -> i + 1).limit(pairs.length * 2 + 2).reduce(0, (acc, i) -> adj.getOrDefault(stack[ptrs[0] - 1], new ArrayDeque<>()).isEmpty() ? (path[ptrs[1]++] = stack[--ptrs[0]]) * 0 : (stack[ptrs[0]] = adj.get(stack[ptrs[0] - 1]).poll()) * 0 + (ptrs[0]++) * 0) * 0 == 0 ? IntStream.range(0, pairs.length).mapToObj(i -> new int[]{path[pairs.length - i], path[pairs.length - 1 - i]}).toArray(int[][]::new) : null).apply(new int[pairs.length + 1]).apply(new int[pairs.length + 1]).apply(new int[2]) : null).apply(new HashMap<>()).apply(new HashMap<>());
    }
}
