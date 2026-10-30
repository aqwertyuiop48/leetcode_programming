import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && (Integer) IntStream.iterate(0, i -> raw[i] > 47 && raw[i] < 58, i -> i + 1).reduce(0, (x, i) -> x * 10 + raw[i] - 48) instanceof Integer n
            && (Integer) ((int) IntStream.range(0, raw.length).filter(i -> raw[i] >= 97).count() + 2) instanceof Integer nodes
            && new int[nodes * 26] instanceof int[] child
            && new int[nodes] instanceof int[] par
            && new int[nodes] instanceof int[] dep
            && new int[2 * n] instanceof int[] endNode
            && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] >= 97
                ? (child[st[0] * 26 + raw[i] - 97] == 0
                    ? (child[st[0] * 26 + raw[i] - 97] = ++st[1]) + (par[st[1]] = st[0]) + (dep[st[1]] = dep[st[0]] + 1) : 0)
                    + (st[0] = child[st[0] * 26 + raw[i] - 97]) + (st[3] = 1)
                : st[3] == 1 ? (endNode[st[2]++] = st[0]) + (st[0] = 0) + (st[3] = 0) : 0) != Integer.MIN_VALUE || true).count() >= 0
            && IntStream.generate(() -> -1).limit(nodes).toArray() instanceof int[] hA
            && IntStream.generate(() -> -1).limit(nodes).toArray() instanceof int[] hB
            && IntStream.generate(() -> -1).limit(nodes).toArray() instanceof int[] tA
            && IntStream.generate(() -> -1).limit(nodes).toArray() instanceof int[] tB
            && IntStream.generate(() -> -1).limit(2 * n).toArray() instanceof int[] nxt
            && IntStream.range(0, n).filter(s -> (hA[endNode[s]] < 0 ? (hA[endNode[s]] = s) >= 0 : (nxt[tA[endNode[s]]] = s) >= 0) && (tA[endNode[s]] = s) >= 0 || true).count() >= 0
            && IntStream.range(n, 2 * n).filter(s -> (hB[endNode[s]] < 0 ? (hB[endNode[s]] = s) >= 0 : (nxt[tB[endNode[s]]] = s) >= 0) && (tB[endNode[s]] = s) >= 0 || true).count() >= 0
            && new int[n] instanceof int[] pa
            && new int[n] instanceof int[] pb
            && new int[2] instanceof int[] cs
            && IntStream.range(0, st[1] + 1).map(x -> st[1] - x).filter(v ->
                (hA[v] >= 0 && hB[v] >= 0
                    ? IntStream.iterate(0, k -> hA[v] >= 0 && hB[v] >= 0, k ->
                        (pa[cs[0]] = hA[v]) >= 0 && (pb[cs[0]] = hB[v]) >= 0 && (hA[v] = nxt[pa[cs[0]]]) >= -1 && (hB[v] = nxt[pb[cs[0]]]) >= -1
                        && (cs[1] += dep[v]) >= 0 && ++cs[0] > 0 ? 0 : 0).count() >= 0
                    : true)
                && (v == 0 || (hA[v] < 0 || (hA[par[v]] < 0 ? (hA[par[v]] = hA[v]) >= 0 : (nxt[tA[par[v]]] = hA[v]) >= 0) && (tA[par[v]] = tA[v]) >= 0)
                    && (hB[v] < 0 || (hB[par[v]] < 0 ? (hB[par[v]] = hB[v]) >= 0 : (nxt[tB[par[v]]] = hB[v]) >= 0) && (tB[par[v]] = tB[v]) >= 0)) || true).count() >= 0
            ? cs[1] + "\n" + IntStream.range(0, n).mapToObj(i -> (pa[i] + 1) + " " + (pb[i] - n + 1)).collect(Collectors.joining("\n"))
            : "");
    }
}
