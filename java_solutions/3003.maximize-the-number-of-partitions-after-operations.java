/*
 * @lc app=leetcode id=3003 lang=java
 *
 * [3003] Maximize the Number of Partitions After Operations
 */

class Solution { public int maxPartitionsAfterOperations(String s, int k) { return ((Function<Map<Long, Integer>, Integer>) memo -> ((Function<Object[], Integer>) box -> ((Function<long[], Integer>) (box[0] = (Function<long[], Integer>) st -> ((Function<Long, Integer>) key -> memo.containsKey(key) ? memo.get(key) - 1 : ((Function<Integer, Integer>) res -> (memo.put(key, res + 1) == null ? res : res)).apply((int)st[0] == s.length() ? 0 : Math.max(((Function<Long, Integer>) nm -> Long.bitCount(nm) > k ? 1 + ((Function<long[], Integer>) box[0]).apply(new long[]{st[0] + 1, 1L << (s.charAt((int)st[0]) - 'a'), st[2]}) : ((Function<long[], Integer>) box[0]).apply(new long[]{st[0] + 1, nm, st[2]})).apply(st[1] | (1L << (s.charAt((int)st[0]) - 'a'))), st[2] == 1 ? IntStream.range(0, 26).map(j -> ((Function<Long, Integer>) cm -> Long.bitCount(cm) > k ? 1 + ((Function<long[], Integer>) box[0]).apply(new long[]{st[0] + 1, 1L << j, 0}) : ((Function<long[], Integer>) box[0]).apply(new long[]{st[0] + 1, cm, 0})).apply(st[1] | (1L << j))).max().orElse(0) : 0))).apply((st[0] << 27) | (st[1] << 1) | st[2]))).apply(new long[]{0, 0, 1}) + 1).apply(new Object[1])).apply(new HashMap<>()); } }
