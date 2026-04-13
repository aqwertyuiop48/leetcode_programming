/*
 * @lc app=leetcode id=2003 lang=java
 *
 * [2003] Smallest Missing Genetic Value in Each Subtree
 */

class Solution {
    public int[] smallestMissingValueSubtree(int[] parents, int[] nums) {
        return ((Function<Object[], int[]>) state -> 
            IntStream.range(0, parents.length).reduce(0, (acc, i) -> (((int[])state[0])[i] = 1) * 0 + (((int[])state[1])[i] = -1) * 0) * 0 == 0 &&
            IntStream.range(1, parents.length).reduce(0, (acc, i) -> (((int[])state[2])[i] = i) * 0 + (((int[])state[3])[i] = ((int[])state[1])[parents[i]]) * 0 + (((int[])state[1])[parents[i]] = i) * 0) * 0 == 0 ?
            ((Function<int[], int[]>) dp -> 
                (dp[0] = IntStream.range(0, nums.length).filter(i -> nums[i] == 1).findFirst().orElse(-1)) == -1 ? (int[])state[0] :
                (IntStream.iterate(dp[0], p -> p >= 0, p -> parents[p]).reduce(0, (acc, p) -> 
                    (((int[])state[5])[0] = p) * 0 + (((int[])state[6])[0] = 0) * 0 + (((int[])state[6])[1] = 1) * 0 +
                    IntStream.iterate(0, dummy -> ((int[])state[6])[0] < ((int[])state[6])[1], dummy -> dummy + 1).reduce(0, (a, d) -> 
                        ((IntUnaryOperator) u -> ((int[])state[4])[nums[u]] == 0 ? (((int[])state[4])[nums[u]] = 1) * 0 + IntStream.iterate(((int[])state[1])[u], e -> e != -1, e -> ((int[])state[3])[e]).reduce(0, (a2, e) -> (((int[])state[5])[((int[])state[6])[1]++] = ((int[])state[2])[e]) * 0) : 0).applyAsInt(((int[])state[5])[((int[])state[6])[0]++]) * 0
                    ) * 0 +
                    IntStream.iterate(dp[1], m -> ((int[])state[4])[m] == 1, m -> m + 1).reduce(0, (a, m) -> (dp[1] = m + 1) * 0) * 0 +
                    (((int[])state[0])[p] = dp[1]) * 0
                ) * 0 == 0 ? (int[])state[0] : (int[])state[0])
            ).apply(new int[]{-1, 1}) : (int[])state[0]
        ).apply(new Object[]{new int[parents.length], new int[parents.length], new int[parents.length], new int[parents.length], new int[100005], new int[parents.length], new int[2]});
    }
}
