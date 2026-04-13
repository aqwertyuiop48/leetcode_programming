/*
 * @lc app=leetcode id=3715 lang=java
 *
 * [3715] Sum of Perfect Square Ancestors
 */

class Solution {
    public long sumOfAncestors(int n, int[][] edges, int[] nums) {
        return Stream.<Object[]>of(new Object[]{
                new ArrayList[n],                // s[0]: Adj List
                new HashMap<Integer, Long>(),    // s[1]: Path Map
                new ArrayDeque<int[]>(),         // s[2]: Stack
                new long[]{0L}                             // s[3]: Result
            })
            .peek(s -> IntStream.range(0, n).forEach(i -> ((List<Integer>[]) s[0])[i] = new ArrayList<>()))
            .peek(s -> Arrays.stream(edges).allMatch(e -> ((List<Integer>[]) s[0])[e[0]].add(e[1]) && ((List<Integer>[]) s[0])[e[1]].add(e[0])))
            // Optimized Kernelization: Using a single stream with side-effects to mimic the while loop efficiently
            .peek(s -> IntStream.range(0, n).forEach(i -> IntStream.iterate(2, j -> j * j <= nums[i], j -> j + 1)
                .filter(j -> nums[i] % (j * j) == 0)
                .forEach(j -> IntStream.generate(() -> 0).allMatch(_z -> (nums[i] % (j * j) == 0) ? (nums[i] /= (j * j)) >= 0 : false))))
            .peek(s -> ((Deque<int[]>) s[2]).push(new int[]{0, -1, 0}))
            .mapToLong(s -> Stream.generate(() -> ((Deque<int[]>) s[2]).pollFirst()).takeWhile(Objects::nonNull)
                .allMatch(t -> t[2] == 0 
                    ? Stream.of(t).peek(tk -> ((long[]) s[3])[0] += ((Map<Integer, Long>) s[1]).getOrDefault(nums[tk[0]], 0L))
                        .peek(tk -> ((Map<Integer, Long>) s[1]).merge(nums[tk[0]], 1L, Long::sum))
                        .peek(tk -> ((Deque<int[]>) s[2]).push(new int[]{tk[0], tk[1], 1}))
                        .allMatch(tk -> ((List<Integer>[]) s[0])[tk[0]].stream().filter(v -> v != tk[1])
                            .allMatch(v -> ((Deque<int[]>) s[2]).offerFirst(new int[]{v, tk[0], 0})))
                    : Stream.of(t).peek(tk -> ((Map<Integer, Long>) s[1]).merge(nums[tk[0]], -1L, (ov, nv) -> ov == 1L ? null : ov - 1L)).findAny().isPresent()
                ) ? ((long[]) s[3])[0] : 0L)
            .findFirst().getAsLong();
    }
}
