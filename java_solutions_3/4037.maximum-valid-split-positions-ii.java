/*
 * @lc app=leetcode id=4037 lang=java
 *
 * [4037] Maximum Valid Split Positions II
 */

class Solution {
    public int maxValidSplits(int[] nums) {
        return nums.length < 2 ? 0 : new java.util.concurrent.atomic.AtomicReference<java.util.function.IntBinaryOperator>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.IntBinaryOperator> gr
            && gr.getAndSet((x, y) -> y == 0 ? x : gr.get().applyAsInt(y, x % y)) == null && gr.get() instanceof java.util.function.IntBinaryOperator g
            && new int[nums.length + 1] instanceof int[] P0 && new int[nums.length + 2] instanceof int[] S && new int[2 * nums.length] instanceof int[] T
            && java.util.stream.IntStream.range(0, nums.length).peek(i -> P0[i + 1] = g.applyAsInt(P0[i], nums[i])).allMatch(x -> true)
            && java.util.stream.IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1).peek(i -> S[i] = g.applyAsInt(S[i + 1], nums[i])).allMatch(x -> true)
            && java.util.stream.IntStream.range(0, nums.length).peek(i -> T[nums.length + i] = nums[i]).allMatch(x -> true)
            && java.util.stream.IntStream.iterate(nums.length - 1, i -> i >= 1, i -> i - 1).peek(i -> T[i] = g.applyAsInt(T[2 * i], T[2 * i + 1])).allMatch(x -> true)
            && new int[nums.length + 2] instanceof int[] nx && new int[nums.length + 2] instanceof int[] pv
            && java.util.stream.IntStream.iterate(nums.length, i -> i >= 0, i -> i - 1).peek(i -> nx[i] = i == nums.length ? nums.length + 1 : P0[i + 1] != P0[i] ? i + 1 : nx[i + 1]).allMatch(x -> true)
            && java.util.stream.IntStream.rangeClosed(0, nums.length).peek(k -> pv[k] = k == 0 ? -1 : S[k - 1] != S[k] ? k - 1 : pv[k - 1]).allMatch(x -> true)
            && new int[nums.length] instanceof int[] ps && new int[nums.length] instanceof int[] se
            && java.util.stream.IntStream.range(0, nums.length).peek(i -> ps[i] = i == 0 || P0[i + 1] != P0[i] ? i : ps[i - 1]).allMatch(x -> true)
            && java.util.stream.IntStream.iterate(nums.length - 1, i -> i >= 0, i -> i - 1).peek(i -> se[i] = i == nums.length - 1 || S[i] != S[i + 1] ? i : se[i + 1]).allMatch(x -> true)
            && new java.util.HashMap<java.util.List<Integer>, Integer>() instanceof java.util.HashMap<java.util.List<Integer>, Integer> memo
            && ((java.util.function.IntBinaryOperator) (l, r) -> l > r ? 0 : java.util.stream.Stream.iterate(new int[]{l + nums.length, r + nums.length + 1, 0},
                    s -> new int[]{(s[0] + (s[0] & 1)) >> 1, (s[1] - (s[1] & 1)) >> 1, g.applyAsInt(g.applyAsInt(s[2], (s[0] & 1) == 1 ? T[s[0]] : 0), (s[1] & 1) == 1 ? T[s[1] - 1] : 0)})
                .filter(s -> s[0] >= s[1]).findFirst().get()[2]) instanceof java.util.function.IntBinaryOperator rq
            && ((java.util.function.BiFunction<int[], java.util.function.IntPredicate, Integer>) (rg, pr) -> java.util.stream.Stream.iterate(new int[]{rg[0], rg[1] + 1},
                    x -> pr.test((x[0] + x[1]) / 2) ? new int[]{x[0], (x[0] + x[1]) / 2} : new int[]{(x[0] + x[1]) / 2 + 1, x[1]})
                .filter(x -> x[0] >= x[1]).findFirst().get()[0]) instanceof java.util.function.BiFunction<int[], java.util.function.IntPredicate, Integer> ft
            ? Math.max(Math.max(0, se[0] - ps[nums.length - 1]),
                java.util.stream.IntStream.range(0, nums.length).map(r -> java.util.stream.IntStream.of(g.applyAsInt(P0[r], S[r + 1])).map(G ->
                    java.util.stream.IntStream.of(P0[r] == G ? ps[r - 1]
                            : memo.computeIfAbsent(java.util.List.of(0, P0[r], nx[r] - 1 > r ? nx[r] - 1 : r + 1, G),
                                k -> ft.apply(new int[]{k.get(2), nums.length - 1}, x -> g.applyAsInt(k.get(1), rq.applyAsInt(k.get(2), x)) == k.get(3)))).map(a ->
                        java.util.stream.IntStream.of(S[r + 1] == G ? se[r + 1]
                                : memo.computeIfAbsent(java.util.List.of(1, S[r + 1], pv[r + 1] == r ? r - 1 : pv[r + 1], G),
                                    k -> ft.apply(new int[]{0, k.get(2)}, x -> g.applyAsInt(k.get(1), rq.applyAsInt(x, k.get(2))) != k.get(3)) - 1)).map(b ->
                            Math.max(0, (b > r ? b - 1 : b) - (a < r ? a : a - 1))).findFirst().getAsInt()).findFirst().getAsInt()).findFirst().getAsInt()).max().getAsInt())
            : 0;
    }
}
