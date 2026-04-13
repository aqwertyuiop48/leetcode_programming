/*
 * @lc app=leetcode id=1787 lang=java
 *
 * [1787] Make the XOR of All Segments Equal to Zero
 */

class Solution {
    public int minChanges(int[] nums, int k) {
        return ((Function<int[][], Integer>) mem -> 
            IntStream.range(0, nums.length).reduce(0, (acc, i) -> (mem[0][(i % k) * 1024 + nums[i]]++) * 0 + (mem[1][i % k]++) * 0) * 0 == 0 &&
            IntStream.range(1, 1024).reduce(0, (acc, i) -> (mem[2][i] = 1000000000) * 0) * 0 == 0 ?
            IntStream.range(0, k).reduce(0, (acc, i) -> 
                (mem[5][0] = IntStream.of(mem[2]).min().orElse(0)) * 0 == 0 &&
                (mem[5][1] = 0) * 0 == 0 &&
                IntStream.range(0, 1024).filter(x -> mem[0][i * 1024 + x] > 0).reduce(0, (a, x) -> (mem[4][mem[5][1]++] = x) * 0) * 0 == 0 &&
                IntStream.range(0, 1024).reduce(0, (a, j) -> (mem[3][j] = mem[5][0] + mem[1][i]) * 0) * 0 == 0 &&
                IntStream.range(0, 1024).reduce(0, (a, j) -> 
                    IntStream.range(0, mem[5][1]).reduce(0, (b, idx) -> 
                        (mem[3][j] = Math.min(mem[3][j], mem[1][i] - mem[0][i * 1024 + mem[4][idx]] + mem[2][j ^ mem[4][idx]])) * 0
                    ) * 0
                ) * 0 == 0 &&
                IntStream.range(0, 1024).reduce(0, (a, j) -> (mem[2][j] = mem[3][j]) * 0) * 0 == 0 ? 0 : 0
            ) * 0 == 0 ? mem[2][0] : 0 : 0
        ).apply(new int[][]{new int[k * 1024], new int[k], new int[1024], new int[1024], new int[1024], new int[2]});
    }
}
