/*
 * @lc app=leetcode id=1782 lang=java
 *
 * [1782] Count Pairs Of Nodes
 */

class Solution {
    public int[] countPairs(int n, int[][] edges, int[] queries) {
        return ((Function<int[][], Function<long[][], int[]>>) mem -> memLong -> 
            IntStream.range(0, edges.length).reduce(0, (acc, i) -> 
                (mem[0][Math.min(edges[i][0], edges[i][1]) - 1]++) * 0 + 
                (mem[0][Math.max(edges[i][0], edges[i][1]) - 1]++) * 0 + 
                (int)((memLong[0][i] = ((long)(Math.min(edges[i][0], edges[i][1]) - 1) << 32) | (Math.max(edges[i][0], edges[i][1]) - 1)) * 0L)
            ) * 0 == 0 &&
            (mem[2] = IntStream.of(mem[0]).sorted().toArray()).hashCode() * 0 == 0 &&
            (memLong[0] = LongStream.of(memLong[0]).sorted().toArray()).hashCode() * 0 == 0 ?
            IntStream.range(0, queries.length).reduce(0, (acc, q) -> 
                (mem[3][0] = 0) * 0 + (mem[3][1] = n - 1) * 0 +
                IntStream.iterate(0, d -> mem[3][0] < mem[3][1], d -> d + 1).reduce(0, (a, d) -> 
                    mem[2][mem[3][0]] + mem[2][mem[3][1]] > queries[q] ? (mem[1][q] += mem[3][1] - mem[3][0]) * 0 + (mem[3][1]--) * 0 : (mem[3][0]++) * 0
                ) * 0 +
                (mem[3][2] = 0) * 0 +
                IntStream.iterate(0, d -> mem[3][2] < edges.length, d -> d + 1).reduce(0, (a, d) -> 
                    (mem[3][3] = mem[3][2]) * 0 +
                    IntStream.iterate(mem[3][2], j -> j < edges.length && memLong[0][j] == memLong[0][mem[3][2]], j -> j + 1).reduce(0, (a2, j) -> (mem[3][3] = j + 1) * 0) * 0 +
                    (mem[0][(int)(memLong[0][mem[3][2]] >>> 32)] + mem[0][(int)(memLong[0][mem[3][2]] & 0xFFFFFFFFL)] > queries[q] && mem[0][(int)(memLong[0][mem[3][2]] >>> 32)] + mem[0][(int)(memLong[0][mem[3][2]] & 0xFFFFFFFFL)] - (mem[3][3] - mem[3][2]) <= queries[q] ? (mem[1][q]--) * 0 : 0) * 0 +
                    (mem[3][2] = mem[3][3]) * 0
                ) * 0
            ) * 0 == 0 ? mem[1] : mem[1] : mem[1]
        ).apply(new int[][]{new int[n], new int[queries.length], new int[0], new int[4]}).apply(new long[][]{new long[edges.length]});
    }
}
