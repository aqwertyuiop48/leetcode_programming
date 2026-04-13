/*
 * @lc app=leetcode id=3753 lang=java
 *
 * [3753] Total Waviness of Numbers in Range II
 */

class Solution {
    public long totalWaviness(long num1, long num2) {
        return Stream.<Object[]>of(new Object[]{ new long[2 * 16 * 2 * 2 * 12 * 12 * 20], null }).peek(ctx -> Arrays.fill((long[])((Object[])ctx)[0], -1L)).peek(ctx -> ((Object[])ctx)[1] = (BiFunction<Object[], Object[], Long>) (self, p) -> IntStream.of((int)((((((((int)p[7] * 16 + (int)p[1]) * 2 + (int)p[2]) * 2 + (int)p[3]) * 12 + ((int)p[4] + 1)) * 12 + ((int)p[5] + 1)) * 20 + (int)p[6]))).mapToObj(key -> (int)p[1] == ((String)p[0]).length() ? ((int)p[3] == 1 ? (long)((int)p[6]) : 0L) : ((long[])((Object[])ctx)[0])[key] != -1L ? ((long[])((Object[])ctx)[0])[key] : (((long[])((Object[])ctx)[0])[key] = IntStream.range(0, ((int)p[2] == 1 ? ((String)p[0]).charAt((int)p[1]) - '0' : 9) + 1).mapToLong(d -> (long)((BiFunction<Object[], Object[], Long>)((Object[])self)[1]).apply(self, new Object[]{ p[0], (int)p[1] + 1, ((int)p[2] == 1 && d == (((String)p[0]).charAt((int)p[1]) - '0')) ? 1 : 0, ((int)p[3] == 0 && d == 0) ? 0 : 1, ((int)p[3] == 0) ? -1 : (int)p[5], d, ((int)p[4] != -1 && (((int)p[5] > d && (int)p[5] > (int)p[4]) || ((int)p[5] < d && (int)p[5] < (int)p[4]))) ? (int)p[6] + 1 : (int)p[6], p[7] })).sum())).findFirst().get()).mapToLong(ctx -> ((BiFunction<Object[], Object[], Long>)((Object[])ctx)[1]).apply(ctx, new Object[]{Long.toString(num2), 0, 1, 0, -1, -1, 0, 0}) - ((BiFunction<Object[], Object[], Long>)((Object[])ctx)[1]).apply(ctx, new Object[]{Long.toString(num1 - 1), 0, 1, 0, -1, -1, 0, 1})).findFirst().getAsLong();
    }
}
