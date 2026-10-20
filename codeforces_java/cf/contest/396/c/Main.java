import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long P
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] head && new int[n + 1] instanceof int[] nxt
            && IntStream.rangeClosed(2, n).allMatch(v -> (par[v] = it.next()) > 0 && (nxt[v] = head[par[v]]) >= 0 && (head[par[v]] = v) > 0)
            && new int[n] instanceof int[] q && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] sz && new int[n + 1] instanceof int[] tin && new int[2] instanceof int[] ct
            && (q[0] = 1) > 0 && (ct[0] = 1) > 0
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(q[i]) instanceof Integer v && IntStream.iterate(head[v], c -> c != 0, c -> nxt[c]).allMatch(c -> (dep[c] = dep[v] + 1) > 0 && (q[ct[0]++] = c) > 0))
            && IntStream.range(0, n + 1).allMatch(i -> (sz[i] = 1) > 0)
            && IntStream.range(0, n - 1).map(i -> n - 1 - i).allMatch(i -> (sz[par[q[i]]] += sz[q[i]]) > 0)
            && (tin[1] = 1) > 0
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(q[i]) instanceof Integer v && (ct[1] = tin[v] + 1) > 0 && IntStream.iterate(head[v], c -> c != 0, c -> nxt[c]).allMatch(c -> (tin[c] = ct[1]) > 0 && (ct[1] += sz[c]) > 0))
            && new long[n + 2] instanceof long[] A && new long[n + 2] instanceof long[] B
            && Integer.valueOf(it.next()) instanceof Integer qn && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, qn).allMatch(z -> Integer.valueOf(it.next()) instanceof Integer t && Integer.valueOf(it.next()) instanceof Integer v
                && (t == 1
                    ? Long.valueOf(it.next()) instanceof Long x && Long.valueOf(it.next()) instanceof Long k
                        && IntStream.of(0, 1).allMatch(s -> IntStream.iterate(s == 0 ? tin[v] : tin[v] + sz[v], j -> j <= n, j -> j + (j & -j))
                            .allMatch(j -> (A[j] = ((A[j] + (s == 0 ? 1 : -1) * ((x + k % P * dep[v]) % P)) % P + P) % P) >= 0 && (B[j] = ((B[j] + (s == 0 ? 1 : -1) * k) % P + P) % P) >= 0))
                    : sb.append(((IntStream.iterate(tin[v], j -> j > 0, j -> j - (j & -j)).mapToLong(j -> A[j]).sum() - (long) dep[v] * (IntStream.iterate(tin[v], j -> j > 0, j -> j - (j & -j)).mapToLong(j -> B[j]).sum() % P) % P) % P + P) % P).append('\n') != null))
            ? sb.toString().trim() : "");
    }
}
