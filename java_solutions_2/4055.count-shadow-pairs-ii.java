/*
 * @lc app=leetcode id=4055 lang=java
 *
 * [4055] Count Shadow Pairs II
 */

class Solution {
    public int shadowPairs(int[] nums) {
        return Stream.of(Arrays.stream(nums).distinct().sorted().toArray())
            .mapToInt(sorted -> Stream.of(Arrays.stream(nums).map(x -> Arrays.binarySearch(sorted, x)).toArray())
                .mapToInt(vals -> Stream.<int[][]>of(new int[2][nums.length])          // w[0] = sidx, w[1] = lidx
                    .mapToInt(w -> Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.ToIntFunction<int[]>>())
                        .peek(f -> f.set(a ->                                         // a = {left, right, lval, hval}
                            (a[1] - a[0] <= 1 || a[3] - a[2] <= 1) ? 0
                            : Stream.of(new int[4])                                    // st = {smallTop, largeTop, smallCount, ans}
                                .mapToInt(st -> IntStream.of(a[2] + (a[3] - a[2]) / 2)
                                    .map(mid ->
                                        IntStream.range(a[0], a[1]).map(i -> vals[i] < mid
                                            ? IntStream.generate(() -> 0)
                                                  .takeWhile(t -> st[0] > 0 && vals[w[0][st[0] - 1]] < vals[i])
                                                  .map(t -> st[0]--).sum() * 0
                                              + (w[0][st[0]++] = i) * 0
                                              + st[2]++ * 0
                                            : IntStream.of(IntStream.generate(() -> 0)
                                                  .takeWhile(t -> st[1] > 0 && vals[w[1][st[1] - 1]] >= vals[i])
                                                  .map(t -> st[1]--).sum())
                                                .map(u -> Stream.iterate(new int[]{0, st[0]},
                                                        p -> w[0][p[0] + (p[1] - p[0]) / 2] <= (st[1] > 0 ? w[1][st[1] - 1] : a[0] - 1)
                                                            ? new int[]{p[0] + (p[1] - p[0]) / 2 + 1, p[1]}
                                                            : new int[]{p[0], p[0] + (p[1] - p[0]) / 2})
                                                    .dropWhile(p -> p[0] < p[1])
                                                    .findFirst().get()[0])
                                                .map(low -> (st[3] += st[0] - low) * 0 + (w[1][st[1]++] = i) * 0)
                                                .sum()
                                        ).sum() * 0
                                        + Stream.of(IntStream.concat(
                                                    IntStream.range(a[0], a[1]).map(i -> vals[i]).filter(v -> v < mid),
                                                    IntStream.range(a[0], a[1]).map(i -> vals[i]).filter(v -> v >= mid)).toArray())
                                            .mapToInt(part -> IntStream.range(0, part.length)
                                                .map(j -> vals[a[0] + j] = part[j]).sum())
                                            .sum() * 0
                                        + st[3]
                                        + f.get().applyAsInt(new int[]{a[0], a[0] + st[2], a[2], mid})
                                        + f.get().applyAsInt(new int[]{a[0] + st[2], a[1], mid, a[3]}))
                                    .sum())
                                .sum()))
                        .mapToInt(f -> f.get().applyAsInt(new int[]{0, nums.length, 0, sorted.length}))
                        .sum())
                    .sum())
                .sum())
            .sum();
    }
}
