import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length + 1).filter(i -> i < raw.length && raw[i] > 47 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[1]) instanceof Integer q && new int[q + 3] instanceof int[] par && new int[]{2, 1} instanceof int[] ptr
            && IntStream.range(0, q).filter(i -> tok[ptr[0]] == 1 ? (par[++ptr[1]] = tok[ptr[0] + 1]) >= 0 & (ptr[0] += 3) > 0 : (ptr[0] += 2) > 0).count() >= 0
            && Integer.valueOf(ptr[1]) instanceof Integer N && new int[N + 2] instanceof int[] sz && new int[N + 2] instanceof int[] tin && new int[N + 2] instanceof int[] nf
            && IntStream.rangeClosed(1, N).filter(v -> (sz[v] = 1) > 0).count() >= 0
            && IntStream.range(0, N - 1).filter(x -> (sz[par[N - x]] += sz[N - x]) > 0).count() >= 0
            && (nf[1] = 1) == 1 && IntStream.rangeClosed(2, N).filter(v -> (tin[v] = nf[par[v]]) >= 0 & (nf[par[v]] += sz[v]) > 0 & (nf[v] = tin[v] + 1) > 0).count() >= 0
            && Integer.valueOf(1 << (32 - Integer.numberOfLeadingZeros(N))) instanceof Integer n2 && Integer.valueOf(31 - Integer.numberOfLeadingZeros(n2)) instanceof Integer hh
            && new long[2 * n2] instanceof long[] t && LongStream.generate(() -> 1).limit(2 * n2).toArray() instanceof long[] lz && LongStream.generate(() -> 1).limit(2 * n2).toArray() instanceof long[] lzi && new int[2] instanceof int[] ci && new long[5] instanceof long[] cl
            && ((LongBinaryOperator) (c, s0) -> (t[(int) c] = t[(int) c] * lz[(int) s0] % 1000000007L) * 0 + (lz[(int) c] = lz[(int) c] * lz[(int) s0] % 1000000007L) * 0 + (lzi[(int) c] = lzi[(int) c] * lzi[(int) s0] % 1000000007L)) instanceof LongBinaryOperator ap
            && ((IntUnaryOperator) nd -> lz[nd] == 1 ? 0 : (int) (ap.applyAsLong(2 * nd, nd) * 0 + ap.applyAsLong(2 * nd + 1, nd) * 0 + (lz[nd] = 1) * 0 + (lzi[nd] = 1) * 0)) instanceof IntUnaryOperator pu
            && new IntBinaryOperator[4] instanceof IntBinaryOperator[] R
            && (R[0] = (nd, ln) -> nd * ln - n2 > ci[1] || nd * ln - n2 + ln - 1 < ci[0] ? 0
                : nd * ln - n2 >= ci[0] && nd * ln - n2 + ln - 1 <= ci[1] ? (int) ((t[nd] = t[nd] * cl[0] % 1000000007L) * 0 + (lz[nd] = lz[nd] * cl[0] % 1000000007L) * 0 + (lzi[nd] = lzi[nd] * cl[1] % 1000000007L) * 0)
                : pu.applyAsInt(nd) + R[0].applyAsInt(2 * nd, ln / 2) + R[0].applyAsInt(2 * nd + 1, ln / 2) + (int) ((t[nd] = (t[2 * nd] + t[2 * nd + 1]) % 1000000007L) * 0)) != null
            && (R[1] = (nd, ln) -> nd * ln - n2 > ci[1] || nd * ln - n2 + ln - 1 < ci[0] ? 0
                : nd * ln - n2 >= ci[0] && nd * ln - n2 + ln - 1 <= ci[1] ? (int) t[nd]
                : pu.applyAsInt(nd) * 0 + (int) (((long) R[1].applyAsInt(2 * nd, ln / 2) + R[1].applyAsInt(2 * nd + 1, ln / 2)) % 1000000007L)) != null
            && (R[2] = (nd, ln) -> ln == 1 ? (int) ((t[nd] = cl[2] * lz[nd] % 1000000007L) * 0)
                : pu.applyAsInt(nd) + R[2].applyAsInt(ci[0] < nd * ln - n2 + ln / 2 ? 2 * nd : 2 * nd + 1, ln / 2) + (int) ((t[nd] = (t[2 * nd] + t[2 * nd + 1]) % 1000000007L) * 0)) != null
            && (R[3] = (nd, ln) -> ln == 1 ? (int) ((cl[3] = lz[nd]) * 0 + (cl[4] = lzi[nd]) * 0)
                : pu.applyAsInt(nd) + R[3].applyAsInt(ci[0] < nd * ln - n2 + ln / 2 ? 2 * nd : 2 * nd + 1, ln / 2)) != null
            && new long[q + 4] instanceof long[] inv && (inv[1] = 1) == 1 && IntStream.rangeClosed(2, q + 3).filter(i -> (inv[i] = (1000000007L - 1000000007L / i) * inv[(int) (1000000007L % i)] % 1000000007L) > 0).count() >= 0
            && (ci[0] = 0) == 0 && (cl[2] = tok[0]) >= 0 && R[2].applyAsInt(1, n2) >= 0 && new int[N + 2] instanceof int[] cc && new int[]{2, 1} instanceof int[] p2
            && IntStream.range(0, q).mapToObj(i -> tok[p2[0]] == 1
                ? (Integer.valueOf(tok[p2[0] + 1]) instanceof Integer p && Integer.valueOf(tok[p2[0] + 2]) instanceof Integer w && Integer.valueOf(++p2[1]) instanceof Integer v && (p2[0] += 3) > 0
                    && Integer.valueOf(cc[p]++) instanceof Integer k && (cl[0] = (k + 2) * inv[k + 1] % 1000000007L) > 0 && (cl[1] = (k + 1) * inv[k + 2] % 1000000007L) > 0
                    && (ci[0] = tin[p]) >= 0 && (ci[1] = tin[p] + sz[p] - 1) >= 0 && R[0].applyAsInt(1, n2) >= 0
                    && (ci[0] = tin[v]) >= 0 && (cl[2] = w) >= 0 && R[2].applyAsInt(1, n2) >= 0 ? "" : "?")
                : (Integer.valueOf(tok[p2[0] + 1]) instanceof Integer v && (p2[0] += 2) > 0 && (ci[0] = tin[v]) >= 0 && (ci[1] = tin[v] + sz[v] - 1) >= 0 && Long.valueOf(R[1].applyAsInt(1, n2)) instanceof Long S
                    && (v == 1 || ((ci[0] = tin[par[v]]) >= 0 && R[3].applyAsInt(1, n2) >= 0)) ? (v == 1 ? S : S * cl[4] % 1000000007L) + "" : "?")).filter(r -> r.length() > 0).collect(Collectors.joining("\n")) instanceof String res
            ? res : "");
    }
}
