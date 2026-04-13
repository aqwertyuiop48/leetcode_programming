/*
 * @lc app=leetcode id=3651 lang=java
 *
 * [3651] Minimum Cost Path with Teleportations
 */

class Solution {
    public int minCost(int[][] grid, int k) {
        // Use Optional to treat the Object[] as a single container, preventing "unrolling" errors
        return Optional.of(new Object[]{ grid, 0, 0, 0, null, null, null })
            .map(s -> 
                (
                    // 1. Initialize Dimensions & Arrays
                    // s[0]:grid, s[1]:n, s[2]:m, s[3]:max, s[4]:dp, s[5]:temp, s[6]:best
                    (s[1] = ((int[][])s[0]).length) instanceof Integer &&
                    (s[2] = ((int[][])s[0])[0].length) instanceof Integer &&
                    (s[3] = Arrays.stream((int[][])s[0]).flatMapToInt(Arrays::stream).max().orElse(0)) instanceof Integer &&
                    (s[4] = new int[(int)s[1]][(int)s[2]]) != null &&
                    (s[5] = new int[(int)s[3] + 1]) != null &&
                    (s[6] = new int[(int)s[3] + 1]) != null &&
                    
                    // Fill temp with MAX_VALUE
                    IntStream.range(0, (int)s[3] + 1).peek(i -> ((int[])s[5])[i] = Integer.MAX_VALUE).sum() > -2 &&

                    // 2. Base Case (Bottom-Right)
                    (((int[])s[5])[((int[][])s[0])[(int)s[1] - 1][(int)s[2] - 1]] = 0) == 0 &&
                    
                    // Process Bottom Row (No Teleports)
                    IntStream.iterate((int)s[2] - 2, i -> i >= 0, i -> i - 1).map(i -> 
                        (((int[])s[5])[((int[][])s[0])[(int)s[1] - 1][i]] = Math.min(((int[])s[5])[((int[][])s[0])[(int)s[1] - 1][i]], (((int[][])s[4])[(int)s[1] - 1][i] = ((int[][])s[4])[(int)s[1] - 1][i + 1] + ((int[][])s[0])[(int)s[1] - 1][i + 1]))) * 0
                    ).sum() > -2 &&

                    // Process Main Grid (No Teleports)
                    IntStream.iterate((int)s[1] - 2, i -> i >= 0, i -> i - 1).map(i -> 
                        // Right Column
                        (((int[])s[5])[((int[][])s[0])[i][(int)s[2] - 1]] = Math.min(((int[])s[5])[((int[][])s[0])[i][(int)s[2] - 1]], (((int[][])s[4])[i][(int)s[2] - 1] = ((int[][])s[4])[i + 1][(int)s[2] - 1] + ((int[][])s[0])[i + 1][(int)s[2] - 1]))) * 0 +
                        // Inner Columns
                        IntStream.iterate((int)s[2] - 2, j -> j >= 0, j -> j - 1).map(j -> 
                            (((int[])s[5])[((int[][])s[0])[i][j]] = Math.min(((int[])s[5])[((int[][])s[0])[i][j]], (((int[][])s[4])[i][j] = Math.min(((int[][])s[4])[i + 1][j] + ((int[][])s[0])[i + 1][j], ((int[][])s[4])[i][j + 1] + ((int[][])s[0])[i][j + 1])))) * 0
                        ).sum()
                    ).sum() > -2 &&

                    // 3. Process K Teleports
                    IntStream.range(0, k).map(x -> 
                        // Update Best Array (Prefix Min)
                        (((int[])s[6])[0] = ((int[])s[5])[0]) * 0 +
                        IntStream.rangeClosed(1, (int)s[3]).map(i -> (((int[])s[6])[i] = Math.min(((int[])s[6])[i - 1], ((int[])s[5])[i])) * 0).sum() +

                        // Bottom Row Update with Teleport
                        IntStream.iterate((int)s[2] - 2, i -> i >= 0, i -> i - 1).map(i -> 
                            (((int[])s[5])[((int[][])s[0])[(int)s[1] - 1][i]] = Math.min(((int[])s[5])[((int[][])s[0])[(int)s[1] - 1][i]], (((int[][])s[4])[(int)s[1] - 1][i] = Math.min(((int[])s[6])[((int[][])s[0])[(int)s[1] - 1][i]], ((int[][])s[4])[(int)s[1] - 1][i + 1] + ((int[][])s[0])[(int)s[1] - 1][i + 1])))) * 0
                        ).sum() +

                        // Main Grid Update with Teleport
                        IntStream.iterate((int)s[1] - 2, i -> i >= 0, i -> i - 1).map(i -> 
                            // Right Column
                            (((int[])s[5])[((int[][])s[0])[i][(int)s[2] - 1]] = Math.min(((int[])s[5])[((int[][])s[0])[i][(int)s[2] - 1]], (((int[][])s[4])[i][(int)s[2] - 1] = Math.min(((int[])s[6])[((int[][])s[0])[i][(int)s[2] - 1]], ((int[][])s[4])[i + 1][(int)s[2] - 1] + ((int[][])s[0])[i + 1][(int)s[2] - 1])))) * 0 +
                            // Inner Columns
                            IntStream.iterate((int)s[2] - 2, j -> j >= 0, j -> j - 1).map(j -> 
                                (((int[])s[5])[((int[][])s[0])[i][j]] = Math.min(((int[])s[5])[((int[][])s[0])[i][j]], (((int[][])s[4])[i][j] = Math.min(Math.min(((int[][])s[4])[i + 1][j] + ((int[][])s[0])[i + 1][j], ((int[][])s[4])[i][j + 1] + ((int[][])s[0])[i][j + 1]), ((int[])s[6])[((int[][])s[0])[i][j]])))) * 0
                            ).sum()
                        ).sum()
                    ).sum() > -2
                ) 
                // Return Final Result
                ? ((int[][])s[4])[0][0] : ((int[][])s[4])[0][0]
            ).get();
    }
}
