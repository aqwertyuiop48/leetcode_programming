/*
 * @lc app=leetcode id=3655 lang=java
 *
 * [3655] XOR After Range Multiplication Queries II
 */

import java.math.BigInteger;

public class Solution {
    public int xorAfterQueries(int[] arr, int[][] queries) {
        return Stream.of((Object) new Object[]{ arr, queries, new int[301][arr.length], 300, new boolean[301] })
            .peek(s -> {
                if (
                    // 1. Initialize Buffer: Use .peek() for the void method, and .sum() to FORCE execution.
                    IntStream.range(0, 301).peek(i -> Arrays.fill(((int[][])((Object[])s)[2])[i], 1)).sum() > -2 &&
                    
                    // 2. Process Queries
                    Arrays.stream((int[][])((Object[])s)[1]).mapToInt(q -> (
                        (q[2] > (int)((Object[])s)[3]) ?
                            // Large Step: Direct update
                            IntStream.iterate(q[0], i -> i <= q[1], i -> i + q[2]).map(i -> 
                                (((int[])((Object[])s)[0])[i] = (int)((1L * ((int[])((Object[])s)[0])[i] * q[3]) % 1000000007L)) * 0
                            ).sum()
                            :
                            // Small Step: Mark active and update difference array
                            (((boolean[])((Object[])s)[4])[q[2]] = true) || true ? 
                            (((int[][])((Object[])s)[2])[q[2]][q[0]] = (int)((1L * ((int[][])((Object[])s)[2])[q[2]][q[0]] * q[3]) % 1000000007L)) > -2 &&
                            (q[0] + q[2] * ((q[1] - q[0]) / q[2] + 1) < ((int[])((Object[])s)[0]).length ?
                                (((int[][])((Object[])s)[2])[q[2]][q[0] + q[2] * ((q[1] - q[0]) / q[2] + 1)] = 
                                (int)((1L * ((int[][])((Object[])s)[2])[q[2]][q[0] + q[2] * ((q[1] - q[0]) / q[2] + 1)] * BigInteger.valueOf(q[3]).modPow(BigInteger.valueOf(1000000005), BigInteger.valueOf(1000000007)).longValue()) % 1000000007L)) > -2
                                : true) ? 0 : 0 : 0
                    )).sum() > -2 &&

                    // 3. Finalize Updates (Propagate ONLY active steps)
                    IntStream.rangeClosed(1, (int)((Object[])s)[3]).filter(step -> ((boolean[])((Object[])s)[4])[step]).map(step -> 
                        IntStream.range(0, ((int[])((Object[])s)[0]).length).map(i -> (
                            (i >= step ? (((int[][])((Object[])s)[2])[step][i] = (int)((1L * ((int[][])((Object[])s)[2])[step][i] * ((int[][])((Object[])s)[2])[step][i-step]) % 1000000007L)) : 0) > -2 ?
                            (((int[])((Object[])s)[0])[i] = (int)((1L * ((int[])((Object[])s)[0])[i] * ((int[][])((Object[])s)[2])[step][i]) % 1000000007L)) : 0
                        )).sum()
                    ).sum() > -2
                ) {}
            })
            // 4. Calculate Final XOR
            .map(s -> Arrays.stream((int[])((Object[])s)[0]).reduce(0, (a, b) -> a ^ b))
            .findFirst()
            .get();
    }
}
