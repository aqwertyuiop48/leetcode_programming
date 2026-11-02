import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] nm && new int[3] instanceof int[] sx
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47
                ? (sx[0] = sx[0] * 10 + raw[i] - 48) >= 0 & (sx[2] = 1) > 0
                : sx[2] == 0 || ((nm[sx[1]++] = sx[0]) >= 0 & (sx[0] = 0) == 0 & (sx[2] = 0) == 0)) || true)
            && Integer.valueOf(nm[0]) instanceof Integer n
            && Arrays.stream(nm, 1, 2 * n - 1).map(x -> x - 1).toArray() instanceof int[] e
            && new int[n + 1] instanceof int[] start
            && IntStream.range(0, 2 * (n - 1)).filter(i -> start[e[i] + 1]++ < 0).count() == 0
            && IntStream.range(0, n).filter(i -> (start[i + 1] += start[i]) < 0).count() == 0
            && start.clone() instanceof int[] pos && new int[2 * (n - 1) + 1] instanceof int[] adj
            && IntStream.range(0, n - 1).filter(i -> (adj[pos[e[2 * i]]++] = e[2 * i + 1]) + (adj[pos[e[2 * i + 1]]++] = e[2 * i]) < 0).count() == 0
            && new boolean[n] instanceof boolean[] rem && new int[n] instanceof int[] rank && new int[n] instanceof int[] par && new int[n] instanceof int[] sz && new int[n] instanceof int[] mx
            && new int[n] instanceof int[] comp && new int[n] instanceof int[] cen && new int[n] instanceof int[] q && new int[n] instanceof int[] roots && new int[n] instanceof int[] nroots && new int[6] instanceof int[] st
            && (st[0] = 1) == 1
            && IntStream.range(0, 20).allMatch(L -> st[0] == 0 || IntStream.range(0, st[0]).allMatch(i -> (q[i] = roots[i]) >= 0 && (par[roots[i]] = -1) < 0 && (comp[roots[i]] = roots[i]) >= 0 && (sz[roots[i]] = 1) > 0 && (mx[roots[i]] = 0) == 0 && (cen[roots[i]] = -1) < 0)
                && (st[1] = st[0]) > 0 && (st[2] = 0) == 0 && (st[3] = start[q[0]]) >= 0
                && IntStream.generate(() -> 0).anyMatch(z -> st[3] < start[q[st[2]] + 1]
                    ? (adj[st[3]] == par[q[st[2]]] || rem[adj[st[3]]] || (par[adj[st[3]]] = q[st[2]]) >= -1 && (comp[adj[st[3]]] = comp[q[st[2]]]) >= 0 && (sz[adj[st[3]]] = 1) > 0 && (mx[adj[st[3]]] = 0) == 0 && (q[st[1]++] = adj[st[3]]) >= 0) && ++st[3] < 0
                    : ++st[2] >= st[1] || (st[3] = start[q[st[2]]]) < 0)
                && IntStream.iterate(st[1] - 1, i -> i > 0, i -> i - 1).allMatch(i -> par[q[i]] < 0 || (sz[par[q[i]]] += sz[q[i]]) > 0 && (mx[par[q[i]]] = Math.max(mx[par[q[i]]], sz[q[i]])) >= 0)
                && IntStream.range(0, st[1]).allMatch(i -> cen[comp[q[i]]] >= 0 || 2 * Math.max(mx[q[i]], sz[comp[q[i]]] - sz[q[i]]) > sz[comp[q[i]]] || (cen[comp[q[i]]] = q[i]) >= 0)
                && (st[5] = 0) == 0
                && IntStream.range(0, st[0]).allMatch(i -> (rank[cen[roots[i]]] = L) >= 0 && (rem[cen[roots[i]]] = true)
                    && IntStream.range(start[cen[roots[i]]], start[cen[roots[i]] + 1]).filter(j -> !rem[adj[j]]).allMatch(j -> (nroots[st[5]++] = adj[j]) >= 0))
                && IntStream.range(0, st[5]).allMatch(i -> (roots[i] = nroots[i]) >= 0) && (st[0] = st[5]) >= 0)
            ? IntStream.range(0, n).mapToObj(i -> "" + (char) ('A' + rank[i])).collect(Collectors.joining(" ")) : "");
    }
}
