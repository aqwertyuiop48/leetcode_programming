import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((v[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(n < 2 ? 1 : 1 << (32 - Integer.numberOfLeadingZeros(n - 1))) instanceof Integer N
            && LongStream.range(0, 8).map(w -> (w & 1) | (w >> 1 & 1) << 17 | (w >> 2 & 1) << 34).toArray() instanceof long[] tab
            && Arrays.copyOfRange(v, 1, n + 1) instanceof int[] a
            && new long[2 * N * 7 + 7] instanceof long[] cnt && new long[2 * N * 7 + 7] instanceof long[] lo && new int[2 * N + 2] instanceof int[] len
            && new long[7] instanceof long[] acc && new long[7] instanceof long[] oq && new long[8 * 7 + 70] instanceof long[] xs && new int[3] instanceof int[] q
            && IntStream.range(0, n).allMatch(i -> (len[N + i] = 1) > 0
                && (cnt[(N + i) * 7 + 0] = tab[a[i] >> 0 & 7]) >= 0
                && (cnt[(N + i) * 7 + 1] = tab[a[i] >> 3 & 7]) >= 0
                && (cnt[(N + i) * 7 + 2] = tab[a[i] >> 6 & 7]) >= 0
                && (cnt[(N + i) * 7 + 3] = tab[a[i] >> 9 & 7]) >= 0
                && (cnt[(N + i) * 7 + 4] = tab[a[i] >> 12 & 7]) >= 0
                && (cnt[(N + i) * 7 + 5] = tab[a[i] >> 15 & 7]) >= 0
                && (cnt[(N + i) * 7 + 6] = tab[a[i] >> 18 & 7]) >= 0)
            && ((IntUnaryOperator) nd -> true
                    && (cnt[nd * 7 + 0] = cnt[2 * nd * 7 + 0] + cnt[(2 * nd + 1) * 7 + 0] + len[nd] * lo[nd * 7 + 0] - (((cnt[2 * nd * 7 + 0] + cnt[(2 * nd + 1) * 7 + 0]) & (lo[nd * 7 + 0] * 131071L)) << 1)) >= 0
                    && (cnt[nd * 7 + 1] = cnt[2 * nd * 7 + 1] + cnt[(2 * nd + 1) * 7 + 1] + len[nd] * lo[nd * 7 + 1] - (((cnt[2 * nd * 7 + 1] + cnt[(2 * nd + 1) * 7 + 1]) & (lo[nd * 7 + 1] * 131071L)) << 1)) >= 0
                    && (cnt[nd * 7 + 2] = cnt[2 * nd * 7 + 2] + cnt[(2 * nd + 1) * 7 + 2] + len[nd] * lo[nd * 7 + 2] - (((cnt[2 * nd * 7 + 2] + cnt[(2 * nd + 1) * 7 + 2]) & (lo[nd * 7 + 2] * 131071L)) << 1)) >= 0
                    && (cnt[nd * 7 + 3] = cnt[2 * nd * 7 + 3] + cnt[(2 * nd + 1) * 7 + 3] + len[nd] * lo[nd * 7 + 3] - (((cnt[2 * nd * 7 + 3] + cnt[(2 * nd + 1) * 7 + 3]) & (lo[nd * 7 + 3] * 131071L)) << 1)) >= 0
                    && (cnt[nd * 7 + 4] = cnt[2 * nd * 7 + 4] + cnt[(2 * nd + 1) * 7 + 4] + len[nd] * lo[nd * 7 + 4] - (((cnt[2 * nd * 7 + 4] + cnt[(2 * nd + 1) * 7 + 4]) & (lo[nd * 7 + 4] * 131071L)) << 1)) >= 0
                    && (cnt[nd * 7 + 5] = cnt[2 * nd * 7 + 5] + cnt[(2 * nd + 1) * 7 + 5] + len[nd] * lo[nd * 7 + 5] - (((cnt[2 * nd * 7 + 5] + cnt[(2 * nd + 1) * 7 + 5]) & (lo[nd * 7 + 5] * 131071L)) << 1)) >= 0
                    && (cnt[nd * 7 + 6] = cnt[2 * nd * 7 + 6] + cnt[(2 * nd + 1) * 7 + 6] + len[nd] * lo[nd * 7 + 6] - (((cnt[2 * nd * 7 + 6] + cnt[(2 * nd + 1) * 7 + 6]) & (lo[nd * 7 + 6] * 131071L)) << 1)) >= 0 ? 0 : 1) instanceof IntUnaryOperator pull
            && IntStream.iterate(N - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (len[i] = len[2 * i] + len[2 * i + 1]) >= 0 && pull.applyAsInt(i) == 0)
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> upd
            && upd.compareAndSet(null, nd -> Integer.valueOf(31 - Integer.numberOfLeadingZeros(nd)) instanceof Integer lv && Integer.valueOf(N >> lv) instanceof Integer sp
                && Integer.valueOf((nd - (1 << lv)) * sp) instanceof Integer l && Integer.valueOf(l + sp - 1) instanceof Integer r && Integer.valueOf(l + sp / 2 - 1) instanceof Integer mid
                && (q[0] <= l && r <= q[1] ? true
                    && (cnt[nd * 7 + 0] = cnt[nd * 7 + 0] + len[nd] * oq[0] - ((cnt[nd * 7 + 0] & (oq[0] * 131071L)) << 1)) >= 0 && (lo[nd * 7 + 0] ^= oq[0]) >= 0
                    && (cnt[nd * 7 + 1] = cnt[nd * 7 + 1] + len[nd] * oq[1] - ((cnt[nd * 7 + 1] & (oq[1] * 131071L)) << 1)) >= 0 && (lo[nd * 7 + 1] ^= oq[1]) >= 0
                    && (cnt[nd * 7 + 2] = cnt[nd * 7 + 2] + len[nd] * oq[2] - ((cnt[nd * 7 + 2] & (oq[2] * 131071L)) << 1)) >= 0 && (lo[nd * 7 + 2] ^= oq[2]) >= 0
                    && (cnt[nd * 7 + 3] = cnt[nd * 7 + 3] + len[nd] * oq[3] - ((cnt[nd * 7 + 3] & (oq[3] * 131071L)) << 1)) >= 0 && (lo[nd * 7 + 3] ^= oq[3]) >= 0
                    && (cnt[nd * 7 + 4] = cnt[nd * 7 + 4] + len[nd] * oq[4] - ((cnt[nd * 7 + 4] & (oq[4] * 131071L)) << 1)) >= 0 && (lo[nd * 7 + 4] ^= oq[4]) >= 0
                    && (cnt[nd * 7 + 5] = cnt[nd * 7 + 5] + len[nd] * oq[5] - ((cnt[nd * 7 + 5] & (oq[5] * 131071L)) << 1)) >= 0 && (lo[nd * 7 + 5] ^= oq[5]) >= 0
                    && (cnt[nd * 7 + 6] = cnt[nd * 7 + 6] + len[nd] * oq[6] - ((cnt[nd * 7 + 6] & (oq[6] * 131071L)) << 1)) >= 0 && (lo[nd * 7 + 6] ^= oq[6]) >= 0 ? 0 : 1 : (q[0] <= mid ? upd.get().applyAsInt(2 * nd) : 0) + (q[1] > mid ? upd.get().applyAsInt(2 * nd + 1) : 0) + pull.applyAsInt(nd)) >= 0 ? 0 : 1)
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> qry
            && qry.compareAndSet(null, nd -> Integer.valueOf(31 - Integer.numberOfLeadingZeros(nd)) instanceof Integer lv && Integer.valueOf(N >> lv) instanceof Integer sp
                && Integer.valueOf((nd - (1 << lv)) * sp) instanceof Integer l && Integer.valueOf(l + sp - 1) instanceof Integer r && Integer.valueOf(l + sp / 2 - 1) instanceof Integer mid
                && (q[0] <= l && r <= q[1] ? true
                    && (acc[0] += cnt[nd * 7 + 0] + len[nd] * xs[lv * 7 + 0] - ((cnt[nd * 7 + 0] & (xs[lv * 7 + 0] * 131071L)) << 1)) >= 0
                    && (acc[1] += cnt[nd * 7 + 1] + len[nd] * xs[lv * 7 + 1] - ((cnt[nd * 7 + 1] & (xs[lv * 7 + 1] * 131071L)) << 1)) >= 0
                    && (acc[2] += cnt[nd * 7 + 2] + len[nd] * xs[lv * 7 + 2] - ((cnt[nd * 7 + 2] & (xs[lv * 7 + 2] * 131071L)) << 1)) >= 0
                    && (acc[3] += cnt[nd * 7 + 3] + len[nd] * xs[lv * 7 + 3] - ((cnt[nd * 7 + 3] & (xs[lv * 7 + 3] * 131071L)) << 1)) >= 0
                    && (acc[4] += cnt[nd * 7 + 4] + len[nd] * xs[lv * 7 + 4] - ((cnt[nd * 7 + 4] & (xs[lv * 7 + 4] * 131071L)) << 1)) >= 0
                    && (acc[5] += cnt[nd * 7 + 5] + len[nd] * xs[lv * 7 + 5] - ((cnt[nd * 7 + 5] & (xs[lv * 7 + 5] * 131071L)) << 1)) >= 0
                    && (acc[6] += cnt[nd * 7 + 6] + len[nd] * xs[lv * 7 + 6] - ((cnt[nd * 7 + 6] & (xs[lv * 7 + 6] * 131071L)) << 1)) >= 0 ? 0 : 1 : true
                    && (xs[lv * 7 + 7 + 0] = xs[lv * 7 + 0] ^ lo[nd * 7 + 0]) >= 0
                    && (xs[lv * 7 + 7 + 1] = xs[lv * 7 + 1] ^ lo[nd * 7 + 1]) >= 0
                    && (xs[lv * 7 + 7 + 2] = xs[lv * 7 + 2] ^ lo[nd * 7 + 2]) >= 0
                    && (xs[lv * 7 + 7 + 3] = xs[lv * 7 + 3] ^ lo[nd * 7 + 3]) >= 0
                    && (xs[lv * 7 + 7 + 4] = xs[lv * 7 + 4] ^ lo[nd * 7 + 4]) >= 0
                    && (xs[lv * 7 + 7 + 5] = xs[lv * 7 + 5] ^ lo[nd * 7 + 5]) >= 0
                    && (xs[lv * 7 + 7 + 6] = xs[lv * 7 + 6] ^ lo[nd * 7 + 6]) >= 0 && (q[0] <= mid ? qry.get().applyAsInt(2 * nd) : 0) + (q[1] > mid ? qry.get().applyAsInt(2 * nd + 1) : 0) >= 0 ? 0 : 1) >= 0 ? 0 : 1)
            && Integer.valueOf(v[n + 1]) instanceof Integer m && new int[]{n + 2} instanceof int[] p
            ? IntStream.range(0, m).mapToObj(i -> Integer.valueOf(v[p[0]++]) instanceof Integer t && (q[0] = v[p[0]++] - 1) >= 0 && (q[1] = v[p[0]++] - 1) >= 0
                ? t == 1 ? IntStream.range(0, 7).allMatch(k -> (acc[k] = 0) == 0) && qry.get().applyAsInt(1) == 0
                        ? String.valueOf(IntStream.range(0, 21).mapToLong(bit -> (acc[bit / 3] >> 17 * (bit % 3) & 131071L) << bit).sum()) : null
                    : (q[2] = v[p[0]++]) >= 0 && IntStream.range(0, 7).allMatch(k -> (oq[k] = tab[q[2] >> 3 * k & 7]) >= 0) && upd.get().applyAsInt(1) >= 0 ? null : null : null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
