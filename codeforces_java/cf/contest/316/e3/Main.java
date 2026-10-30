import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] nm && new int[3] instanceof int[] st && new int[1] instanceof int[] pos
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || ((nm[st[1]++] = st[0]) >= 0 & (st[0] = 0) == 0 & (st[2] = 0) == 0)) || true)
            && ((IntSupplier) () -> nm[pos[0]++]) instanceof IntSupplier nx
            && Integer.valueOf(nx.getAsInt()) instanceof Integer n && Integer.valueOf(nx.getAsInt()) instanceof Integer m && Long.valueOf(1000000000L) instanceof Long M && (pos[0] += n) > 0
            && Integer.valueOf(n + 3) instanceof Integer OFF && new long[2 * OFF + 1] instanceof long[] F && (F[OFF + 1] = 1) == 1
            && IntStream.rangeClosed(2, OFF).allMatch(i -> (F[OFF + i] = (F[OFF + i - 1] + F[OFF + i - 2]) % 1000000000L) >= 0)
            && IntStream.rangeClosed(1, OFF).allMatch(i -> (F[OFF - i] = ((F[OFF - i + 2] - F[OFF - i + 1]) % 1000000000L + 1000000000L) % 1000000000L) >= 0)
            && new long[n + 3] instanceof long[] PF && IntStream.rangeClosed(1, n + 2).allMatch(i -> (PF[i] = (PF[i - 1] + F[OFF + i]) % 1000000000L) >= 0)
            && new long[2 * n] instanceof long[] s0 && new long[2 * n] instanceof long[] s1 && new long[2 * n] instanceof long[] lz && new long[2] instanceof long[] qa && new int[3] instanceof int[] g
            && new int[2 * n] instanceof int[] lo && new int[2 * n] instanceof int[] hi && new int[2 * n] instanceof int[] rc
            && new IntPredicate[4] instanceof IntPredicate[] fn
            && ((IntBinaryOperator) (v, c) -> (s0[v] = (s0[v] + (long) c * ((PF[hi[v]] - PF[lo[v] - 1] + 1000000000L) % 1000000000L)) % 1000000000L) >= 0
                && (s1[v] = (s1[v] + (long) c * ((PF[hi[v] + 1] - PF[lo[v]] + 1000000000L) % 1000000000L)) % 1000000000L) >= 0
                && (lz[v] = (lz[v] + c) % 1000000000L) >= 0 ? 1 : 0) instanceof IntBinaryOperator apply
            && ((IntPredicate) v -> lz[v] == 0 || (apply.applyAsInt(v + 1, (int) lz[v]) == 1 && apply.applyAsInt(rc[v], (int) lz[v]) == 1 && (lz[v] = 0) == 0)) instanceof IntPredicate push
            && ((IntPredicate) v -> (s0[v] = (s0[v + 1] + s0[rc[v]]) % 1000000000L) >= 0 && (s1[v] = (s1[v + 1] + s1[rc[v]]) % 1000000000L) >= 0) instanceof IntPredicate pull
            && (fn[0] = v -> lo[v] == hi[v] ? (s0[v] = nm[1 + lo[v]] % 1000000000L * F[OFF + lo[v]] % 1000000000L) >= 0 && (s1[v] = nm[1 + lo[v]] % 1000000000L * F[OFF + lo[v] + 1] % 1000000000L) >= 0
                : Integer.valueOf((lo[v] + hi[v]) / 2) instanceof Integer mid && (rc[v] = v + 2 * (mid - lo[v] + 1)) > 0
                    && (lo[v + 1] = lo[v]) > 0 && (hi[v + 1] = mid) > 0 && (lo[rc[v]] = mid + 1) > 0 && (hi[rc[v]] = hi[v]) > 0
                    && fn[0].test(v + 1) && fn[0].test(rc[v]) && pull.test(v)) instanceof IntPredicate
            && (fn[1] = v -> g[0] <= lo[v] && hi[v] <= g[1] ? apply.applyAsInt(v, g[2]) == 1
                : push.test(v) && (g[0] > hi[v + 1] || fn[1].test(v + 1)) && (g[1] <= hi[v + 1] || fn[1].test(rc[v])) && pull.test(v)) instanceof IntPredicate
            && (fn[2] = v -> g[0] <= lo[v] && hi[v] <= g[1] ? (qa[0] += s0[v]) >= 0 && (qa[1] += s1[v]) >= 0
                : push.test(v) && (g[0] > hi[v + 1] || fn[2].test(v + 1)) && (g[1] <= hi[v + 1] || fn[2].test(rc[v]))) instanceof IntPredicate
            && ((IntBinaryOperator) (l, r) -> (g[0] = l) > 0 && (g[1] = r) > 0 && (qa[0] = 0) == 0 && (qa[1] = 0) == 0 && fn[2].test(0)
                ? (int) ((qa[1] % 1000000000L * F[OFF + 1 - l] + qa[0] % 1000000000L * F[OFF - l]) % 1000000000L) : -1) instanceof IntBinaryOperator query
            && (lo[0] = 1) == 1 && (hi[0] = n) == n && fn[0].test(0)
            ? IntStream.range(0, m).mapToObj(e -> Integer.valueOf(nx.getAsInt()) instanceof Integer t
                ? t == 1 ? Integer.valueOf(nx.getAsInt()) instanceof Integer x && Integer.valueOf(nx.getAsInt()) instanceof Integer v
                        && (g[2] = (int) ((v - query.applyAsInt(x, x)) % 1000000000L + 1000000000L) % 1000000000) >= 0 && (g[0] = x) > 0 && (g[1] = x) > 0 && fn[1].test(0) ? (String) null : (String) null
                : t == 2 ? Integer.valueOf(nx.getAsInt()) instanceof Integer l && Integer.valueOf(nx.getAsInt()) instanceof Integer r ? String.valueOf(query.applyAsInt(l, r)) : ""
                : Integer.valueOf(nx.getAsInt()) instanceof Integer l && Integer.valueOf(nx.getAsInt()) instanceof Integer r && Integer.valueOf(nx.getAsInt()) instanceof Integer d
                        && (g[2] = d % 1000000000) >= 0 && (g[0] = l) > 0 && (g[1] = r) > 0 && fn[1].test(0) ? (String) null : (String) null
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
