/*
 * @lc app=leetcode id=3495 lang=java
 *
 * [3495] Minimum Operations to Make Array Elements Zero
 */

class Solution {
    public long minOperations(int[][] queries) {
        return Optional.of(new Object[]{new long[18], new IntToLongFunction[1]}).map((Object[] st) -> IntStream.range(0, 18).mapToLong(i -> i == 0 ? (((long[])st[0])[0] = 1) * 0 : (((long[])st[0])[i] = ((long[])st[0])[i - 1] + 3L * i * (1L << (2 * (i - 1))) + 1) * 0).sum() * 0 == 0 ? st : st).map((Object[] st) -> (((IntToLongFunction[])st[1])[0] = (int x) -> x == 0 ? 0L : ((long[])st[0])[(31 - Integer.numberOfLeadingZeros(x)) >> 1] + (x - (1 << (((31 - Integer.numberOfLeadingZeros(x)) >> 1) << 1))) * (((31 - Integer.numberOfLeadingZeros(x)) >> 1) + 1L)) != null ? st : st).map((Object[] st) -> Arrays.stream(queries).mapToLong(q -> (((IntToLongFunction[])st[1])[0].applyAsLong(q[1]) - ((IntToLongFunction[])st[1])[0].applyAsLong(q[0] - 1) + 1) >> 1).sum()).get();
    }
}
