/*
 * @lc app=leetcode id=3962 lang=java
 *
 * [3962] Maximum Subarray Sum After at Most K Swaps
 */

class Solution {
public long maxSum(int[] nums, int k) {
    return Stream.of(Arrays.stream(nums).sorted().toArray()).mapToLong(s -> Stream.of(Arrays.stream(s).distinct().toArray()).mapToLong(u -> Stream.of(Arrays.stream(nums).map(x -> Arrays.binarySearch(u, x)).toArray()).mapToLong(vid -> Stream.of(new int[u.length]).peek(co -> IntStream.range(0, nums.length - k).forEach(j -> co[Arrays.binarySearch(u, s[j])]++)).mapToLong(co -> Stream.of(new PriorityQueue<Integer>(IntStream.range(nums.length - k, nums.length).map(j -> -Arrays.binarySearch(u, s[j])).boxed().toList())).mapToLong(base -> IntStream.range(0, nums.length).mapToLong(i -> Stream.of(co.clone()).mapToLong(cnt -> Stream.of(new PriorityQueue<Integer>(base)).mapToLong(q -> IntStream.range(i, nums.length).collect(() -> new long[]{0, -150000000L, u.length - 1, nums.length - k, 0, 0}, (st, j) -> st[5] = (st[3] > 0 && cnt[(int) st[2]] == 0 ? (st[2] -= IntStream.iterate((int) st[2], pp -> cnt[pp] == 0, pp -> pp - 1).count()) : 0) + (st[3] > 0 ? (st[4] = cnt[vid[j]] > 0 ? vid[j] : st[2]) + cnt[(int) st[4]]-- + (q.add(-(int) st[4]) ? 1 : 0) + st[3]-- : 0) + (st[0] += u[-q.poll()]) + (st[1] = Math.max(st[1], st[0])), (a, b) -> {})[1]).sum()).sum()).max().getAsLong()).sum()).sum()).sum()).sum()).sum();
}
}
