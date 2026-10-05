/*
 * @lc app=leetcode id=4012 lang=java
 *
 * [4012] Count of Unfinished Tasks After Each Shift
 */

class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        return Stream.of(
            new long[tasks.length], // prefix sums p
            new long[1]             // accumulated damage d [0]
        ).toArray(long[][]::new) instanceof long[][] state ?
            IntStream.range(0, tasks.length)
                .mapToLong(i -> state[0][i] = (i > 0 ? state[0][i - 1] : 0L) + tasks[i])
                .toArray() instanceof long[] p && p.length > 0 ?
                    IntStream.range(0, shifts.length)
                        .map(i ->
                            (state[1][0] + shifts[i] >= p[p.length - 1] ?
                                (state[1][0] = 0L) * 0 == 0 ? 0 : 0
                            :
                                (state[1][0] += shifts[i]) * 0 == 0 ?
                                    p.length - Math.abs(Arrays.binarySearch(p, state[1][0]) + 1)
                                : 0
                            )
                        ).toArray()
                : new int[0]
        : new int[0];
    }
}
