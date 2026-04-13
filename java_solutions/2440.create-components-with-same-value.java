/*
 * @lc app=leetcode id=2440 lang=java
 *
 * [2440] Create Components With Same Value
 */

class Solution { public int componentValue(int[] nums, int[][] edges) { return ((Function<Integer, Integer>) S -> ((Function<int[], Integer>) head -> ((Function<int[], Integer>) to -> ((Function<int[], Integer>) next -> (IntStream.range(0, edges.length).map(i -> (to[2 * i] = edges[i][1]) * 0 + (next[2 * i] = head[edges[i][0]]) * 0 + (head[edges[i][0]] = 2 * i) * 0 + (to[2 * i + 1] = edges[i][0]) * 0 + (next[2 * i + 1] = head[edges[i][1]]) * 0 + (head[edges[i][1]] = 2 * i + 1) * 0).sum() * 0 == 0) ? ((Function<Object[], Integer>) box -> (box[0] = (Function<int[], Integer>) state -> ((IntUnaryOperator) sum -> sum == state[2] ? 0 : sum).applyAsInt(nums[state[0]] + IntStream.iterate(head[state[0]], e -> e != -1, e -> next[e]).filter(e -> to[e] != state[1]).map(e -> ((Function<int[], Integer>)box[0]).apply(new int[]{to[e], state[0], state[2]})).sum())) != null ? IntStream.iterate(nums.length, i -> i > 0, i -> i - 1).filter(i -> S % i == 0).filter(i -> ((Function<int[], Integer>)box[0]).apply(new int[]{0, -1, S / i}) == 0).findFirst().orElse(1) - 1 : 0).apply(new Object[1]) : 0).apply(new int[edges.length * 2])).apply(new int[edges.length * 2])).apply(IntStream.range(0, nums.length).map(i -> -1).toArray())).apply(Arrays.stream(nums).sum()); } }
