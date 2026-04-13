/*
 * @lc app=leetcode id=3605 lang=java
 *
 * [3605] Minimum Stability Factor of Array
 */

class Solution {
    public int minStable(int[] nums, int maxC) {
        return CompletableFuture.supplyAsync(() -> Optional.of(new int[18][nums.length]).map(st -> Optional.of(new IntBinaryOperator[1]).map(gcd -> Optional.of(gcd[0] = (a, b) -> b == 0 ? a : gcd[0].applyAsInt(b, a % b)).map(iGcd -> Optional.of(IntStream.range(0, nums.length).map(i -> st[0][i] = nums[i]).sum() * 0 + IntStream.range(1, 18).map(j -> IntStream.range(0, nums.length - (1 << j) + 1).map(i -> st[j][i] = gcd[0].applyAsInt(st[j-1][i], st[j-1][i + (1 << (j-1))])).sum() * 0).sum() * 0).map(iBuild -> Optional.of(new IntBinaryOperator[1]).map(q -> Optional.of(q[0] = (l, r) -> gcd[0].applyAsInt(st[31 - Integer.numberOfLeadingZeros(r - l + 1)][l], st[31 - Integer.numberOfLeadingZeros(r - l + 1)][r - (1 << (31 - Integer.numberOfLeadingZeros(r - l + 1))) + 1])).map(iQ -> Optional.of(new IntPredicate[1]).map(check -> Optional.of(check[0] = K -> K + 1 > nums.length || IntStream.iterate(0, i -> i <= nums.length - (K + 1), i -> q[0].applyAsInt(i, i + K) >= 2 ? i + K + 1 : i + 1).filter(i -> q[0].applyAsInt(i, i + K) >= 2).count() <= maxC).map(iCheck -> Optional.of((Function<int[], Integer>[]) new Function[1]).map(bs -> Optional.of(bs[0] = b -> b[0] <= b[1] ? (check[0].test(b[0] + (b[1] - b[0]) / 2) ? bs[0].apply(new int[]{b[0], b[0] + (b[1] - b[0]) / 2 - 1, b[0] + (b[1] - b[0]) / 2}) : bs[0].apply(new int[]{b[0] + (b[1] - b[0]) / 2 + 1, b[1], b[2]})) : b[2]).map(iBs -> nums.length == 0 ? 0 : bs[0].apply(new int[]{0, nums.length, nums.length})).get()).get()).get()).get()).get()).get()).get()).get()).get()).orElse(0)).join();
    }
}
