/*
 * @lc app=leetcode id=3739 lang=java
 *
 * [3739] Count Subarrays With Majority Element II
 */

class Solution {
    public long countMajoritySubarrays(int[] A, int target) {
        return Stream.<Object[]>of(new Object[]{new int[]{A.length + 1}, new long[2 * A.length + 2], new long[2 * A.length + 2], new long[]{0L}})
            .peek(s -> ((long[])s[1])[((int[])s[0])[0]] = ((long[])s[2])[((int[])s[0])[0]] = 1L)
            .peek(s -> Arrays.stream(A).forEach(a -> LongStream.of((((int[])s[0])[0] += (a == target ? 1 : -1)))
                .forEach(pre -> ((long[])s[3])[0] += (((long[])s[2])[((int[])s[0])[0]] = ++((long[])s[1])[((int[])s[0])[0]] + ((long[])s[2])[((int[])s[0])[0] - 1]) * 0 + ((long[])s[2])[((int[])s[0])[0] - 1])))
            .mapToLong(s -> ((long[])s[3])[0]).findFirst().getAsLong();
    }
}
