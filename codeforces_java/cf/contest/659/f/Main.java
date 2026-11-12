import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[4] instanceof int[] pz
            && Stream.of(0).peek(z0 -> {
                while (pz[0] <= raw.length && ((pz[0] > 0 && raw[pz[0] - 1] > 32 && (pz[0] == raw.length || raw[pz[0]] <= 32)) ? ++pz[1] > 0 : true) && ++pz[0] > 0) {}
            }).findFirst().isPresent()
            && new long[pz[1]] instanceof long[] v
            && new long[2] instanceof long[] ps
            && Stream.of(0).peek(z0 -> {
                while (pz[2] <= raw.length && (pz[2] < raw.length && raw[pz[2]] > 32 ? (ps[0] = ps[0] * 10 + raw[pz[2]] - 48) >= 0 : !(pz[2] > 0 && raw[pz[2] - 1] > 32) || ((v[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && ++pz[2] > 0) {}
            }).findFirst().isPresent()
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && Integer.valueOf((int) v[1]) instanceof Integer m
            && Integer.valueOf(n * m) instanceof Integer N
            && Long.valueOf(v[2]) instanceof Long k
            && new long[N] instanceof long[] key
            && new boolean[N] instanceof boolean[] act
            && new int[N] instanceof int[] ds
            && new int[N] instanceof int[] sz
            && Stream.of(0).peek(z0 -> {
                while (pz[3] < N && (key[pz[3]] = (v[3 + pz[3]] << 20) | pz[3]) >= 0 && (ds[pz[3]] = pz[3]) >= 0 && (sz[pz[3]] = 1) > 0 && ++pz[3] > 0) {}
            }).findFirst().isPresent()
            && Stream.of(0).peek(z0 -> Arrays.sort(key)).findFirst().isPresent()
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh
            && (fh[0] = x -> ds[x] == x ? x : (ds[x] = fh[0].applyAsInt(ds[x]))) != null
            && fh[0] instanceof IntUnaryOperator find
            && new long[]{0, -1, 0} instanceof long[] st
            && new int[4] instanceof int[] lp
            && Stream.of(0).peek(z1 -> {
                while (lp[0] < N && Integer.valueOf((int) (key[N - 1 - lp[0]] & 1048575)) instanceof Integer c && Integer.valueOf(lp[0]++) instanceof Integer t
                    && (act[c] = true) && (lp[1] = 0) == 0) {
                    while (lp[1] < 4 && Integer.valueOf(c / m + (lp[1] == 0 ? -1 : lp[1] == 1 ? 1 : 0)) instanceof Integer r
                        && Integer.valueOf(c % m + (lp[1] == 2 ? -1 : lp[1] == 3 ? 1 : 0)) instanceof Integer cc
                        && (r < 0 || r >= n || cc < 0 || cc >= m || !act[r * m + cc]
                            || (Integer.valueOf(find.applyAsInt(c)) instanceof Integer ra && Integer.valueOf(find.applyAsInt(r * m + cc)) instanceof Integer rb
                                && (ra.intValue() == rb.intValue() || (sz[ra] < sz[rb] ? (ds[ra] = rb) + (sz[rb] += sz[ra]) : (ds[rb] = ra) + (sz[ra] += sz[rb])) >= 0)))
                        && ++lp[1] > 0) {}
                    if (!(t < N - 1 && v[3 + (int) (key[N - 2 - t] & 1048575)] == v[3 + c]
                        || (Long.valueOf(v[3 + c]) instanceof Long h
                            && Integer.valueOf(k % h == 0 && k / h <= N
                                ? IntStream.range((int) st[0], t + 1).filter(p -> sz[find.applyAsInt((int) (key[N - 1 - p] & 1048575))] >= k / h).findFirst().orElse(-1)
                                : -1) instanceof Integer p0
                            && (p0 < 0 ? (st[0] = t + 1) > 0 : (st[1] = key[N - 1 - p0] & 1048575) >= 0 && (st[2] = h) < 0)))) {
                        if ((lp[0] = N) > 0) {}
                    }
                }
            }).findFirst().isPresent()
            ? (st[1] < 0 ? "NO"
                : Integer.valueOf((int) (k / st[2])) instanceof Integer need && new boolean[N] instanceof boolean[] vis && new int[need] instanceof int[] q && new int[]{1} instanceof int[] tl
                    && (vis[(int) st[1]] = true) && (q[0] = (int) st[1]) >= 0
                    && new int[3] instanceof int[] bp
                    && Stream.of(0).peek(z1 -> {
                        while (bp[0] < need && (bp[1] = 0) == 0) {
                            while (bp[1] < 4 && Integer.valueOf(q[bp[0]] / m + (bp[1] == 0 ? -1 : bp[1] == 1 ? 1 : 0)) instanceof Integer r
                                && Integer.valueOf(q[bp[0]] % m + (bp[1] == 2 ? -1 : bp[1] == 3 ? 1 : 0)) instanceof Integer cc
                                && (r < 0 || r >= n || cc < 0 || cc >= m || v[3 + r * m + cc] < st[2] || vis[r * m + cc] || tl[0] >= need
                                    || ((vis[r * m + cc] = true) && (q[tl[0]++] = r * m + cc) >= 0))
                                && ++bp[1] > 0) {}
                            if (++bp[0] < 0) {}
                        }
                    }).findFirst().isPresent()
                    ? "YES\n" + IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).mapToObj(j -> vis[i * m + j] ? String.valueOf(st[2]) : "0").collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))
                    : "")
            : "");
    }
}
