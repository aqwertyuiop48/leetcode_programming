/*
 * @lc app=leetcode id=3117 lang=java
 *
 * [3117] Minimum Sum of Values by Dividing Array
 */

class Solution { public int minimumValueSum(int[] nums, int[] andValues) { return ((Function<Object[], Integer>) box -> IntStream.of(nums).reduce(0, (dummy, x) -> (box[0] = ((Function<long[], long[]>) nextStates -> IntStream.range(0, nextStates.length).filter(i -> i == 0 || (nextStates[i] >>> 30) != (nextStates[i-1] >>> 30)).mapToLong(i -> nextStates[i]).toArray()).apply(Arrays.stream((long[]) box[0]).filter(s -> (s >>> 48) < andValues.length).flatMap(s -> ((LongFunction<LongStream>) sNew -> ((LongFunction<LongStream>) newMask -> ((LongFunction<LongStream>) target -> (newMask & target) != target ? LongStream.empty() : (newMask == target ? LongStream.of(sNew, (((s >>> 48) + 1L) << 48) | (0x3FFFFL << 30) | ((s & 0x3FFFFFFFL) + x)) : LongStream.of(sNew))).apply((long) andValues[(int)(s >>> 48)])).apply((sNew >>> 30) & 0x3FFFFL)).apply(s & (~(0x3FFFFL << 30) | ((long)x << 30)))).sorted().toArray())) != null ? 0 : 0) * 0 == 0 ? (int) Arrays.stream((long[]) box[0]).filter(s -> (s >>> 48) == andValues.length).map(s -> s & 0x3FFFFFFFL).min().orElse(-1L) : -1).apply(new Object[]{new long[]{0x3FFFFL << 30}}); } }
