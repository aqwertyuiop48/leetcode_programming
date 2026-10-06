/*
 * @lc app=leetcode id=4037 lang=java
 *
 * [4037] Maximum Valid Split Positions II
 */

class Solution {
    public int maxValidSplits(int[] nums) {
        return new java.util.concurrent.atomic.AtomicReference<java.util.function.IntBinaryOperator>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.IntBinaryOperator> gr
    && gr.getAndSet((x, y) -> y == 0 ? x : gr.get().applyAsInt(y, x % y)) == null && gr.get() instanceof java.util.function.IntBinaryOperator g
            && java.util.stream.IntStream.range(1, 17).boxed().reduce(java.util.List.of(nums),
                (lst, k) -> java.util.stream.Stream.concat(lst.stream(), java.util.stream.Stream.of(java.util.stream.IntStream.range(0, Math.max(0, nums.length - (1 << k) + 1))
                    .map(i -> g.applyAsInt(lst.get(k - 1)[i], lst.get(k - 1)[i + (1 << (k - 1))])).toArray())).toList(), (a, b) -> a) instanceof java.util.List<int[]> sp
            && new int[nums.length] instanceof int[] P && new int[nums.length] instanceof int[] S
            && java.util.stream.IntStream.range(0, nums.length).peek(i -> P[i] = g.applyAsInt(i == 0 ? 0 : P[i - 1], nums[i])).allMatch(x -> true)
            && java.util.stream.IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1).peek(i -> S[i] = g.applyAsInt(i == nums.length - 1 ? 0 : S[i + 1], nums[i])).allMatch(x -> true)
            && ((java.util.function.BiFunction<int[], java.util.function.IntPredicate, Integer>) (rg, pr) -> java.util.stream.Stream.iterate(rg, x -> x[0] < x[1],
                    x -> pr.test((x[0] + x[1]) / 2) ? new int[]{x[0], (x[0] + x[1]) / 2} : new int[]{(x[0] + x[1]) / 2 + 1, x[1]})
                .reduce((u, v) -> v).map(x -> pr.test((x[0] + x[1]) / 2) ? (x[0] + x[1]) / 2 : (x[0] + x[1]) / 2 + 1).orElse(rg[0])) instanceof java.util.function.BiFunction<int[], java.util.function.IntPredicate, Integer> ft
            && ((java.util.function.BiFunction<int[], java.util.function.IntPredicate, Integer>) (rg, pr) -> java.util.stream.Stream.iterate(rg, x -> x[0] < x[1],
                    x -> pr.test((x[0] + x[1] + 1) / 2) ? new int[]{(x[0] + x[1] + 1) / 2, x[1]} : new int[]{x[0], (x[0] + x[1] + 1) / 2 - 1})
                .reduce((u, v) -> v).map(x -> pr.test((x[0] + x[1] + 1) / 2) ? (x[0] + x[1] + 1) / 2 : (x[0] + x[1] + 1) / 2 - 1).orElse(rg[0])) instanceof java.util.function.BiFunction<int[], java.util.function.IntPredicate, Integer> lt
            && ((java.util.function.IntBinaryOperator) (l, r) -> l > r ? 0 : g.applyAsInt(sp.get(31 - Integer.numberOfLeadingZeros(r - l + 1))[l],
                    sp.get(31 - Integer.numberOfLeadingZeros(r - l + 1))[r - (1 << (31 - Integer.numberOfLeadingZeros(r - l + 1))) + 1])) instanceof java.util.function.IntBinaryOperator rq
            ? Math.max(Math.max(0, lt.apply(new int[]{0, nums.length - 1}, j -> S[j] <= P[nums.length - 1]) - ft.apply(new int[]{0, nums.length - 1}, i -> P[i] <= P[nums.length - 1])),
                java.util.stream.IntStream.range(0, nums.length).map(r -> java.util.stream.IntStream.of(g.applyAsInt(r == 0 ? 0 : P[r - 1], r == nums.length - 1 ? 0 : S[r + 1])).map(G -> Math.max(0,
                    (r < nums.length - 1 && S[r + 1] == G ? lt.apply(new int[]{r + 1, nums.length - 1}, j -> S[j] <= G) - 1
                        : lt.apply(new int[]{0, r - 1}, j -> g.applyAsInt(rq.applyAsInt(j, r - 1), r == nums.length - 1 ? 0 : S[r + 1]) == G))
                    - (r >= 1 && P[r - 1] == G ? ft.apply(new int[]{0, r - 1}, i -> P[i] <= G)
                        : ft.apply(new int[]{r + 1, nums.length - 1}, j -> g.applyAsInt(r == 0 ? 0 : P[r - 1], rq.applyAsInt(r + 1, j)) == G) - 1))).findFirst().getAsInt()).max().orElse(0))
            : 0;
    }
}
