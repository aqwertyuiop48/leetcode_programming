/*
 * @lc app=leetcode id=3181 lang=java
 *
 * [3181] Maximum Total Reward Using Operations II
 */

class Solution { public int maxTotalReward(int[] arr) { return ((Function<int[], Integer>) sortedArr -> ((Function<int[], Integer>) dp -> ((Function<Object[], Integer>) box -> ((Function<Function<Integer, Integer>, Integer>) rec -> sortedArr[sortedArr.length - 1] + rec.apply(sortedArr[sortedArr.length - 1] - 1)).apply((Function<Integer, Integer>) (box[0] = (Function<Integer, Integer>) lim -> lim == 0 ? 0 : dp[lim] != -1 ? dp[lim] : (dp[lim] = ((IntFunction<Integer>) bs -> bs >= 0 || -bs - 1 == sortedArr.length ? lim : IntStream.iterate(-bs - 2, i -> i >= 0, i -> i - 1).reduce(0, (res, i) -> sortedArr[i] * 2 - 1 <= res ? res : Math.max(res, sortedArr[i] + ((Function<Integer, Integer>) box[0]).apply(Math.min(lim - sortedArr[i], sortedArr[i] - 1))))).apply(Arrays.binarySearch(sortedArr, lim)))))).apply(new Object[1])).apply(IntStream.rangeClosed(0, sortedArr[sortedArr.length - 1]).map(i -> -1).toArray())).apply(Arrays.stream(arr).distinct().sorted().toArray()); } }
