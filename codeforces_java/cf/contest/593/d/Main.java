import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] hd && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && new int[n] instanceof int[] eu && new int[n] instanceof int[] ev && new long[n] instanceof long[] ew
            && IntStream.range(0, n - 1).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer u && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer v && (Long) Long.parseLong(tk.nextToken()) instanceof Long w
                && (eu[i] = u) > 0 && (ev[i] = v) > 0 && (ew[i] = w) > 0 && (to[2 * i] = v) > 0 && (nxt[2 * i] = hd[u]) >= -1 && (hd[u] = 2 * i) >= 0 && (to[2 * i + 1] = u) > 0 && (nxt[2 * i + 1] = hd[v]) >= -1 && (hd[v] = 2 * i + 1) >= 0)
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] q && new int[]{1} instanceof int[] tl && (q[0] = 1) == 1
            && IntStream.range(0, n).takeWhile(qi -> qi < tl[0]).allMatch(qi -> (Integer) q[qi] instanceof Integer u
                && IntStream.iterate(hd[u], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[u]).allMatch(e -> (dep[to[e]] = dep[u] + 1) > 0 && (par[to[e]] = u) > 0 && (q[tl[0]++] = to[e]) > 0))
            && new int[n - 1] instanceof int[] ch && new long[n + 1] instanceof long[] W && new int[n + 1] instanceof int[] dsu
            && IntStream.range(0, n + 1).allMatch(i -> (dsu[i] = i) >= 0)
            && IntStream.range(0, n - 1).allMatch(i -> (ch[i] = dep[eu[i]] > dep[ev[i]] ? eu[i] : ev[i]) > 0 && (W[ch[i]] = ew[i]) > 0 && (ew[i] != 1 || (dsu[ch[i]] = par[ch[i]]) > 0))
            && new int[1] instanceof int[] rh && ((IntUnaryOperator) v -> (rh[0] = IntStream.iterate(v, u -> dsu[u]).filter(u -> dsu[u] == u).findFirst().getAsInt()) > 0
                && IntStream.iterate(v, u -> u != rh[0], u -> dsu[u] + 0 * (dsu[u] = rh[0])).sum() >= 0 ? rh[0] : rh[0]) instanceof IntUnaryOperator f
            ? IntStream.range(0, m).mapToObj(qq -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer tp
                ? (tp == 1
                    ? ((Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b && (Long) Long.parseLong(tk.nextToken()) instanceof Long y
                        && new int[]{a, b} instanceof int[] ab && new long[]{y} instanceof long[] st
                        && IntStream.iterate(0, i -> i + 1).takeWhile(i -> st[0] > 0 && (ab[0] = f.applyAsInt(ab[0])) != (ab[1] = f.applyAsInt(ab[1])))
                            .allMatch(i -> (Integer) (dep[ab[0]] >= dep[ab[1]] ? 0 : 1) instanceof Integer h && (st[0] /= W[ab[h]]) >= 0 && (ab[h] = par[ab[h]]) >= 0)
                        ? String.valueOf(st[0]) : null)
                    : ((Integer) Integer.parseInt(tk.nextToken()) instanceof Integer p && (Long) Long.parseLong(tk.nextToken()) instanceof Long c && (W[ch[p - 1]] = c) > 0 && (c != 1 || (dsu[ch[p - 1]] = par[ch[p - 1]]) > 0)
                        ? (String) null : null))
                : null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
