import java.nio.IntBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] w
            && (w[0] + "{" + w[1] + "|" + w[2]) instanceof String s
            && (Integer) s.length() instanceof Integer T
            && (Integer) w[0].length() instanceof Integer l1
            && (Integer) w[1].length() instanceof Integer l2
            && (Integer) (2 * T + 2) instanceof Integer N
            && (Integer) 28 instanceof Integer K
            && new int[N * K] instanceof int[] nx
            && new int[N] instanceof int[] link
            && new int[N] instanceof int[] len
            && new int[3 * N] instanceof int[] cnt
            && new int[3] instanceof int[] sz
            && new int[6] instanceof int[] ps
            && (link[0] = -1) < 0
            && new IntUnaryOperator[2] instanceof IntUnaryOperator[] f
            && (f[0] = x -> x >= 0 && nx[x * K + ps[2]] == 0 ? ((nx[x * K + ps[2]] = ps[3]) > 0 ? f[0].applyAsInt(link[x]) : -2) : x) != null
            && (f[1] = y -> y >= 0 && nx[y * K + ps[2]] == ps[4] ? ((nx[y * K + ps[2]] = ps[5]) > 0 ? f[1].applyAsInt(link[y]) : -2) : y) != null
            && IntStream.range(0, T).allMatch(i ->
                (Integer) (s.charAt(i) - 'a') instanceof Integer c
                && (ps[2] = c) >= 0
                && (Integer) (++sz[0]) instanceof Integer cur
                && (ps[3] = cur) > 0
                && (len[cur] = len[ps[0]] + 1) > 0
                && (cnt[(i <= l1 ? 0 : i <= l1 + l2 + 1 ? 1 : 2) * N + cur] = 1) > 0
                && (Integer) f[0].applyAsInt(ps[0]) instanceof Integer p
                && (p < 0 ? (link[cur] = 0) >= 0
                    : (Integer) nx[p * K + c] instanceof Integer q
                    && (len[p] + 1 == len[q] ? (link[cur] = q) > 0
                        : (Integer) (++sz[0]) instanceof Integer cl
                        && (len[cl] = len[p] + 1) > 0
                        && IntBuffer.wrap(nx).put(cl * K, nx, q * K, K) != null
                        && (link[cl] = link[q]) >= 0
                        && (ps[4] = q) > 0
                        && (ps[5] = cl) > 0
                        && f[1].applyAsInt(p) >= -1
                        && (link[q] = cl) > 0
                        && (link[cur] = cl) > 0))
                && (ps[0] = cur) > 0)
            && (Integer) sz[0] instanceof Integer m
            && new int[T + 2] instanceof int[] b
            && IntStream.rangeClosed(0, m).allMatch(v -> ++b[len[v]] > 0)
            && IntStream.rangeClosed(1, T).allMatch(l -> (b[l] += b[l - 1]) > 0)
            && new int[m + 1] instanceof int[] ord
            && IntStream.rangeClosed(0, m).allMatch(k -> (ord[--b[len[m - k]]] = m - k) >= 0)
            && IntStream.range(0, m).allMatch(k ->
                (Integer) ord[m - k] instanceof Integer v
                && (cnt[link[v]] += cnt[v]) >= 0 && (cnt[N + link[v]] += cnt[N + v]) >= 0 && (cnt[2 * N + link[v]] += cnt[2 * N + v]) >= 0)
            && new long[T + 3] instanceof long[] d
            && IntStream.rangeClosed(1, m).allMatch(v ->
                (Long) ((long) cnt[v] * cnt[N + v] % 1000000007L * cnt[2 * N + v] % 1000000007L) instanceof Long pr
                && (d[len[link[v]] + 1] += pr) > -4000000000000000000L
                && (d[len[v] + 1] -= pr) > -4000000000000000000L)
            && IntStream.rangeClosed(1, T).allMatch(l -> (d[l] += d[l - 1]) >= 0)
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.rangeClosed(1, Math.min(l1, Math.min(l2, T - l1 - l2 - 2))).allMatch(l -> sb.append(d[l] % 1000000007L).append(' ') != null)
            ? sb.toString().trim() : "");
    }
}
