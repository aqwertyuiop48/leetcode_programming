import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.generate(() -> Integer.parseInt(st.nextToken()) - 1).limit(2L * (n - 1)).toArray() instanceof int[] e
            && new int[n + 1] instanceof int[] start
            && IntStream.range(0, 2 * (n - 1)).filter(i -> start[e[i] + 1]++ < 0).count() == 0
            && IntStream.range(0, n).filter(i -> (start[i + 1] += start[i]) < 0).count() == 0
            && start.clone() instanceof int[] pos && new int[2 * (n - 1) + 1] instanceof int[] adj
            && IntStream.range(0, n - 1).filter(i -> (adj[pos[e[2 * i]]++] = e[2 * i + 1]) + (adj[pos[e[2 * i + 1]]++] = e[2 * i]) < 0).count() == 0
            && new boolean[n] instanceof boolean[] removed && new int[n] instanceof int[] rank && new int[n] instanceof int[] ord && new int[n] instanceof int[] par
            && new int[n] instanceof int[] sz && new int[n] instanceof int[] mx && new int[1] instanceof int[] cnt
            && new ArrayDeque<int[]>(List.<int[]>of(new int[]{0, 0})) instanceof ArrayDeque<int[]> q
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).filter(tk ->
                (ord[0] = tk[0]) >= 0 && (par[tk[0]] = -1) < 0 && (cnt[0] = 1) > 0
                && IntStream.iterate(0, h -> h < cnt[0], h -> h + 1).map(h -> Integer.valueOf(ord[h]) instanceof Integer u
                    && (sz[u] = 1) > 0 && (mx[u] = 0) >= 0
                    ? IntStream.range(start[u], start[u + 1]).filter(j -> adj[j] != par[u] && !removed[adj[j]]).map(j -> (par[adj[j]] = u) + (ord[cnt[0]++] = adj[j])).max().orElse(0) : 0).max().orElse(0) >= 0
                && IntStream.iterate(cnt[0] - 1, h -> h >= 0, h -> h - 1).map(h -> ord[h] >= 0 && par[ord[h]] >= 0
                    ? (sz[par[ord[h]]] += sz[ord[h]]) + (mx[par[ord[h]]] = Math.max(mx[par[ord[h]]], sz[ord[h]])) : 0).max().orElse(0) >= 0
                && IntStream.range(0, cnt[0]).map(h -> ord[h]).filter(u -> Math.max(mx[u], cnt[0] - sz[u]) * 2 <= cnt[0]).findFirst() instanceof OptionalInt oc
                && Integer.valueOf(oc.getAsInt()) instanceof Integer c
                && (rank[c] = tk[1]) >= 0 && (removed[c] = true)
                && IntStream.range(start[c], start[c + 1]).filter(j -> !removed[adj[j]]).mapToObj(j -> q.add(new int[]{adj[j], tk[1] + 1})).count() >= 0).count() >= 0
            ? IntStream.range(0, n).mapToObj(i -> "" + (char) ('A' + rank[i])).collect(Collectors.joining(" ")) : "");
    }
}
