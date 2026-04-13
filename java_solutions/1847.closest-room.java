/*
 * @lc app=leetcode id=1847 lang=java
 *
 * [1847] Closest Room
 */

class Solution {
    public int[] closestRoom(int[][] rooms, int[][] queries) {
        return (((Function<int[][], Function<int[], Function<TreeSet<Integer>, int[]>>>) (queInd -> ans -> ts -> 
            IntStream.range(0, queries.length).reduce(0, (acc, i) -> (queInd[i] = new int[]{queries[i][1], queries[i][0], i}).hashCode() * 0) * 0 == 0 &&
            IntStream.of(0).peek(x -> Arrays.sort(queInd, (a, b) -> Integer.compare(b[0], a[0]))).peek(x -> Arrays.sort(rooms, (a, b) -> Integer.compare(b[1], a[1]))).sum() * 0 == 0 ?
            (((Function<int[], int[]>) (ptrs -> 
                IntStream.range(0, queries.length).reduce(0, (acc, i) -> 
                    IntStream.iterate(0, d -> ptrs[0] < rooms.length && rooms[ptrs[0]][1] >= queInd[i][0], d -> d + 1).reduce(0, (a, d) -> (ts.add(rooms[ptrs[0]++][0]) ? 1 : 1) * 0) * 0 +
                    (((Function<Integer, Function<Integer, Integer>>) (floor -> ceil -> 
                        (ans[queInd[i][2]] = floor == null && ceil == null ? -1 : floor == null ? (int)ceil : ceil == null ? (int)floor : Math.abs((int)floor - queInd[i][1]) <= Math.abs((int)ceil - queInd[i][1]) ? (int)floor : (int)ceil) * 0
                    ))).apply(ts.floor(queInd[i][1])).apply(ts.ceiling(queInd[i][1])) * 0
                ) * 0 == 0 ? ans : ans
            ))).apply(new int[1]) : ans
        ))).apply(new int[queries.length][]).apply(new int[queries.length]).apply(new TreeSet<>());
    }
}
