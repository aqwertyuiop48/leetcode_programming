import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 && raw[i] <= 57
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[1] = 1) > 0
                : st[1] == 0 || (v[st[2]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
            && Integer.valueOf(v[2]) instanceof Integer h && Integer.valueOf(v[3]) instanceof Integer t
            && new int[n + 2] instanceof int[] off
            && IntStream.range(0, 2 * m).allMatch(k -> ++off[v[4 + k] + 1] > 0)
            && IntStream.rangeClosed(1, n).allMatch(x -> (off[x + 1] += off[x]) >= 0)
            && IntStream.range(0, n + 2).map(i -> off[i]).toArray() instanceof int[] pos
            && new int[2 * m] instanceof int[] adj
            && IntStream.range(0, m).allMatch(k -> (adj[pos[v[4 + 2 * k]]++] = v[5 + 2 * k]) > 0 && (adj[pos[v[5 + 2 * k]]++] = v[4 + 2 * k]) > 0)
            && IntStream.rangeClosed(1, n).allMatch(x -> Stream.of(0).peek(z -> Arrays.sort(adj, off[x], off[x + 1])).findFirst().isPresent())
            && new int[2] instanceof int[] res
            && new int[n + 1] instanceof int[] mark
            && IntStream.rangeClosed(1, n).anyMatch(u -> off[u + 1] - off[u] > h
                && IntStream.range(off[u], off[u + 1]).allMatch(i -> (mark[adj[i]] = u) > 0)
                && IntStream.range(off[u], off[u + 1]).anyMatch(i -> Integer.valueOf(adj[i]) instanceof Integer w
                    && off[w + 1] - off[w] > t
                    && (off[u + 1] - off[u] - 1 >= h + t || off[w + 1] - off[w] - 1 >= h + t
                        || Long.valueOf(IntStream.range(off[w], off[w + 1]).filter(j -> mark[adj[j]] == u).count()) instanceof Long c
                            && (off[u + 1] - off[u] - 1) + (off[w + 1] - off[w] - 1) - c >= h + t)
                    && (res[0] = u) > 0 && (res[1] = w) > 0))
            ? Integer.valueOf(res[0]) instanceof Integer u && Integer.valueOf(res[1]) instanceof Integer w
                && IntStream.range(off[u], off[u + 1]).map(i -> adj[i]).filter(x -> x != w).boxed().toList() instanceof List<Integer> A
                && A.stream().filter(x -> Arrays.binarySearch(adj, off[w], off[w + 1], x) < 0).toList() instanceof List<Integer> ex
                && Stream.concat(ex.stream(), A.stream().filter(x -> Arrays.binarySearch(adj, off[w], off[w + 1], x) >= 0)).limit(h).toList() instanceof List<Integer> heads
                && new HashSet<Integer>(heads) instanceof HashSet<Integer> hs
                ? "YES\n" + u + " " + w + "\n" + heads.stream().map(String::valueOf).collect(Collectors.joining(" ")) + "\n"
                    + IntStream.range(off[w], off[w + 1]).map(i -> adj[i]).filter(x -> x != u && !hs.contains(x)).limit(t).boxed().map(String::valueOf).collect(Collectors.joining(" "))
                : ""
            : "NO");
    }
}
