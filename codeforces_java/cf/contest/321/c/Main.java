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
            && new boolean[n] instanceof boolean[] removed && new int[n] instanceof int[] rank && new int[n] instanceof int[] ord && new int[n] instanceof int[] par
            && new int[n] instanceof int[] sz && new int[n] instanceof int[] mx && new int[1] instanceof int[] cnt && new int[3] instanceof int[] bs
            && new ArrayDeque<int[]>(List.<int[]>of(new int[]{0, 0})) instanceof ArrayDeque<int[]> q
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).filter(tk ->
                (ord[0] = tk[0]) >= 0 && (par[tk[0]] = -1) < 0 && (cnt[0] = 1) > 0 && (sz[tk[0]] = 1) > 0 && (mx[tk[0]] = 0) == 0
                && (bs[0] = 0) == 0 && (bs[2] = tk[0]) >= 0 && (bs[1] = start[tk[0]]) >= 0
                && IntStream.generate(() -> 0).anyMatch(z -> bs[1] < start[bs[2] + 1]
                    ? (adj[bs[1]] == par[bs[2]] || removed[adj[bs[1]]] || ((par[adj[bs[1]]] = bs[2]) >= 0 && (sz[adj[bs[1]]] = 1) > 0 && (mx[adj[bs[1]]] = 0) == 0 && (ord[cnt[0]++] = adj[bs[1]]) >= 0)) && ++bs[1] < 0
                    : ++bs[0] >= cnt[0] || ((bs[2] = ord[bs[0]]) >= 0 && (bs[1] = start[bs[2]]) >= 0 && false))
                && (cnt[0] == 1 ? (bs[0] = ord[0]) >= 0
                    : IntStream.iterate(cnt[0] - 1, h -> h >= 0, h -> h - 1).map(h -> ord[h] >= 0 && par[ord[h]] >= 0
                        ? (sz[par[ord[h]]] += sz[ord[h]]) + (mx[par[ord[h]]] = Math.max(mx[par[ord[h]]], sz[ord[h]])) : 0).max().orElse(0) >= 0
                    && IntStream.range(0, cnt[0]).map(h -> ord[h]).filter(u -> Math.max(mx[u], cnt[0] - sz[u]) * 2 <= cnt[0]).findFirst() instanceof OptionalInt oc
                    && (bs[0] = oc.getAsInt()) >= 0)
                && Integer.valueOf(bs[0]) instanceof Integer c
                && (rank[c] = tk[1]) >= 0 && (removed[c] = true)
                && (cnt[0] == 1 || IntStream.range(start[c], start[c + 1]).filter(j -> !removed[adj[j]]).mapToObj(j -> q.add(new int[]{adj[j], tk[1] + 1})).count() >= 0)).count() >= 0
            ? IntStream.range(0, n).mapToObj(i -> "" + (char) ('A' + rank[i])).collect(Collectors.joining(" ")) : "");
    }
}
