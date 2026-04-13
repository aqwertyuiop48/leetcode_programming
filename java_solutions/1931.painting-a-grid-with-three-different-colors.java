/*
 * @lc app=leetcode id=1931 lang=java
 *
 * [1931] Painting a Grid With Three Different Colors
 */

class Solution {
    public int colorTheGrid(int m, int n) {
        return ((Function<int[], Function<int[], Function<int[], Function<int[][], Integer>>>>) p3 -> valid -> len -> trans -> 
            (p3[0] = 1) * 0 + (p3[1] = 3) * 0 + (p3[2] = 9) * 0 + (p3[3] = 27) * 0 + (p3[4] = 81) * 0 == 0 &&
            (len[0] = IntStream.range(0, p3[m == 5 ? 4 : m - 1] * 3).filter(mask -> IntStream.range(0, m - 1).allMatch(j -> (mask / p3[j]) % 3 != (mask / p3[j + 1]) % 3)).reduce(0, (acc, i) -> (valid[acc] = i) * 0 + acc + 1)) > 0 &&
            IntStream.range(0, len[0]).reduce(0, (acc, i) -> IntStream.range(0, len[0]).reduce(0, (a, j) -> (trans[i][j] = IntStream.range(0, m).allMatch(bit -> (valid[i] / p3[bit]) % 3 != (valid[j] / p3[bit]) % 3) ? 1 : 0) * 0) * 0) * 0 == 0 ?
            ((Function<long[], Function<long[], Integer>>) dp -> nextDp -> 
                IntStream.range(0, len[0]).reduce(0, (acc, i) -> (int)((dp[i] = 1) * 0)) * 0 == 0 &&
                IntStream.range(1, n).reduce(0, (acc, col) -> 
                    IntStream.range(0, len[0]).reduce(0, (a, i) -> (int)((nextDp[i] = IntStream.range(0, len[0]).filter(j -> trans[i][j] == 1).mapToLong(j -> dp[j]).sum() % 1000000007L) * 0L)) * 0 + 
                    IntStream.range(0, len[0]).reduce(0, (a, i) -> (int)((dp[i] = nextDp[i]) * 0L)) * 0
                ) * 0 == 0 ? (int)(Arrays.stream(dp, 0, len[0]).sum() % 1000000007L) : 0
            ).apply(new long[len[0]]).apply(new long[len[0]]) : 0
        ).apply(new int[6]).apply(new int[243]).apply(new int[1]).apply(new int[243][243]);
    }
}
