/*
 * @lc app=leetcode id=1944 lang=java
 *
 * [1944] Number of Visible People in a Queue
 */

class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        return ((Function<int[], Function<Stack<Integer>, int[]> >) ans -> mono -> 
            IntStream.iterate(heights.length - 1, i -> i >= 0, i -> i - 1).reduce(0, (acc, i) -> 
                (ans[i] = IntStream.iterate(0, d -> !mono.isEmpty() && mono.peek() < heights[i], d -> d + 1).reduce(0, (a, d) -> mono.pop() * 0 + a + 1) + (mono.isEmpty() ? 0 : 1)) * 0 + 
                (mono.push(heights[i]) * 0)
            ) * 0 == 0 ? ans : ans
        ).apply(new int[heights.length]).apply(new Stack<>());
    }
}
