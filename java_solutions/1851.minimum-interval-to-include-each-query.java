/*
 * @lc app=leetcode id=1851 lang=java
 *
 * [1851] Minimum Interval to Include Each Query
 */

class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        return (((Function<int[][], Function<int[], Function<int[], int[]>>>) (queInd -> parent -> ans -> 
            IntStream.range(0, queries.length).reduce(0, (acc, i) -> (queInd[i] = new int[]{queries[i], i}).hashCode() * 0 + (parent[i] = i) * 0 + (ans[i] = -1) * 0) * 0 == 0 &&
            (parent[queries.length] = queries.length) * 0 == 0 &&
            IntStream.of(0).peek(x -> Arrays.sort(queInd, (a, b) -> Integer.compare(a[0], b[0]))).peek(x -> Arrays.sort(intervals, (a, b) -> Integer.compare(a[1] - a[0], b[1] - b[0]))).sum() * 0 == 0 ?
            (((Function<IntUnaryOperator[], int[]>) (find -> 
                (find[0] = (i -> parent[i] == i ? i : (parent[i] = find[0].applyAsInt(parent[i])))) != null &&
                IntStream.range(0, intervals.length).reduce(0, (acc, i) -> 
                    (((ToIntFunction<int[]>) (bs -> 
                        IntStream.iterate(0, d -> bs[0] <= bs[1], d -> d + 1).reduce(0, (a, d) -> (((IntUnaryOperator) (mid -> queInd[mid][0] >= intervals[i][0] ? (bs[2] = mid) * 0 + (bs[1] = mid - 1) * 0 : (bs[0] = mid + 1) * 0))).applyAsInt((bs[0] + bs[1]) >>> 1) * 0) * 0 == 0 && bs[2] != -1 ?
                        IntStream.iterate(find[0].applyAsInt(bs[2]), idx -> idx < queries.length && queInd[idx][0] <= intervals[i][1], idx -> find[0].applyAsInt(idx + 1)).reduce(0, (a, idx) -> (ans[queInd[idx][1]] = intervals[i][1] - intervals[i][0] + 1) * 0 + (parent[idx] = idx + 1) * 0) * 0 : 0
                    ))).applyAsInt(new int[]{0, queries.length - 1, -1}) * 0
                ) * 0 == 0 ? ans : ans
            ))).apply(new IntUnaryOperator[1]) : ans
        ))).apply(new int[queries.length][]).apply(new int[queries.length + 1]).apply(new int[queries.length]);
    }
}
