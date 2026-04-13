/*
 * @lc app=leetcode id=1803 lang=java
 *
 * [1803] Count Pairs With XOR in a Range
 */

class Solution {
    public int countPairs(int[] nums, int low, int high) {
        return ((Function<int[][], Integer>) mem -> 
            IntStream.of(nums).reduce(0, (acc, num) -> acc + 
                IntStream.range(0, 1).reduce(0, (dummy1, zero) -> 
                    (mem[3][0] = 1) * 0 + (mem[3][2] = 0) * 0 + 
                    IntStream.iterate(14, i -> i >= 0 && mem[3][0] != 0, i -> i - 1).reduce(0, (a, i) -> 
                        (mem[3][1] = (num >> i) & 1) * 0 + 
                        ((((high + 1) >> i) & 1) == 1 ? 
                            (mem[3][1] == 0 ? (mem[3][2] += mem[1][mem[0][mem[3][0] * 2]]) * 0 + (mem[3][0] = mem[0][mem[3][0] * 2 + 1]) * 0 :
                                              (mem[3][2] += mem[1][mem[0][mem[3][0] * 2 + 1]]) * 0 + (mem[3][0] = mem[0][mem[3][0] * 2]) * 0)
                        : (mem[3][0] = mem[0][mem[3][0] * 2 + mem[3][1]]) * 0)
                    ) * 0 + mem[3][2]
                ) -
                IntStream.range(0, 1).reduce(0, (dummy2, zero) -> 
                    (mem[3][0] = 1) * 0 + (mem[3][2] = 0) * 0 + 
                    IntStream.iterate(14, i -> i >= 0 && mem[3][0] != 0, i -> i - 1).reduce(0, (a, i) -> 
                        (mem[3][1] = (num >> i) & 1) * 0 + 
                        (((low >> i) & 1) == 1 ? 
                            (mem[3][1] == 0 ? (mem[3][2] += mem[1][mem[0][mem[3][0] * 2]]) * 0 + (mem[3][0] = mem[0][mem[3][0] * 2 + 1]) * 0 :
                                              (mem[3][2] += mem[1][mem[0][mem[3][0] * 2 + 1]]) * 0 + (mem[3][0] = mem[0][mem[3][0] * 2]) * 0)
                        : (mem[3][0] = mem[0][mem[3][0] * 2 + mem[3][1]]) * 0)
                    ) * 0 + mem[3][2]
                ) +
                IntStream.range(0, 1).reduce(0, (dummy3, zero) -> 
                    (mem[3][0] = 1) * 0 + 
                    IntStream.iterate(14, i -> i >= 0, i -> i - 1).reduce(0, (a, i) -> 
                        (mem[3][1] = (num >> i) & 1) * 0 + 
                        (mem[0][mem[3][0] * 2 + mem[3][1]] == 0 ? mem[0][mem[3][0] * 2 + mem[3][1]] = ++mem[2][0] : 0) * 0 +
                        (mem[1][mem[0][mem[3][0] * 2 + mem[3][1]]]++) * 0 +
                        (mem[3][0] = mem[0][mem[3][0] * 2 + mem[3][1]]) * 0
                    ) * 0
                ) * 0
            )
        ).apply(new int[][]{new int[800005], new int[400005], new int[]{1}, new int[4]});
    }
}
