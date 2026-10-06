/*
 * @lc app=leetcode id=3943 lang=java
 *
 * [3943] Number of Pairs After Increment
 */

class Solution {
    public int[] numberOfPairs(int[] nums1, int[] nums2, int[][] queries) {
        return new long[nums2.length] instanceof long[] a && java.util.stream.IntStream.range(0, nums2.length).map(i -> (int) (a[i] = nums2[i]) * 0).sum() == 0
            && new long[(nums2.length + 511) / 512 * 1088] instanceof long[] T && new long[(nums2.length + 511) / 512] instanceof long[] lz && new long[lz.length] instanceof long[] E
            && java.util.stream.IntStream.range(0, 5).mapToLong(i -> i < nums1.length ? nums1[i] : 1L << 40).toArray() instanceof long[] xs
            && new java.util.concurrent.atomic.AtomicReference<java.util.function.LongBinaryOperator>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.LongBinaryOperator> fr
            && fr.getAndSet((p, k) -> T[(int) p] >>> 43 != k >>> 33 ? 0 : (T[(int) p] >> 10) == k ? T[(int) p] & 1023 : fr.get().applyAsLong(p + 1, k)) == null && fr.get() instanceof java.util.function.LongBinaryOperator cf
            && new java.util.concurrent.atomic.AtomicReference<java.util.function.LongBinaryOperator>() instanceof java.util.concurrent.atomic.AtomicReference<java.util.function.LongBinaryOperator> gr
            && gr.getAndSet((p, k) -> T[(int) p] >>> 43 != k >>> 33 ? (T[(int) p] = k << 10 | 1) : (T[(int) p] >> 10) == k ? ++T[(int) p] : gr.get().applyAsLong(p + 1, k)) == null && gr.get() instanceof java.util.function.LongBinaryOperator inf
            && ((java.util.function.IntPredicate) b -> (E[b] += 1) > 0 && java.util.stream.IntStream.range(b * 512, Math.min(nums2.length, b * 512 + 512))
                .map(i -> (int) inf.applyAsLong(b * 1088L + (a[i] * 0x9E3779B97F4A7C15L >>> 54), E[b] << 33 | a[i]) * 0).sum() == 0) instanceof java.util.function.IntPredicate rb
            && java.util.stream.IntStream.range(0, lz.length).allMatch(rb::test)
            && ((java.util.function.LongBinaryOperator) (b, w) -> T[(int) (b * 1088 + (w * 0x9E3779B97F4A7C15L >>> 54))] >>> 43 != E[(int) b] ? 0
                : (T[(int) (b * 1088 + (w * 0x9E3779B97F4A7C15L >>> 54))] >> 10) == (E[(int) b] << 33 | w) ? T[(int) (b * 1088 + (w * 0x9E3779B97F4A7C15L >>> 54))] & 1023
                : cf.applyAsLong(b * 1088 + (w * 0x9E3779B97F4A7C15L >>> 54) + 1, E[(int) b] << 33 | w)) instanceof java.util.function.LongBinaryOperator at
            ? java.util.Arrays.stream(queries).filter(q -> q[0] == 2 || java.util.stream.IntStream.rangeClosed(q[1] / 512, q[2] / 512)
                    .map(b -> b * 512 >= q[1] && Math.min(nums2.length, b * 512 + 512) - 1 <= q[2] ? (int) (lz[b] += q[3]) * 0
                        : java.util.stream.IntStream.rangeClosed(Math.max(q[1], b * 512), Math.min(q[2], b * 512 + 511)).map(i -> (int) (a[i] += q[3]) * 0).sum() + (rb.test(b) ? 0 : 1)).sum() < 0)
                .mapToInt(q -> (int) java.util.stream.IntStream.range(0, lz.length).mapToLong(b -> at.applyAsLong(b, q[1] - xs[0] - lz[b]) + at.applyAsLong(b, q[1] - xs[1] - lz[b]) + at.applyAsLong(b, q[1] - xs[2] - lz[b]) + at.applyAsLong(b, q[1] - xs[3] - lz[b]) + at.applyAsLong(b, q[1] - xs[4] - lz[b])).sum()).toArray()
            : null;
    }
}
