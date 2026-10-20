import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && LongStream.generate(() -> Long.parseLong(st.nextToken())).limit(n).toArray() instanceof long[] a
            && LongStream.generate(() -> Long.parseLong(st.nextToken())).limit(n).toArray() instanceof long[] b
            && new long[4 * n] instanceof long[] tm && new long[4 * n] instanceof long[] tc
            && LongStream.range(0, 4 * n).map(i -> tc[(int) i] = 4000000000000000000L).max().getAsLong() > 0
            ? IntStream.range(0, n).mapToLong(i -> Long.valueOf(i == 0 ? 0L
                    : Stream.iterate(new int[]{1, 0, n - 1}, s -> s != null, s -> s[1] == s[2] ? null
                        : i <= (s[1] + s[2]) / 2 ? new int[]{2 * s[0], s[1], (s[1] + s[2]) / 2} : new int[]{2 * s[0] + 1, (s[1] + s[2]) / 2 + 1, s[2]})
                        .mapToLong(s -> tm[s[0]] * a[i] + tc[s[0]]).min().getAsLong()) instanceof Long dp
                && Stream.iterate(new long[]{1, 0, n - 1, b[i], dp}, s -> s != null, s -> Integer.valueOf((int) ((s[1] + s[2]) / 2)) instanceof Integer mid
                    && Integer.valueOf((int) s[0]) instanceof Integer nd
                    && Boolean.valueOf(s[3] * a[mid] + s[4] < tm[nd] * a[mid] + tc[nd]) instanceof Boolean sw
                    && new long[]{sw ? tm[nd] : s[3], sw ? tc[nd] : s[4]} instanceof long[] lo
                    && (tm[nd] = sw ? s[3] : tm[nd]) >= Long.MIN_VALUE && (tc[nd] = sw ? s[4] : tc[nd]) >= Long.MIN_VALUE
                    ? s[1] == s[2] ? null
                        : lo[0] * a[(int) s[1]] + lo[1] < tm[nd] * a[(int) s[1]] + tc[nd] ? new long[]{2 * nd, s[1], mid, lo[0], lo[1]}
                        : lo[0] * a[(int) s[2]] + lo[1] < tm[nd] * a[(int) s[2]] + tc[nd] ? new long[]{2 * nd + 1, mid + 1, s[2], lo[0], lo[1]} : null
                    : null).count() >= 0 ? dp : 0L).reduce((x, y) -> y).getAsLong() : "");
    }
}
