/*
 * @lc app=leetcode id=4051 lang=java
 *
 * [4051] Count Subarrays with Distant Sums
 */

class Solution {
    public long distantSubarrays(int[] nums, int goal, int k) {
        return Stream.of(LongStream.concat(LongStream.of(0L), Arrays.stream(nums).asLongStream()).toArray()).peek(p -> Arrays.parallelPrefix(p, Long::sum)).mapToLong(p -> Stream.of(Arrays.stream(p).distinct().sorted().toArray()).mapToLong(s -> Stream.of(new int[s.length + 1]).mapToLong(t -> Stream.of((java.util.function.LongToIntFunction) x -> IntStream.of(Arrays.binarySearch(s, x)).map(b -> b ^ (b >> 31)).sum()).mapToLong(lb -> Stream.of((java.util.function.IntUnaryOperator) m -> IntStream.iterate(m, i -> i > 0, i -> i - (i & -i)).map(i -> t[i]).sum()).mapToLong(q -> (long) nums.length * (nums.length + 1) / 2 - Arrays.stream(p).map(cur -> LongStream.of(cur).map(c -> Math.max(0, q.applyAsInt(lb.applyAsInt(c - goal + k)) - q.applyAsInt(lb.applyAsInt(c - goal - k + 1)))).peek(z -> IntStream.iterate(lb.applyAsInt(cur) + 1, i -> i < t.length, i -> i + (i & -i)).forEach(i -> t[i]++)).sum()).sum()).sum()).sum()).sum()).sum()).sum();
    }
}
