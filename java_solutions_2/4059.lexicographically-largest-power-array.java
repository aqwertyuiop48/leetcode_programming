/*
 * @lc app=leetcode id=4059 lang=java
 *
 * [4059] Lexicographically Largest Power Array
 */

class Solution {
    public int[] largestPower(int[] A) {
        return Stream.of(new int[15])
            .peek(res -> Stream.of(new int[15])
                .peek(done -> Stream.of(new java.util.concurrent.atomic.AtomicReference<BiFunction<List<Integer>, Integer, Integer>>())
                    .peek(f -> f.set((list, i) ->
                        i == 15 ? 0
                        : done[i] == 1 ? f.get().apply(list, i + 1)
                        : Stream.of(list.stream().collect(Collectors.partitioningBy(a -> (a & (1 << (14 - i))) != 0)))
                            .mapToInt(m ->
                                (m.get(true).isEmpty() ? 0
                                    : (res[i] += m.get(true).size()) * 0 + f.get().apply(m.get(true), i + 1))
                              + (m.get(false).isEmpty() ? 0
                                    : (done[i] = 1) * 0 + f.get().apply(m.get(false), i + 1)))
                            .sum()))
                    .peek(f -> f.get().apply(Arrays.stream(A).boxed().toList(), 0))
                    .findFirst())
                .findFirst())
            .findFirst().get();
    }
}
