import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] T && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0
                : st[2] == 0 || ((T[st[0]++] = st[1]) >= 0 && (st[1] = 0) == 0 && (st[2] = 0) == 0))
            && Integer.valueOf(T[0]) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long P
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] head && new int[n + 1] instanceof int[] nxt
            && IntStream.rangeClosed(2, n).allMatch(v -> (par[v] = T[v - 1]) > 0 && (nxt[v] = head[par[v]]) >= 0 && (head[par[v]] = v) > 0)
            && new int[n] instanceof int[] q && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] sz && new int[n + 1] instanceof int[] tin && new int[2] instanceof int[] ct
            && (q[0] = 1) > 0 && (ct[0] = 1) > 0
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(q[i]) instanceof Integer v && IntStream.iterate(head[v], c -> c != 0, c -> nxt[c]).allMatch(c -> (dep[c] = dep[v] + 1) > 0 && (q[ct[0]++] = c) > 0))
            && IntStream.range(0, n + 1).allMatch(i -> (sz[i] = 1) > 0)
            && IntStream.range(0, n - 1).map(i -> n - 1 - i).allMatch(i -> (sz[par[q[i]]] += sz[q[i]]) > 0)
            && (tin[1] = 1) > 0
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(q[i]) instanceof Integer v && (ct[1] = tin[v] + 1) > 0 && IntStream.iterate(head[v], c -> c != 0, c -> nxt[c]).allMatch(c -> (tin[c] = ct[1]) > 0 && (ct[1] += sz[c]) > 0))
            && new long[n + 2] instanceof long[] A && new long[n + 2] instanceof long[] B
            && (st[0] = n + 1) > 0 && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, T[n]).allMatch(z -> Integer.valueOf(st[0]) instanceof Integer b && Integer.valueOf(T[b + 1]) instanceof Integer v
                && (st[0] = b + (T[b] == 1 ? 4 : 2)) > 0
                && (T[b] == 1
                    ? Long.valueOf((T[b + 2] + (long) T[b + 3] * dep[v]) % P) instanceof Long val && Long.valueOf(T[b + 3]) instanceof Long k
                        && IntStream.iterate(tin[v], j -> j <= n, j -> j + (j & -j)).allMatch(j -> (A[j] += val) >= 0 && (B[j] += k) >= 0)
                        && IntStream.iterate(tin[v] + sz[v], j -> j <= n, j -> j + (j & -j)).allMatch(j -> (A[j] += P - val) >= 0 && (B[j] += P - k) >= 0)
                    : sb.append(((IntStream.iterate(tin[v], j -> j > 0, j -> j - (j & -j)).mapToLong(j -> A[j] % P - dep[v] * (B[j] % P)).sum() % P + P) % P)).append('\n') != null))
            ? sb.toString().trim() : "");
    }
}
