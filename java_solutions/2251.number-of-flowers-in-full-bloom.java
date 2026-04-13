/*
 * @lc app=leetcode id=2251 lang=java
 *
 * [2251] Number of Flowers in Full Bloom
 */

class Solution { public int[] fullBloomFlowers(int[][] flowers, int[] people) { return ((Function<int[], Function<int[], int[]>>) starts -> ends -> IntStream.of(people).map(p -> ((ToIntFunction<int[]>) bsStart -> IntStream.iterate(0, d -> bsStart[0] <= bsStart[1], d -> d + 1).reduce(0, (acc, d) -> ((IntUnaryOperator) mid -> starts[mid] <= p ? (bsStart[2] = mid + 1) * 0 + (bsStart[0] = mid + 1) * 0 : (bsStart[1] = mid - 1) * 0).applyAsInt((bsStart[0] + bsStart[1]) >>> 1) * 0) * 0 == 0 ? bsStart[2] : 0).applyAsInt(new int[]{0, starts.length - 1, 0}) - ((ToIntFunction<int[]>) bsEnd -> IntStream.iterate(0, d -> bsEnd[0] <= bsEnd[1], d -> d + 1).reduce(0, (acc, d) -> ((IntUnaryOperator) mid -> ends[mid] <= p ? (bsEnd[2] = mid + 1) * 0 + (bsEnd[0] = mid + 1) * 0 : (bsEnd[1] = mid - 1) * 0).applyAsInt((bsEnd[0] + bsEnd[1]) >>> 1) * 0) * 0 == 0 ? bsEnd[2] : 0).applyAsInt(new int[]{0, ends.length - 1, 0})).toArray()).apply(IntStream.range(0, flowers.length).map(i -> flowers[i][0]).sorted().toArray()).apply(IntStream.range(0, flowers.length).map(i -> flowers[i][1] + 1).sorted().toArray()); } }
