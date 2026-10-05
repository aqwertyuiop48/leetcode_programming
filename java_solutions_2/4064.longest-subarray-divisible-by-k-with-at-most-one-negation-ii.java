/*
 * @lc app=leetcode id=4064 lang=java
 *
 * [4064] Longest Subarray Divisible by K with At Most One Negation II
 */

class Solution {
    public int longestSubarray(int[] nums, int k) {
        return IntStream.of((k & 1) == 1 ? k : k / 2).map(half ->
            Stream.of(new int[nums.length + 1])
                .peek(prefix -> IntStream.range(0, nums.length)
                    .forEach(i -> prefix[i + 1] = ((prefix[i] + nums[i]) % k + k) % k))
                .mapToInt(prefix -> Stream.of(new int[k])
                    .peek(firstPos -> IntStream.range(0, k)
                        .forEach(r -> firstPos[r] = r == 0 ? 0 : Integer.MAX_VALUE))
                    .peek(firstPos -> IntStream.rangeClosed(1, nums.length)
                        .forEach(i -> firstPos[prefix[i]] = Math.min(firstPos[prefix[i]], i)))
                    .mapToInt(firstPos -> Stream.of(IntStream.range(0, k)
                            .filter(r -> firstPos[r] != Integer.MAX_VALUE)
                            .boxed()
                            .sorted(Comparator.comparingInt(r -> firstPos[r]))
                            .mapToInt(r -> r)
                            .toArray())
                        .mapToInt(order -> Stream.of(new int[half])
                            .mapToInt(pointer -> Stream.of(new int[k])
                                .peek(best -> Arrays.fill(best, Integer.MAX_VALUE))
                                .mapToInt(best -> IntStream.range(0, nums.length)
                                    .map(i -> IntStream.of(((nums[i] % half) + half) % half)
                                        .peek(value -> IntStream.iterate(pointer[value], p -> p + 1)
                                            .takeWhile(p -> p < order.length && firstPos[order[p]] <= i)
                                            .peek(p -> best[(order[p] + 2 * value) % k] =
                                                Math.min(best[(order[p] + 2 * value) % k], firstPos[order[p]]))
                                            .forEach(p -> pointer[value] = p + 1))
                                        .map(value -> Math.max(
                                            i + 1 - firstPos[prefix[i + 1]],
                                            i + 1 - best[prefix[i + 1]]))
                                        .sum())
                                    .max().orElse(0))
                                .sum())
                            .sum())
                        .sum())
                    .sum())
                .sum()
        ).sum();
    }
}
