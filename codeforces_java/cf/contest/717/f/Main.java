import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] nums && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).allMatch(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[1] = 1) == 1
                : st[1] == 0 || ((nums[st[2]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0))
            && (st[1] == 0 || (nums[st[2]++] = st[0]) >= 0)
            && Integer.valueOf(nums[0]) instanceof Integer n
            && Integer.valueOf(Math.max(2, Integer.highestOneBit(Math.max(1, n - 1)) * 2)) instanceof Integer sz
            && Integer.valueOf(Integer.numberOfTrailingZeros(sz)) instanceof Integer hh
            && new long[2][2 * sz] instanceof long[][] t && new long[2][sz] instanceof long[][] d
            && Long.valueOf(1000000000000000000L) instanceof Long inf
            && IntStream.range(0, 2 * sz).allMatch(i -> (t[0][i] = inf) > 0 && (t[1][i] = inf) > 0)
            && new long[]{0} instanceof long[] run
            && IntStream.range(0, n).allMatch(i -> (run[0] += (i % 2 == 0 ? 1 : -1) * (long) nums[1 + i]) > Long.MIN_VALUE
                && (t[i & 1][sz + i] = (i % 2 == 0 ? run[0] : -run[0])) > Long.MIN_VALUE)
            && IntStream.range(1, sz).map(i -> sz - i).allMatch(p -> (t[0][p] = Math.min(t[0][2 * p], t[0][2 * p + 1])) > Long.MIN_VALUE
                && (t[1][p] = Math.min(t[1][2 * p], t[1][2 * p + 1])) > Long.MIN_VALUE)
            && ((Function<long[], Long>) a -> a[1] >= a[2] ? 0L : Integer.valueOf((int) a[0]) instanceof Integer tr && t[tr] instanceof long[] tt && d[tr] instanceof long[] dd
                && Long.valueOf(a[1] + sz) instanceof Long l0 && Long.valueOf(a[2] + sz) instanceof Long r0 && new long[]{l0, r0} instanceof long[] s
                && IntStream.iterate(0, i -> s[0] < s[1], i -> i + 1).allMatch(i -> ((s[0] & 1) == 0 || ((tt[(int) s[0]] += a[3]) > Long.MIN_VALUE
                        && (s[0] >= sz || (dd[(int) s[0]] += a[3]) > Long.MIN_VALUE) && ++s[0] > 0))
                    && ((s[1] & 1) == 0 || (--s[1] > 0 && (tt[(int) s[1]] += a[3]) > Long.MIN_VALUE && (s[1] >= sz || (dd[(int) s[1]] += a[3]) > Long.MIN_VALUE)))
                    && (s[0] >>= 1) >= 0 && (s[1] >>= 1) >= 0 || true)
                && IntStream.iterate((int) (l0 >> 1), p -> p >= 1, p -> p >> 1).allMatch(p -> (tt[p] = Math.min(tt[2 * p], tt[2 * p + 1]) + dd[p]) > Long.MIN_VALUE)
                && IntStream.iterate((int) ((r0 - 1) >> 1), p -> p >= 1, p -> p >> 1).allMatch(p -> (tt[p] = Math.min(tt[2 * p], tt[2 * p + 1]) + dd[p]) > Long.MIN_VALUE)
                ? 0L : 0L) instanceof Function<long[], Long> inc
            && ((Function<long[], Long>) a -> a[1] >= a[2] ? inf : Integer.valueOf((int) a[0]) instanceof Integer tr && t[tr] instanceof long[] tt && d[tr] instanceof long[] dd
                && Long.valueOf(a[1] + sz) instanceof Long l0 && Long.valueOf(a[2] + sz) instanceof Long r0
                && IntStream.of(l0.intValue(), (int) (r0 - 1)).allMatch(pp -> IntStream.rangeClosed(1, hh).map(sx -> hh + 1 - sx).allMatch(sx -> Integer.valueOf(pp >> sx) instanceof Integer ix
                    && (dd[ix] == 0 || ((tt[2 * ix] += dd[ix]) > Long.MIN_VALUE && (2 * ix >= sz || (dd[2 * ix] += dd[ix]) > Long.MIN_VALUE)
                        && (tt[2 * ix + 1] += dd[ix]) > Long.MIN_VALUE && (2 * ix + 1 >= sz || (dd[2 * ix + 1] += dd[ix]) > Long.MIN_VALUE) && (dd[ix] = 0) == 0))))
                && new long[]{l0, r0, inf} instanceof long[] s
                && IntStream.iterate(0, i -> s[0] < s[1], i -> i + 1).allMatch(i -> ((s[0] & 1) == 0 || ((s[2] = Math.min(s[2], tt[(int) s[0]])) > Long.MIN_VALUE && ++s[0] > 0))
                    && ((s[1] & 1) == 0 || (--s[1] > 0 && (s[2] = Math.min(s[2], tt[(int) s[1]])) > Long.MIN_VALUE))
                    && (s[0] >>= 1) >= 0 && (s[1] >>= 1) >= 0 || true)
                ? s[2] : inf) instanceof Function<long[], Long> qry
            && ((LongUnaryOperator) x -> x < 0 ? 0L : (x & 1) == 0 ? qry.apply(new long[]{0, x, x + 1}) : -qry.apply(new long[]{1, x, x + 1})) instanceof LongUnaryOperator getB
            && Integer.valueOf(nums[1 + n]) instanceof Integer q
            && new int[]{2 + n} instanceof int[] ptr
            ? IntStream.range(0, q).mapToObj(qi -> Integer.valueOf(nums[ptr[0]]) instanceof Integer ty
                ? (ty == 1
                    ? (Integer.valueOf(nums[ptr[0] + 1]) instanceof Integer l && Integer.valueOf(nums[ptr[0] + 2]) instanceof Integer r && Integer.valueOf(nums[ptr[0] + 3]) instanceof Integer kv
                        && (ptr[0] += 4) > 0 && Long.valueOf(l % 2 == 0 ? kv : -kv) instanceof Long delta
                        && inc.apply(new long[]{l & 1, l, r + 1, (l & 1) == 0 ? delta : -delta}) != null
                        && ((r - l) % 2 != 0 || (inc.apply(new long[]{0, r + 1, n, delta}) != null && inc.apply(new long[]{1, r + 1, n, -delta}) != null)) ? "" : "")
                    : (Integer.valueOf(nums[ptr[0] + 1]) instanceof Integer a && Integer.valueOf(nums[ptr[0] + 2]) instanceof Integer b && (ptr[0] += 3) > 0
                        && Long.valueOf(getB.applyAsLong(a - 1)) instanceof Long ba && Long.valueOf(a % 2 == 0 ? -1 : 1) instanceof Long sg
                        && qry.apply(new long[]{0, a, b}) >= ba + (1 - sg) / 2
                        && qry.apply(new long[]{1, a, b}) >= -ba + (1 + sg) / 2
                        && 2 * (getB.applyAsLong(b) - ba) + sg == (b % 2 == 0 ? 1 : -1) ? "1\n" : "0\n"))
                : "").collect(Collectors.joining()) : "");
    }
}
