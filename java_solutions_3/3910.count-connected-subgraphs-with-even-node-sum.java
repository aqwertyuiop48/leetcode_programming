/*
 * @lc app=leetcode id=3910 lang=java
 *
 * [3910] Count Connected Subgraphs with Even Node Sum
 */

class Solution {
    public int evenSumSubgraphs(int[] nums, int[][] edges) {
        return new int[nums.length] instanceof int[] adj && java.util.Arrays.stream(edges).peek(e -> adj[e[0]] |= 1 << e[1]).peek(e -> adj[e[1]] |= 1 << e[0]).allMatch(x -> true)
            ? (int) java.util.stream.IntStream.range(1, 1 << nums.length).filter(m -> java.util.stream.IntStream.range(0, nums.length).filter(v -> (m >> v & 1) == 1).map(v -> nums[v]).sum() % 2 == 0
                && java.util.stream.Stream.iterate(Integer.lowestOneBit(m), r -> (r | java.util.stream.IntStream.range(0, nums.length).filter(v -> (r >> v & 1) == 1).map(v -> adj[v]).reduce(0, (a, b) -> a | b)) & m)
                    .skip(nums.length).findFirst().get() == m).count()
            : 0;
    }
}
