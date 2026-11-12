import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] all && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48
                ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : ps[2] == 0 || ((all[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0))
            && Long.valueOf(all[0]) instanceof Long m && Integer.valueOf(all[1]) instanceof Integer n
            && Arrays.stream(all, 2, 2 + n).sorted().asLongStream().toArray() instanceof long[] srt
            && IntStream.range(0, n).mapToLong(i -> ((srt[(i + 1) % n] - srt[i] - 1) % m + m) % m).toArray() instanceof long[] g
            && Integer.valueOf(IntStream.range(0, n).reduce((x, y) -> g[y] > g[x] ? y : x).getAsInt()) instanceof Integer k
            && IntStream.range(0, n).mapToLong(j -> (srt[(k + 1 + j) % n] - srt[(k + 1) % n] + m) % m).toArray() instanceof long[] P
            && Long.valueOf(m - P[n - 1] - 1) instanceof Long G
            && ((Function<long[], Long>) a -> LongStream.of(a[2], a[3]).toArray() instanceof long[] st
                && IntStream.range((int) a[1], n).allMatch(i -> (st[0] = st[1] + 0 * (st[1] = Math.max(
                    Math.max(st[1], P[i] <= st[1] + 1 ? P[i] + a[0] : st[1]),
                    Math.max(P[i] - a[0] <= st[1] + 1 ? P[i] : st[1], i > 0 && P[i] - a[0] <= st[0] + 1 ? Math.max(P[i - 1] + a[0], P[i]) : st[1])))) > Long.MIN_VALUE)
                ? st[1] : 0L) instanceof Function<long[], Long> run
            && ((LongPredicate) r -> run.apply(new long[]{r, 1, -1000000000000000000L, 0}) >= m - r - 1
                || n >= 2 && P[1] - r <= r + 1 && run.apply(new long[]{r, 2, -1000000000000000000L, Math.max(r, P[1])}) >= m + Math.min(0, P[1] - r) - 1
                || run.apply(new long[]{r, 0, -1000000000000000000L, -1}) >= m - 1) instanceof LongPredicate chk
            && new long[]{0, G} instanceof long[] b
            && IntStream.range(0, 32).allMatch(z -> b[0] >= b[1] || (chk.test((b[0] + b[1]) / 2) ? (b[1] = (b[0] + b[1]) / 2) >= 0 : (b[0] = (b[0] + b[1]) / 2 + 1) >= 0))
            ? b[0] : "");
    }
}
