/*
 * @lc app=leetcode id=3177 lang=java
 *
 * [3177] Find the Maximum Length of a Good Subsequence II
 */

class Solution { public int maximumLength(int[] A, int k) { return ((Function<List<Map<Integer, Integer>>, ToIntFunction<int[]>>) dp -> res -> Arrays.stream(A).reduce(0, (dummy, a) -> IntStream.rangeClosed(0, k).map(idx -> k - idx).reduce(0, (dummy2, i) -> ((IntUnaryOperator) v -> (dp.get(i).put(a, v) == null ? 0 : 0) * 0 + (res[i] = Math.max(res[i], v)) * 0).applyAsInt(Math.max(dp.get(i).getOrDefault(a, 0) + 1, i > 0 ? res[i - 1] + 1 : 0)))) * 0 == 0 ? res[k] : 0).apply(IntStream.rangeClosed(0, k).mapToObj(i -> new HashMap<Integer, Integer>()).collect(Collectors.toList())).applyAsInt(new int[k + 1]); } }
