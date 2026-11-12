import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] v && new int[2] instanceof int[] ix && new long[1] instanceof long[] cu && new int[]{1} instanceof int[] sg
            && IntStream.range(0, raw.length).filter(p -> (v[ix[0] += (raw[p] < 48 && p > 0 && raw[p - 1] >= 48 ? 1 : 0)] = cu[0] = raw[p] >= 48 ? cu[0] * 10 + sg[0] * (raw[p] - 48) : 0 * (sg[0] = raw[p] == 45 ? -1 : 1)) == Long.MIN_VALUE).count() == 0
            && new int[]{1} instanceof int[] st
            ? IntStream.range(0, (int) v[0]).mapToObj(tc -> (Integer) (int) v[st[0]] instanceof Integer n && (Integer) st[0] instanceof Integer o
                && new long[]{Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE} instanceof long[] mx
                && new long[]{Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE} instanceof long[] mn
                && new int[]{1, 1, 1, -1} instanceof int[] cx && new int[]{1, 1, -1, 1} instanceof int[] cy && new int[]{1, -1, 1, 1} instanceof int[] cz
                && IntStream.range(0, n).filter(i -> i >= 0).peek(i -> IntStream.range(0, 4).forEach(k -> mx[k] = Math.max(mx[k], cx[k] * v[o + 1 + 3 * i] + cy[k] * v[o + 2 + 3 * i] + cz[k] * v[o + 3 + 3 * i])
                    + 0 * (mn[k] = Math.min(mn[k], cx[k] * v[o + 1 + 3 * i] + cy[k] * v[o + 2 + 3 * i] + cz[k] * v[o + 3 + 3 * i])))).count() >= 0
                && (st[0] += 1 + 3 * n) > 0
                && ((BiFunction<Long, Long, long[]>) (d, p) -> (Long) Math.max(mx[1] - d, -3000000000000000000L) instanceof Long a1 && (Long) (a1 + Math.floorMod(p - a1, 2L)) instanceof Long l1 && (Long) Math.min(mn[1] + d, 3000000000000000000L) instanceof Long b1 && (Long) (b1 - Math.floorMod(b1 - p, 2L)) instanceof Long h1 && l1 <= h1
                    && (Long) Math.max(mx[2] - d, -3000000000000000000L) instanceof Long a2 && (Long) (a2 + Math.floorMod(p - a2, 2L)) instanceof Long l2 && (Long) Math.min(mn[2] + d, 3000000000000000000L) instanceof Long b2 && (Long) (b2 - Math.floorMod(b2 - p, 2L)) instanceof Long h2 && l2 <= h2
                    && (Long) Math.max(mx[3] - d, -3000000000000000000L) instanceof Long a3 && (Long) (a3 + Math.floorMod(p - a3, 2L)) instanceof Long l3 && (Long) Math.min(mn[3] + d, 3000000000000000000L) instanceof Long b3 && (Long) (b3 - Math.floorMod(b3 - p, 2L)) instanceof Long h3 && l3 <= h3
                    && (Long) Math.max(l1 + l2 + l3, Math.max(mx[0] - d, -3000000000000000000L)) instanceof Long lo0 && (Long) Math.min(h1 + h2 + h3, Math.min(mn[0] + d, 3000000000000000000L)) instanceof Long hi0
                    && (Long) (lo0 + Math.floorMod(p - lo0, 2L)) instanceof Long tt && tt <= hi0
                    && (Long) (l1 + Math.min(tt - l1 - l2 - l3, h1 - l1)) instanceof Long s2 && (Long) (l2 + Math.min(tt - l1 - l2 - l3 - (s2 - l1), h2 - l2)) instanceof Long s3
                    ? new long[]{s2, s3, tt - s2 - s3} : null) instanceof BiFunction<Long, Long, long[]> tf
                && (Long) Math.max(Math.max((mx[0] - mn[0] + 1) / 2, (mx[1] - mn[1] + 1) / 2), Math.max(Math.max((mx[2] - mn[2] + 1) / 2, (mx[3] - mn[3] + 1) / 2),
                    Math.max(0L, Math.max((Math.floorDiv(mx[0], 4L) - Math.floorDiv((mn[1] + mn[2] + mn[3]), 4L) + (Math.floorMod(mx[0], 4L) - Math.floorMod((mn[1] + mn[2] + mn[3]), 4L) > 0 ? 1 : 0)), (Math.floorDiv((mx[1] + mx[2] + mx[3]), 4L) - Math.floorDiv(mn[0], 4L) + (Math.floorMod((mx[1] + mx[2] + mx[3]), 4L) - Math.floorMod(mn[0], 4L) > 0 ? 1 : 0)))))) instanceof Long d0
                && LongStream.iterate(d0, d -> d + 1).mapToObj(d -> Stream.of(0L, 1L).map(p -> tf.apply(d, p)).filter(Objects::nonNull).findFirst().orElse(null)).filter(Objects::nonNull).findFirst().get() instanceof long[] s
                ? (s[0] + s[1]) / 2 + " " + (s[0] + s[2]) / 2 + " " + (s[1] + s[2]) / 2 : "").collect(Collectors.joining("\n")) : "");
    }
}
