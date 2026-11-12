import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer q
            && LongStream.iterate(1, p -> p * 42).limit(12).toArray() instanceof long[] pw
            && new long[4 * n + 4] instanceof long[] mn && new long[4 * n + 4] instanceof long[] val && new long[4 * n + 4] instanceof long[] lz && new int[4 * n + 4] instanceof int[] same
            && ((LongUnaryOperator) v -> Integer.valueOf(Arrays.binarySearch(pw, v)) instanceof Integer ix ? (ix >= 0 ? 0L : pw[-ix - 1] - v) : 0L) instanceof LongUnaryOperator dd
            && ((LongBinaryOperator) (c, v) -> (same[(int) c] = 1) > 0 && (val[(int) c] = v) > 0 && (mn[(int) c] = dd.applyAsLong(v)) >= 0 && (lz[(int) c] = 0) == 0 ? 0L : 0L) instanceof LongBinaryOperator setSame
            && ((LongBinaryOperator) (c, x) -> same[(int) c] == 1 ? (val[(int) c] += x) * 0 + (mn[(int) c] -= x) * 0 : (mn[(int) c] -= x) * 0 + (lz[(int) c] += x) * 0) instanceof LongBinaryOperator addTo
            && ((LongUnaryOperator) nd -> same[(int) nd] == 1 ? setSame.applyAsLong(2 * nd, val[(int) nd]) + setSame.applyAsLong(2 * nd + 1, val[(int) nd])
                : lz[(int) nd] != 0 ? addTo.applyAsLong(2 * nd, lz[(int) nd]) + addTo.applyAsLong(2 * nd + 1, lz[(int) nd]) + (lz[(int) nd] = 0) : 0L) instanceof LongUnaryOperator push
            && ((LongUnaryOperator) nd -> (mn[(int) nd] = Math.min(mn[(int) (2 * nd)], mn[(int) (2 * nd + 1)])) * 0
                + (same[(int) nd] = same[(int) (2 * nd)] == 1 && same[(int) (2 * nd + 1)] == 1 && val[(int) (2 * nd)] == val[(int) (2 * nd + 1)] ? 1 : 0) * 0
                + (same[(int) nd] == 1 ? (val[(int) nd] = val[(int) (2 * nd)]) * 0 : 0L)) instanceof LongUnaryOperator pull
            && new AtomicReference<ToLongFunction<long[]>>() instanceof AtomicReference<ToLongFunction<long[]>> f
            && f.getAndSet(p -> (p[0] == 4
                    ? (p[2] == p[3] ? setSame.applyAsLong(p[1], Long.parseLong(t[1 + (int) p[2]]))
                        : f.get().applyAsLong(new long[]{4, 2 * p[1], p[2], ((p[2] + p[3]) / 2), 0, 0, 0}) + f.get().applyAsLong(new long[]{4, 2 * p[1] + 1, ((p[2] + p[3]) / 2) + 1, p[3], 0, 0, 0}) + pull.applyAsLong(p[1]))
                    : p[0] == 3
                    ? (same[(int) p[1]] == 1 ? val[(int) p[1]] : push.applyAsLong(p[1]) * 0 + f.get().applyAsLong(new long[]{3, p[4] <= ((p[2] + p[3]) / 2) ? 2 * p[1] : 2 * p[1] + 1, p[4] <= ((p[2] + p[3]) / 2) ? p[2] : ((p[2] + p[3]) / 2) + 1, p[4] <= ((p[2] + p[3]) / 2) ? ((p[2] + p[3]) / 2) : p[3], p[4], 0, 0}))
                    : p[0] == 2
                    ? (p[5] < p[2] || p[3] < p[4] ? Long.MAX_VALUE : p[4] <= p[2] && p[3] <= p[5] ? mn[(int) p[1]]
                        : push.applyAsLong(p[1]) * 0 + Math.min(f.get().applyAsLong(new long[]{2, 2 * p[1], p[2], ((p[2] + p[3]) / 2), p[4], p[5], 0}), f.get().applyAsLong(new long[]{2, 2 * p[1] + 1, ((p[2] + p[3]) / 2) + 1, p[3], p[4], p[5], 0})))
                    : (p[5] < p[2] || p[3] < p[4] ? 0L
                        : p[4] <= p[2] && p[3] <= p[5] && (p[0] == 1 || same[(int) p[1]] == 1 || mn[(int) p[1]] - p[6] >= 0)
                            ? (p[0] == 1 ? setSame.applyAsLong(p[1], p[6]) : same[(int) p[1]] == 1 ? (val[(int) p[1]] += p[6]) * 0 + (mn[(int) p[1]] = dd.applyAsLong(val[(int) p[1]])) * 0 : addTo.applyAsLong(p[1], p[6]))
                            : push.applyAsLong(p[1]) + f.get().applyAsLong(new long[]{p[0], 2 * p[1], p[2], ((p[2] + p[3]) / 2), p[4], p[5], p[6]}) + f.get().applyAsLong(new long[]{p[0], 2 * p[1] + 1, ((p[2] + p[3]) / 2) + 1, p[3], p[4], p[5], p[6]}) + pull.applyAsLong(p[1])))
                ) == null
            && f.get().applyAsLong(new long[]{4, 1, 1, n, 0, 0, 0}) == 0
            && new int[]{n + 2} instanceof int[] ptr && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, q).filter(k -> Integer.valueOf(ptr[0]) instanceof Integer b
                && (t[b].equals("1")
                    ? sb.append(f.get().applyAsLong(new long[]{3, 1, 1, n, Long.parseLong(t[b + 1]), 0, 0})).append('\n') != null && (ptr[0] += 2) < 0
                    : t[b].equals("2")
                    ? f.get().applyAsLong(new long[]{1, 1, 1, n, Long.parseLong(t[b + 1]), Long.parseLong(t[b + 2]), Long.parseLong(t[b + 3])}) != Long.MIN_VALUE && (ptr[0] += 4) < 0
                    : IntStream.generate(() -> 0).takeWhile(z -> f.get().applyAsLong(new long[]{0, 1, 1, n, Long.parseLong(t[b + 1]), Long.parseLong(t[b + 2]), Long.parseLong(t[b + 3])}) == 0
                        && f.get().applyAsLong(new long[]{2, 1, 1, n, Long.parseLong(t[b + 1]), Long.parseLong(t[b + 2]), 0}) == 0).count() >= 0 && (ptr[0] += 4) < 0)).count() == 0
            ? sb.toString().trim() : "");
    }
}
