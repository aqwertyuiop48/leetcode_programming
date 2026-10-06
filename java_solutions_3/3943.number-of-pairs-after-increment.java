/*
 * @lc app=leetcode id=3943 lang=java
 *
 * [3943] Number of Pairs After Increment
 */

class Solution {
    public int[] numberOfPairs(int[] nums1, int[] nums2, int[][] queries) {
        return new long[nums2.length] instanceof long[] a && java.util.stream.IntStream.range(0, nums2.length).peek(i -> a[i] = nums2[i]).allMatch(x -> true)
            && new long[(a.length + 255) / 256] instanceof long[] lz && new long[lz.length][] instanceof long[][] vv && new int[lz.length][] instanceof int[][] cc
            && ((java.util.function.IntPredicate) b -> java.util.Arrays.stream(a, b * 256, Math.min(a.length, (b + 1) * 256)).sorted().toArray() instanceof long[] s
                && java.util.stream.IntStream.range(0, s.length).filter(i -> i == 0 || s[i] != s[i - 1]).toArray() instanceof int[] st
                && (vv[b] = java.util.Arrays.stream(st).mapToLong(i -> s[i]).toArray()) != null
                && (cc[b] = java.util.stream.IntStream.range(0, st.length).map(j -> (j + 1 < st.length ? st[j + 1] : s.length) - st[j]).toArray()) != null) instanceof java.util.function.IntPredicate rebuild
            && java.util.stream.IntStream.range(0, lz.length).allMatch(rebuild::test)
            && ((java.util.function.LongBinaryOperator) (b, key) -> key < vv[(int) b][0] || key > vv[(int) b][vv[(int) b].length - 1] || java.util.Arrays.binarySearch(vv[(int) b], key) < 0 ? 0 : cc[(int) b][java.util.Arrays.binarySearch(vv[(int) b], key)]) instanceof java.util.function.LongBinaryOperator at
            ? java.util.Arrays.stream(queries).filter(q -> q[0] == 2 || java.util.stream.IntStream.rangeClosed(q[1] / 256, q[2] / 256)
                    .map(b -> b * 256 >= q[1] && Math.min(a.length, (b + 1) * 256) - 1 <= q[2] ? (int) (lz[b] += q[3]) * 0
                        : java.util.stream.IntStream.rangeClosed(Math.max(q[1], b * 256), Math.min(q[2], Math.min(a.length, (b + 1) * 256) - 1)).map(i -> (int) (a[i] += q[3]) * 0).sum() + (rebuild.test(b) ? 0 : 1)).sum() < 0)
                .mapToInt(q -> java.util.stream.IntStream.range(0, lz.length * nums1.length)
                    .map(k -> (int) at.applyAsLong(k / nums1.length, q[1] - nums1[k % nums1.length] - lz[k / nums1.length])).sum()).toArray()
            : null;
    }
}
