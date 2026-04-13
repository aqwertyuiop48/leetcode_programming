/*
 * @lc app=leetcode id=2386 lang=java
 *
 * [2386] Find the K-Sum of an Array
 */

class Solution { public long kSum(int[] nums, int k) { return ((Function<long[], Function<PriorityQueue<long[]>, Long>>) state -> pq -> Arrays.stream(nums).map(x -> (int)((state[0] += Math.max(x, 0)) * 0L)).sum() * 0 == 0 && IntStream.range(0, nums.length).map(i -> nums[i] = Math.abs(nums[i])).sum() * 0 == 0 ? ((Function<int[], Long>) arr -> (pq.offer(new long[]{arr[0], 0}) ? 1 : 1) * 0 == 0 ? IntStream.iterate(k - 1, dummy -> dummy > 0, dummy -> dummy - 1).mapToLong(dummy -> ((Function<long[], Long>) top -> (state[1] = top[0]) * 0L + (top[1] < arr.length - 1 ? (pq.offer(new long[]{top[0] - arr[(int)top[1]] + arr[(int)top[1] + 1], top[1] + 1}) ? 1 : 1) * 0L + (pq.offer(new long[]{top[0] + arr[(int)top[1] + 1], top[1] + 1}) ? 1 : 1) * 0L : 0L)).apply(pq.poll())).sum() * 0L == 0L ? state[0] - state[1] : 0L : 0L).apply(Arrays.stream(nums).sorted().toArray()) : 0L).apply(new long[2]).apply(new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]))); } }
