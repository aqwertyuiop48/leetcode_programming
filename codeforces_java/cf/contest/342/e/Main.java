import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(500) instanceof Integer BS
            && IntStream.range(0, n - 1).mapToObj(i -> new int[]{Integer.parseInt(it.next()), Integer.parseInt(it.next())}).toArray(int[][]::new) instanceof int[][] ed
            && new int[n + 2] instanceof int[] st && Arrays.stream(ed).allMatch(x -> st[x[0] + 1]++ >= 0 & st[x[1] + 1]++ >= 0)
            && IntStream.rangeClosed(1, n + 1).allMatch(v -> (st[v] += st[v - 1]) >= 0)
            && st.clone() instanceof int[] pos && new int[2 * n] instanceof int[] adj && Arrays.stream(ed).allMatch(x -> (adj[pos[x[0]]++] = x[1]) > 0 & (adj[pos[x[1]]++] = x[0]) > 0)
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] tin && new int[n] instanceof int[] ord && new int[n + 1] instanceof int[] stk && new int[]{1, 0} instanceof int[] sc && (stk[0] = 1) == 1
            && IntStream.generate(() -> 0).takeWhile(z -> sc[0] > 0).allMatch(z -> Integer.valueOf(stk[--sc[0]]) instanceof Integer v && (tin[v] = sc[1]) >= 0 && (ord[sc[1]++] = v) > 0
                && IntStream.range(st[v], st[v + 1]).filter(k -> adj[k] != par[v]).allMatch(k -> (par[adj[k]] = v) > 0 && (dep[adj[k]] = dep[v] + 1) > 0 && (stk[sc[0]++] = adj[k]) > 0))
            && new int[18][] instanceof int[][] sp && (sp[0] = IntStream.range(0, n).map(i -> dep[ord[i]]).toArray()) != null
            && IntStream.range(1, 18).filter(k -> (1 << k) <= n).allMatch(k -> (sp[k] = IntStream.range(0, n - (1 << k) + 1).map(i -> Math.min(sp[k - 1][i], sp[k - 1][i + (1 << (k - 1))])).toArray()) != null)
            && ((IntBinaryOperator) (u, v) -> u == v ? 0 : Integer.valueOf(Math.min(tin[u], tin[v]) + 1) instanceof Integer l && Integer.valueOf(Math.max(tin[u], tin[v])) instanceof Integer r && Integer.valueOf(31 - Integer.numberOfLeadingZeros(r - l + 1)) instanceof Integer k
                ? dep[u] + dep[v] - 2 * (Math.min(sp[k][l], sp[k][r - (1 << k) + 1]) - 1) : 0) instanceof IntBinaryOperator dist
            && IntStream.range(0, m).mapToObj(i -> new int[]{Integer.parseInt(it.next()), Integer.parseInt(it.next())}).toArray(int[][]::new) instanceof int[][] qs
            && new boolean[n + 1] instanceof boolean[] red && (red[1] = true) && new int[n + 1] instanceof int[] dd && new int[BS] instanceof int[] nb && new int[1] instanceof int[] nc
            ? IntStream.iterate(0, s -> s < m, s -> s + BS).boxed().flatMap(s -> IntStream.rangeClosed(1, n).allMatch(v -> (dd[v] = red[v] ? 0 : 1 << 29) >= 0)
                    && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> (dd[par[ord[i]]] = Math.min(dd[par[ord[i]]], dd[ord[i]] + 1)) >= 0)
                    && IntStream.range(1, n).allMatch(i -> (dd[ord[i]] = Math.min(dd[ord[i]], dd[par[ord[i]]] + 1)) >= 0) && (nc[0] = 0) == 0
                    ? IntStream.range(s, Math.min(m, s + BS)).mapToObj(q -> qs[q][0] == 1 ? ((red[qs[q][1]] = true) && (nb[nc[0]++] = qs[q][1]) > 0 ? "" : "") : String.valueOf(Math.min(dd[qs[q][1]], IntStream.range(0, nc[0]).map(i -> dist.applyAsInt(nb[i], qs[q][1])).min().orElse(1 << 29)))) : Stream.<String>empty())
                .filter(x -> !x.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
