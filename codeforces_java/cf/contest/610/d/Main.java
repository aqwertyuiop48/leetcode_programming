import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{-1, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> Integer.valueOf(i < raw.length ? raw[i] : 32) instanceof Integer ch
                && (ch == 45 ? (st[2] = 1) > 0 : ch >= 48 ? (st[0] = Math.max(st[0], 0) * 10 + ch - 48) >= 0
                    : st[0] < 0 || ((v[st[1]++] = st[2] == 1 ? -st[0] : st[0]) > Integer.MIN_VALUE && (st[0] = -1) < 0 && (st[2] = 0) == 0))).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n
            && new int[]{Integer.MIN_VALUE} instanceof int[] last
            && IntStream.range(0, 2 * n).map(e -> (e & 1) == 0 ? Math.min(v[2 + 4 * (e >> 1)], v[4 + 4 * (e >> 1)]) : Math.max(v[2 + 4 * (e >> 1)], v[4 + 4 * (e >> 1)]) + 1).sorted().filter(x -> last[0] != x && (last[0] = x) == x).toArray() instanceof int[] ys
            && Integer.valueOf(Integer.highestOneBit(2 * ys.length - 3)) instanceof Integer N
            && Integer.valueOf(Integer.numberOfTrailingZeros(N)) instanceof Integer LOG
            && new long[2 * N] instanceof long[] full && new long[2 * N] instanceof long[] len && new int[2 * N] instanceof int[] cnt
            && IntStream.range(0, ys.length - 1).filter(i -> (full[N + i] = (long) ys[i + 1] - ys[i]) > 0).count() >= 0
            && IntStream.range(1, N).map(j -> N - j).filter(nd -> (full[nd] = full[2 * nd] + full[2 * nd + 1]) >= 0).count() >= 0
            && ((IntPredicate) i -> (len[i] = cnt[i] > 0 ? full[i] : i >= N ? 0 : len[2 * i] + len[2 * i + 1]) >= 0) instanceof IntPredicate pl
            && LongStream.range(0, 2L * n).map(e -> ((((e & 1) == 0 ? Math.min(v[1 + 4 * (int) (e >> 1)], v[3 + 4 * (int) (e >> 1)]) : Math.max(v[1 + 4 * (int) (e >> 1)], v[3 + 4 * (int) (e >> 1)]) + 1L) + 1000000001L) << 18) | e).sorted().toArray() instanceof long[] ev
            && new long[]{0, 0} instanceof long[] ar
            && LongStream.of(ev).filter(key -> Integer.valueOf((int) (key & 262143)) instanceof Integer e && Integer.valueOf(e >> 1) instanceof Integer sg
                && Integer.valueOf((e & 1) == 0 ? 1 : -1) instanceof Integer d
                && Long.valueOf((key >> 18) - 1000000001L) instanceof Long x
                && (ar[0] += len[1] * (x - ar[1])) >= 0 && (ar[1] = x) > Long.MIN_VALUE
                && Integer.valueOf(Arrays.binarySearch(ys, Math.min(v[2 + 4 * sg], v[4 + 4 * sg]))) instanceof Integer lo
                && Integer.valueOf(Arrays.binarySearch(ys, Math.max(v[2 + 4 * sg], v[4 + 4 * sg]) + 1)) instanceof Integer hi
                && ((IntPredicate) i -> (cnt[i] += d) > -1000000000 && pl.test(i)) instanceof IntPredicate ap
                && new int[]{lo + N, hi + N} instanceof int[] s
                && IntStream.range(0, LOG + 1).filter(z -> (s[0] >= s[1] || (((s[0] & 1) == 0 || ap.test(s[0]++)) && ((s[1] & 1) == 0 || ap.test(--s[1]))))
                    && (z == 0 || (pl.test((lo + N) >> z) && pl.test((hi + N - 1) >> z))) && (s[0] >>= 1) >= 0 && (s[1] >>= 1) >= 0).count() >= 0).count() >= 0
            ? ar[0] : "");
    }
}
