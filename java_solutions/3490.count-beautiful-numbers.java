/*
 * @lc app=leetcode id=3490 lang=java
 *
 * [3490] Count Beautiful Numbers
 */

class Solution {
    public int beautifulNumbers(int l, int r) {
        return Optional.of(new Object[]{null, null, null, new LongUnaryOperator[1], new IntToLongFunction[1]}).map((Object[] st) -> (((LongUnaryOperator[])st[3])[0] = (state) -> Optional.of(new long[]{(state >> 48) & 0xF, (state >> 47) & 1, (state >> 46) & 1, (state >> 45) & 1, (state >> 35) & 0x3FF, state & 0x7FFFFFFFFL}).map(p -> p[0] == (int)st[2] ? (p[2] == 0 ? 0L : (p[3] == 1 ? 1L : (p[5] % p[4] == 0 ? 1L : 0L))) : (p[2] == 1 && p[3] == 1 && p[1] == 0 ? (long)Math.pow(10, (int)st[2] - p[0]) : ((Map<Long, Long>)st[0]).containsKey(state) ? ((Map<Long, Long>)st[0]).get(state) : Optional.of(LongStream.rangeClosed(0, p[1] == 1 ? ((int[])st[1])[(int)p[0]] : 9).map(d -> ((LongUnaryOperator[])st[3])[0].applyAsLong(((p[0] + 1) << 48) | (((p[1] == 1 && d == ((int[])st[1])[(int)p[0]]) ? 1L : 0L) << 47) | (((p[2] == 0 && d == 0) ? 0L : 1L) << 46) | (((p[3] == 1 || (p[2] == 1 && d == 0)) ? 1L : 0L) << 45) | ((p[4] + d) << 35) | (((p[2] == 0 && d == 0) ? 0L : 1L) == 0L ? 1L : (((p[3] == 1 || (p[2] == 1 && d == 0)) ? 1L : 0L) == 1L ? 0L : p[5] * d)))).sum()).map(ans -> (((Map<Long, Long>)st[0]).put(state, ans) == null ? ans : ans)).get())).get()) != null ? st : st).map((Object[] st) -> (((IntToLongFunction[])st[4])[0] = (x) -> x < 1 ? 0L : Optional.of(Integer.toString(x)).map(s -> (((st[2] = s.length()) != null) ? 0L : 0L) + (((st[1] = s.chars().map(c -> c - '0').toArray()) != null) ? 0L : 0L) + (((st[0] = new HashMap<Long, Long>()) != null) ? 0L : 0L) + ((LongUnaryOperator[])st[3])[0].applyAsLong((0L << 48) | (1L << 47) | (0L << 46) | (0L << 45) | (0L << 35) | 1L)).get()) != null ? st : st).map((Object[] st) -> (int)(((IntToLongFunction[])st[4])[0].applyAsLong(r) - ((IntToLongFunction[])st[4])[0].applyAsLong(l - 1))).get();
    }
}
