import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && Arrays.copyOf(b, b.length + 1) instanceof byte[] raw
            && new long[2] instanceof long[] st && new int[]{0} instanceof int[] ix && new long[raw.length / 2 + 2] instanceof long[] v
            && IntStream.range(0, raw.length).filter(k -> raw[k] > 47 && raw[k] < 58 ? (st[0] = st[0] * 10 + raw[k] - 48) < 0
                : raw[k] == 45 ? (st[1] = 1) < 0
                : k > 0 && raw[k - 1] > 47 && raw[k - 1] < 58 && (v[ix[0]++] = st[1] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) < 0).count() >= 0
            && Integer.valueOf((int) v[0]) instanceof Integer n && Integer.valueOf((int) v[1]) instanceof Integer m && Integer.valueOf((int) v[n + 2]) instanceof Integer q
            && IntStream.range(0, n).mapToLong(i -> v[2 + i]).sorted().distinct().toArray() instanceof long[] vals
            && Integer.valueOf(vals.length) instanceof Integer D && Integer.valueOf((D + 15) >> 4) instanceof Integer NB
            && IntStream.range(0, n).map(i -> Arrays.binarySearch(vals, v[2 + i])).toArray() instanceof int[] rk
            && new int[NB * 16] instanceof int[] cnt && new int[NB] instanceof int[] pc && new boolean[NB] instanceof boolean[] dr
            && new long[NB] instanceof long[] P && new long[NB] instanceof long[] Q && new long[NB * 16] instanceof long[] vm
            && IntStream.range(0, D).filter(i -> (vm[i] = Math.floorMod(vals[i], (long) m)) < 0).count() >= 0
            && new long[D + 5] instanceof long[] G && (G[0] = 1 % m) >= 0 && (G[1] = 0) == 0
            && IntStream.range(2, D + 5).filter(i -> (G[i] = (G[i - 1] + G[i - 2]) % m) < 0).count() >= 0
            && new long[2] instanceof long[] PQ && new int[1] instanceof int[] ri && new long[2] instanceof long[] cs && new int[2] instanceof int[] cw
            && Integer.valueOf(Math.max(1, (int) (n / Math.sqrt(q)))) instanceof Integer bs
            && IntStream.range(0, q).mapToLong(j -> Integer.valueOf((int) v[n + 3 + 2 * j] - 1) instanceof Integer l0 && Integer.valueOf((int) v[n + 4 + 2 * j]) instanceof Integer r0
                ? ((long) (l0 / bs) << 36) | ((long) ((l0 / bs) % 2 == 0 ? r0 : 32767 - r0) << 20) | j : 0L).sorted().toArray() instanceof long[] keys
            && new long[q] instanceof long[] ans
            && Arrays.stream(keys).filter(key -> Integer.valueOf((int) (key & 1048575)) instanceof Integer idx && Integer.valueOf((int) v[n + 3 + 2 * idx] - 1) instanceof Integer l && Integer.valueOf((int) v[n + 4 + 2 * idx]) instanceof Integer r
                && IntStream.range(l, cw[0]).filter(pos -> cnt[rk[pos]]++ == 0 && ++pc[rk[pos] >> 4] > 0 && (dr[rk[pos] >> 4] = true)).count() >= 0 && (cw[0] = Math.min(cw[0], l)) >= 0
                && IntStream.range(cw[1], r).filter(pos -> cnt[rk[pos]]++ == 0 && ++pc[rk[pos] >> 4] > 0 && (dr[rk[pos] >> 4] = true)).count() >= 0 && (cw[1] = Math.max(cw[1], r)) >= 0
                && IntStream.range(cw[0], l).filter(pos -> --cnt[rk[pos]] == 0 && --pc[rk[pos] >> 4] >= 0 && (dr[rk[pos] >> 4] = true)).count() >= 0 && (cw[0] = Math.max(cw[0], l)) >= 0
                && IntStream.range(r, cw[1]).filter(pos -> --cnt[rk[pos]] == 0 && --pc[rk[pos] >> 4] >= 0 && (dr[rk[pos] >> 4] = true)).count() >= 0 && (cw[1] = Math.min(cw[1], r)) >= 0
                && (cs[0] = 0) + (cs[1] = 0) == 0
                && IntStream.range(0, NB).filter(bk -> (!dr[bk] || (PQ[0] = 0L) + (PQ[1] = 0L) + (ri[0] = 0) >= 0 && (((cnt[bk * 16 + 0] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 0]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 0]) : 0L) & 0L) | ((cnt[bk * 16 + 1] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 1]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 1]) : 0L) & 0L) | ((cnt[bk * 16 + 2] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 2]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 2]) : 0L) & 0L) | ((cnt[bk * 16 + 3] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 3]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 3]) : 0L) & 0L) | ((cnt[bk * 16 + 4] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 4]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 4]) : 0L) & 0L) | ((cnt[bk * 16 + 5] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 5]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 5]) : 0L) & 0L) | ((cnt[bk * 16 + 6] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 6]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 6]) : 0L) & 0L) | ((cnt[bk * 16 + 7] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 7]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 7]) : 0L) & 0L) | ((cnt[bk * 16 + 8] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 8]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 8]) : 0L) & 0L) | ((cnt[bk * 16 + 9] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 9]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 9]) : 0L) & 0L) | ((cnt[bk * 16 + 10] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 10]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 10]) : 0L) & 0L) | ((cnt[bk * 16 + 11] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 11]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 11]) : 0L) & 0L) | ((cnt[bk * 16 + 12] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 12]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 12]) : 0L) & 0L) | ((cnt[bk * 16 + 13] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 13]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 13]) : 0L) & 0L) | ((cnt[bk * 16 + 14] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 14]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 14]) : 0L) & 0L) | ((cnt[bk * 16 + 15] > 0 ? (PQ[0] += G[++ri[0] + 1] * vm[bk * 16 + 15]) + (PQ[1] += G[ri[0] + 2] * vm[bk * 16 + 15]) : 0L) & 0L)) == 0L && (P[bk] = PQ[0] % m) + (Q[bk] = PQ[1] % m) >= 0 && !(dr[bk] = false))
                    && (cs[1] += G[(int) cs[0] + 1] * Q[bk] + G[(int) cs[0]] * P[bk]) + (cs[0] += pc[bk]) < 0).count() >= 0
                && (ans[idx] = cs[1] % m) < 0).count() >= 0
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
