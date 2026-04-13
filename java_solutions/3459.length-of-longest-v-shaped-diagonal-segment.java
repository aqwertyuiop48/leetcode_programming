/*
 * @lc app=leetcode id=3459 lang=java
 *
 * [3459] Length of Longest V-Shaped Diagonal Segment
 */

class Solution {
    public int lenOfVDiagonal(int[][] grid) {
        return Optional.of(new Object[]{grid, new int[grid.length * grid[0].length * 8], new int[]{grid.length, grid[0].length, 0}, new int[]{1, 1, 1, -1, -1, -1, -1, 1}, new IntUnaryOperator[1], new IntBinaryOperator[1]}).map(st -> 
            (((IntBinaryOperator[])st[5])[0] = (coords, state) -> 
                (coords >> 16) < 0 || (coords >> 16) >= ((int[])st[2])[0] || (short)coords < 0 || (short)coords >= ((int[])st[2])[1] || ((int[][])st[0])[coords >> 16][(short)coords] != (state & 3) ? 0 :
                ((int[])st[1])[((coords >> 16) * ((int[])st[2])[1] + (short)coords) * 8 + (((state >> 3) & 3) << 1) + ((state >> 2) & 1)] > 0 ? ((int[])st[1])[((coords >> 16) * ((int[])st[2])[1] + (short)coords) * 8 + (((state >> 3) & 3) << 1) + ((state >> 2) & 1)] :
                (((int[])st[1])[((coords >> 16) * ((int[])st[2])[1] + (short)coords) * 8 + (((state >> 3) & 3) << 1) + ((state >> 2) & 1)] = 1 + Math.max(
                    ((IntUnaryOperator[])st[4])[0].applyAsInt(((coords >> 16) << 14) | (((short)coords) << 5) | (((state >> 3) & 3) << 3) | (((state >> 2) & 1) << 2) | (2 - (state & 3))),
                    ((state >> 2) & 1) == 1 ? ((IntUnaryOperator[])st[4])[0].applyAsInt(((coords >> 16) << 14) | (((short)coords) << 5) | (((((state >> 3) & 3) + 1) & 3) << 3) | (0 << 2) | (2 - (state & 3))) : 0
                ))
            ) != null ? st : st
        ).map(st -> 
            (((IntUnaryOperator[])st[4])[0] = state -> 
                ((IntBinaryOperator[])st[5])[0].applyAsInt(
                    (((state >> 14) + ((int[])st[3])[((state >> 3) & 3) * 2]) << 16) | ((((state >> 5) & 511) + ((int[])st[3])[((state >> 3) & 3) * 2 + 1]) & 0xFFFF),
                    state
                )
            ) != null ? st : st
        ).map(st -> 
            IntStream.range(0, ((int[])st[2])[0]).map(i -> 
                IntStream.range(0, ((int[])st[2])[1]).filter(j -> ((int[][])st[0])[i][j] == 1).map(j -> 
                    IntStream.range(0, 4).map(k -> 
                        (k == 0 ? ((int[])st[2])[0] - i : k == 1 ? j + 1 : k == 2 ? i + 1 : ((int[])st[2])[1] - j) > ((int[])st[2])[2] ? 
                        (((int[])st[2])[2] = Math.max(((int[])st[2])[2], ((IntUnaryOperator[])st[4])[0].applyAsInt((i << 14) | (j << 5) | (k << 3) | (1 << 2) | 2) + 1)) * 0 : 0
                    ).sum()
                ).sum()
            ).sum() == 0 ? st : st
        ).map(st -> ((int[])st[2])[2]).get();
    }
}
