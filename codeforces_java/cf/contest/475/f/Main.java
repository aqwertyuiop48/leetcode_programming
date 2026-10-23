import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[4] instanceof int[] st && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : i < raw.length && raw[i] == 45 ? (st[3] = 1) > 0 : st[2] > 0 && (v[st[0]++] = st[3] > 0 ? -st[1] : st[1]) != Integer.MIN_VALUE && (st[1] = st[2] = st[3] = 0) == 0) || true)
                && (Integer) v[0] instanceof Integer n
                && new int[2][n] instanceof int[][] C && IntStream.range(0, n).allMatch(i -> (C[0][i] = v[1 + 2 * i]) != Integer.MIN_VALUE && (C[1][i] = v[2 + 2 * i]) != Integer.MIN_VALUE)
                && new int[4][n] instanceof int[][] L && new int[2][2 * n + 3] instanceof int[][] H && new int[2][2 * n + 3] instanceof int[][] Tl
                && IntStream.range(0, 2).allMatch(ax -> LongStream.range(0, n).map(i -> (C[ax][(int) i] + 1000000000L) << 17 | i).sorted().toArray() instanceof long[] ks && IntStream.range(0, n).allMatch(i -> (L[2 * ax][(int) (ks[i] & 131071)] = i + 1 < n ? (int) (ks[i + 1] & 131071) : -1) > -2 && (L[2 * ax + 1][(int) (ks[i] & 131071)] = i > 0 ? (int) (ks[i - 1] & 131071) : -1) > -2) && (H[ax][0] = (int) (ks[0] & 131071)) >= 0 && (Tl[ax][0] = (int) (ks[n - 1] & 131071)) >= 0)
                && new int[2 * n + 3] instanceof int[] sz && (sz[0] = n) > 0 && new int[2 * n + 5] instanceof int[] stk && new int[]{1} instanceof int[] sp && new int[1] instanceof int[] lf && new int[1] instanceof int[] nc && new int[3] instanceof int[] rs && new int[4] instanceof int[] cur && new boolean[4] instanceof boolean[] dn && new int[1] instanceof int[] sc
                && Optional.<IntPredicate>of(s -> !dn[s] && (Integer) L[s][cur[s]] instanceof Integer e && (e < 0 ? (dn[s] = true) && (dn[s ^ 1] = true) && false : Math.abs(C[s >> 1][e] - C[s >> 1][cur[s]]) >= 2 ? (rs[0] = s) >= 0 && (rs[1] = cur[s]) >= 0 && (rs[2] = sc[0] + 1) > 0 : (cur[s] = e) < 0)).get() instanceof IntPredicate chk
                && Optional.<IntPredicate>of(c -> (Integer) rs[0] instanceof Integer s && (Integer) rs[2] instanceof Integer t && (Integer) (s >> 1) instanceof Integer ax && (Integer) (1 - ax) instanceof Integer o && (Integer) ((s & 1) == 0 ? H[ax][c] : Tl[ax][c]) instanceof Integer start && (Integer) rs[1] instanceof Integer last && new int[t] instanceof int[] tn && (tn[0] = start) >= 0 && IntStream.range(1, t).allMatch(i -> (tn[i] = L[s][tn[i - 1]]) >= 0) && (Integer) L[s][last] instanceof Integer e && (L[s][last] = -1) == -1 && (L[s ^ 1][e] = -1) == -1 && (Integer) (++nc[0]) instanceof Integer q
                        && ((s & 1) == 0 ? (H[ax][q] = start) >= 0 && (Tl[ax][q] = last) >= 0 && (H[ax][c] = e) >= 0 : (Tl[ax][q] = start) >= 0 && (H[ax][q] = last) >= 0 && (Tl[ax][c] = e) >= 0)
                        && IntStream.of(tn).allMatch(u -> (Integer) L[2 * o + 1][u] instanceof Integer pu && (Integer) L[2 * o][u] instanceof Integer qu && (pu >= 0 ? (L[2 * o][pu] = qu) >= -1 : (H[o][c] = qu) >= -1) && (qu >= 0 ? (L[2 * o + 1][qu] = pu) >= -1 : (Tl[o][c] = pu) >= -1))
                        && IntStream.of(tn).mapToLong(u -> (C[o][u] + 1000000000L) << 17 | u).sorted().toArray() instanceof long[] ks
                        && IntStream.range(0, t).allMatch(i -> (Integer) (int) (ks[i] & 131071) instanceof Integer u && (L[2 * o][u] = i + 1 < t ? (int) (ks[i + 1] & 131071) : -1) > -2 && (L[2 * o + 1][u] = i > 0 ? (int) (ks[i - 1] & 131071) : -1) > -2)
                        && (H[o][q] = (int) (ks[0] & 131071)) >= 0 && (Tl[o][q] = (int) (ks[t - 1] & 131071)) >= 0 && (sz[q] = t) > 0 && (sz[c] -= t) > 0 && (stk[sp[0]++] = c) >= 0 && (stk[sp[0]++] = q) >= 0).get() instanceof IntPredicate split
                && Optional.<IntPredicate>of(c -> sz[c] == 1 ? lf[0]++ >= 0 : IntStream.range(0, 4).allMatch(s -> (cur[s] = (s & 1) == 0 ? H[s >> 1][c] : Tl[s >> 1][c]) >= 0 && !(dn[s] = false)) && (sc[0] = 0) == 0 && IntStream.generate(() -> 0).anyMatch(z -> chk.test(0) || chk.test(1) || chk.test(2) || chk.test(3) || dn[0] && dn[1] && dn[2] && dn[3] && (rs[2] = 0) == 0 || sc[0]++ < 0) && (rs[2] == 0 ? lf[0]++ >= 0 : split.test(c))).get() instanceof IntPredicate proc
                && IntStream.generate(() -> 0).anyMatch(z -> sp[0] == 0 || proc.test(stk[--sp[0]]) && false) ? lf[0] : "");
    }
}
