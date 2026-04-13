/*
 * @lc app=leetcode id=1982 lang=java
 *
 * [1982] Find Array Given Subset Sums
 */

class Solution {
    public int[] recoverArray(int n, int[] sums) {
        return ((Function<Object[], int[]>) state -> 
            IntStream.range(0, n).reduce(0, (acc, i) -> 
                ((Function<Object[], Integer>) step -> 
                    IntStream.range(0, ((int[])state[0]).length).reduce(0, (a, j) -> 
                        !((boolean[])step[4])[j] ? 
                            (((int[])step[2])[((int[])step[5])[2]++] = ((int[])state[0])[j]) * 0 +
                            (((int[])state[0])[j] == 0 ? (((int[])step[5])[4] = 1) * 0 : 0) +
                            ((IntUnaryOperator) kIdx -> 
                                (((boolean[])step[4])[ ((int[])step[5])[1] = kIdx ] = true) ? 
                                    (((int[])step[3])[((int[])step[5])[3]++] = ((int[])state[0])[kIdx]) * 0 
                                : 0
                            ).applyAsInt(
                                IntStream.range(Math.max(((int[])step[5])[1], j + 1), ((int[])state[0]).length)
                                         .filter(k -> !((boolean[])step[4])[k] && ((int[])state[0])[k] == ((int[])state[0])[j] + (int)step[1])
                                         .findFirst().getAsInt()
                            )
                        : 0
                    ) * 0 +
                    (((int[])state[1])[i] = ((int[])step[5])[4] == 1 ? (int)step[1] : -(int)step[1]) * 0 +
                    ((state[0] = ((int[])step[5])[4] == 1 ? step[2] : step[3]).hashCode() * 0)
                ).apply(new Object[]{
                    ((int[])state[0]).length,
                    ((int[])state[0])[1] - ((int[])state[0])[0],
                    new int[((int[])state[0]).length / 2],
                    new int[((int[])state[0]).length / 2],
                    new boolean[((int[])state[0]).length],
                    new int[]{0, 0, 0, 0, 0}
                }) * 0
            ) * 0 == 0 ? (int[])state[1] : null
        ).apply(new Object[]{ IntStream.of(sums).sorted().toArray(), new int[n] });
    }
}
