import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(
            new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split("\\s+") instanceof String[] tk
            && Arrays.stream(tk).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && Integer.valueOf(a[0]) instanceof Integer n
            && Integer.valueOf(a[1]) instanceof Integer m
            && new int[n] instanceof int[] hd
            && IntStream.range(0, n).allMatch(i -> (hd[i] = -1) < 0)
            && new int[2 * m] instanceof int[] nx
            && new int[2 * m] instanceof int[] to
            && IntStream.range(0, 2 * m).allMatch(k ->
                (to[k] = a[2 + 2 * (k / 2) + 1 - k % 2] - 1) >= 0
                && (nx[k] = hd[a[2 + 2 * (k / 2) + k % 2] - 1]) >= -1
                && (hd[a[2 + 2 * (k / 2) + k % 2] - 1] = k) >= 0)
            && new int[n] instanceof int[] disc
            && new int[n] instanceof int[] low
            && new int[n] instanceof int[] d1
            && new int[n + 1] instanceof int[] stk
            && new int[]{0, 0, n} instanceof int[] ct
            && new int[2 * n + 1] instanceof int[] par
            && IntStream.range(0, 2 * n + 1).allMatch(i -> (par[i] = -1) < 0)
            && new int[n] instanceof int[] pe
            && new int[n] instanceof int[] it
            && new int[n + 1] instanceof int[] cs
            && new int[1] instanceof int[] sp
            && ((BooleanSupplier) () ->
                Integer.valueOf(cs[sp[0] - 1]) instanceof Integer u
                && (it[u] == -1
                    ? sp[0]-- > 0
                        && (sp[0] == 0
                            || (Integer.valueOf(cs[sp[0] - 1]) instanceof Integer p
                                && (low[p] = Math.min(low[p], low[u])) > 0
                                && (low[u] >= disc[p] ? Integer.valueOf(ct[2]++) instanceof Integer b
                                    && Stream.generate(() -> stk[--ct[1]]).anyMatch(w -> (par[w] = b) >= 0 && w.equals(u))
                                    && (par[b] = p) >= 0 : true)))
                    : Integer.valueOf(it[u]) instanceof Integer e
                        && (it[u] = nx[e]) >= -1
                        && ((e ^ 1) == pe[u]
                            || (disc[to[e]] == 0
                                ? (d1[to[e]] = d1[u] ^ 1) >= 0
                                    && (disc[to[e]] = low[to[e]] = ++ct[0]) > 0
                                    && (stk[ct[1]++] = to[e]) >= 0
                                    && (pe[to[e]] = e) >= -1
                                    && (it[to[e]] = hd[to[e]]) >= -1
                                    && (cs[sp[0]++] = to[e]) >= 0
                                : (low[u] = Math.min(low[u], disc[to[e]])) > 0)))) instanceof BooleanSupplier step
            && IntStream.range(0, n).allMatch(v ->
                disc[v] != 0
                || ((disc[v] = low[v] = ++ct[0]) > 0
                    && (stk[ct[1]++] = v) >= 0
                    && (pe[v] = -1) < 0
                    && (it[v] = hd[v]) >= -1
                    && (cs[sp[0]++] = v) >= 0
                    && IntStream.iterate(0, i -> sp[0] > 0, i -> i + 1).allMatch(i -> step.getAsBoolean())))
            && new boolean[2 * n + 1] instanceof boolean[] nb
            && IntStream.range(0, m).allMatch(i ->
                Integer.valueOf(a[2 + 2 * i] - 1) instanceof Integer x
                && Integer.valueOf(a[3 + 2 * i] - 1) instanceof Integer y
                && (d1[x] != d1[y]
                    || (nb[par[x] == par[y] ? par[x] : par[x] >= 0 && par[par[x]] == y ? par[x] : par[y]] = true)))
            && new int[2 * n + 1] instanceof int[] dep
            && new int[2 * n + 1] instanceof int[] cn
            && new int[2 * n + 1] instanceof int[] rt
            && IntStream.range(0, 2 * n + 1).allMatch(i -> (dep[i] = -1) < 0)
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fl
            && fl.getAndSet(x ->
                dep[x] >= 0 ? 0
                : par[x] < 0
                    ? (dep[x] = 0) + (cn[x] = 0) + (rt[x] = x) >= 0 ? 0 : 0
                    : fl.get().applyAsInt(par[x]) >= 0
                        && (dep[x] = dep[par[x]] + 1) > 0
                        && (cn[x] = cn[par[x]] + (nb[x] ? 1 : 0)) >= 0
                        && (rt[x] = rt[par[x]]) >= 0 ? 0 : 0) == null
            && IntStream.range(0, 2 * n + 1).allMatch(i -> fl.get().applyAsInt(i) >= 0)
            && new int[18][2 * n + 1] instanceof int[][] up
            && IntStream.range(0, 2 * n + 1).allMatch(i -> (up[0][i] = par[i] < 0 ? i : par[i]) >= 0)
            && IntStream.range(1, 18).allMatch(j -> IntStream.range(0, 2 * n + 1).allMatch(i -> (up[j][i] = up[j - 1][up[j - 1][i]]) >= 0))
            && ((IntBinaryOperator) (p, q) ->
                new int[]{dep[p] >= dep[q] ? p : q, dep[p] >= dep[q] ? q : p} instanceof int[] ab
                && IntStream.range(0, 18).allMatch(j -> ((dep[ab[0]] - dep[ab[1]]) >> j & 1) == 0 || (ab[0] = up[j][ab[0]]) >= 0)
                && (ab[0] == ab[1]
                    || (IntStream.range(0, 18).map(j -> 17 - j).allMatch(j ->
                            up[j][ab[0]] == up[j][ab[1]] || ((ab[0] = up[j][ab[0]]) >= 0 && (ab[1] = up[j][ab[1]]) >= 0))
                        && (ab[0] = up[0][ab[0]]) >= 0))
                ? ab[0] : -1) instanceof IntBinaryOperator lca
            ? IntStream.range(0, a[2 + 2 * m]).mapToObj(i ->
                Integer.valueOf(a[3 + 2 * m + 2 * i] - 1) instanceof Integer x
                && Integer.valueOf(a[4 + 2 * m + 2 * i] - 1) instanceof Integer y
                && !x.equals(y)
                && rt[x] == rt[y]
                && (((d1[x] ^ d1[y]) & 1) == 1
                    || (Integer.valueOf(lca.applyAsInt(x, y)) instanceof Integer l
                        && cn[x] + cn[y] - 2 * cn[l] + (nb[l] ? 1 : 0) > 0))
                ? "Yes" : "No").collect(Collectors.joining("\n"))
            : ""), "main", 1L << 29).start();
    }
}




