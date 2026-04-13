/*
 * @lc app=leetcode id=3791 lang=java
 *
 * [3791] Number of Balanced Integers in a Range
 */

class Solution {
    public long countBalanced(long low, long high) {
        return LongStream.of(high, low - 1)
            .map(v -> v < 0 ? 0L : ((Function<Object[], Long>) a -> ((Function<Object[], Long>) a[0]).apply(a)).apply(new Object[]{
                (Function<Object[], Long>) self -> ((Function<Integer, Long>) k -> ((long[]) self[6])[k] != -1L ? ((long[]) self[6])[k] : (((long[]) self[6])[k] = (int) self[1] == ((String) self[5]).length() ? ((int) self[4] == 100 ? 1L : 0L) : IntStream.rangeClosed(0, (int) self[2] == 1 ? ((String) self[5]).charAt((int) self[1]) - '0' : 9).mapToLong(d -> (long) ((Function<Object[], Long>) self[0]).apply(new Object[]{self[0], (int) self[1] + 1, ((int) self[2] == 1 && d == ((String) self[5]).charAt((int) self[1]) - '0') ? 1 : 0, ((int) self[3] == 1 && d == 0) ? 1 : 0, (int) self[4] + (((int) self[3] == 1 && d == 0) ? 0 : ((int) self[1] % 2 == 0 ? d : -d)), self[5], self[6]})).sum())).apply(((int) self[1] << 10) | ((int) self[2] << 9) | ((int) self[3] << 8) | (int) self[4]), 
                0, 1, 1, 100, v + "", LongStream.generate(() -> -1L).limit(1 << 15).toArray()
            }))
            .reduce((h, l) -> h - l).orElse(0L);
    }
}
