/*
 * @lc app=leetcode id=3041 lang=java
 *
 * [3041] Maximize Consecutive Elements in an Array After Modification
 */

class Solution { public int maxSelectedElements(int[] A) { return ((Function<Map<Integer, Integer>, Integer>) dp -> IntStream.of(A).sorted().map(a -> ((IntUnaryOperator) v1 -> ((IntUnaryOperator) v2 -> (dp.put(a + 1, v1) == null ? 0 : 0) * 0 + (dp.put(a, v2) == null ? 0 : 0) * 0 + Math.max(v1, v2)).applyAsInt(dp.getOrDefault(a - 1, 0) + 1)).applyAsInt(dp.getOrDefault(a, 0) + 1)).max().orElse(0)).apply(new HashMap<>()); } }
