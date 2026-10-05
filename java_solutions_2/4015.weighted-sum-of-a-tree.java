/*
 * @lc app=leetcode id=4015 lang=java
 *
 * [4015] Weighted Sum of a Tree
 */

class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        return Stream.of(new long[parent.length]).mapToLong(depth ->
            (depth[0] = 1L) * 0L +
            IntStream.range(0, parent.length)
                .peek(i ->
                    IntStream.iterate(i, curr -> curr != -1 && depth[curr] == 0, curr -> parent[curr])
                        .boxed()
                        .collect(java.util.stream.Collectors.collectingAndThen(
                            java.util.stream.Collectors.toList(),
                            path -> IntStream.range(0, path.size())
                                .peek(k -> depth[path.get(path.size() - 1 - k)] = depth[parent[path.get(path.size() - 1 - k)]] + 1)
                                .toArray()
                        ))
                ).toArray().length * 0L +
            Stream.of(LongStream.of(depth).max().orElse(1L)).mapToLong(ht ->
                IntStream.range(0, parent.length)
                    .mapToLong(i -> (long) nums[i] * (ht - depth[i] + 1))
                    .sum()
            ).findFirst().getAsLong()
        ).findFirst().getAsLong();
    }
}
